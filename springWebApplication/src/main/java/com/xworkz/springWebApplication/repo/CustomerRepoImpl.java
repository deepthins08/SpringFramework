package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.CustomerDTO;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepoImpl implements CustomerRepo{
    @Override
    public boolean save(CustomerDTO customerDTO) {
        System.out.println("save from CustomerRepoImpl");
        return true;
    }
}
