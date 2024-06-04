package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.MovieTicketBookingDTO;
import org.springframework.stereotype.Repository;

@Repository
public class MovieTicketBookingRepoImpl implements MovieTicketBookingRepo{

    MovieTicketBookingRepoImpl(){
        System.out.println("Created MovieTicketBookingRepoImpl");
    }

    @Override
    public boolean save(MovieTicketBookingDTO movieTicketBookingDTO) {
        System.out.println("running save in MovieTicketBookingRepoImpl "+movieTicketBookingDTO);
        return false;
    }
}
