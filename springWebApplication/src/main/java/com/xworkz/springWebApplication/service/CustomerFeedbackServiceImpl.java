package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.CustomerFeedbackDTO;
import com.xworkz.springWebApplication.repo.CustomerFeedbackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
