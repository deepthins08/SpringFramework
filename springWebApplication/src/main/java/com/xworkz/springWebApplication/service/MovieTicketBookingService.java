package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.MovieTicketBookingDTO;

public interface MovieTicketBookingService {

    boolean validateAndSave(MovieTicketBookingDTO movieTicketBookingDTO);
}
