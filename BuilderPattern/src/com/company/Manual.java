package com.company;

public class Manual {

    private String engine;
    private boolean TripComputer;
    private int Seats;
    private boolean GPS;


    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isTripComputer() {
        return TripComputer;
    }

    public void setTripComputer(boolean tripComputer) {
        TripComputer = tripComputer;
    }

    public int getSeats() {
        return Seats;
    }

    public void setSeats(int seats) {
        Seats = seats;
    }

    public boolean isGPS() {
        return GPS;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }


}
