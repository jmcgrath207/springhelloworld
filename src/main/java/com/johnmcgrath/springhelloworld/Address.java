package com.johnmcgrath.springhelloworld;

/**
 * Created by john on 4/3/17.
 */
public class Address {

    private String street;
    private String postcode;

    public Address() {

    }

    public Address(String street, String postcode) {
        this.street = street;
        this.postcode = postcode;
    }

    public void init() {
        System.out.println("Bean Created: " + this);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
