package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.TravelBookingDTO;
import com.xworkz.springWebApplication.repo.TravelBookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TravelBookingServiceImpl implements TravelBookingService{
   @Autowired
   private TravelBookingRepo travelBookingRepo;

    TravelBookingServiceImpl(){
        System.out.println("created TravelBookingServiceImpl");
    }

    @Override
    public boolean validateAndSave(TravelBookingDTO travelBookingDTO) {
        System.out.println("running validateAndSave in TravelBookingServiceImpl");
       boolean save= travelBookingRepo.save(travelBookingDTO);
       if(save){
           System.out.println("Booking is confirmed");
       }else{
           System.out.println("Booking is not confirmed");
       }
        return true;
    }
}
