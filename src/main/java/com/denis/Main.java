package com.denis;

import com.denis.entity.BatteryParameters;
import com.denis.entity.RefuelerMan;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(Car.Transmission.MECHANICAL, "Opel", "АВ2536ВП", "4Y1SL65848Z411439", DriverDoc.Category.B);

        BatteryParameters batteryShop = new BatteryParameters();
        Driver driver = new Driver();
        RefuelerMan refuelerMan = new RefuelerMan();
        driver.setCarDriver(car);

        driver.move();
        driver.stop();
        batteryShop.batteryParam(car);
        driver.move();
        refuelerMan.refuelTransport(car);
        driver.stop();

    }
}
