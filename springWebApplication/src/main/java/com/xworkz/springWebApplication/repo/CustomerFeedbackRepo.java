package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.CustomerFeedbackDTO;

public interface CustomerFeedbackRepo {

    boolean save(CustomerFeedbackDTO customerFeedbackDTO);
}
