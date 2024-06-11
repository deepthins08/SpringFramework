package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.CustomerFeedbackDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerFeedbackRepoImpl implements CustomerFeedbackRepo{
    @Autowired
    private EntityManagerFactory entityManagerFactory;
    @Override
    public boolean save(CustomerFeedbackDTO customerFeedbackDTO) {
        System.out.println("save is running in CustomerFeedbackRepoImpl "+customerFeedbackDTO);
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();
        try{
            entityTransaction.begin();
            entityManager.persist(customerFeedbackDTO);
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
    public Optional<CustomerFeedbackDTO> findById(int id) {
        System.out.println("findById from repo");
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        try{
            Query query= entityManager.createNamedQuery("findByIdFeedback");
            query.setParameter("id",id);
            CustomerFeedbackDTO customerFeedbackDTO=(CustomerFeedbackDTO) query.getSingleResult();
            return Optional.ofNullable(customerFeedbackDTO);
        }catch (PersistenceException e){
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return CustomerFeedbackRepo.super.findById(id);
    }

    @Override
    public List<CustomerFeedbackDTO> findByName(String name) {
        System.out.println("findByName from repo");
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        try{
            Query query= entityManager.createNamedQuery("findByNameFeedback");
            query.setParameter("name","%"+name+"%");
            List<CustomerFeedbackDTO> list= query.getResultList();
            return list;
        }catch (PersistenceException e){
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return Collections.emptyList();
    }

}
