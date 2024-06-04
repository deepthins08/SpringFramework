package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.PatientInfoDTO;
import org.springframework.stereotype.Repository;

@Repository
public class PatientInfoRepoImpl implements PatientInfoRepo{

    PatientInfoRepoImpl(){
        System.out.println("Created PatientInfoRepoImpl");
    }
    @Override
    public boolean save(PatientInfoDTO patientInfoDTO) {
        System.out.println("running save in PatientInfoRepoImpl "+patientInfoDTO);
        return true;
    }
}
