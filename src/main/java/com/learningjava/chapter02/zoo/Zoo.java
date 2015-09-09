package com.learningjava.chapter02.zoo;

/**
 * Created by vashishta on 9/9/15.
 */
public class Zoo {

    public static void main(String[] args) {
        Animal [] animals = new Animal[2];

        Animal cat = new Cat();

        animals[0] = cat;

        Animal bird = new Bird();

        animals[1] = bird;


        for(Animal animal : animals) {
            animal.doWalk();
        }


    }
}
