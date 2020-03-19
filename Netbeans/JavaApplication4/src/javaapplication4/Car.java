/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import com.digitallschool.training.spiders.ExceptionHandling.InvalidCarPriceException;

import java.io.Serializable;
/**
 *
 * @author HP
 */
public class Car implements Serializable{
    
    private double price;
    String color;
    public final String brand;
    final String model;
    double cc;
    String type;
    private boolean ignition;
    private double speed;
    final int totalGears;
    int currentGear;
    public static String category;
    
    //Created for Engine Class
    
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    //Engine Type //
    
    public int currentGear() {
        return currentGear;
    }
    
    public void changeGear(int gear) 
    {
        if(gear>totalGears){
            System.out.println("Out of Gears");
        }
        else if(gear == -1){
            System.out.println("Reverse in Progress");
        }
        else {
            currentGear += gear;
            System.out.println(currentGear);
        }
    }
    
    public double currentSpeed() {
        System.out.println(speed + " Current Speed");
        return speed;
    }

    public void applyBreak(double step) {
        if(step>0){
            if (speed >= step) {
                speed -= step;
                System.out.println(speed);
            } else {
                speed = 0;
                System.out.println(speed);
            }
        }else{
            System.out.println(" Braking Cannot be Negative");
        }
            
    }

    public void stop() {
        speed = 0;
        System.out.println(speed);
    }

    public void accelerate(double step) {
        if (isOn()){
            if(step>0) 
            {
                speed += step;
                System.out.println(speed);
            }else{
                System.out.println("Accelerate Cannot be Negative");
            }
        }else{
            System.out.println("Ignition On");
        }
    }

    public boolean isOn() {
        return ignition;
    }

    public void ignitionOn() {
        ignition = true;
    }

    public void ignitionOff() {
        ignition = false;
    }

    
    public double getPrice(){
        System.out.println(price);
        return price;
    }
    
    public void setPrice(double p) throws InvalidCarPriceException{
        if(p >= 100000){
            price = p;
            System.out.println(price);
        }else{
//            IllegalArgumentException e = new IllegalArgumentException();
//            throw e;
////          System.out.println("Invalid Car Price");
              
//              throw new IllegalArgumentException("This throws the user declared content in this block");
              
                throw new InvalidCarPriceException("This throws the user declared content in this block from the created own class");
              
        }
        //price = p;
    }
    
    
    
    {
        //brand = "Audi";
        price = 3500000;
        color = "White";
        //model = "A3";
        cc = 2499;
        type = "Diesel";
        totalGears = 6;
        category = "vehicles";
    }

    public Car() {
        brand = "Audi";
        model = "A3";
        /*price = 3500000;
        color = "White";
        model = "A3";
        cc = 2499;
        type = "Diesel";*/
    }
    
    public Car(String b){
        brand = b;        
        model = "A3";
        /*price = 3500000;
        color = "White";
        model = "A3";
        cc = 2499;
        type = "Diesel";*/
    }
    
    public Car(String b, String m){
        brand = b;
        model = m;
        /*price = 3500000;
        color = "White";
        cc = 2499;
        type = "Diesel";*/
    }
    
    public Car(String b, String m, double p){
        brand = b;
        model = m;
        price = p;
    }
    
    public Car(String b, String m, double p,Engine engine){
        brand = b;
        model = m;
        price = p;
        this.engine = engine;
    }
    
}