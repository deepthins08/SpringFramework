package com.xworkz.springWebApplication.controller;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.PatientInfoDTO;
import com.xworkz.springWebApplication.service.PatientInfoService;
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
public class PatientInfoController {

    @Autowired
    private PatientInfoService patientInfoService;
    public PatientInfoController(){

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

    @GetMapping("/patientSearch")
    public String getPatient(@RequestParam int id, Model model){
        System.out.println("calling getPatient in controller ");
        Optional<PatientInfoDTO> optional= patientInfoService.findById(id);
        if(optional.isPresent()){
            model.addAttribute("msg","Search id is found "+id);
            model.addAttribute("dto1",optional.get());
//           model.addAttribute("dto1",Collections.singletonList(optional.get()));


        }else {
            model.addAttribute("msg","Search id is not found "+id);

        }

        return "PatientSearch";
    }

    @GetMapping("/patient")
    public String getByPhysician(@RequestParam String physician,Model model){
        List<PatientInfoDTO> list= patientInfoService.findByPhysician(physician);
        if(list.isEmpty()){
            model.addAttribute("msg","Patient info is not found");
        }else{
            model.addAttribute("dto1",list);
            model.addAttribute("msg","Patient info is found");
        }

        return "SearchByPhysician";
    }
}
