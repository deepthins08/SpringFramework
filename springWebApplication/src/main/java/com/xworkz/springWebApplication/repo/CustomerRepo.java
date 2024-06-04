package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.CustomerDTO;

public interface CustomerRepo {

    boolean save(CustomerDTO customerDTO);
}
