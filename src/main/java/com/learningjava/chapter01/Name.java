package com.learningjava.chapter01;

/**
 * Created by vashishta on 8/19/15.
 * The name type, when created via its constructor to represent a name
 * A name can have a first and a last name.
 */
public class Name {

    private String first;
    String middleName;
    private String last;
    String prefix;
    String suffix;

    /**
     * A name should only be created when first and last name are available.
     * We should never create a name without a first name and a last name
     */

    public Name(String firstName, String lastName) {
        first = firstName;
        last = lastName;
    }

    public Name() {}

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Name name = (Name) o;

        if (!first.equals(name.first)) return false;
        if (!last.equals(name.last)) return false;

        return true;
    }


    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int result = first.hashCode();
        result = 31 * result + last.hashCode();
        return result;
    }
}
