package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.PatientInfoDTO;

public interface PatientInfoRepo {

    boolean save(PatientInfoDTO patientInfoDTO);
}
