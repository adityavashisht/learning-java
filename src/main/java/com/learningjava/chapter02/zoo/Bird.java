package com.learningjava.chapter02.zoo;

/**
 * Created by vashishta on 9/9/15.
 */
public class Bird extends Animal {

    @Override
    protected void makeSound() {
        System.out.println("Chirp");
    }

    @Override
    protected void doWalk() {
        System.out.println("Step two");
    }
}
