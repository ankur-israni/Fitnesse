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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InventoryServiceFixture {


    private String name;


    public Integer id(){
        return 1;
    }

    public Float price(){
        return 99f;
    }

    public String manufacturedBy(){
        return "apple";
    }

    public String description(){
        return "apple";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    private static final String FIND_BY_NAME_URL="http://localhost:7000/inventory/services/findByName";

    public static void main(String args[]) throws Exception{
        InventoryServiceFixture fixture = new InventoryServiceFixture();
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
