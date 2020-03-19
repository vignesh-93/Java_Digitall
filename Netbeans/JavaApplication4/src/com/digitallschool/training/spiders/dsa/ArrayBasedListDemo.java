/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.dsa;

import java.util.Iterator;

/**
 *
 * @author HP
 */
public class ArrayBasedListDemo {
    public static void main(String[] args) {
        
    }
    
    public static void main11(String[] args) {
        ArrayBasedList l1 = new ArrayBasedList();
        l1.add(15);
        l1.add(25);
        l1.add(35);
        l1.add(45);
        
        Iterator i1 = l1.iterator();
        Iterator i2 = l1.iterator();
        
        System.out.println(i1.next());
        System.out.println(i1.hasNext());
        for(int i=0; i<4; i++){
            System.out.println(i1.next() + " " + i2.next());
        }

    }
    
    public static void main10(String[] args) {
        ArrayBasedList l1 = new ArrayBasedList();
        l1.add(15);
        l1.add(25);
        l1.add(35);
        l1.add(45);
        l1.add(55);
        l1.add(65);
        l1.add(35);
        System.out.println(l1.indexOf(35));
        System.out.println("********");
        System.out.println(l1.lastIndexOf(35));
        System.out.println("********");
        System.out.println(l1.subList(1, 4));
    }
    
    public static void main9(String[] args) {
        ArrayBasedList l1 = new ArrayBasedList();
        l1.add(15);
        l1.add(25);
        l1.add(35);
        l1.add(45);
        l1.add(50);
        System.out.println(l1);
        ArrayBasedList l2 = new ArrayBasedList();
        l2.add(100);
        l2.add(200);
//        l2.add(300);
        System.out.println(l2);
        //To add values at the Last
//        System.out.println(l1.addAll(l2));
//        System.out.println(l1);
        System.out.println("**********");
        //To add values using the Index
        System.out.println(l1.addAll(1, l2));
        System.out.println(l1);
    }
    
    public static void main8(String[] args) {
        ArrayBasedList l1 = new ArrayBasedList();
        l1.add(15);
        l1.add(25);
        l1.add(35);
        l1.add(45);
        l1.add(50);
        System.out.println(l1);
        ArrayBasedList l2 = new ArrayBasedList();
        l2.add(25);
        l2.add(35);
        l2.add(45);
        l1.add(55);
        System.out.println(l2);
        
        System.out.println(l1.retainAll(l2));
        System.out.println(l1);
        System.out.println(l2);
    }
    
    public static void main7(String[] args) {
        ArrayBasedList l1 = new ArrayBasedList();
        l1.add(25);
        l1.add(35);
        l1.add(45);
        l1.add(40);
        System.out.println(l1);
        ArrayBasedList l2 = new ArrayBasedList();
        l2.add(25);
        l2.add(35);
        l2.add(45);
        System.out.println(l2);
        System.out.println(l1.containsAll(l2));
    }
    
    public static void main6(String[] args) {
        ArrayBasedList l1 = new ArrayBasedList();
        l1.add(25);
        l1.add(15);
        l1.add(45);
        l1.add(40);
        
        ArrayBasedList l2 = new ArrayBasedList();
        l2.add(25);
        l2.add(35);
        l2.add(45);
        
        System.out.println(l2.contains(25));
        System.out.println(l2.contains(30));
        System.out.println(l2.contains(35));
        
        System.out.println(l1.retainAll(l2));
        System.out.println(l1);
    }
    
    public static void main5(String[] args) {
        ArrayBasedList l1 = new ArrayBasedList();
        l1.add(25);
        l1.add(35);
        l1.add(45);
        l1.add(55);
        
        ArrayBasedList l2 = new ArrayBasedList();
        l2.add(25);
        l2.add(35);
        l2.add(45);
        
        System.out.println("Before");
        System.out.println("L1"+l1);
        System.out.println("L2"+l2);
        System.out.println("After");
//        System.out.println(l1.addAll(l2));
//        System.out.println(l1 + " l1 After adding");
       l1.removeAll(l2);
        System.out.println(l1);
        
    }
    
    public static void main4(String[] args) {
        ArrayBasedList l1 = new ArrayBasedList();
        l1.add(25);
        l1.add(35);
        l1.add(45);
        l1.add(55);
        l1.add(65);
        ArrayBasedList l2 = new ArrayBasedList();
        l2.add(100);
        l2.add(35);
        l2.add(200);
        System.out.println(l1 + " First");
        System.out.println(l2 + " Second");
        System.out.println(l1.addAll(l2));
        System.out.println(l1 + " l1 After adding");
        
        for(int i=0;i<l1.size();i++){
            l1.remove(i);
        System.out.println(l1);
        i--;
        }
//        System.out.println(l1);
//        System.out.println(l1.removeAll(l2));
//        System.out.println(l1 +" After Remove All");
//        System.out.println(l1.remove(0));
//        System.out.println(l1 + " After removing [0]");
//        System.out.println(l1.remove(new Integer(35)));
//        System.out.println(l1 + " After removing 35");
    }
    
    public static void main3(String[] args) {
        ArrayBasedList l1 = new ArrayBasedList();
        l1.add(25);
        l1.add(35);
        l1.add(45);
        ArrayBasedList l2 = new ArrayBasedList();
        l2.add(100);
        l2.add(200);
        l2.add(300);
        System.out.println(l1.addAll(l2));
        System.out.println(l1);
        
    }
    
    public static void main2(String[] args) {
        ArrayBasedList l1 = new ArrayBasedList();
        l1.add(25);
        l1.add(35);
        l1.add(45);
        System.out.println(l1.get(2));
//        l1.set(1, 55);
        System.out.println(l1.get(1));
//        l1.set(0, 20);
        System.out.println(l1.get(0));
        l1.add(0,20);
        System.out.println(l1.get(2));
        System.out.println("*****");
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.get(2));
        System.out.println(l1.get(3));
        System.out.println("********");
        System.out.println(l1.get(2));
        System.out.println(l1.remove(2) + " Removed using Index");
        System.out.println(l1.get(2));
        System.out.println("********");
        System.out.println(l1.get(1));
        System.out.println(l1.remove(new Integer(75)) + " Remove using Value");
        System.out.println(l1.get(1));
    }
    
    public static void main1(String[] args) {
        ArrayBasedList l1 = new ArrayBasedList();
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
        for(int i=0;i<19;i++){
            l1.add(25);
//        System.out.println(l1.add(25));
        }
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
    }
    
}
