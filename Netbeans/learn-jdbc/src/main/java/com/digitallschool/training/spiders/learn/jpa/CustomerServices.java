/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.learn.jpa;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
public class CustomerServices {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
    
    private List<Customer> findAll() {
        try {
            return emf.createEntityManager().
                    createNamedQuery("SELECT C FROM Customer C", Customer.class).getResultList();
        } catch (Exception ex) {
            return null;
        }
    }

    private Customer findCustomer(Long id) {
        try {
            return emf.createEntityManager().find(Customer.class, id);
        } catch (Exception e) {
            return null;
        }
    }
        
    private boolean addCustomer(Customer customer) {
        EntityManager em = null;
        EntityTransaction tx = null;

        try {
            em = emf.createEntityManager();
            tx = em.getTransaction();
            tx.begin();

            em.persist(customer);

            tx.commit();
            return true;
        } catch (Exception ex) {
            if (Objects.nonNull(tx)) {
                tx.rollback();
            }
            return false;
        } finally {
            if (Objects.nonNull((em))) {
                em.close();
            }
        }
    }

    private boolean updateCustomer(Customer customer) {
        EntityManager em = null;
        EntityTransaction tx = null;

        try {
            em = emf.createEntityManager();
            tx = em.getTransaction();
            tx.begin();

            em.merge(customer);

            tx.commit();
            return true;
        } catch (Exception ex) {
            if (Objects.nonNull(tx)) {
                tx.rollback();
            }
            return false;
        } finally {
            if (Objects.nonNull((em))) {
                em.close();
            }
        }
    }

    private boolean deleteCustomer(Customer customer) {
        EntityManager em = null;
        EntityTransaction tx = null;
        
        try{
            em = emf.createEntityManager();
            tx = em.getTransaction();
            tx.begin();
            
            em.remove(customer);
            
            tx.commit();
            return true;
        }catch(Exception ex){
            if(Objects.nonNull(tx)){
                tx.rollback();
            }
            return false;
        } finally {
            if(Objects.nonNull((em))){
                em.close();
            }
        }
    }

}
