package com.learningjava.chapter08;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by vashishta on 9/15/15.
 */
public class SampleThread implements Runnable {

    private class MyThread implements Runnable {

        @Override
        public void run() {

        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        SampleThread thread = new SampleThread();
        thread.doExecutor();

    }

    /**
     *
     */
    public void doExecutor() {
        int poolSize = 10;

        Executor executor = Executors.newFixedThreadPool(poolSize);

        for (int index = 0; index < 1000; index++) {
            System.out.println(index);
            // Anonymous inner class
            executor.execute(this);
            executor.execute(new MyThread());

        }
    }

    private void doAnotherTask() {

    }


    @Override
    public void run() {
        doAnotherTask();
        System.out.println("Test");
    }
}
