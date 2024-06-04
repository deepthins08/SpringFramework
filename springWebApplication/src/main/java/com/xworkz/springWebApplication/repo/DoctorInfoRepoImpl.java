package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.DoctorInfoDTO;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorInfoRepoImpl implements DoctorInfoRepo{
    DoctorInfoRepoImpl(){
        System.out.println("created DoctorInfoRepoImpl");
    }

    @Override
    public boolean save(DoctorInfoDTO doctorInfoDTO) {
        System.out.println("running save in DoctorInfoRepoImpl "+doctorInfoDTO);
        return true;
    }
}
