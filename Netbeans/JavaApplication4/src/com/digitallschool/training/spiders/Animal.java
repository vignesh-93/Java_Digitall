/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders;

/**
 *
 * @author HP
 */
public abstract class Animal {
    
     public String name;
    public String type;
    
    public Animal(){
        super();
    }


    /// Making Animal Class move Method Abstract 
    public abstract void move(int distance);

//    public void move(int distance)
//    {
//        System.out.println("Animal is moving: " + distance + " distance"); 
//    }

    public void eat() {
        System.out.println("Animal is eating");
    }
    
    public static void whoAmI(){
        System.out.println("I am Animal");
    }

    
}
