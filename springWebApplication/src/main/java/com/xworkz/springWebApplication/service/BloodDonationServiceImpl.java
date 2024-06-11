package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.repo.BloodDonationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

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
        return save;
    }

    @Override
    public Optional<BloodDonationDTO> findById(int id) {

        System.out.println("findById from Service");
       Optional<BloodDonationDTO> bloodDonationDTO= bloodDonationRepo.findById(id);
        return bloodDonationDTO;
    }

    @Override
    public List<BloodDonationDTO> findByName(String name) {

        System.out.println("findByName from service");
      List<BloodDonationDTO> list = bloodDonationRepo.findByName(name);
        return list;
    }
}
