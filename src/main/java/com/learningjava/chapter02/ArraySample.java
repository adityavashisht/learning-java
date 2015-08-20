package com.learningjava.chapter02;

/**
 * Created by vashishta on 8/20/15.
 */
public class ArraySample {
    /**
     * Arrays are single dimensional, two-dimensional
     */
    private static String[] names = {"Aditya" /* 0 index value*/, "Oliver" /* 1 index value*/};


    private static int[] numbers = {0, 1, 2};

    private static float[] money = {10.0f, 12.0f};

    private static double[] lottery = {1000.00, 100000.00};

    private static long[] roads = {122, 151};

    private static String [] notSureNamesSize = new String[3];

    public static void loop () {
        for(int index = 0; index < notSureNamesSize.length; index++) {
            System.out.println(notSureNamesSize[index]);
        }
    }

    static {
        notSureNamesSize[0] = "Aditya";
        notSureNamesSize[1] = "Oliver";
        notSureNamesSize[2] = "Enzo";
    }

    public static void main(String [] args) {
        loop();
    }
}
