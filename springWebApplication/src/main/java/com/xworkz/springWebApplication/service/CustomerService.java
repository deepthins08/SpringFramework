package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.CustomerDTO;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    boolean validateAndSave(CustomerDTO customerDTO);

    default Optional<CustomerDTO> findById(int id){
        return Optional.empty();
    }

    List<CustomerDTO> findByGender(String gender);
}
