package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.MovieTicketBookingDTO;
import com.xworkz.springWebApplication.repo.MovieTicketBookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieTicketBookingServiceImpl implements MovieTicketBookingService{
    @Autowired
    private MovieTicketBookingRepo movieTicketBookingRepo;
    MovieTicketBookingServiceImpl(){
        System.out.println("Created MovieTicketBookingServiceImpl");
    }

    @Override
    public boolean validateAndSave(MovieTicketBookingDTO movieTicketBookingDTO) {
        System.out.println("running validateAndSave in MovieTicketBookingServiceImpl"+movieTicketBookingDTO);
       boolean save= movieTicketBookingRepo.save(movieTicketBookingDTO);
       if(save){
           System.out.println("movie tickets are booked");
       }
       else{
           System.out.println("Movie Tickets are not booked");
       }
        return true;
    }
}
