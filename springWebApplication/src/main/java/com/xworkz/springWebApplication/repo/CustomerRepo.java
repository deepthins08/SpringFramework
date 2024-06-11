package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.CustomerDTO;

import java.util.List;
import java.util.Optional;

public interface CustomerRepo {

    boolean save(CustomerDTO customerDTO);

    default Optional<CustomerDTO> findById(int id){
        return Optional.empty();
    }


    List<CustomerDTO> findByGender(String gender);
}
