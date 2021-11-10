package com.ankur.inventory.domain;



public class InventoryFindByNameRequest {


    private String name;

    public InventoryFindByNameRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private InventoryFindByNameRequest(){

    }
}
