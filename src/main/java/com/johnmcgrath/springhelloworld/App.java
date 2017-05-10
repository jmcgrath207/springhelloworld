package com.johnmcgrath.springhelloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


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
        OffersDOA offersDoa = (OffersDOA)context.getBean("offersDoa");

        List<Offer> offers = offersDoa.getOffers();

        for(Offer offer: offers) {
            System.out.println(offer);

        }



        /**
         * Closes Application context in case there is a memory leak
         */

        ((ClassPathXmlApplicationContext)context).close();

    }
}
