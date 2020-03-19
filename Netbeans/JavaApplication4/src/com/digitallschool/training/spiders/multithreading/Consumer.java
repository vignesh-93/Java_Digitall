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
public class Consumer extends Thread {

    private Warehouse wh;

    public Consumer(Warehouse wh) {
        this.wh = wh;
    }

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " : " + wh.getGoods());
        }

    }

}
