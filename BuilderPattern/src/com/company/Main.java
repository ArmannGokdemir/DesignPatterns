package com.company;

public class Main {
    //Builder is a creational design pattern that lets you construct complex objects step by step.
    //The pattern allows you to produce different types and representations of an object using the same construction code.
    public static void main(String[] args) {

	Director director = new Director();
	CarBuilder carBuilder = new CarBuilder();


	director.makeSedan(carBuilder);
	Car sedan = carBuilder.getResult();
		System.out.println("Sedan specs : "+sedan.getEngine());


	director.makeSportsCar(carBuilder);
	Car sportsCar = carBuilder.getResult();
	System.out.println("Sports car specs : "+sportsCar.getEngine());
    }
}
