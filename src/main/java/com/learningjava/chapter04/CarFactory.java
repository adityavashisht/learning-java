package com.learningjava.chapter04;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vashishta on 9/9/15.
 */
public class CarFactory {

    public Car car;

    public CarFactory(Car car) {
        this.car = car;
    }

    public static Car makeNew() {
        return new HondaCrv();
    }

    public static void main(String[] args) {
        Car c = CarFactory.makeNew();
        c.drive();

        List<? extends Honda> cars = new ArrayList<>();

    }
}
