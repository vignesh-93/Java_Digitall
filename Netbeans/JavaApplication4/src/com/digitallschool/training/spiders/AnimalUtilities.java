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
public class AnimalUtilities {
    
    public double max(int a, double b){
        return a>b?a:b;
    }
    public double max(double a, int b){
        return a>b?a:b;
    }
    
    public void competeAgain(Animal a, Bird b){
        
    }
    
    public void competeAgain(Bird a, Animal b){
        
    }
    
    public void compete(Animal a, Animal b){
        //System.out.println("First compete");
        a.move(10);
        b.move(10);
    }
    
    public void compete(Animal a, Bird b){
        a.move(20);
        b.move(20);
    }
    
    public void compete(Bird a, Bird b){
        //System.out.println("Third compete");        
        a.move(30);
        b.move(30);
    }

    
}
