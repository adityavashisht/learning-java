package com.learningjava.chapter01;

import org.testng.annotations.Test;

/**
 * Created by vashishta on 9/8/15.
 */
public class AddressTest {


    public static void main(String[] args) {

        Address address = new Address();
        int x = 32;

        Integer apartmentValue = new Integer(1);

        address.setHouseNumber(x);

        address.setApartment(apartmentValue);


        Address address1 = new Address("abc","def","1234");

        System.out.println(address1);


    }
}
