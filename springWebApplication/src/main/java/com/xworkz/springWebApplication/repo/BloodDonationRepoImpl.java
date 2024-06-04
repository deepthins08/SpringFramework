package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import org.springframework.stereotype.Repository;

@Repository
public class BloodDonationRepoImpl implements BloodDonationRepo{


    BloodDonationRepoImpl(){
        System.out.println("Created BloodDonationRepoImpl");
    }

    @Override
    public boolean save(BloodDonationDTO bloodDonationDTO) {
        System.out.println("data is saved in repo "+bloodDonationDTO);

        return true;
    }
}
