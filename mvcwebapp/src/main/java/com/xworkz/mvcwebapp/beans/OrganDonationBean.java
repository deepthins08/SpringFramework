package com.xworkz.mvcwebapp.beans;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.mvcwebapp.dto.OrganDonationDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class OrganDonationBean {

    public OrganDonationBean(){
        System.out.println("Created OrganDonationBean");
    }

    @PostMapping("/donate")
    public String setDonation(OrganDonationDTO dto,Model model){
        model.addAttribute("organ","Thank you for Registering "+dto.getName());
        return "organDonation";
    }




}
