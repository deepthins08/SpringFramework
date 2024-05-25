package com.xworkz.springwebapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.springwebapp")
@PropertySource("classpath:application.properties")
public class SpringConfiguration {

    public SpringConfiguration(){
        System.out.println("Created SpringConfiguration");
    }


    @Bean
    public ViewResolver viewResolver(){
        System.out.println("Created ViewResolver");
     return new InternalResourceViewResolver("/",".jsp");
    }


}
