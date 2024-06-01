package com.xworkz.springWebApplication.beans;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.springWebApplication.dto.CustomerFeedbackDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Component
@RequestMapping("/")
public class CustomerFeedbackBean {

    public CustomerFeedbackBean(){
        System.out.println("Created CustomerFeedbackBean");
    }

    @PostMapping("/feedback")
    public String setFeedback(@Valid CustomerFeedbackDTO customerFeedbackDTO, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors",bindingResult.getAllErrors());
            model.addAttribute("dto",customerFeedbackDTO);
        }
        else {
            model.addAttribute("feedbackMsg",customerFeedbackDTO.getName()+" Thank you for your feedback, Your satisfaction rating is "+customerFeedbackDTO.getSatisfaction());
        }

        return "CustomerFeedback";
    }
}
