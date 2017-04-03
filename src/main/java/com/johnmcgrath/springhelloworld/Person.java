package com.johnmcgrath.springhelloworld;

/**
 * Created by john on 3/28/17.
 */
public class Person {

    private int id;
    private String name;

    private int taxId;

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void speak() {
        System.out.println("Hello! I'am a person.");

    }

    /* method is used to print out these variables if object is printed to screen */
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taxId=" + taxId +
                '}';
    }
}
