package com.company;

public class Main {

    public static void main(String[] args) {


	Singleton singletonObject =Singleton.getInstance();
    Singleton singletonObject1 =Singleton.getInstance();
    if(singletonObject1==singletonObject){
        System.out.println("Singleton is working");
    }

    }

}
