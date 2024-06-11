package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.EventBookingDTO;
import com.xworkz.springWebApplication.repo.EventBookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventBookingServiceImpl implements EventBookingService{
    @Autowired
    private EventBookingRepo eventBookingRepo;
    EventBookingServiceImpl(){
        System.out.println("created EventBookingServiceImpl");
    }

    @Override
    public boolean validateAndSave(EventBookingDTO eventBookingDTO) {
        System.out.println("running validateAndSave in EventBookingServiceImpl");
     boolean save=   eventBookingRepo.save(eventBookingDTO);
     if(save){
         System.out.println("event is booked"+eventBookingDTO);
     }else{
         System.out.println("event is not booked");
     }
        return true;
    }
    @Override
    public Optional<EventBookingDTO> findById(int id) {

        System.out.println("findById from Service");
        Optional<EventBookingDTO> eventBookingDTO= eventBookingRepo.findById(id);
        return eventBookingDTO;
    }

    @Override
    public List<EventBookingDTO> findByEventType(String group) {

        System.out.println("findByName from service");
        List<EventBookingDTO> list = eventBookingRepo.findByEventType(group);
        return list;
    }
}
