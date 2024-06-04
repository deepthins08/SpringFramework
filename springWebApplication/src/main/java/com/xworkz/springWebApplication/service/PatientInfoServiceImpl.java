package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.PatientInfoDTO;
import com.xworkz.springWebApplication.repo.PatientInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientInfoServiceImpl implements PatientInfoService{
   @Autowired
    private PatientInfoRepo patientInfoRepo;

    PatientInfoServiceImpl(){
        System.out.println("Created PatientInfoServiceImpl");
    }
    @Override
    public boolean validAndSave(PatientInfoDTO patientInfoDTO) {
        System.out.println("running validateAndSave in PatientInfoServiceImpl");
      boolean save=  patientInfoRepo.save(patientInfoDTO);
      if(save){
          System.out.println("patient details are saved");
      }else{
          System.out.println("patients details are not saved");
      }
        return true;
    }
}
