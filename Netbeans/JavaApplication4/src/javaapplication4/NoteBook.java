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
public class NoteBook {
    
    final String Brand;
    int pages;
    int used;
    String type;
    double price;
    int left;
    
    public NoteBook()   //Constructor 
    {
        Brand="ClassMate";
        pages=190;
        used=0;
        type="Ruled";
        price=50;
        left = 190;
    }
    
    public NoteBook(String a)   
    {
        Brand=a;
        pages=190;
        used=0;
        type="Ruled";
        price=50;
        left = 190;
    }
    
    public NoteBook(String brd,int pgs)
    {
        Brand=brd;
        pages=pgs;
        used=0;
        type="Ruled";
        price=50;
        left = 190;
    }
    
    public void PagesUsed   (int p)
    {
        if(p<0)
        {
            System.out.println("Incorrect");
            return;
        }
        
        if(p>190)
        {
            System.out.println("Insufficient Pages");
        }else
            {
                pages -= p;
                System.out.println(pages + " Pages Used");
            }
    }
    
    public void PagesRemain(int p)
    {
        
        if(p<0)
        {
            System.out.println("Incorrect");
            return;
        }
        
        if(p>190)
        {
            System.out.println("Insufficient Pages");
        }else
            {
                left -= p;
                System.out.println(left + " Remaining");
            }
    }
    
}
