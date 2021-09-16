package com.denis;

public class Car {
    public enum Transmission{MECHANICAL , AUTOMATIC, ROBOT};
    private String model;
    private String number;
    private Transmission transmission;
    private DriverDoc driverDoc;

    public Car(){

    }

    public Car(String model, String number, Transmission transmission, DriverDoc driverDoc) {
        this.model = model;
        this.number = number;
        this.transmission = transmission;
        this.driverDoc = driverDoc;
    }

    public DriverDoc getDriverDoc() {
        return driverDoc;
    }

    public void setDriverDoc(DriverDoc driverDoc) {
        this.driverDoc = driverDoc;
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
