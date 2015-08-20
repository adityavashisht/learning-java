package com.learningjava.chapter02;

import com.learningjava.chapter01.Name;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vashishta on 8/20/15.
 */
public class LoopingSample {

    private static List<Name> names = new ArrayList<Name>();

    static {
        Name name = new Name("Aditya", "Vashisht");
        Name name2 = new Name("Oliver", "Vashisht");

        names.add(name);
        names.add(name2);
    }

    public void forLoop() {
        System.out.println("FOR LOOP");
        for (int index = 0; index < 10; index++) {
            System.out.println(index);
        }
    }

    public void whileLoop() {
        System.out.println("WHILE LOOP");
        int counter = 0;
        while (counter < 10) {
            System.out.println(counter);
            ++counter;

        }

    }

    public void doWhileLoop() {

        System.out.println("DO-WHILE LOOP");
        int counter = 0;

        do {
            System.out.println(counter);
            counter++;
        }
        while (counter < 10);
    }

    /**
     * Stop processing and exit loop
     */
    public void doLoopingWithBreak() {
        System.out.println("FOR LOOP - BREAK");
        for (int index = 0; index < 10; index++) {
            if (index == 3) break;
            System.out.println(index);
        }
    }

    /**
     * Continue processing or skip
     */
    public void doLoopingContinue() {
        System.out.println("FOR LOOP - CONTINUE");
        for (int index = 0; index < 10; index++) {
            if (index == 3) continue;
            System.out.println(index);
        }

    }

    public void loopOverNames() {
        for (Name name : names) {
            System.out.println(name.getFirst());
        }
    }

    public void doLoopingNamesTerrible() {
        int length = names.size();

        for(int index = 0; index<length ; index++) {
            Name name = names.get(index);
            System.out.println(name.getFirst());
        }
    }

    /**
     * Form 0 to 100
     */
    public void loopOverNumbersDivisibleBy2() {

    }



    public static void main(String[] args) {
        LoopingSample sample = new LoopingSample();
        sample.forLoop();
        sample.whileLoop();
        sample.doWhileLoop();

        sample.doLoopingWithBreak();
        sample.doLoopingContinue();

        sample.loopOverNames();

        sample.doLoopingNamesTerrible();
    }
}
