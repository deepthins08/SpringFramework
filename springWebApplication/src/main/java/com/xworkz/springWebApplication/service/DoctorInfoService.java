package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.DoctorInfoDTO;

public interface DoctorInfoService {

    boolean validateAndSave(DoctorInfoDTO doctorInfoDTO);
}
