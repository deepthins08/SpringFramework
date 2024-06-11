package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.BloodDonationDTO;
import com.xworkz.springWebApplication.dto.TravelBookingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class TravelBookingRepoImpl implements TravelBookingRepo{
    @Autowired
    private EntityManagerFactory entityManagerFactory;
    TravelBookingRepoImpl(){
        System.out.println("Created TravelBookingRepoImpl");
    }

    @Override
    public boolean save(TravelBookingDTO travelBookingDTO) {
        System.out.println("running save in TravelBookingRepoImpl "+travelBookingDTO);
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction= entityManager.getTransaction();
        try{
            entityTransaction.begin();
            entityManager.persist(travelBookingDTO);
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
    public Optional<TravelBookingDTO> findById(int id) {
        System.out.println("findById from repo");
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        try{
            Query query= entityManager.createNamedQuery("findByIdTravel");
            query.setParameter("id",id);
            TravelBookingDTO travelBookingDTO=(TravelBookingDTO) query.getSingleResult();
            return Optional.ofNullable(travelBookingDTO);
        }catch (PersistenceException e){
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return TravelBookingRepo.super.findById(id);
    }

    @Override
    public List<TravelBookingDTO> findByTransportation(String group) {
        System.out.println("findByName from repo");
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
        try{
            Query query= entityManager.createNamedQuery("findByTransport");
            query.setParameter("group",group);
            List<TravelBookingDTO> list= query.getResultList();
            return list;
        }catch (PersistenceException e){
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return Collections.emptyList();
    }
}
