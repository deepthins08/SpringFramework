package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.DoctorInfoDTO;

import java.util.List;
import java.util.Optional;

public interface DoctorInfoRepo {

    boolean save(DoctorInfoDTO doctorInfoDTO);

    default Optional<DoctorInfoDTO> findById(int id){
        return Optional.empty();
    }


    List<DoctorInfoDTO> findByHospital(String hospital);
}
