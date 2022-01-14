package com.company;

public class Main {

    public static void main(String[] args) {
	BaseProduct product =new Product("laptop",10000);
	BaseProduct product1 =new Product("phone",5000);
	BaseProduct product2 =new Product("hue lamp",1250);

    ICustomer customer = new Customer("Arman Gokdemir",0);
    ICustomer customer2 = new Customer("Kerem Akmil",1);
    ICustomer customer3 = new Customer("Hasan Sayin",2);

    customer.AddToFavs(product);
    customer.AddToFavs(product1);
    customer.AddToFavs(product2);

    customer2.AddToFavs(product);

    customer3.AddToFavs(product2);

    product.setPrice(7600);
    product1.setPrice(6000);
    product2.setPrice(675);





    }
}
