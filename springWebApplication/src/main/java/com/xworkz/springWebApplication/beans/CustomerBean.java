package com.xworkz.springWebApplication.beans;

import com.xworkz.springWebApplication.dto.CustomerDTO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Component
@RequestMapping("/")
public class CustomerBean {
    public CustomerBean(){
        System.out.println("Created CustomerBean");
    }

    @PostMapping("/customer")
    public String setCustomerInfo(@Valid CustomerDTO customerDTO, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors",bindingResult.getAllErrors());
        }
        else {
            model.addAttribute("customerMsg",customerDTO.getName());
        }
        return "Customer";
    }
}
