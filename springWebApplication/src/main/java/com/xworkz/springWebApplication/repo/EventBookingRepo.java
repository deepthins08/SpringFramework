package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.EventBookingDTO;

import java.util.List;
import java.util.Optional;

public interface EventBookingRepo {

    boolean save(EventBookingDTO eventBookingDTO);

    default Optional<EventBookingDTO> findById(int id){
        return Optional.empty();
    }


    List<EventBookingDTO> findByEventType(String group);
}
