package com.xworkz.spring.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {

    @Value("${host}")
    private String host;
    @Value("${port}")
    private int port;
    @Value("${username}")
    private String userName;
    @Value("${password}")
    private String password;

    public DBConnection(){
        System.out.println("Created DBConnection");

    }
    @Autowired
    public String getData(){
        System.out.println("host is "+this.host);
        System.out.println("port no is "+this.port);
        System.out.println("username is "+this.userName);
        System.out.println("password is "+this.password);
        return "properties";
    }


}
