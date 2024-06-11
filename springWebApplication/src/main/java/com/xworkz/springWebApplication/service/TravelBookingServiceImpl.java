package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.TravelBookingDTO;
import com.xworkz.springWebApplication.repo.TravelBookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<TravelBookingDTO> findById(int id) {

        System.out.println("findById from Service");
        Optional<TravelBookingDTO> travelBookingDTO= travelBookingRepo.findById(id);
        return travelBookingDTO;
    }

    @Override
    public List<TravelBookingDTO> findByTransportation(String group) {

        System.out.println("findByName from service");
        List<TravelBookingDTO> list = travelBookingRepo.findByTransportation(group);
        return list;
    }
}
