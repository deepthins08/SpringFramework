package com.xworkz.spring.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Human {
    @Autowired
    
    private Food food;

    public Human(){
        System.out.println("Created Human");
    }

}
