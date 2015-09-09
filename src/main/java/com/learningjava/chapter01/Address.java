package com.learningjava.chapter01;

/**
 * Created by vashishta on 8/19/15.
 */
public class Address {

    String street;// default values on creation via the default constructor is a null
    String line1;
    String zipCode;
    int apartment;// default value will be 0
    boolean international; //default is false

    Integer houseNumber;

    double y;
    Double ab;
    Boolean magic;

    public Address(String street, String line1, String zipCode) {
        this.street = street;
        this.line1 = line1;
        this.zipCode = zipCode;
    }

    public Boolean getMagic() {
        return magic;
    }

    public void setMagic(Boolean magic) {
        this.magic = magic;
    }

    public boolean isInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Double getAb() {
        return ab;
    }

    public void setAb(Double ab) {
        this.ab = ab;
    }

    public Address() {
    }

    // Accessors
    public String getZipCode() {
        return zipCode;
    }

    // Mutators
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", line1='" + line1 + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", apartment=" + apartment +
                ", international=" + international +
                ", houseNumber=" + houseNumber +
                ", y=" + y +
                ", ab=" + ab +
                ", magic=" + magic +
                '}';
    }
}
