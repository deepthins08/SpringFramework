package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerRepoImpl implements CustomerRepo{
    @Autowired
    private EntityManagerFactory entityManagerFactory;
    @Override
    public boolean save(CustomerDTO customerDTO) {
        System.out.println("save from CustomerRepoImpl");
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();
        try{
            entityTransaction.begin();
            entityManager.persist(customerDTO);
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
    public Optional<CustomerDTO> findById(int id) {
        System.out.println("findById from repo");
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        try{
            Query query= entityManager.createNamedQuery("findByIdCustomer");
            query.setParameter("id",id);
            CustomerDTO customerDTO=(CustomerDTO) query.getSingleResult();
            return Optional.ofNullable(customerDTO);
        }catch (PersistenceException e){
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return CustomerRepo.super.findById(id);
    }

    @Override
    public List<CustomerDTO> findByGender(String gender) {
        System.out.println("findByName from repo");
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        try{
            Query query= entityManager.createNamedQuery("findByGenderCustomer");
            query.setParameter("gender",gender);
            List<CustomerDTO> list= query.getResultList();
            return list;
        }catch (PersistenceException e){
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return Collections.emptyList();
    }
}
