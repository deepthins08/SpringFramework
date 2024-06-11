package com.xworkz.springWebApplication.controller;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.DoctorInfoDTO;
import com.xworkz.springWebApplication.service.DoctorInfoService;
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
public class DoctorInfoController {
@Autowired
    private DoctorInfoService doctorInfoService;

    public DoctorInfoController(){
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
    @GetMapping("/doctorSearch")
    public String getDonarInfo(@RequestParam int id, Model model){
        System.out.println("calling getDonarInfo in controller ");
        Optional<DoctorInfoDTO> optional= doctorInfoService.findById(id);
        if(optional.isPresent()){
            model.addAttribute("msg","Search id is found "+id);
            model.addAttribute("dto1",optional.get());


        }else {
            model.addAttribute("msg","Search id is not found "+id);

        }

        return "DoctorSearch";
    }

    @GetMapping("/hospital")
    public String getByName(@RequestParam String hospital,Model model){
        List<DoctorInfoDTO> list= doctorInfoService.findByHospital(hospital);
        if(list.isEmpty()){
            model.addAttribute("msg","Doctor information is not found");
        }else{
            model.addAttribute("dto1",list);
            model.addAttribute("msg","Doctor Information is found");
        }

        return "SearchByHospital";
    }
}
