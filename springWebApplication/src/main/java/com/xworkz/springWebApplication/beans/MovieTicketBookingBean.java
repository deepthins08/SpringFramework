package com.xworkz.springWebApplication.beans;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.springWebApplication.dto.MovieTicketBookingDTO;
import com.xworkz.springWebApplication.service.MovieTicketBookingService;
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
public class MovieTicketBookingBean {
    @Autowired
    private MovieTicketBookingService movieTicketBookingService;

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
            boolean save = movieTicketBookingService.validateAndSave(movieTicketBookingDTO);
            if (save) {
                model.addAttribute("movieMsg", "Your Movie Tickets are booked for  " + movieTicketBookingDTO.getGroup());
            }else{
                model.addAttribute("movieMsg", "Your Movie Tickets are not booked  ");

            }
        }

        return "MovieTicketBooking";
    }
}
