package com.company;

public class Main {

    public static void main(String[] args) {
	AbstractFactory modernFurnitureFactory = new ModernFurnitureFactory();
	AbstractFactory victorianFurnitureFactory = new VictorianFurnitureFactory();

	Chair modernChair = modernFurnitureFactory.createChair();
	Sofa modernSofa = modernFurnitureFactory.createSofa();

	Chair victorianChair = victorianFurnitureFactory.createChair();
	Sofa victorianSofa = victorianFurnitureFactory.createSofa();

    }
}
