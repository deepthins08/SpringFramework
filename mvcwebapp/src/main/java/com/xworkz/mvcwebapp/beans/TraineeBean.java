package com.xworkz.mvcwebapp.beans;

import com.xworkz.mvcwebapp.dto.TraineeDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Component
@RequestMapping("/")
public class TraineeBean {


    public TraineeBean(){
        System.out.println("Created TraineeBean");
    }

    @PostMapping("/train")
    public String setTrainee(@Valid TraineeDTO traineeDTO, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()) {
            bindingResult.getAllErrors().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            model.addAttribute("error", bindingResult.getAllErrors());
            model.addAttribute("dto",traineeDTO);

        }else {

            model.addAttribute("intern", "Trainee " + traineeDTO.getName() + " is Registered");
        }
        return "Trainee";
    }
}
