/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import Inherit.Employee;
import java.util.Iterator;

/**
 *
 * @author HP
 */
public class SetDemo {
    
    public static void main(String[] args) {
        TreeSet t1 = new TreeSet(new EmployeeComparator());
        t1.add(new Employee(21,"Bv"));
        t1.add(new Employee(22,"Hbk"));
        t1.add(new Employee(32,"Sa"));
        t1.add(new Employee(67,"Bv"));
//        t1.add(10);
//        t1.add(20);
        System.out.println(t1);
    }
    
//    public void Employee(){
//        String EmployeeName;
//        int EmployeeID;
//    }
    
    public static void main7(String[] args) {
        Set<Integer> s1 = new HashSet();
        s1.add(25);
        s1.add(16);
        s1.add(30);

        Iterator it = s1.iterator();

        if (it.hasNext()) {
            System.out.println(" --");
            while (it.hasNext()) {
                System.out.println("|" + it.next() + "|");
            }
            System.out.println(" --");
        } else {
            System.out.println("It's Empty");
        }
    }

    public static void main6(String[] args) {
        Set<Integer> s1 = new HashSet();
        s1.add(25);
        s1.add(16);
        s1.add(30);
        //s1.add("James");
        System.out.println(s1);

        Integer[] values = s1.toArray(new Integer[0]);
        System.out.println(values.length);
        process(values);
    }

    public static void main5(String[] args) {
        Set s1 = new HashSet();
        s1.add(25);
        s1.add(16);
        s1.add(30);
        System.out.println(s1);

        Object[] values = s1.toArray();

        Integer[] v2 = new Integer[values.length];

        for (int i = 0; i < values.length; i++) {
            v2[i] = (Integer) values[i];
        }

        process(v2);
    }

    public static void process(Integer[] v) {

    }

    
    public static void main4(String[] args) {
        Set s1 = new HashSet();
        s1.add(25);
        s1.add(16);
        s1.add(30);
        System.out.println(s1);

        Set s2 = new HashSet();
        s2.add(35);
        s2.add(18);
        s2.add(30);
        System.out.println(s2);

        //s1.addAll(s2);
        //s1.removeAll(s2);
        //s1.retainAll(s2);
        //s2.clear();
        s1.remove(25);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.containsAll(s2));
    }

    
    public static void main3(String[] args) {
        
        Set s1 = new HashSet();
        System.out.println(s1.isEmpty());
        System.out.println(s1.size());
        System.out.println(s1);

        s1.add(25);
        s1.add(40);
        System.out.println(s1.isEmpty());
        System.out.println(s1.size());
        System.out.println(s1);

        int i = 65;

        s1.add(i);
        s1.add("James");

        boolean b1 = false;
        Boolean b2 = true;
        s1.add(b1);
        s1.add(b2);
        s1.add("james");
        s1.add('M');
        System.out.println(s1);

        for (Object t : s1) {
            System.out.println(t.getClass().getName());
        }


    }
    
    public static void main2(String[] args) {
        HashSet hs1 = new HashSet();
        
        add(hs1);
    }
    
    public static void add(Set hs1) {
        
    }
    
    public static void main1(String[] args) {
        TreeSet s = new TreeSet();

        doJob(s);
    }

    public static void doJob(Set s) {

    }

    
}
