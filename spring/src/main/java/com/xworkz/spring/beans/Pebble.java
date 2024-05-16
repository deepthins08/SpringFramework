package com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pebble {

    @Autowired
    private String color;
    @Autowired
    @Qualifier("name")  //spring will compare the return type and then property name with the bean name.
    private String size; //here size is property name but by using qualifier i have passed name to match with
    // return type in configuration

    public Pebble(){
        System.out.println("Created Pebble");
    }
}
