/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks.MarketTask;

//import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MainMenu {

    static void mainMenu() {

        Scanner MainInput = new Scanner(System.in);

        while (true) {
            System.out.println("*****Main Menu*****");
            System.out.println(" 1.Customer \n 2.Purchase \n 3.Payment \n 4.Statistics \n 5.Exit");

            System.out.println("Enter your choice::");
            int choiceForMainMenu = MainInput.nextInt();

            switch (choiceForMainMenu) {
                case 1:
                    Customer();
//                            System.out.println("1. Customer");
                    break;
                case 2:
                    Purchase();
//                        System.out.println("2. Purchase");
                    break;
                case 3:
                    Payment();
//                            System.out.println("3. Payment");
                    break;
                case 4:
                    Statistics();
//                        System.out.println("4. Statistics");
                    break;
                case 5:
                    Exit();
                    return;
//			System.out.println("5. Exit");
//                    break;
                default:
                    System.out.println("Incorrect input!!! Please re-enter choice from our menu");
            }
        }

    }

    public static void Customer() {
        System.out.println("******************Customer****************");
        System.out.println("1. Add");
        System.out.println("2. View");
        System.out.println("3. Update");
        System.out.println("4. Exit");
        System.out.println("Choose one from the top");
        Scanner customerInput = new Scanner(System.in);
        int customerChoice = customerInput.nextInt();

        switch (customerChoice) {
            case 1:
                Customer.addCustomer();
                break;
            case 2:
                Customer.viewCustomer();
                break;
            case 3:
                Customer.updateCustomer();
                break;
            case 4:
                Customer.exitCustomer();
                break;
        }
    }

    public static void Purchase() {
        System.out.println("**************Purchase***************");
        System.out.println("1. Add");
        System.out.println("2. View");
        System.out.println("3. Update");
        System.out.println("4. Exit");
        
        Scanner pc = new Scanner(System.in);
        int PurchaseChoice = pc.nextInt();
        
        switch(PurchaseChoice){
            case 1: Purchase.addPurchase();
                    break;
            case 2:
                Purchase.viewPurchase();
                break;
            case 3:
                Purchase.updatePurchase();
                break;
            case 4:
                Purchase.exitPurchase();
                break;
        }
    }

    public static void Payment() {
        System.out.println("**************Payment***************");
        System.out.println("1. Add");
        System.out.println("2. View");
        System.out.println("3. Update");
        System.out.println("4. Exit");
        
        Scanner pyc = new Scanner(System.in);
        int PaymentChoice = pyc.nextInt();
        
        switch(PaymentChoice){
            case 1: Payment.addPayment();
                break;
            case 2:
                Payment.viewPayment();
                break;
            case 3:
                Payment.updatePayment();
                break;
            case 4:
                Payment.exitPayment();
                break;
        }
    }

    public static void Statistics() {
        System.out.println("**************Statistics***************");
        System.out.println("1. Add");
        System.out.println("2. View");
        System.out.println("3. Update");
        System.out.println("4. Exit");
    }

    public static void Exit() {
        System.out.println("Terminated");
    }

}
