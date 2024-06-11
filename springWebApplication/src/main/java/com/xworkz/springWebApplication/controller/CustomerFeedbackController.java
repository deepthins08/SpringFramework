package com.xworkz.springWebApplication.controller;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.CustomerFeedbackDTO;
import com.xworkz.springWebApplication.service.CustomerFeedbackService;
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
public class CustomerFeedbackController {
    @Autowired
    private CustomerFeedbackService customerFeedbackService;

    public CustomerFeedbackController(){
        System.out.println("Created CustomerFeedbackBean");
    }

    @PostMapping("/feedback")
    public String setFeedback(@Valid CustomerFeedbackDTO customerFeedbackDTO, BindingResult bindingResult, Model model,@RequestParam String submit) {

        System.out.println("running setFeedback on feedback, submit value : "+submit);
        boolean edit=submit.equalsIgnoreCase("Edit");
        if (bindingResult.hasErrors()) {
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors", bindingResult.getAllErrors());
            model.addAttribute("dto", customerFeedbackDTO);
        } else {
            if (!edit) {
                boolean save = customerFeedbackService.validateAndSave(customerFeedbackDTO);
                if (save) {
                    model.addAttribute("feedbackMsg", customerFeedbackDTO.getName() + " Thank you for your feedback, Your satisfaction rating is " + customerFeedbackDTO.getSatisfaction());

                } else {
                    model.addAttribute("feedbackMsg", " Please try again");

                }
            }
        }
            return "CustomerFeedback";

        }

    @GetMapping("/feedbackSearch")
    public String getFeedback(@RequestParam int id,@RequestParam String edit, Model model){

        System.out.println("calling getDonarInfo in controller ");

            Optional<CustomerFeedbackDTO> optional = customerFeedbackService.findById(id);

            if (optional.isPresent()) {
                model.addAttribute("msg", "Search id is found " + id);
                model.addAttribute("dto1", optional.get());
               if("edit".equals(edit)){
                   model.addAttribute("dto",optional.get());
                   model.addAttribute("action","edit");
                   return "CustomerFeedback";
               }

            } else {
                model.addAttribute("msg", "Search id is not found " + id);

            }

        return "CustomerFeedbackSearch";
    }

    @GetMapping("/feedback")
    public String getByName(@RequestParam String name,Model model){
        List<CustomerFeedbackDTO> list= customerFeedbackService.findByName(name);


        if(list.isEmpty()){
            model.addAttribute("msg","Customer information is not found");
        }else{
            model.addAttribute("dto1",list);
            model.addAttribute("msg","Customer Information is found");
        }

        return "FeedbackNameSearch";
    }
    }
