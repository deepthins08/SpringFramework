package com.xworkz.springWebApplication.repo;

import com.xworkz.springWebApplication.dto.MovieTicketBookingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
public class MovieTicketBookingRepoImpl implements MovieTicketBookingRepo{
    @Autowired
    private EntityManagerFactory entityManagerFactory;

    MovieTicketBookingRepoImpl(){
        System.out.println("Created MovieTicketBookingRepoImpl");
    }

    @Override
    public boolean save(MovieTicketBookingDTO movieTicketBookingDTO) {
        System.out.println("running save in MovieTicketBookingRepoImpl "+movieTicketBookingDTO);
        EntityManager entityManager= this.entityManagerFactory.createEntityManager();
       EntityTransaction entityTransaction= entityManager.getTransaction();
        try{
            entityTransaction.begin();
            entityManager.persist(movieTicketBookingDTO);
            entityTransaction.commit();
        }catch(PersistenceException e){
            e.printStackTrace();
            entityTransaction.rollback();
        }finally {
            entityManager.close();
        }
        return true;
    }

    @Override
    public Optional<MovieTicketBookingDTO> findById( int id) {
       EntityManager entityManager= this.entityManagerFactory.createEntityManager();

      try{
        Query query=  entityManager.createNamedQuery("findById");
        query.setParameter("id",id);
          MovieTicketBookingDTO movieTicketBookingDTO=(MovieTicketBookingDTO) query.getSingleResult();
          return Optional.ofNullable(movieTicketBookingDTO);
      }catch(PersistenceException e){
          e.printStackTrace();
        }finally {
          entityManager.close();
      }

        return Optional.empty();
    }

    @Override
    public List<MovieTicketBookingDTO> findByLocation(String group) {
        System.out.println("Calling findBYLocation from Repo ");
       EntityManager entityManager= this.entityManagerFactory.createEntityManager();
       try{
          Query query= entityManager.createNamedQuery("findByLocation");
          query.setParameter("group","%"+group+"%");
        List<MovieTicketBookingDTO> list=  query.getResultList();
        list.forEach(x->{
                    System.out.println(x.getGroup());
                    System.out.println(x.getTickets());
                    System.out.println(x.getDate());
                    System.out.println(x.getTime());
                }
                );
         return list;

       }catch (PersistenceException e){
           e.printStackTrace();
       }finally {
           entityManager.close();
       }
        return Collections.emptyList();
    }
}
