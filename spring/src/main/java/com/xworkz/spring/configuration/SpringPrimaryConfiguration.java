package com.xworkz.spring.configuration;

import com.xworkz.spring.beans.Mug;
import com.xworkz.spring.beans.Snake;
import com.xworkz.spring.beans.Spoon;
import com.xworkz.spring.beans.Temple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;

@Configuration
@ComponentScan("com.xworkz.spring")
public class SpringPrimaryConfiguration {

    public SpringPrimaryConfiguration(){
        System.out.println("Created SpringPrimaryConfiguration");
    }
    @Bean
    public String name(){
        System.out.println("Created name");
        return "Edward";
    }
    @Bean
    public char[] address(){
        System.out.println("Created address");
        return new char[]{'b', 'e', 'n', 'g', 'a', 'l', 'o', 'r', 'e'};
    }
    @Bean
    public LinkedList<String> family(){
        System.out.println("Created LinkedList");
        LinkedList<String> familyList = new LinkedList<>();

        familyList.add("John");
        familyList.add("Mary");
        familyList.add("David");
        familyList.add("Sarah");

        return familyList;
    }
    @Bean
    public Map<String,Integer> subAndMarks(){
        System.out.println("Created subAndMarks");
        Map<String, Integer> subjectMarks = new HashMap<>();

        subjectMarks.put("Math", 90);
        subjectMarks.put("Science", 85);
        subjectMarks.put("History", 88);

        return subjectMarks;
    }
    @Bean
    public Properties userAndPassword(){
        System.out.println("Created userAndPassword");
//        Properties properties = new Properties();
//
//        props.setProperty("user1", "password1");
//        props.setProperty("user2", "password2");
//        props.setProperty("user3", "password3");


        return new Properties();
    }
    @Bean
    public Temple templeBean(){
        System.out.println("Created temple in configuration");
        return new Temple();
    }
    @Bean
    public Spoon spoon(){
        System.out.println("Created Spoon in Configuration");
        return new Spoon();
    }
    @Bean
    public Mug mug(){
        System.out.println("Created Mug in Configuration");
        return new Mug();
    }
    @Bean
    public Snake snake(){
        System.out.println("Created Snake in Configuration");
        return new Snake();
    }

    @Bean
    public String color(){
        System.out.println("Color is ceated");
        return "black";
    }
}
