package com.johnmcgrath.springhelloworld;

/**
 * Created by john on 3/28/17.
 */
public class Person {

    private int id;
    private String name;

    private int taxId;

    /* We are dependcy injects the address object into too the person object */
    private Address address;

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public static Person getInstance(int id,String name) {
        System.out.println("Creating Person using factory method");
        return new Person(id, name);
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /* on create method, this starts after the constructor is built */

    public void onCreate() {
        System.out.println("Person created: " + this);
    }

    public void onDestory()  {
        System.out.println("Person destoroyed." + this);
    }

    public void speak() {
        System.out.println("Hello! I'am a person.");

    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /* method is used to print out these variables if object is printed to screen */
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taxId=" + taxId +
                ", address=" + address +
                '}';
    }
}
