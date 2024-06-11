package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.CustomerFeedbackDTO;

import java.util.List;
import java.util.Optional;

public interface CustomerFeedbackRepo {

    boolean save(CustomerFeedbackDTO customerFeedbackDTO);
    default Optional<CustomerFeedbackDTO> findById(int id){
        return Optional.empty();
    }

    List<CustomerFeedbackDTO> findByName(String name);
}
