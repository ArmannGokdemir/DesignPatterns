package com.company;

public class VictorianFurnitureFactory implements AbstractFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
