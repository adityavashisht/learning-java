package com.learningjava.chapter04;

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
    }
}
