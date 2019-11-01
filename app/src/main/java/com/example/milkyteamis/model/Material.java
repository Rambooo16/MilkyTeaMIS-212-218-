package com.example.milkyteamis.model;

public class Material {
    //标识原料id
    private int id;
    //原料名称
    private String name;
    //原料库存
    private int storage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
