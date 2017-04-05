package com.johnmcgrath.springhelloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world! for spring
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        /** ApplicationContext is a bean container,
         * It is a class that instantiate beans.
         *
         * Beans are java objects that are imported via
         * spring framework
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Person person1 = (Person)context.getBean("person");

        person1.setTaxId(666);
        System.out.println(person1);

        Address address2 =(Address)context.getBean("address2");
        System.out.println(address2);

        /**
         * Closes Application context incase there is a memory leak
         */

        /* ((ClassPathXmlApplicationContext)context).close(); */

    }
}
