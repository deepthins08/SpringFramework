package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.repo.BloodDonationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BloodDonationServiceImpl implements BloodDonationService{
    @Autowired
    private BloodDonationRepo bloodDonationRepo;

    BloodDonationServiceImpl(){
        System.out.println("Created BloodDonationServiceImpl");
    }

    @Override
    public boolean validateAndSave(BloodDonationDTO bloodDonationDTO) {
        System.out.println("Running validateAndSave in BloodDonationServiceImpl" +bloodDonationDTO);
       boolean save= bloodDonationRepo.save(bloodDonationDTO);
       if(save){
           System.out.println("data is saved from repo in service");
       }
       else{
           System.out.println("data is not saved");
       }
        return true;
    }
}
