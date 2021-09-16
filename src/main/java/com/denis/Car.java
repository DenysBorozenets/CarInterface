package com.denis;

import com.denis.interfaces.Battery;
import com.denis.interfaces.CarDriver;
import com.denis.interfaces.Tanker;

public class Car implements Battery, CarDriver, Tanker {
    public enum Transmission{MECHANICAL , AUTOMATIC, ROBOT};
    private String model;
    private String number;
    private Transmission transmission;
    private DriverDoc driverDoc;

    boolean isMove = false;
    boolean isOpenLid = false;

    public Car(Transmission mechanical, String opel, String ав2536ВП, String s, DriverDoc.Category b){

    }

    public Car(String model, String number, Transmission transmission, DriverDoc driverDoc) {
        this.model = model;
        this.number = number;
        this.transmission = transmission;
        this.driverDoc = driverDoc;
    }

    @Override
    public double getWeight(){
        return 2000;
    }

    @Override
    public int getPower() {
        return 1500;
    }

    @Override
    public void move() {
        if (isOpenLid) {
            System.out.println("Can`t go");
        } else {
            isMove = true;
            System.out.println("Can go");
        }
    }

    @Override
    public void stop() {
        isMove = false;
        System.out.println("Stop");
    }

    @Override
    public void refuel() {
        if(!isOpenLid){
            System.out.println("Can`t refuel");
        } else {
            System.out.println("Refueling");
        }
    }

    public void openLid(){
        if (isMove) {
            System.out.println("You can`t refuel");
        } else {
            isOpenLid = true;
            System.out.println("You can refuel");
        }
    }

    public void closeLid() {
        if (isMove) {
            System.out.println("You can`t close");
        } else {
            isOpenLid = false;
            System.out.println("Is close");
        }
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
