package com.xworkz.springWebApplication.beans;

import com.xworkz.springWebApplication.dto.TravelBookingDTO;
import com.xworkz.springWebApplication.service.TravelBookingService;
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
public class TravelBookingBean {
    @Autowired
    private TravelBookingService travelBookingService;

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
            boolean save = travelBookingService.validateAndSave(travelBookingDTO);
            if (save) {
                model.addAttribute("travelMsg", travelBookingDTO.getName() + " your travel details are confirmed");
            }else{
                model.addAttribute("travelMsg", " your travel details are not confirmed");

            }
        }
        return "Travel";
    }
}
