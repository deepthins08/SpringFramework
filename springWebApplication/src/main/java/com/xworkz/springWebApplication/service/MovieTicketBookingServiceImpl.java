package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.MovieTicketBookingDTO;
import com.xworkz.springWebApplication.repo.MovieTicketBookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

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
        return save;
    }

    @Override
    public Optional<MovieTicketBookingDTO> findById( int id) {
        System.out.println("running find by id in Service");
       Optional<MovieTicketBookingDTO> optional= movieTicketBookingRepo.findById(id);
//        System.out.println(optional);
        return optional;
    }

    @Override
    public List<MovieTicketBookingDTO> findByLocation(String group) {

        System.out.println("running findByLocation in service");
       List<MovieTicketBookingDTO> list=  movieTicketBookingRepo.findByLocation(group);

        return list;
    }
}
