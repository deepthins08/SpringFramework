package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;

import java.util.List;
import java.util.Optional;

public interface BloodDonationRepo {

    boolean save(BloodDonationDTO bloodDonationDTO);

    default Optional<BloodDonationDTO> findById(int id){
        return Optional.empty();
    }


    List<BloodDonationDTO> findByName(String name);
}
