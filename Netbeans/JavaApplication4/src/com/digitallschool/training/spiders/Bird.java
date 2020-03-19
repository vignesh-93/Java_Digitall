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
public class Bird extends Animal {

    boolean fly;
    
    public Bird(boolean f){
        super();
        fly = f;
    }

    public Bird() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void move(int distance) {
        if (fly) {
            System.out.println("Bird is flying: " + distance + " distance");
        } else {
            System.out.println("Bird is moving: " + distance + " distance");
        }
    }
    
    public static void whoAmI(){
//        super.eat();  
          System.out.println("I am Bird");
//        System.out.println(fly);
//          Animal.whoAmI();
        }
    
//    public void eat() {
//        System.out.println("Bird is eating");
//    }
    
    public void eating(){
        super.eat();
//          eat();
    }
}

