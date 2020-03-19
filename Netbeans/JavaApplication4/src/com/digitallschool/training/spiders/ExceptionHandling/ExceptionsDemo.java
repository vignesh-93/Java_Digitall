/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.ExceptionHandling;

/**
 *
 * @author HP
 */
public class ExceptionsDemo {
    
    public static void main(String[] args) {
        
        System.out.println("Main Started");
        ExceptionsDemo.m1();
        System.out.println("Main Ended");
    }
    
        public static void m1(){
            System.out.println("m1 started");
            try{
            ExceptionsDemo.m2();
            }
            catch(NumberFormatException nfe){
//                  nfe.printStackTrace();
                System.err.println("Unable to Parse");    
            }
            System.out.println("m1 ended");
        }
        
        public static void m2(){
            System.out.println("m2 started");
            
            int i = Integer.parseInt("a5",37);
            System.out.println(i);
            
            System.out.println("m2 ended");
            }
}
