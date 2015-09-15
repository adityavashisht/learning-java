package com.learningjava.chapter07;

import java.net.MalformedURLException;

/**
 * Created by vashishta on 9/14/15.
 */
public class ExceptionTest {

    public boolean checkNull(String value) throws IllegalArgumentException, MalformedURLException {

        if (value == null) {
            throw new IllegalArgumentException("Hey dude!");
        } else
            return value != null;


    }

    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();



        try {
            exceptionTest.checkNull(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}