package com.denis;

public class Driver {
    DriverDoc driverDoc;

    public Driver() {

    }

    public Driver(DriverDoc driverDoc) {
        this.driverDoc = driverDoc;
    }

    public DriverDoc getDriverDoc() {
        return driverDoc;
    }

    public void setDriverDoc(DriverDoc driverDoc) {
        this.driverDoc = driverDoc;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverDoc=" + driverDoc +
                '}';
    }
}
