/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author Sathiyaseelan
 */
public class Menu {
    static void mainMenu() {
        System.out.println("----------------MainMenu----------------");
        System.out.print("\n");
        System.out.print(" 1.Customer \n 2.Purchase \n 3.Payment \n 4.Statistics \n 5.Exit");
        Scanner s = new Scanner (System.in);
        int i = s.nextInt();
        switch(i){
            case 1 : customerMenu();
            break;
            case 2 : purchaseMenu();
            break;
            case 3 : paymentMenu();
            break;
            case 4 : statistics();
            break;
            case 5 : Exit();
            break;
            
        }
    }
        static void customerMenu(){
            System.out.println("-----------CustomerMenu-----------");
            System.out.println(" 1.Add \n 2.View \n 3.Update \n 4.Exit");
            Scanner s = new Scanner (System.in);
        int i = s.nextInt();
        switch(i){
            case 1 : Customer.addCustomer();
            break;
            case 2 : Customer.customerViewMenu();
            break;
            case 3 : Customer.customerStatistics();
            break;
            case 4 : Customer.customerExit();
            break;  
        }
        }
        static void purchaseMenu(){
            System.out.println("-----------PurchaseMenu-----------");
            System.out.println(" 1.Add \n 2.View \n 3.statistics \n 4.Exit");
        }
        static void paymentMenu(){
            System.out.println("-----------PaymentMenu-----------");
            System.out.println(" 1.Add \n 2.View \n 3.statistics \n 4.Exit");
        }
        static void statistics(){
            System.out.println("");
        }
        static void Exit(){
            System.out.println("Application is Closed");
           
        }
    }
