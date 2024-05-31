package com.xworkz.springWebApplication.beans;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class BloodDonationBean {
    public BloodDonationBean(){
        System.out.println("Created BloodDonationBean");
    }

    @PostMapping("/blood")
    public String sendBloodDonarInfo(BloodDonationDTO bloodDonationDTO, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("error",bindingResult.getAllErrors());
            model.addAttribute("dto",bloodDonationDTO);
        }
        else{
            model.addAttribute("bloodMsg",bloodDonationDTO.getName()+" Successfully Registered..");
        }
        return "BloodDonation";
    }
}
