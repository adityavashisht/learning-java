package com.learningjava.chapter08;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by vashishta on 9/15/15.
 */
public class SynchExample {

    private String candy = "abc";

    private final String TOKEN = "LOCK";

    private ReentrantLock reentrantLock = new ReentrantLock(true);

    public synchronized String getValue() {
        return candy;
    }

    public String getValueWithBlock() {
        synchronized (TOKEN) {
            return candy;
        }
    }

    public String getWithRentry() {
        String val = "";

        try {
            reentrantLock.lock();
            val = candy;
        }



        finally {
            reentrantLock.unlock();
        }

        return val;
    }


}
