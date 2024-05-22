package com.xworkz.springwebapp.beans;

import com.xworkz.springwebapp.dto.MatrimonyDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.crypto.Data;

@Component
@RequestMapping("/")
public class MatrimonyInfo {

    public String name;

    public MatrimonyInfo(){
        System.out.println("Created MatrimonyInfo");
    }

    @PostMapping("/marriage")
    public String sendInfo(MatrimonyDTO matrimonyDTO){
        System.out.println("After registration");
        System.out.println("Registered Details are "+matrimonyDTO);


        return "MatrimonyRegister.html";
    }



}
