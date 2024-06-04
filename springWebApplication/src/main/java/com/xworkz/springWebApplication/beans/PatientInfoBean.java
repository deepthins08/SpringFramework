package com.xworkz.springWebApplication.beans;

import com.xworkz.springWebApplication.dto.PatientInfoDTO;
import com.xworkz.springWebApplication.service.PatientInfoService;
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
public class PatientInfoBean {

    @Autowired
    private PatientInfoService patientInfoService;
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
            boolean save = patientInfoService.validAndSave(patientInfoDTO);
            if (save) {
                model.addAttribute("patientMsg", patientInfoDTO.getName() + " Your details are received");
            }else {
                model.addAttribute("patientMsg", " Your details are not received");

            }
        }
        return "PatientInfo";
    }
}
