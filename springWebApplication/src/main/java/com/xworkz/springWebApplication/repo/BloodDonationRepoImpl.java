package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class BloodDonationRepoImpl implements BloodDonationRepo{

    @Autowired
  private EntityManagerFactory entityManagerFactory;
    BloodDonationRepoImpl(){
        System.out.println("Created BloodDonationRepoImpl");
    }

    @Override
    public boolean save(BloodDonationDTO bloodDonationDTO) {
        System.out.println("data is saved in repo "+bloodDonationDTO);
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
       EntityTransaction entityTransaction= entityManager.getTransaction();
       try{
           entityTransaction.begin();
           entityManager.persist(bloodDonationDTO);
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
    public Optional<BloodDonationDTO> findById(int id) {
        System.out.println("findById from repo");
       EntityManager entityManager= this.entityManagerFactory.createEntityManager();
       try{
          Query query= entityManager.createNamedQuery("findByIdBlood");
          query.setParameter("id",id);
          BloodDonationDTO bloodDonationDTO=(BloodDonationDTO) query.getSingleResult();
          return Optional.ofNullable(bloodDonationDTO);
       }catch (PersistenceException e){
           e.printStackTrace();
       }finally {
           entityManager.close();
       }
        return BloodDonationRepo.super.findById(id);
    }

    @Override
    public List<BloodDonationDTO> findByName(String name) {
        System.out.println("findByName from repo");
       EntityManager entityManager= this.entityManagerFactory.createEntityManager();
       try{
          Query query= entityManager.createNamedQuery("findByName");
          query.setParameter("name",name);
         List<BloodDonationDTO> list= query.getResultList();
         return list;
       }catch (PersistenceException e){
           e.printStackTrace();
       }finally {
           entityManager.close();
       }
        return Collections.emptyList();
    }
}
