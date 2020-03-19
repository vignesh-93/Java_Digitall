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
public class Parrot extends Bird{
    boolean talk;
    
    public Parrot(){
        super(false);
    }
    
    public void talk(String message){
        if(talk){
            System.out.println("Parrot saying: " + message);
        }else{
            System.out.println("Can't talk");
        }
    }
    
    public void move(int distance){
        System.out.println("Parrot is flying " + distance + " Distance");
    }
}

