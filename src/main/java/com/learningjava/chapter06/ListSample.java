package com.learningjava.chapter06;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vashishta on 9/14/15.
 */
public class ListSample {


    public static void main(String[] args) {
        List<String> values = new ArrayList<String>();
        values.add("Ady");
        values.add("Test");
        values.add("Check");
        values.add(null);
        values.add(null);

        for (String value : values) {
            if (value != null) {
                System.out.println(value);
            }
        }
    }
}
