package com.learningjava.chapter04;

/**
 * Created by vashishta on 9/9/15.
 */
public class HondaCrv extends Honda {


    @Override
    public void drive() {
        System.out.println("Honda CRV Driving");
    }

    @Override
    public void tootHorn() {
        System.out.println("Toot");
    }

    @Override
    public void idle() {

    }
}
