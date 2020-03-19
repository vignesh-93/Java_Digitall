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
public class Producer extends Thread {

    private Warehouse wh;

  

    public Producer(Warehouse wh) {
        this.wh = wh;
    }

    @Override
    public void run() {
        
        String name = Thread.currentThread().getName();
        
        int first = 10;
        int last = 100;
        int range = last - first;
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * range) + first;

            wh.setGoods(random);
            System.out.println(name + " : " + random);
        }
        
    }

}
