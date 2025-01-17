package com.ankur.inventory.fixture;

import com.ankur.inventory.domain.InventoryFindByNameRequest;
import com.ankur.inventory.domain.InventoryFindByNameResponse;
import com.ankur.inventory.domain.Item;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InventoryFindByNameFixture {

    private RestTemplate restTemplate;
    private HttpHeaders headers;
    private InventoryFindByNameRequest findByNameRequest;
    private HttpEntity<InventoryFindByNameRequest> request;
    private ResponseEntity<InventoryFindByNameResponse> response;
    private InventoryFindByNameResponse inventoryFindByNameResponse;
    private URI url;
    private String name;


    public InventoryFindByNameFixture(){
        restTemplate = restTemplate();
        headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Content-Type", "application/json");
        headers.add("client-id", "eship");

        try {
             url = new URI(FIND_BY_NAME_URL);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private void init(){
        findByNameRequest = new InventoryFindByNameRequest(this.getName());
        request = new HttpEntity<>(findByNameRequest,headers);
        ResponseEntity<InventoryFindByNameResponse> response = restTemplate.postForEntity(url, request, InventoryFindByNameResponse.class);
        inventoryFindByNameResponse = response.getBody();
    }


    public String id(){
        init();
        return resolveId();
    }

    public String price(){
        init();
        return resolvePrice();
    }

    public String manufacturedBy(){
        init();
        return resolveManufacturedBy();
    }

    private String resolvePrice() {
        StringBuilder builder = new StringBuilder();
        for(Item item: inventoryFindByNameResponse.getItems()){
            builder.append(item.getPrice());
            builder.append(",");
        }
        return builder.toString();
    }

    private String resolveId() {
        StringBuilder builder = new StringBuilder();
        for(Item item: inventoryFindByNameResponse.getItems()){
            builder.append(item.getId());
            builder.append(",");
        }
        return builder.toString();
    }

    private String resolveManufacturedBy() {
        StringBuilder builder = new StringBuilder();
        for(Item item: inventoryFindByNameResponse.getItems()){
            builder.append(item.getInfo().getManufacturedBy());
            builder.append(",");
        }
        return builder.toString();
    }

    private String resolveDescription() {
        StringBuilder builder = new StringBuilder();
        for(Item item: inventoryFindByNameResponse.getItems()){
            builder.append(item.getInfo().getDescription());
            builder.append(",");
        }
        return builder.toString();
    }

    public String description(){
        init();
        return resolveDescription();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    private static final String FIND_BY_NAME_URL="http://localhost:7000/inventory/services/findByName";

    public static void main(String args[]) throws Exception{
        InventoryFindByNameFixture fixture = new InventoryFindByNameFixture();
        fixture.test();
    }

    public  void test() throws Exception {
        RestTemplate restTemplate = restTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Content-Type", "application/json");
        headers.add("client-id", "eship");

        URI url = new URI(FIND_BY_NAME_URL);

        InventoryFindByNameRequest findByNameRequest = new InventoryFindByNameRequest("Lamp");

        HttpEntity<InventoryFindByNameRequest> request = new HttpEntity<>(findByNameRequest,headers);
        ResponseEntity<InventoryFindByNameResponse> response = restTemplate.postForEntity(url, request, InventoryFindByNameResponse.class);

        InventoryFindByNameResponse inventoryFindByNameResponse = response.getBody();

        for(Item item: inventoryFindByNameResponse.getItems()) {
            System.out.println(item.getName());
        }

        System.out.println("inventoryFindByNameResponse = "+inventoryFindByNameResponse.getStatus());
    }

    private RestTemplate restTemplate() {
        final RestTemplate restTemplate = new RestTemplate();
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);
        restTemplate.setMessageConverters(messageConverters);
        return restTemplate;
    }



}
