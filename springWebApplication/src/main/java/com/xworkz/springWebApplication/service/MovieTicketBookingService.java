package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.MovieTicketBookingDTO;

import java.util.List;
import java.util.Optional;

public interface MovieTicketBookingService {

    boolean validateAndSave(MovieTicketBookingDTO movieTicketBookingDTO);

    default Optional<MovieTicketBookingDTO> findById(int id){
         return Optional.empty();
    }

     List<MovieTicketBookingDTO> findByLocation(String group);
}
