package com.denis.entity;

import com.denis.interfaces.Tanker;

public class RefuelerMan {
    private String name;
    private String gasStation;

    public RefuelerMan() {

    }

    public RefuelerMan(String name, String gasStation) {
        this.name = name;
        this.gasStation = gasStation;
    }

    public void refuelTransport(Tanker tanker) {
        tanker.openLid();
        tanker.refuel();
        tanker.closeLid();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGasStation() {
        return gasStation;
    }

    public void setGasStation(String gasStation) {
        this.gasStation = gasStation;
    }

    @Override
    public String toString() {
        return "RefuelerMan{" +
                "name='" + name + '\'' +
                ", gasStation='" + gasStation + '\'' +
                '}';
    }
}
