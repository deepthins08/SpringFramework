package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.TravelBookingDTO;
import org.springframework.stereotype.Repository;

@Repository
public class TravelBookingRepoImpl implements TravelBookingRepo{
    TravelBookingRepoImpl(){
        System.out.println("Created TravelBookingRepoImpl");
    }

    @Override
    public boolean save(TravelBookingDTO travelBookingDTO) {
        System.out.println("running save in TravelBookingRepoImpl "+travelBookingDTO);
        return true;
    }
}
