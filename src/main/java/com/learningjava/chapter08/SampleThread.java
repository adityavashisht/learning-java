package com.learningjava.chapter08;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by vashishta on 9/15/15.
 */
public class SampleThread {

    public static void main(String[] args) {
        int poolSize = 10;

        Executor executor = Executors.newFixedThreadPool(poolSize);

        for (int index = 0; index < 1000; index++) {
            System.out.println(index);
            executor.execute(new JavaAgent());

        }
    }


}
