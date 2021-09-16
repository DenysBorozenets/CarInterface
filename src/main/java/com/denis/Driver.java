package com.denis;

import com.denis.interfaces.CarDriver;

public class Driver {
    private Human human;
    private DriverDoc driverDoc;
    private CarDriver carDriver;

    public Driver() {

    }

    public Driver(DriverDoc driverDoc, Human human) {
        this.driverDoc = driverDoc;
        this.human = human;
    }

    public void move() {
        carDriver.move();
    }

    public void stop() {
        carDriver.stop();
    }

    public DriverDoc getDriverDoc() {
        return driverDoc;
    }

    public void setDriverDoc(DriverDoc driverDoc) {
        this.driverDoc = driverDoc;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public CarDriver getCarDriver() {
        return carDriver;
    }

    public void setCarDriver(CarDriver carDriver) {
        this.carDriver = carDriver;
    }

    @Override
    public String
    toString() {
        return "Driver{" +
                "human=" + human +
                ", driverDoc=" + driverDoc +
                '}';
    }
}
