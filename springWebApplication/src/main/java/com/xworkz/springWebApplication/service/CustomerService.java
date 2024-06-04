package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.CustomerDTO;

public interface CustomerService {

    boolean validateAndSave(CustomerDTO customerDTO);
}
