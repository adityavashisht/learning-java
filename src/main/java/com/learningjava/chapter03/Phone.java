package com.learningjava.chapter03;

/**
 * Created by vashishta on 8/21/15.
 */
public class Phone implements Comparable {
    PhoneType phoneType;
    String number;

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (!number.equals(phone.number)) return false;
        if (phoneType != phone.phoneType) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = phoneType.hashCode();
        result = 31 * result + number.hashCode();
        return result;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
