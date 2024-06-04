package com.xworkz.springWebApplication.beans;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.springWebApplication.dto.CustomerFeedbackDTO;
import com.xworkz.springWebApplication.service.CustomerFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class CustomerFeedbackBean {
    @Autowired
    private CustomerFeedbackService customerFeedbackService;

    public CustomerFeedbackBean(){
        System.out.println("Created CustomerFeedbackBean");
    }

    @PostMapping("/feedback")
    public String setFeedback(@Valid CustomerFeedbackDTO customerFeedbackDTO, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors", bindingResult.getAllErrors());
            model.addAttribute("dto", customerFeedbackDTO);
        } else {
            boolean save = customerFeedbackService.validateAndSave(customerFeedbackDTO);
            if (save) {
                model.addAttribute("feedbackMsg", customerFeedbackDTO.getName() + " Thank you for your feedback, Your satisfaction rating is " + customerFeedbackDTO.getSatisfaction());

            } else {
                model.addAttribute("feedbackMsg", " Please try again");

            }
        }
            return "CustomerFeedback";

        }

    }
