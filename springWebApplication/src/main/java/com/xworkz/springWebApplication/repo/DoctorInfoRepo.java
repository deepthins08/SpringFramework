package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.DoctorInfoDTO;

public interface DoctorInfoRepo {

    boolean save(DoctorInfoDTO doctorInfoDTO);
}
