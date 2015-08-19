package com.learningjava.chapter01;

/**
 * Created by vashishta on 8/19/15.
 */

import java.util.ArrayList;
import java.util.List;

/**

 * A person is-a human. Is-a relationship indicates a parent-child association
 *
 * Immutability - allows us to create instances from classes where, when once created,
 * we cannot alter the state of the object
 */
public class Person extends Human {
    /**
     * A person has-a name
     */
    private final Name name;

    private  int age;

    /**
     * A person has an address
     */
    private final Address address;

    private final List<String> watches;

    public void addOneMoreWatch(String watch) {
        watches.add(watch);
    }

    /**
     *
     * @param name
     * @param address
     */
    public Person(Name name, Address address) {
        this.name = name;
        this.address = address;
        this.watches = new ArrayList<String>();
        this.age=  0;
    }

    public Person(Name name, Address address, int age) {
        this.name = name;
        this.address = address;
        this.watches = new ArrayList<String>();
        this.age = age;
    }


    /**
     * What is "this"?
     * @param nme
     */
    public Person(Name nme) {
        name = nme;
        this.address = null;
        this.watches = null;
        this.age = 0;
    }


    public Name getName() {
        return name;
    }



    public Address getAddress() {
        return address;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
