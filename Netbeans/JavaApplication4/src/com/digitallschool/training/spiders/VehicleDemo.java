/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders;

import javaapplication4.Car;

/**
 *
 * @author HP
 */
public class VehicleDemo {
        
    public static void main(String[] args) {
        
        Car c1 = new Car();
        
        System.out.println(c1.brand);
        c1.ignitionOn();
        c1.accelerate(50);
        c1.currentSpeed();
        }
    
}
