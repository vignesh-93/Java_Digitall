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
public class RandomPrinterThread extends Thread{
    
    @Override
    public void run(){
        //Find Random Values - Start 
        int first = 10;
        int last = 100;
        int range = last - first;
//        Thread.currentThread().setName("rpt");
        String name = Thread.currentThread().getName(); 
        for(int i = 0;i<10;i++){
        int random = (int)(Math.random() * range) + first; 
        System.out.println(name +" " + random);
        //Find Random Values - End
        try{
            Thread.sleep(500);
        }catch(InterruptedException ioe){
            
        }
        }
    }
    
}
