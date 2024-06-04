package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.EventBookingDTO;
import org.springframework.stereotype.Repository;

@Repository
public class EventBookingRepoImpl implements EventBookingRepo{

    EventBookingRepoImpl(){
        System.out.println("Created EventBookingRepoImpl");
    }
    @Override
    public boolean save(EventBookingDTO eventBookingDTO) {
        System.out.println("running save in EventBookingRepoImpl"+eventBookingDTO);
        return true;
    }
}
