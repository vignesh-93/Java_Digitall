/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class First15Prime 
{
    
    public static void main(String[] args) 
    {
        pp(10);
    }
       
       static void pp(int x)
       {
       int current = 2;
       int scale =0;
       
       loop:
       while(scale < x)
            {
                while(true)
                    {
                        if(isprime(current))
                            {
                                System.out.println(current);
                                
                                current++;
                                scale++;
                                continue loop;
                            }
                        current++;
                    }
            }
       }
    
       static boolean isprime(int a){
            if(a==0||a==1)
            {
//                System.out.println("Neither Prime nor Composite");
                return false;
            }else{
                   for(int i=2;i<a;i++){
                       if(a%i==0) {
                           return false;
                       }
//                       return true;
                   }
            }
            return true;
        }
}
