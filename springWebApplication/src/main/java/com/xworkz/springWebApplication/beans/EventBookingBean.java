package com.xworkz.springWebApplication.beans;

import com.xworkz.springWebApplication.dto.EventBookingDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Component
@RequestMapping("/")
public class EventBookingBean {

    public EventBookingBean(){
        System.out.println("Created EventBookingBean");
    }

    @PostMapping("/event")
    public String setEvent(@Valid EventBookingDTO eventBookingDTO, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors",bindingResult.getAllErrors());
            model.addAttribute("dto",eventBookingDTO);
        }
        else {
            model.addAttribute("eventMsg",eventBookingDTO.getName()+" ,your "+eventBookingDTO.getOtherEventType() +" is successfully Booked");
        }
        return "EventBooking";
    }
}
