package com.xworkz.springWebApplication.beans;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.service.BloodDonationService;
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
public class BloodDonationBean {
    @Autowired
    private BloodDonationService bloodDonationService;
    public BloodDonationBean(){
        System.out.println("Created BloodDonationBean");
    }

    @PostMapping("/blood")
    public String sendBloodDonarInfo(@Valid BloodDonationDTO bloodDonationDTO, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("error",bindingResult.getAllErrors());
            model.addAttribute("dto",bloodDonationDTO);
        }
        else {
            boolean saved = bloodDonationService.validateAndSave(bloodDonationDTO);
            if (saved) {
                model.addAttribute("bloodMsg", bloodDonationDTO.getName() + " Successfully Registered..");
            }else{
                model.addAttribute("bloodMsg", bloodDonationDTO.getName() + " Not Registered..");

            }
        }
        return "BloodDonation";
    }
}
