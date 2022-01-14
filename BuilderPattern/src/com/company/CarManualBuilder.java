package com.company;

public class CarManualBuilder implements Builder{
    Manual manual = new Manual();
    @Override
    public void reset() {
        manual = new Manual();

    }

    @Override
    public void setSeats(int seat) {
        manual.setSeats(seat);
    }

    @Override
    public void setEngine(String engine) {
        manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean tf) {
        manual.setTripComputer(tf);
    }

    @Override
    public void setGPS(boolean tf) {
        manual.setGPS(tf);
    }
    
    public Manual getResult(){
        return manual;
    }
    
}
