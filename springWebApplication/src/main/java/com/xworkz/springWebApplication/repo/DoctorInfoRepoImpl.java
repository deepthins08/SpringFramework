package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.DoctorInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class DoctorInfoRepoImpl implements DoctorInfoRepo{
    @Autowired
    private EntityManagerFactory entityManagerFactory;
    DoctorInfoRepoImpl(){
        System.out.println("created DoctorInfoRepoImpl");
    }

    @Override
    public boolean save(DoctorInfoDTO doctorInfoDTO) {
        System.out.println("running save in DoctorInfoRepoImpl "+doctorInfoDTO);
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();
        try{
            entityTransaction.begin();
            entityManager.persist(doctorInfoDTO);
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
    public Optional<DoctorInfoDTO> findById(int id) {
        System.out.println("findById from repo");
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        try{
            Query query= entityManager.createNamedQuery("findByIdHospital");
            query.setParameter("id",id);
            DoctorInfoDTO doctorInfoDTO=(DoctorInfoDTO) query.getSingleResult();
            return Optional.ofNullable(doctorInfoDTO);
        }catch (PersistenceException e){
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return DoctorInfoRepo.super.findById(id);
    }

    @Override
    public List<DoctorInfoDTO> findByHospital(String hospital) {
        System.out.println("findByName from repo");
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        try{
            Query query= entityManager.createNamedQuery("findByHospital");
            query.setParameter("hospital",hospital);
            List<DoctorInfoDTO> list= query.getResultList();
            return list;
        }catch (PersistenceException e){
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return Collections.emptyList();
    }
}
