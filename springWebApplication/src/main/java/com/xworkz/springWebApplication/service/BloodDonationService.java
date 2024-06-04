package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;

public interface BloodDonationService {


    boolean validateAndSave(BloodDonationDTO bloodDonationDTO);
}
