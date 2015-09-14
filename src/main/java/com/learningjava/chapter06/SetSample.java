package com.learningjava.chapter06;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vashishta on 9/14/15.
 */
public class SetSample {

    public static void main(String[] args) {
        Set<String> values = new HashSet<String>();
        values.add("Ady");
        values.add("Test");
        values.add(null);
        values.add(null);

        for (String value : values) {
            System.out.println(value);
        }
    }
}
