package com.xworkz.springWebApplication.beans;

import com.xworkz.springWebApplication.dto.CustomerDTO;
import com.xworkz.springWebApplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class CustomerBean {
    @Autowired
    private CustomerService customerService;
    public CustomerBean(){
        System.out.println("Created CustomerBean");
    }


    @PostMapping("/customer")
    public String setCustomerInfo(@Valid CustomerDTO customerDTO, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors",bindingResult.getAllErrors());
            model.addAttribute("dto",customerDTO);
        }
        else {
          boolean save=  customerService.validateAndSave(customerDTO);
          if(save){
              System.out.println("data is saved in controller "+customerDTO);
              model.addAttribute("customerMsg",customerDTO.getName()+" your details are  saved");
          }
          else{
              System.out.println("data is not saved");
              model.addAttribute("customerMsg",customerDTO.getName()+" your details are not saved");
          }

        }
        return "Customer";
    }
}
