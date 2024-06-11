package com.xworkz.springWebApplication.controller;

import com.xworkz.springWebApplication.dto.CustomerDTO;
import com.xworkz.springWebApplication.dto.CustomerFeedbackDTO;
import com.xworkz.springWebApplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    public CustomerController(){
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

    @GetMapping("/customerSearch")
    public String getCustomer(@RequestParam int id, Model model){
        System.out.println("calling getCustomer in controller ");
        Optional<CustomerDTO> optional= customerService.findById(id);
        if(optional.isPresent()){
            model.addAttribute("msg","Search id is found "+id);
            model.addAttribute("dto1",optional.get());
//           model.addAttribute("dto1",Collections.singletonList(optional.get()));


        }else {
            model.addAttribute("msg","Search id is not found "+id);

        }

        return "CustomerSearch";
    }

    @GetMapping("/search")
    public String getByGender(@RequestParam String gender,Model model){
        List<CustomerDTO> list= customerService.findByGender(gender);
        if(list.isEmpty()){
            model.addAttribute("msg","Customer information is not found");
        }else{
            model.addAttribute("dto1",list);
            model.addAttribute("msg","Customer Information is found");
        }

        return "SearchByGender";
    }
}
