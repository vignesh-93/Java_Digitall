/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.multithreading;

//import java.lang.Thread.State;

/**
 *
 * @author HP
 */
public class MultithreadingDemo {
    
    public static void main(String[] args) {
        RandomPrinterThread t1 = new RandomPrinterThread();
        t1.setName("rpt");
        t1.start();
        System.out.println("**********");
        //Random Values -- Start
        int first = 110;
        int last = 200;
        int range = last - first;
        String name = Thread.currentThread().getName(); 
        for(int i = 0;i<10;i++){
        int random = (int)(Math.random() * range) + first; 
        System.out.println(name +" " + random);
        // Random Values -- End
//        if(i==6){
//            System.out.println("RPT status is : " + t1.getState());
//        }
        if(i == 3){
            try{
            t1.join(1000);
        }catch(InterruptedException ioe){
                System.out.println("main interrupted");
        }
        }
        try{
            Thread.sleep(500);
        }catch(InterruptedException ioe){
        
        }
    }
}
    
    public static void main2(String[] args) { 
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
        System.out.println(t1.getState());
        System.out.println(t1.getId());
    }
    
    public static void main1(String[] args) {
        Thread t1 = new Thread();
        //State is an Enum 
        Thread.State s1  = t1.getState();
        System.out.println(s1);
        t1.run();
        System.out.println(t1.getState());
        t1.start();
        try{
            Thread.sleep(2);
       }catch(InterruptedException ioe){
       
       }System.out.println(t1.getState());
//        t1.start();
    }

}
