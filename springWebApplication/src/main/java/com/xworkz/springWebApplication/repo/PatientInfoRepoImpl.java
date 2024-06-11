package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.PatientInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class PatientInfoRepoImpl implements PatientInfoRepo{
    @Autowired
    private EntityManagerFactory entityManagerFactory;

    PatientInfoRepoImpl(){
        System.out.println("Created PatientInfoRepoImpl");
    }
    @Override
    public boolean save(PatientInfoDTO patientInfoDTO) {
        System.out.println("running save in PatientInfoRepoImpl "+patientInfoDTO);
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();
        try{
            entityTransaction.begin();
            entityManager.persist(patientInfoDTO);
            entityTransaction.commit();
        }catch (PersistenceException e){
            e.printStackTrace();
            entityTransaction.rollback();
        }finally {
            entityManager.close();
        }
        return true;
    }
    @Override
    public Optional<PatientInfoDTO> findById(int id) {
        System.out.println("findById from repo");
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        try{
            Query query= entityManager.createNamedQuery("findByIdPatient");
            query.setParameter("id",id);
            PatientInfoDTO patientInfoDTO=(PatientInfoDTO) query.getSingleResult();
            return Optional.ofNullable(patientInfoDTO);
        }catch (PersistenceException e){
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return PatientInfoRepo.super.findById(id);
    }

    @Override
    public List<PatientInfoDTO> findByPhysician(String physician) {
        System.out.println("findByName from repo");
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        try{
            Query query= entityManager.createNamedQuery("findByPhysician");
            query.setParameter("physician",physician);
            List<PatientInfoDTO> list= query.getResultList();
            return list;
        }catch (PersistenceException e){
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return Collections.emptyList();
    }
}
