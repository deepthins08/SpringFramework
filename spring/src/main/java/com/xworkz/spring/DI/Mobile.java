package com.xworkz.spring.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
    @Autowired
    private String brand;

    public Mobile(){
        System.out.println("Created Mobile");
    }
    @Autowired
    public String setCharger(Charger charger){
        System.out.println("charger is from mobile");
        return "charger";
    }
}
