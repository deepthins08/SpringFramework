package com.xworkz.springwebapp.beans;

import com.xworkz.springwebapp.dto.ContactDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ContactInfo {


    public ContactInfo(){
        System.out.println("Created ContactInfo");
    }

    @PostMapping("/go")
    public String getContact(ContactDTO contactDTO, Model model){
        model.addAttribute("info","Thanks for Contact, "+contactDTO.getName());

        return "contact";
    }

}
