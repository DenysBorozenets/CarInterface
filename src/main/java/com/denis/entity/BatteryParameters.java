package com.denis.entity;

import com.denis.interfaces.Battery;

public class BatteryParameters {
    private String model;
    private String shop;

    public BatteryParameters() {

    }

    public BatteryParameters(String model, String shop) {
        this.model = model;
        this.shop = shop;
    }

    public void batteryParam(Battery battery) {
        System.out.println(battery.getPower() + " " + battery.getWeight());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }
}
