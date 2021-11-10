
package com.ankur.inventory.domain;



public class Item {


    private Integer id;

    private String name;


    private Float price;

    private Info info;

    public Item() {

    }

    public Item(Integer id, String name, Float price, Info info) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.info=info;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
