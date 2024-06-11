package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.PatientInfoDTO;

import java.util.List;
import java.util.Optional;

public interface PatientInfoService {

    boolean validAndSave(PatientInfoDTO patientInfoDTO);
    default Optional<PatientInfoDTO> findById(int id){
        return Optional.empty();
    }

    List<PatientInfoDTO> findByPhysician(String physician);
}
