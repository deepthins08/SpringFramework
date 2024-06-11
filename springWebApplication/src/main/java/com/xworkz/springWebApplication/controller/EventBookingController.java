package com.xworkz.springWebApplication.controller;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.EventBookingDTO;
import com.xworkz.springWebApplication.service.EventBookingService;
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
public class EventBookingController {
    @Autowired
    private EventBookingService eventBookingService;

    public EventBookingController(){
        System.out.println("Created EventBookingBean");
    }

    @PostMapping("/event")
    public String setEvent(@Valid EventBookingDTO eventBookingDTO, BindingResult bindingResult,@RequestParam String submit ,Model model){
        System.out.println("running setEvent on event, submit value : "+submit);
        boolean edit=submit.equalsIgnoreCase("Edit");
        if(bindingResult.hasErrors()){
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors",bindingResult.getAllErrors());
            model.addAttribute("dto",eventBookingDTO);
        }
        else {
            if (!edit) {
                boolean save = eventBookingService.validateAndSave(eventBookingDTO);
                if (save) {
                    model.addAttribute("eventMsg", eventBookingDTO.getName() + " ,your " + eventBookingDTO.getGroup() + " is successfully Booked");
                } else {
                    model.addAttribute("eventMsg", eventBookingDTO.getName() + " ,your " + eventBookingDTO.getOtherEventType() + " is not Booked");

                }
            }
        }
        return "EventBooking";
    }

    @GetMapping("/eventSearch")
    public String getEvent(@RequestParam int id,@RequestParam String edit, Model model){

        System.out.println("calling getDonarInfo in controller ");
        Optional<EventBookingDTO> optional= eventBookingService.findById(id);
        if(optional.isPresent()){
            model.addAttribute("msg","Search id is found "+id);
            model.addAttribute("dto1",optional.get());
            if("edit".equals(edit)){
                model.addAttribute("dto",optional.get());
                model.addAttribute("action","edit");
                return "EventBooking";
            }


        }else {
            model.addAttribute("msg","Search id is not found "+id);

        }

        return "EventBookingSearch";
    }

    @GetMapping("/eventTypeSearch")
    public String getEventType(@RequestParam String group,Model model){
        List<EventBookingDTO> list= eventBookingService.findByEventType(group);
        if(list.isEmpty()){
            model.addAttribute("msg","Event type is not found");
        }else{
            model.addAttribute("dto1",list);
            model.addAttribute("msg","Event type is found");
        }

        return "SearchByEventType";
    }
}
