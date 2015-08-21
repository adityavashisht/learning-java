package com.learningjava.chapter03;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by vashishta on 8/21/15.
 */
public class Contact {

    String name;
    String email;

    List<Phone> phoneList;

    Set<Phone> phoneSet = new HashSet<Phone>();

    public Set<Phone> getPhoneSet() {
        return phoneSet;
    }

    public void setPhoneSet(Set<Phone> phoneSet) {
        this.phoneSet = phoneSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }
}
