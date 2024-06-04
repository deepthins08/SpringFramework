package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;

public interface BloodDonationRepo {

    boolean save(BloodDonationDTO bloodDonationDTO);
}
