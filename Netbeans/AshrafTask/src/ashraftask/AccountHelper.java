/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ashraftask;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class AccountHelper {
    
    public static void main(String[] args) {
        
    Account Acc1 = new Account("BV",11,2000,"New");
    Account Acc2 = new Account("Hbk",10,1100,"Req");
    Account Acc3 = new Account("SA",23,7000,"Asap");
    Account Acc4 = new Account("SB",26,5000,"Said");
    
    ArrayList<Account> account = new ArrayList<Account>();
    account.add(Acc1);
    account.add(Acc2);
    account.add(Acc3);
    account.add(Acc4);
    
        System.out.println(Acc1.AccountName);
        
        for(Account acc : account){
            System.out.println(acc.AccountName + " " + acc.id + " " + acc.AccountBalance + " " + acc.AccountData);
        }
}
    
}
