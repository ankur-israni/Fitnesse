package com.ankur.inventory.domain;



public class Info {


    private String manufacturedBy;

    private String description;

    public Info(String manufacturedBy, String description){
        this.manufacturedBy=manufacturedBy;
        this.description=description;
    }

    public Info(){
    }

    public String getManufacturedBy() {
        return manufacturedBy;
    }

    public void setManufacturedBy(String manufacturedBy) {
        this.manufacturedBy = manufacturedBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
