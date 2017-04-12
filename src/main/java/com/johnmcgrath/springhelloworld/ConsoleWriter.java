package com.johnmcgrath.springhelloworld;

import org.springframework.stereotype.Component;

/**
 * Created by john on 4/7/17.
 */

@Component
public class ConsoleWriter {


    public void write(String text) {
        System.out.println(text);
    }

}