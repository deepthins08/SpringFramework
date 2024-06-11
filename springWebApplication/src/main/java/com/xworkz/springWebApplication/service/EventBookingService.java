package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.EventBookingDTO;

import java.util.List;
import java.util.Optional;

public interface EventBookingService {

    boolean validateAndSave(EventBookingDTO eventBookingDTO);
    default Optional<EventBookingDTO> findById(int id){
        return Optional.empty();
    }

    List<EventBookingDTO> findByEventType(String group);
}
