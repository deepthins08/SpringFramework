package com.xworkz.springWebApplication.beans;

import com.xworkz.springWebApplication.dto.DoctorInfoDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Component
@RequestMapping("/")
public class DoctorInfoBean {

    public DoctorInfoBean(){
        System.out.println("Created DoctorInfoBean");
    }

    @PostMapping("/doctor")
    public String setDoctor(@Valid DoctorInfoDTO doctorInfoDTO, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors",bindingResult.getAllErrors());
            model.addAttribute("dto",doctorInfoDTO);
        }else {
            model.addAttribute("doctorMsg",doctorInfoDTO.getName()+" ,your details are received");
        }

        return "DoctorInfo";
    }
}
