package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;

import java.util.List;
import java.util.Optional;

public interface BloodDonationService {


    boolean validateAndSave(BloodDonationDTO bloodDonationDTO);

   default Optional<BloodDonationDTO> findById(int id){
       return Optional.empty();
   }

    List<BloodDonationDTO> findByName(String name);
}
