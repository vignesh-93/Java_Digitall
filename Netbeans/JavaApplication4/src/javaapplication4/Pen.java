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
public class Pen {
            
    String Brand;
    int Refill;
    int used;
    String type;
    double price;
    int left;
    
     public Pen()   //Constructor 
    {
        Brand="Reynolds";
        Refill=100;
        used=0;
        type="Ball Pen";
        price=5;
        left = 100;
    }
    
    public Pen(String a)   
    {
        Brand=a;
        Refill=100;
        used=0;
        type="Ball Pen";
        price=5;
        left = 100;

    }
    
    public Pen(String brd,int ref)
    {
        Brand=brd;
        Refill=ref;
        used=0;
        type="Ball Pen";
        price=5;
        left = 100;
    }
    
    public Pen(String brd,int ref,String typ)
    {
        Brand=brd;
        Refill=0;
        used=0;
        type=typ;
        price=5;
        left = 100;
    }

    
    public void InkUsed   (int p)
    {
        if(p<0)
        {
            System.out.println("Incorrect");
            return;
        }
        
        if(p>100)
        {
            System.out.println("Insufficient");
        }else
            {
                Refill -= p;
                System.out.println(Refill + " Remaining");
                System.out.println(p + " Given");
            }
    }
    
    public void InkRemain(int p)
    {
        
        if(p<0)
        {
            System.out.println("Incorrect");
            return;
        }
        
        if(p>100)
        {
            System.out.println("Insufficient");
        }else
            {
                left = Refill - p;
                System.out.println(left + " Remaining");
                System.out.println(p + " Used");
            }
    }
    
}
