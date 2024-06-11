package com.xworkz.springWebApplication.controller;

import com.xworkz.springWebApplication.dto.MovieTicketBookingDTO;
import com.xworkz.springWebApplication.service.MovieTicketBookingService;
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
public class MovieTicketBookingController {
    @Autowired
    private MovieTicketBookingService movieTicketBookingService;

    public MovieTicketBookingController(){
        System.out.println("Created MovieTicketBookingBean");
    }

    @PostMapping("/movie")
    public String setMovie(@Valid MovieTicketBookingDTO movieTicketBookingDTO, BindingResult bindingResult, Model model,@RequestParam String submit){
        System.out.println("running setMovie on feedback, submit value : "+submit);
        boolean edit=submit.equalsIgnoreCase("Edit");
        if(bindingResult.hasErrors()){
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("errors",bindingResult.getAllErrors());
            model.addAttribute("dto",movieTicketBookingDTO);

        }else {
            if (!edit) {
                boolean save = movieTicketBookingService.validateAndSave(movieTicketBookingDTO);
                if (save) {
                    model.addAttribute("movieMsg", "Your Movie Tickets are booked for  " + movieTicketBookingDTO.getGroup());
                } else {
                    model.addAttribute("movieMsg", "Your Movie Tickets are not booked  ");

                }
            }
        }

        return "MovieTicketBooking";
    }

    @GetMapping("/movieSearch")
    public String onSearch(@RequestParam int id,@RequestParam String edit, Model model){

        System.out.println("Calling onSearch method from MovieTicketBookingController");

       Optional<MovieTicketBookingDTO> optional= movieTicketBookingService.findById(id);
        if(optional.isPresent()) {
            model.addAttribute("msg","Search id is found "+ id);
            model.addAttribute("dto",optional.get());
             if("edit".equals(edit)){
                 model.addAttribute("dto",optional.get());
                 model.addAttribute("action","edit");
                 return "MovieTicketBooking";
             }



        }else{
            model.addAttribute("msg", "Search id is not found ");
        }
        return "MovieTicketBookingSearch";
    }

    @GetMapping("/nameSearch")
    public String nameSearch(@RequestParam String group,Model model){
        System.out.println("Calling nameSearch from MovieTicketBookingController");
       List<MovieTicketBookingDTO> list= movieTicketBookingService.findByLocation(group);
       if(list.isEmpty()){
           model.addAttribute("error","Movie Name is not present");
       }else{
           model.addAttribute("dto",list);
       }

        return "MovieNameSearch";
    }
}
