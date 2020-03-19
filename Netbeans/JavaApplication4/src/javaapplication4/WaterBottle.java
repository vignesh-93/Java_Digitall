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
public class WaterBottle {
    
                String color;
                final int capacity;
                final String brand;
                double price;
                int quantity;
                private boolean openss;
                
    public WaterBottle() 
        {
            System.out.println("WaterBottle Created");
            color="green";
            capacity=750;
            brand="Tupperware";
            price=15;
            quantity=750;
        }
    
    public void empty(int q)
   {
       if(q<0)
       {
           System.out.println("invalid empty quantity");
           return;
       }
       if(quantity-q>=0)
       {
           quantity-=q;
       }
       else
       {
           System.out.println("underflow process");
       }
   }
   public void fill(int q)
   {
       if(q<0)
       {
           System.out.println("invalid fill quantity");
           return;
       }
       if(q+quantity<=capacity)
       {
           quantity +=q;
       }
       else
       {
           System.out.println("overflow problem");
       }
   }
   public void open()
   {
       openss=true;
   }
   public void close()
   {
       openss=false;
   }
   public boolean isopen()
   {
    return openss;
   }
    public double getprice()
    {
        return price;
    }
    public void setprice(double v)
    {
        if(v<10)
        {
            System.out.println("invalid price");
        }
        else
        {
            price=v;
        }
    }
    public  int getquantity()
    {
        return quantity;
    }
    public void setQuantity(int q)
    {
        if(q<0 || q>capacity)
        {
            System.out.println("quantity is overflow");
        }
        else
        {
            quantity=q;
        }
    }
public WaterBottle(String b,int c)
{
   brand =b;
   capacity=c;
    color="blue";
     price=15.0;
     quantity=750;
}



}
                


