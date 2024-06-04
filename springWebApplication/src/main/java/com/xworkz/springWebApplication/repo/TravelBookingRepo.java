package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.TravelBookingDTO;

public interface TravelBookingRepo {

    boolean save(TravelBookingDTO travelBookingDTO);
}
