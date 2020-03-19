/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.md;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author HP
 */
public class JPAMain {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test1");

        EntityManager em = emf.createEntityManager();

        AuthorOperation a = new AuthorOperation();
        a.authorOper(em);

        /*List<Author> obj=em.createQuery("SELECT a from Author a", Author.class).getResultList();
	       
		for(Author e:obj)
        	System.out.println(e.getId()+" "+e.getAuthor_name()+" "+e.getEmail());*/
        em.close();
        emf.close();
    }

}
