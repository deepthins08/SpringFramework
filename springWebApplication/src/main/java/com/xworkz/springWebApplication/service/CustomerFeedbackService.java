package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.CustomerFeedbackDTO;

public interface CustomerFeedbackService {

    boolean validateAndSave(CustomerFeedbackDTO customerFeedbackDTO);
}
