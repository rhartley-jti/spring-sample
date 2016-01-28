package com.pluralsight.model;

/**
 * Created by rhartley on 1/27/2016.
 */
public class Customer {
    private String firstname;
    private String lastname;

    public Customer() {

    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
