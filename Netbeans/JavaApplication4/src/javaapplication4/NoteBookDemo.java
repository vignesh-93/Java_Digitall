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
public class NoteBookDemo {
    
    public static void main(String[] args) {
        
        NoteBook a = new NoteBook();
        System.out.println(a.Brand);
        System.out.println(a.pages);
        System.out.println(a.used);
        System.out.println(a.type);
        System.out.println(a.price);
        System.out.println("--------------------");
    
        NoteBook b = new NoteBook("PaperKraft");
        System.out.println(b.Brand);
        System.out.println("---------------");
      
       NoteBook c = new NoteBook("Faber-Castell",200);
       System.out.println(c.Brand);
       System.out.println(c.price);
       System.out.println("---------------");
       
       NoteBook d = new NoteBook();
        System.out.println(d.used);
        d.PagesRemain(40);
        d.PagesRemain(-20);
        d.PagesRemain(200);
        System.out.println("---------------"); 
        
       NoteBook e = new NoteBook();
        System.out.println(e.used);
        e.PagesUsed(100);
//      e.PagesUsed(100);
        System.out.println("---------------"); 
    }
    
    
    
}
