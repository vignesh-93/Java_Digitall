/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.md;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author HP
 */
public class AuthorOperation {
    
//   public static void main(String[] args) throws Exception {
//        // TODO Auto-generated method stub
//
//        EntityManagerFactory emf1 = Persistence.createEntityManagerFactory("test1");
//
//        EntityManager em = emf1.createEntityManager();
//   }
    

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void authorOper(EntityManager em) throws Exception {
        

        /*List<Author> obj=em.createQuery("SELECT a from Author a", Author.class).getResultList();
	       
		for(Author e:obj)
        	System.out.println(e.getId()+" "+e.getAuthor_name()+" "+e.getEmail());*/
        while (true) {
            System.out.println("###Welcome to Main Menu###\n1. Author\n2.publisher\n3.book\n4.exit");
            String product = br.readLine();
            //Integer.parseInt(product);

            switch (product) {
                case "1":
                    System.out.println("\n\n\n");
                    authorMenu(em);
                    break;
                case "2":
                    System.out.println("Publisher not have been implemented");
                    break;
                case "3":
                    System.out.println("Publisher not have been implemented");
                    break;
                case "4":
                    return;
            }

        }

    }

    public static void authorMenu(EntityManager em) throws Exception {
        while (true) {
            System.out.println("###Welcome to Author Menu###\n1. ShowAuthor\n2.AddAuthor\n3.UpdateAuthor\n4.exit");

            String prod = br.readLine();
            switch (prod) {
                case "1":
                    showAuthors(em);
                    break;
                case "2":
                    addAuthors(em);
                    break;
                case "3":
                    updateAuthor(em);
                    break;
                case "4":
                    return;

            }

        }

    }

    public static void showAuthors(EntityManager em) throws Exception {
        List<Authors> obj = em.createQuery("SELECT a from Authors a", Authors.class).getResultList();

        for (Authors e : obj) {
            System.out.println(e.getId() + " " + e.getName() + " " + e.getEmail());
        }

    }

    public static void addAuthors(EntityManager em) throws Exception {
        System.out.println("Enter Author Name:\n");
        String nam = br.readLine();
        System.out.println("Enter Author Email-ID:\n");
        String ema = br.readLine();
        System.out.println("Enter Author Profile:\n");
        String prof = br.readLine();

        Authors a2 = new Authors();
        a2.setId(0);
        a2.setName(nam);
        a2.setEmail(ema);
        a2.setProfile(prof);
        a2.setBlog("unknown");

        EntityTransaction ex = em.getTransaction();
        ex.begin();
        em.persist(a2);
        ex.commit();

        System.out.println("#####Author Added Successfully######");

    }

    public static void updateAuthor(EntityManager em) throws Exception {
        System.out.println("###Enter Author Id updating the Name of Author\n");
        String primaryKey = br.readLine();
        System.out.println("\n");
        System.out.println("###Enter new Name for updation\n");
        String Author_name = br.readLine();
        int primary = Integer.parseInt(primaryKey);

        Authors a3 = em.find(Authors.class, (long) primary);

        EntityTransaction ex = em.getTransaction();
        ex.begin();
        a3.setName(Author_name);
        ex.commit();

        System.out.println("#####Author Updated Successfully######");

    }

}
