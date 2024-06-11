package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.CustomerFeedbackDTO;
import com.xworkz.springWebApplication.repo.CustomerFeedbackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerFeedbackServiceImpl implements CustomerFeedbackService{
    @Autowired
    private CustomerFeedbackRepo customerFeedbackRepo;
    CustomerFeedbackServiceImpl(){
        System.out.println("Created CustomerFeedbackServiceImpl");
    }

    @Override
    public boolean validateAndSave(CustomerFeedbackDTO customerFeedbackDTO) {
        System.out.println("validateAndSave running in CustomerFeedbackServiceImpl "+customerFeedbackDTO);
      boolean save=  customerFeedbackRepo.save(customerFeedbackDTO);
      if(save){
          System.out.println("feedback is successful  in service ");
      }
      else{
          System.out.println("feedback is not given");
      }
        return true;
    }

    @Override
    public Optional<CustomerFeedbackDTO> findById(int id) {

        System.out.println("findById from Service");
        Optional<CustomerFeedbackDTO> customerFeedbackDTO= customerFeedbackRepo.findById(id);
        return customerFeedbackDTO;
    }

    @Override
    public List<CustomerFeedbackDTO> findByName(String name) {

        System.out.println("findByName from service");
        List<CustomerFeedbackDTO> list = customerFeedbackRepo.findByName(name);
        return list;
    }
}
