package com.company;

public class CarBuilder implements Builder{
    private Car car = new Car();
    @Override
    public void reset() {
        car = new Car();

    }

    @Override
    public void setSeats(int seat) {
        car.setSeats(seat);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean tf) {
        car.setTripComputer(tf);
    }

    @Override
    public void setGPS(boolean tf) {
        car.setGPS(tf);
    }

    public Car getResult(){
        return car;
    }
}
