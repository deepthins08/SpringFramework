package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.TravelBookingDTO;

import java.util.List;
import java.util.Optional;

public interface TravelBookingService {

    boolean validateAndSave(TravelBookingDTO travelBookingDTO);

    default Optional<TravelBookingDTO> findById(int id){
        return Optional.empty();
    }

    List<TravelBookingDTO> findByTransportation(String group);
}
