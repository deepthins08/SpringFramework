package com.xworkz.springWebApplication.controller;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.TravelBookingDTO;
import com.xworkz.springWebApplication.service.TravelBookingService;
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
public class TravelBookingController {
    @Autowired
    private TravelBookingService travelBookingService;

    public TravelBookingController(){

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

    @GetMapping("/travelSearch")
    public String getDonarInfo(@RequestParam int id, Model model){
        System.out.println("calling getDonarInfo in controller ");
        Optional<TravelBookingDTO> optional= travelBookingService.findById(id);
        if(optional.isPresent()){
            model.addAttribute("msg","Search id is found "+id);
            model.addAttribute("dto1",optional.get());
//           model.addAttribute("dto1",Collections.singletonList(optional.get()));


        }else {
            model.addAttribute("msg","Search id is not found "+id);

        }

        return "TravelBookingSearch";
    }

    @GetMapping("/transport")
    public String getByName(@RequestParam String group,Model model){
        List<TravelBookingDTO> list= travelBookingService.findByTransportation(group);
        if(list.isEmpty()){
            model.addAttribute("msg","Donar information is not found");
        }else{
            model.addAttribute("dto1",list);
            model.addAttribute("msg","Donar Information is found");
        }

        return "SearchByTransport";
    }
}
