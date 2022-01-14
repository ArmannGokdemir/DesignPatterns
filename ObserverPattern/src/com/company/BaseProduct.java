package com.company;

import java.util.ArrayList;

public abstract class BaseProduct {
    protected ArrayList<ICustomer> observers = new ArrayList<ICustomer>();
    protected  String name;
    protected int price;
    public BaseProduct(String isim,int fiyat){
        this.name =isim;
        this.price =fiyat;
    }

    public ArrayList<ICustomer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<ICustomer> observers) {
        this.observers = observers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(this.price > price){
            this.notifyObservers("There is a sale on "+this.name +" new price is "+ price);
        }
        else if(price >this.price){
            this.notifyObservers("New price of "+this.name +" is "+ price);
        }
        this.price = price;
    }

    public void addObserver(ICustomer customer){
        observers.add(customer);
    }
    public void removeObserver(ICustomer customer){
        observers.remove(observers.indexOf(customer));
    }

    public void notifyObservers(String message){
        for(ICustomer customer : observers){
            customer.update(message);
        }
    }


}
