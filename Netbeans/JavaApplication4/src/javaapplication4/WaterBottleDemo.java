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
public class WaterBottleDemo {
    
    
    public static void main(String[] args)
   {
       WaterBottle a=new WaterBottle();
       System.out.println(a.getquantity());
       a.setQuantity(800);
       System.out.println(a.getquantity());
       a.open();
       System.out.println(a.isopen());
       a.close();
       System.out.println(a.isopen());
   }
   
    
    
    public static void main2(String[] args)
   {
       WaterBottle a=new WaterBottle();
       System.out.println(a.getprice());
       a.setprice(-10);
       System.out.println(a.getprice());
   }
    
   
    public static void main1(String[] args) {
        
        
        WaterBottle a = new WaterBottle();
        System.out.println(a.brand);
        System.out.println(a.quantity);
        System.out.println(a.price);
        System.out.println(a.capacity);
        System.out.println(a.color);
        System.out.println("------------------");
        
        WaterBottle b = new WaterBottle();
        System.out.println(b.brand);
        System.out.println(b.quantity);
        System.out.println(b.price);
        System.out.println(b.capacity);
        System.out.println(b.color);
        System.out.println("------------------");
        
        b.price = 20;
        System.out.println(a.price);
        System.out.println(b.price);
        
    }
    
}
