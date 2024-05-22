package com.xworkz.springwebapp.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class SendInfo {

  public SendInfo(){
        System.out.println("Created SendInfo");
    }

    @PostMapping("/send")
    public String onSend(){
        System.out.println("after clicking the submit button this message will be appear");

      return "index.jsp";
    }


}
