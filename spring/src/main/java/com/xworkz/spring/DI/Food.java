package com.xworkz.spring.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Food {
    @Value("${Food}")
    private String name;

    public Food(){
        System.out.println("Created Food");
    }
   @Autowired
    public String run(){
        System.out.println("name of the food is "+this.name);
        return "dosa";
    }

}
