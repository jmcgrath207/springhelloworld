package com.johnmcgrath.springhelloworld;

/**
 * Created by john on 4/3/17.
 */

/* A class used to create beans */
public class PersonFactory {
    public Person createPerson(int id, String name) {
        System.out.println("Using factory to create person");
        return new Person(id,name);
    }

}
