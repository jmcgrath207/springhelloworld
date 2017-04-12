package com.johnmcgrath.springhelloworld;


import org.springframework.stereotype.Component;

/**
 * Created by john on 4/7/17.
 */

@Component
public class FileWriter {

    public void write(String text) {
        // Write to a file here.
        // Dummy implementation
        System.out.println("Write to file: " + text);

    }

}
