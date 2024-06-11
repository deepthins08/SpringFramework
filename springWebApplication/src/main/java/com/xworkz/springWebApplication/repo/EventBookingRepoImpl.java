package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.EventBookingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class EventBookingRepoImpl implements EventBookingRepo{
    @Autowired
    private EntityManagerFactory entityManagerFactory;

    EventBookingRepoImpl(){
        System.out.println("Created EventBookingRepoImpl");
    }
    @Override
    public boolean save(EventBookingDTO eventBookingDTO) {
        System.out.println("running save in EventBookingRepoImpl"+eventBookingDTO);
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();
        try{
            entityTransaction.begin();
            entityManager.persist(eventBookingDTO);
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
    public Optional<EventBookingDTO> findById(int id) {
        System.out.println("findById from repo");
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        try{
            Query query= entityManager.createNamedQuery("findByIdEvent");
            query.setParameter("id",id);
            EventBookingDTO eventBookingDTO=(EventBookingDTO) query.getSingleResult();
            return Optional.ofNullable(eventBookingDTO);
        }catch (PersistenceException e){
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return EventBookingRepo.super.findById(id);
    }

    @Override
    public List<EventBookingDTO> findByEventType(String group) {
        System.out.println("findByName from repo");
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        try{
            Query query= entityManager.createNamedQuery("findByEventType");
            query.setParameter("group","%"+group+"%");
            List<EventBookingDTO> list= query.getResultList();
            return list;
        }catch (PersistenceException e){
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return Collections.emptyList();
    }
}
