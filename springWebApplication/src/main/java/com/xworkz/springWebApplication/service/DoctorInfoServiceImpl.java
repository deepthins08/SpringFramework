package com.xworkz.springWebApplication.service;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.DoctorInfoDTO;
import com.xworkz.springWebApplication.repo.DoctorInfoRepo;
import com.xworkz.springWebApplication.repo.DoctorInfoRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<DoctorInfoDTO> findById(int id) {

        System.out.println("findById from Service");
        Optional<DoctorInfoDTO> doctorInfoDTO= doctorInfoRepo.findById(id);
        return doctorInfoDTO;
    }

    @Override
    public List<DoctorInfoDTO> findByHospital(String hospital) {

        System.out.println("findByName from service");
        List<DoctorInfoDTO> list = doctorInfoRepo.findByHospital(hospital);
        return list;
    }
}
