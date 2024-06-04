package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.DoctorInfoDTO;
import com.xworkz.springWebApplication.repo.DoctorInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorInfoServiceImpl implements DoctorInfoService{
    @Autowired
    private DoctorInfoRepo doctorInfoRepo;
    DoctorInfoServiceImpl(){
        System.out.println("Created DoctorInfoServiceImpl");
    }
    @Override
    public boolean validateAndSave(DoctorInfoDTO doctorInfoDTO) {
        System.out.println("running validateAndSave in DoctorInfoServiceImpl");
        boolean save=doctorInfoRepo.save(doctorInfoDTO);
        if(save){
            System.out.println("Doctor info is saved");
        }else{
            System.out.println("Doctor info is not saved");
        }
        return true;
    }
}
