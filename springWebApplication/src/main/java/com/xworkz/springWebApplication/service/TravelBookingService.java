package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.TravelBookingDTO;

public interface TravelBookingService {

    boolean validateAndSave(TravelBookingDTO travelBookingDTO);
}
