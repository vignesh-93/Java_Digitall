/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.multithreading;

/**
 *
 * @author HP
 */
public class PCDemo {

    public static void main(String[] args) {
        Warehouse wh = new Warehouse();
        Producer p = new Producer(wh);
        Consumer c = new Consumer(wh);
        
        p.setName("A1");
//        System.out.println(p.getName());
        c.setName("B1");
//        System.out.println(c.getName());
        p.start();
        c.start();
        
    }
    
}
