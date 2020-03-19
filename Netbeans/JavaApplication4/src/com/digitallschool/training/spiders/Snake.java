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
public class Snake extends Animal{
    boolean poisonous;
    
    public void move(int distance){
        System.out.println("Snake is crawling: " + distance + " distance");
    }
}

