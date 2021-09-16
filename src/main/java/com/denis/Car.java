package com.denis;

public class Car {
    public enum Transmission{MECHANICAL , AUTOMATIC, ROBOT};
    private String model;
    private String number;
    private Transmission transmission;

    public Car(){

    }

    public Car(String model, String number, Transmission transmission) {
        this.model = model;
        this.number = number;
        this.transmission = transmission;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
