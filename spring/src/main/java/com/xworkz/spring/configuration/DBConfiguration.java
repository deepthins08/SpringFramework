package com.xworkz.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.xworkz.spring")
@PropertySource("classpath:application.properties")
public class DBConfiguration {

    public DBConfiguration(){
        System.out.println("Created DBConfiguration");
    }


    @Bean
    public String name(){
        System.out.println("name is registered");
        return "Chrome";
    }

    @Bean
    public String getData(){
        return "properties";
    }

    @Bean
    public String brand(){
        System.out.println("brand is registered");
        return "Realme";
    }

    @Bean
    public String run(){
        return "food";
    }

}
