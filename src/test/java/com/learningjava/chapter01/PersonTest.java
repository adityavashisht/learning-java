package com.learningjava.chapter01;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by vashishta on 8/19/15.
 */
public class PersonTest {

    @Test
    public  void testPerson() {
        Name name = new Name("Ashish", "KC");
        Person personWithOnlyName = new Person(name);



        Address address = new Address();
        address.setLine1("Some Line 1");
        address.setStreet("Set Street One");

        Name newName = new Name("Pravin", "ABC");

        Person personWithAddress = new Person(newName, address);

        personWithAddress.addOneMoreWatch("Casio");

        Assert.assertEquals(personWithAddress.getName().getFirst(),"Pravin");
        Assert.assertEquals(personWithOnlyName.getName().getFirst(), "Ashish");
    }
}
