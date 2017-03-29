package com.johnmcgrath.springhelloworld;

import org.springframework.context.ApplicationContext;

/**
 * Hello world! for spring
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context;

        Person person = new Person();
        person.speak();

    }
}
