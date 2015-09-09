package com.learningjava.chapter03;

import java.util.*;

/**
 * Created by vashishta on 8/21/15.
 */
public class MyCollections {

    /**
     * There are two interfaces at the top
     * 1.) List
     * 2.) Map
     *
     * Any implementation of a List interface can be converted to another within the same tree
     * However a List cannot be converted directly to a Map and vice versa.
     */

    public void buildContacts() {
        Contact contact = new Contact();
        contact.setEmail("abc@yahoo.com");
        contact.setName("ADy");

        Phone phone = new Phone();
        phone.setNumber("121212");
        phone.setPhoneType(PhoneType.HOME);


        Phone phone3 = new Phone();
        phone3.setNumber("121212");
        phone3.setPhoneType(PhoneType.HOME);

        Phone phone2 = null;

        List<Phone> phones = Collections.synchronizedList(new ArrayList<Phone>());

        phones.add(phone);
        phones.add(phone2);
        phones.add(phone3);

        contact.setPhoneList(phones);

        //Collections.sort(phones);

        System.out.println(phones.size());


        contact.getPhoneSet().add(phone);
        contact.getPhoneSet().add(phone2);
        contact.getPhoneSet().add(phone3);

        System.out.println(contact.getPhoneSet().size());
    }

    public void showMap() {

        Phone phone = new Phone();
        phone.setNumber("121212");
        phone.setPhoneType(PhoneType.HOME);

        Phone phone2 = new Phone();
        phone2.setNumber("91212");
        phone2.setPhoneType(PhoneType.HOME);

        Map<String, Phone> keyValue = new HashMap<String, Phone>();
        keyValue.put("Pravin", phone);
        keyValue.put("Pravin", phone2);


        Set<String> keys = keyValue.keySet();

        for(String key:keys){
            Phone value = keyValue.get(key);

            System.out.println(value.getNumber());
        }

    }



    public static void main(String [] args) {
        MyCollections  myCollections = new MyCollections();
        myCollections.buildContacts();

        myCollections.showMap();;
    }

}
