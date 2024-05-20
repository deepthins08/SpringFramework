package com.xworkz.spring.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Browser {
    @Autowired
    private String name;


    @Autowired
    public Browser(Internet internet){
        System.out.println("DI Using Constructor");
    }
}
