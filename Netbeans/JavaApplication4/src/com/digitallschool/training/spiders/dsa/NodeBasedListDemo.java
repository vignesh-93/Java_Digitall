/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.dsa;

/**
 *
 * @author HP
 */
public class NodeBasedListDemo {
    
    public static void main(String[] args) {
        
         NodeBasedList t = new NodeBasedList();
        
        System.out.println(t.isEmpty());
        
        t.add(20);
        t.add(30);
        t.add(40);
        System.out.println(t);
        
        NodeBasedList t1 = new NodeBasedList();
        
        t1.add(20);
        t1.add(30);
//        t1.add(40);
        System.out.println(t1);
        
//        System.out.println(t.remove(2));
//        System.out.println(t);
//        System.out.println(t.remove(new Integer(30)));
        System.out.println(t);
        
//        System.out.println(t.contains(80));
//        System.out.println(t.get(0));
        System.out.println(t.containsAll(t1));
//        System.out.println(t.removeAll(t1));
        System.out.println(t);
        System.out.println(t1);
    }

}
