package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.MovieTicketBookingDTO;

public interface MovieTicketBookingRepo {

    boolean save(MovieTicketBookingDTO movieTicketBookingDTO);
}
