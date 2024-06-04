package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.EventBookingDTO;

public interface EventBookingService {

    boolean validateAndSave(EventBookingDTO eventBookingDTO);
}
