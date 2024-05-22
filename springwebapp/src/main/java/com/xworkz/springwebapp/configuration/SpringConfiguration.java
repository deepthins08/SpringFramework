package com.xworkz.springwebapp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.xworkz.springwebapp")
@PropertySource("classpath:application.properties")
public class SpringConfiguration {

    public SpringConfiguration(){
        System.out.println("Created SpringConfiguration");
    }


}
