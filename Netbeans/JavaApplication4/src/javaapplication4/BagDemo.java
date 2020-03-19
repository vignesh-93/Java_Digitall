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
public class BagDemo {
    
    public static void main(String[] args) {
        
        Bag b1 = new Bag();
        System.out.println(b1.brand + " " +  b1.color + " " + b1.material + " " + b1.type + " " + b1.price);
        
        Bag b2 = new Bag("Adidas");
        System.out.println(b2.brand);

        Bag b3 = new Bag("Nike",3000);
        System.out.println(b3.brand + " " + b3.price);
        
        Bag b4 = new Bag();
        b4.drop();
        b4.open();
        b4.drop();
        b4.close();
        
    }
    
    
}
