package com.company;

import java.util.ArrayList;

public class Customer implements ICustomer{
    private String name;
    private int id;
    private ArrayList<BaseProduct> favs = new ArrayList<BaseProduct>();

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public ArrayList<BaseProduct> getFavs() {
        return favs;
    }

    public void setFavs(ArrayList<BaseProduct> favs) {
        this.favs = favs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void AddToFavs(BaseProduct product) {
        this.favs.add(product);
        product.addObserver(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Hey "+this.name+message);
    }

    @Override
    public void ShowFavs() {
        int index=1;
        for (BaseProduct product:
             favs) {
            System.out.println(index+". Product "+product.getName());
        }
    }
}
