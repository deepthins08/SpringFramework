package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.CustomerDTO;
import com.xworkz.springWebApplication.dto.CustomerFeedbackDTO;
import com.xworkz.springWebApplication.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepo customerRepo;
    CustomerServiceImpl(){
        System.out.println("Created CustomerServiceImpl ");
    }

    @Override
    public boolean validateAndSave(CustomerDTO customerDTO) {
        System.out.println("validateAndSave from CustomerServiceImpl");
        boolean save=customerRepo.save(customerDTO);
        if(save){
            System.out.println("details are saved successfully "+customerDTO);
        }else {
            System.out.println("details are not saved");
        }
        return true;
    }

    @Override
    public Optional<CustomerDTO> findById(int id) {

        System.out.println("findById from Service");
        Optional<CustomerDTO> customerDTO= customerRepo.findById(id);
        return customerDTO;
    }

    @Override
    public List<CustomerDTO> findByGender(String gender) {

        System.out.println("findByName from service");
        List<CustomerDTO> list = customerRepo.findByGender(gender);
        return list;
    }
}
