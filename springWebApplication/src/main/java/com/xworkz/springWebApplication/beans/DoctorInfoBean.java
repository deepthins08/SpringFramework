package com.xworkz.springWebApplication.beans;

import com.xworkz.springWebApplication.dto.DoctorInfoDTO;
import com.xworkz.springWebApplication.service.DoctorInfoService;
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
public class DoctorInfoBean {
@Autowired
    private DoctorInfoService doctorInfoService;

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

            boolean save = doctorInfoService.validateAndSave(doctorInfoDTO);
            if (save) {
                model.addAttribute("doctorMsg", doctorInfoDTO.getName() + " ,your details are received");
            }else {
                model.addAttribute("doctorMsg", doctorInfoDTO.getName() + " ,your details are not received");

            }

        }

        return "DoctorInfo";
    }
}
