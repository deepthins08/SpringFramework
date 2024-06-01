package com.xworkz.springWebApplication.beans;

import com.xworkz.springWebApplication.dto.PatientInfoDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Component
@RequestMapping("/")
public class PatientInfoBean {


    public PatientInfoBean(){

        System.out.println("Created PatientInfoBean");
    }

    @PostMapping("/patient")
    public String setPatient(@Valid PatientInfoDTO patientInfoDTO, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors",bindingResult.getAllErrors());
            model.addAttribute("dto",patientInfoDTO);
        }else {
            model.addAttribute("patientMsg",patientInfoDTO.getName()+" Your details are received");
        }
        return "PatientInfo";
    }
}
