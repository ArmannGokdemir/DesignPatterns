package com.company;

public class Director {
    public void makeSportsCar(Builder builder){
        builder.reset();
        builder.setEngine("V8 6L");
        builder.setSeats(2);
        builder.setGPS(true);
        builder.setTripComputer(true);

    }
    public void makeSedan(Builder builder){
        builder.reset();
        builder.setEngine("1.3L 130NM");
        builder.setSeats(4);
        builder.setGPS(true);
        builder.setTripComputer(true);

    }
    public void makeSUV(Builder builder){
        builder.reset();
        builder.setEngine("SUV motor");
        builder.setSeats(4);
        builder.setGPS(true);
        builder.setTripComputer(true);

    }

}
