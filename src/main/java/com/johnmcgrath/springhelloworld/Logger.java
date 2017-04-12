package com.johnmcgrath.springhelloworld;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;



/**
 * Created by john on 4/7/17.
 */



public class Logger  {


    public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
        this.consoleWriter = consoleWriter;
        this.fileWriter = fileWriter;
    }

    private ConsoleWriter consoleWriter;


    private FileWriter fileWriter;

    public void setConsoleWriter(ConsoleWriter writer) {
        this.consoleWriter = writer;
    }


    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }

    public void writeConsole(String text) {
        consoleWriter.write(text);
    }

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @PreDestroy
    public void destory() {
        System.out.println("destory");
    }

}
