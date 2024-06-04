package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.CustomerFeedbackDTO;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerFeedbackRepoImpl implements CustomerFeedbackRepo{
    @Override
    public boolean save(CustomerFeedbackDTO customerFeedbackDTO) {
        System.out.println("save is running in CustomerFeedbackRepoImpl "+customerFeedbackDTO);
        return true;
    }
}
