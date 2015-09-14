package com.learningjava.chapter06;

import com.learningjava.chapter01.Address;
import com.learningjava.chapter01.Name;
import com.learningjava.chapter01.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by vashishta on 9/14/15.
 */
public class MapSample {

    public static void main(String[] args) {

        Map<Person, Address> personMap = new HashMap<>();

        Name nameAdy = new Name("A", null);
        Address address = new Address("123", "Line1", "12345");

        Person person = new Person(nameAdy, address);

        Person personAdyClone = new Person(nameAdy, address);

        personMap.put(person, address);

        personMap.put(personAdyClone, address);

        boolean isEqual = person.equals(personAdyClone);

        Set<Person> personSet = personMap.keySet();

        for (Person personKey : personSet) {

            if (personKey.getName().getLast().equals("A")) {
                System.out.println(personMap.get(personKey));
            }

            if ("A".equals(personKey.getName().getLast())) {
                System.out.println(personMap.get(personKey));
            }
        }


        System.out.println(personMap.size());


    }


}
