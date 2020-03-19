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
public class PenDemo {
    
      public static void main(String[] args) {
        
        Pen a = new Pen();
        System.out.println(a.Brand);
        System.out.println(a.Refill);
        System.out.println(a.used);
        System.out.println(a.type);
        System.out.println(a.price);
        System.out.println("--------------------");
    
        Pen b = new Pen("Rorito");
        System.out.println(b.Brand);
        System.out.println("---------------");
      
       Pen c = new Pen("Natraj",200);
       System.out.println(c.Brand);
       System.out.println(c.price);
       System.out.println("---------------");
       
       Pen d = new Pen();
        System.out.println(d.used);
        d.InkRemain(40);
        d.InkRemain(-20);
        d.InkRemain(200);
        System.out.println("---------------"); 
        
       Pen e = new Pen();
        System.out.println(e.used);
        e.InkUsed(70);
//      e.PagesUsed(100);
        System.out.println("---------------"); 
    }
    
}
