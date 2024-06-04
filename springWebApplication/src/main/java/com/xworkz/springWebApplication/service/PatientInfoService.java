package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.PatientInfoDTO;

public interface PatientInfoService {

    boolean validAndSave(PatientInfoDTO patientInfoDTO);
}
