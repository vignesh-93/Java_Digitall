/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author HP
 */
public class CarDemo {
    
    
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setPrice(100001);
        c1.setPrice(2345);
        c1.getPrice();
        
    }
    
    public static void main1(String[] args) {
        Car c1 = new Car("Tata", "Safari", 1450000);
        System.out.println(c1.brand);
        System.out.println(c1.model);
        //System.out.println(c1.price);
        System.out.println(c1.getPrice());
        
        //c1.price = -860000;
        c1.setPrice(-860000);
        System.out.println(c1.getPrice());
        System.out.println("------------------");
        c1.changeGear(3);
        System.out.println("------------------");
        c1.changeGear(-1);
        System.out.println("------------------");
        c1.changeGear(7);
        System.out.println("------------------");
//        c1.currentGear();
        System.out.println(c1.currentGear());
        System.out.println("------------------");
        System.out.println(c1.totalGears);
        System.out.println("------------------");
        c1.ignitionOn();
        c1.accelerate(-80);
        System.out.println("------------------");
        c1.applyBreak(-20);
        System.out.println("------------------");
        c1.currentSpeed();
        System.out.println("------------------");
        
        Car c2 = new Car("Toyota","Etios");
        System.out.println(c2.brand);
        System.out.println(c2.model);
        System.out.println("------------------");
        System.out.println(c2.category);
        
    }

    /* 
    public static void main1(String[] args) {
        
        Car a = new Car();
        System.out.println(a.price);
        System.out.println(a.Brand);
        System.out.println(a.Model);
        System.out.println(a.Type);
        System.out.println(a.color);
        System.out.println(a.cc);
        System.out.println("-----------");
        a.Brand="Ford";
        a.price=1000000;
        System.out.println(a.price);
        System.out.println(a.Brand);
        System.out.println("-----------");
        
        Car b = new Car();
        System.out.println(b.price);
        b.Brand="BMW";
        System.out.println(b.Brand);
        System.out.println("-----------");
    }
  */
}
