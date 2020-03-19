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
public class Bag {
      
   final String brand;
   int price;
   String type;
   String material;
   String color;
   private boolean openss;
    
   {
//   brand = "Livya";
   price = 2000;
   type = "Backpack";
   material = "nylon";
   color = "black";
   }
   
   public Bag(){
       brand = "Livya";
   }
   
   public Bag(String a){
       brand = a;
   }
   
   public Bag(String a,int p){
       brand = a;
       price = p;
   }
   
   public void open(){
       openss = true;
   }
   
   public void close(){
       System.out.println("The bag is closed");
       openss = false;
   }
   
   public boolean isopen(){
       return openss;
   }
   
   public void drop(){
       if(isopen()){
           System.out.println("Fill the bag");
       }else{
           System.out.println("Open the bag to drop");
       }
   }
   
   
   
}
