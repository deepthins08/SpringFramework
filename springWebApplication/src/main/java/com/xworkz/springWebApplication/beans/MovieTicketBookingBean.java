package com.xworkz.springWebApplication.beans;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.springWebApplication.dto.MovieTicketBookingDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Component
@RequestMapping("/")
public class MovieTicketBookingBean {

    public MovieTicketBookingBean(){
        System.out.println("Created MovieTicketBookingBean");
    }

    @PostMapping("/movie")
    public String setMovie(@Valid MovieTicketBookingDTO movieTicketBookingDTO, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors",bindingResult.getAllErrors());
            model.addAttribute("dto",movieTicketBookingDTO);

        }else {
            model.addAttribute("movieMsg","Your Movie Tickets are booked for "+movieTicketBookingDTO.getGroup());
        }

        return "MovieTicketBooking";
    }
}
