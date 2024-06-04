package com.xworkz.springWebApplication.beans;

import com.xworkz.springWebApplication.dto.EventBookingDTO;
import com.xworkz.springWebApplication.service.EventBookingService;
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
public class EventBookingBean {
    @Autowired
    private EventBookingService eventBookingService;

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
            boolean save = eventBookingService.validateAndSave(eventBookingDTO);
            if (save) {
                model.addAttribute("eventMsg", eventBookingDTO.getName() + " ,your " + eventBookingDTO.getGroup() + " is successfully Booked");
            }else{
                model.addAttribute("eventMsg", eventBookingDTO.getName() + " ,your " + eventBookingDTO.getOtherEventType() + " is not Booked");

            }
        }
        return "EventBooking";
    }
}
