package com.learningjava.chapter02;

/**
 * Created by vashishta on 8/21/15.
 */
public class Constructs {

    public enum Week {
        M, T, W, TH, F, SA, SU
    }

    public void showSwitchCase(Week week) {

        int month = 8;
        String monthString;
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";


                break;
        }


    }

    public void showTernaryUsage() {
        String empty = "";
        boolean isEmpty = (empty.length() == 0) ? true : false;

        if (empty.length() == 0) {
            isEmpty = true;
        } else {
            isEmpty = false;
        }

    }

    public void showIfElse() {

        int month = 8;
        String monthString;

        if (month == 1) {

        } else if (month == 2) {

        } else if (month == 3) {

        } else {

        }

    }

    public void showLogicalOr() {
        int value = 1;
        int value2 = 2;
        int value3 = -1;

        boolean isPositive1 = (value > 0) ? true : false;
        boolean isPositive2 = (value2>0)? true:false;
        boolean isPositive3 = (value3>0)? true:false;

        // Now match them on the OR condition
        boolean isValid = isPositive1 || isPositive2 || isPositive3;
        System.out.println(isValid);

    }

    public void showLogicalAnd() {
        int value = 1;
        int value2 = -1;

        boolean isPositive1 = (value > 0) ? true : false;
        boolean isPositive2 = (value2>0)? true:false;

        // Now match them on the AND condition
        boolean isValid = isPositive1 && isPositive2;

        System.out.println(isValid);


    }




    public static void main(String [] args) {
        Constructs constructs = new Constructs();
        constructs.showLogicalAnd();
        constructs.showLogicalOr();
    }


}
