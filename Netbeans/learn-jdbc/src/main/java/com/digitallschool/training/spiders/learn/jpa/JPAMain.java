/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.learn.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author HP
 */
public class JPAMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
        EntityManager em = emf.createEntityManager();

        Customer c = em.find(Customer.class, 10L);
        System.out.println("Customer Data");
        System.out.println(c.getId() + " ," + c.getName() + " ," + c.getAddress());

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        c.setAddress("Chennai");

        System.out.println("Customer Data after Update");
        System.out.println(c.getId() + " ," + c.getName() + " ," + c.getAddress());

        try {
            Thread.sleep(5000);

        } catch (InterruptedException ie) {
            System.out.println("RollBack");
            tx.rollback();
        }

        tx.commit();

        em.close();
        emf.close();
    }

    public static void main1(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
        EntityManager em = emf.createEntityManager();

        List<Customer> customer = em.createQuery("SELECT A FROM Customer a", Customer.class).getResultList();

        customer.forEach(e -> {
            System.out.println(e.getId() + " ," + e.getName() + " ," + e.getAddress());
        });

        em.close();
        emf.close();
    }

}
