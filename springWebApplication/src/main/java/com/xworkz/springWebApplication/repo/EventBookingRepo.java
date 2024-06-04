package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.EventBookingDTO;

public interface EventBookingRepo {

    boolean save(EventBookingDTO eventBookingDTO);
}
