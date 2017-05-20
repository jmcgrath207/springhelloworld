package com.johnmcgrath.springhelloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import java.util.ArrayList;
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

         Offer offer1 =  new Offer (89,"John","something@stest.com","yyyyyy");

         offersDoa.update(offer1);


         List<Offer> offers = new ArrayList<Offer>();

         offers.add(new Offer("Dave","something@gmail.com","asdfasfdsad"));
        offers.add(new Offer("Jeff","something@gmail.com","asdfasfdsad"));

        int[] rvals = offersDoa.create(offers);

        for(int value:rvals) {
            System.out.println("Updated " + value + " rows.");
        }






        Offer a = offersDoa.getOffer( 3);

        System.out.println(a);

        offersDoa.delete(88);


        /**
         * Closes Application context in case there is a memory leak
         */

        ((ClassPathXmlApplicationContext)context).close();

    }
}
