package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.PatientInfoDTO;
import com.xworkz.springWebApplication.repo.PatientInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<PatientInfoDTO> findById(int id) {

        System.out.println("findById from Service");
        Optional<PatientInfoDTO> patientInfoDTO= patientInfoRepo.findById(id);
        return patientInfoDTO;
    }

    @Override
    public List<PatientInfoDTO> findByPhysician(String physician) {

        System.out.println("findByName from service");
        List<PatientInfoDTO> list = patientInfoRepo.findByPhysician(physician);
        return list;
    }
}
