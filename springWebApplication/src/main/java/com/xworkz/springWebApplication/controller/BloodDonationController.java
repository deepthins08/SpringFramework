package com.xworkz.springWebApplication.controller;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.service.BloodDonationService;
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
public class BloodDonationController {
    @Autowired
    private BloodDonationService bloodDonationService;
    public BloodDonationController(){
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
    @GetMapping("/donationSearch")
    public String getDonarInfo(@RequestParam int id,Model model){
        System.out.println("calling getDonarInfo in controller ");
       Optional<BloodDonationDTO> optional= bloodDonationService.findById(id);
       if(optional.isPresent()){
           model.addAttribute("msg","Search id is found "+id);
           model.addAttribute("dto1",optional.get());
//           model.addAttribute("dto1",Collections.singletonList(optional.get()));


       }else {
           model.addAttribute("msg","Search id is not found "+id);

       }

        return "BloodDonationSearch";
    }

    @GetMapping("/donarName")
    public String getByName(@RequestParam String name,Model model){
      List<BloodDonationDTO> list= bloodDonationService.findByName(name);
      if(list.isEmpty()){
          model.addAttribute("msg","Donar information is not found");
      }else{
          model.addAttribute("dto1",list);
          model.addAttribute("msg","Donar Information is found");
      }

        return "donarNameSearch";
    }
}
