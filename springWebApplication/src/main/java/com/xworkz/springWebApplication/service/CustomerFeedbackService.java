package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.CustomerFeedbackDTO;

import java.util.List;
import java.util.Optional;

public interface CustomerFeedbackService {

    boolean validateAndSave(CustomerFeedbackDTO customerFeedbackDTO);

    default Optional<CustomerFeedbackDTO> findById(int id){
        return Optional.empty();
    }
    List<CustomerFeedbackDTO> findByName(String name);
}
