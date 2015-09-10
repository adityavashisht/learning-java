package com.learningjava.chapter05;

/**
 * Created by vashishta on 9/10/15.
 */
public abstract class TeaTemplate {

    protected void makeTea() {
        addWater();
        addMilk();
        addSugar();
        addGinger();

    }

    // Hook
    private void addWater() {
    }

    abstract void addMilk();

    abstract void addSugar();

    protected void addGinger() {
    }
}
