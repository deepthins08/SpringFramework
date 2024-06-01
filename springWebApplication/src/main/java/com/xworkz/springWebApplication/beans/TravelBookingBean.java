package com.xworkz.springWebApplication.beans;

import com.xworkz.springWebApplication.dto.TravelBookingDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Component
@RequestMapping("/")
public class TravelBookingBean {

    public TravelBookingBean(){

        System.out.println("Created TravelBookingBean");
    }


    @PostMapping("/travel")
    public String setTravel(@Valid TravelBookingDTO travelBookingDTO, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors",bindingResult.getAllErrors());
            model.addAttribute("dto",travelBookingDTO);
        }
        else {
            model.addAttribute("travelMsg",travelBookingDTO.getName()+ " your travel details are confirmed");
        }
        return "Travel";
    }
}
