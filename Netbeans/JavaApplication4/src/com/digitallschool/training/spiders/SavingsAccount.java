/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders;

/**
 *
 * @author HP
 */
public class SavingsAccount extends Account {

 private static double minimumLimit; 
 
 static {
 minimumLimit = 1000;
 }

//public SavingsAccount(){
//    super();
//} 
 
public SavingsAccount(int acc,int bal){
      super(acc,bal);
//    minimumLimit = minim;
} 
 
 public void credit(double cb){
      balance += cb;
      System.out.println("Credit" + cb );
      System.out.println("Balance" + balance);
 }
 
 public void debit(double db){
      
     if(db<0){
         System.out.println("Negative");
     }else{
        if(db < balance){
           balance -= db;
   //         System.out.println(balance + " before 2nd if");
   //         System.out.println("**********");
               if(balance < minimumLimit){
                   System.out.println("Fine Payment");
               }else {
                   System.out.println("Debited " + db );
                   System.out.println("Balance " + balance);
                     }
        }else
        {
          System.out.println("No Money");
        }
     }
 }
    
}
