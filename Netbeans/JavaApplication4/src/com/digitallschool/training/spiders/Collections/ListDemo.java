/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author HP
 */
public class ListDemo {
    public static void main(String[] args) {
        List t = new LinkedList();
        t.add(4);
        t.add(3);
        t.add(87);
        t.add(54);
        System.out.println(t);
        
        t.add(2, 100);
        System.out.println(t);
        
        t.set(2, 50);
        System.out.println(t);
        
        System.out.println(t.get(3));
        
         System.out.println("------");
    
    
        ListIterator it = t.listIterator(3);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-----");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
        System.out.println("------");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("------");
        System.out.println(t.indexOf(32));
    
    }

}
