package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.MovieTicketBookingDTO;

import java.util.List;
import java.util.Optional;

public interface MovieTicketBookingRepo {

    boolean save(MovieTicketBookingDTO movieTicketBookingDTO);

    default Optional<MovieTicketBookingDTO> findById(int id){

        return Optional.empty();
    }

    List<MovieTicketBookingDTO> findByLocation(String group);
}
