/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks.MarketTask;

import static Tasks.MarketTask.MainMenu.mainMenu;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Purchase {

    private int purchaseId;
    private int customerId;
    private LocalDate purchasedOn;
    private double amount;
    static List<Purchase> PurchaseList = new ArrayList();
    
    public Purchase(int purchaseId, int customerId, LocalDate purchasedOn, double amount) {
        this.purchaseId = purchaseId;
        this.customerId = customerId;
        this.purchasedOn = purchasedOn;
        this.amount = amount;
    }
    
    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchasetId) {
        this.purchaseId = purchasetId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public LocalDate getpurchasedOn() {
        return purchasedOn;
    }

    public void setpurchasedOn(LocalDate paidOn) {
        this.purchasedOn = paidOn;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    @Override
    public String toString(){
        return "[" + purchaseId + ", " + customerId + ", " + purchasedOn + ", " + amount + "]";
    }
    
    public static void addPurchase(){
        
        Scanner p = new Scanner(System.in);
        
        System.out.println("Purchase Id");
        int pid = p.nextInt();
        System.out.println("Customer ID");
        int cid = p.nextInt();
//        System.out.println("Date of Purcase");
        LocalDate dp = LocalDate.now();
        System.out.println("Purchase Amount");
        int pa = p.nextInt();
        
        PurchaseList.add(new Purchase(pid,cid,dp,pa));
        
        try(FileWriter out = new FileWriter
                        ("C:\\Users\\HP\\Desktop\\Markettask\\New folder\\PurchaseListData_New.dat",true)){
            for(Purchase pFor : PurchaseList){
                out.write(pFor.getPurchaseId() + ",");
                out.write(pFor.getCustomerId() + ",");
                out.write(pFor.getpurchasedOn() + ",");
                out.write(pFor.getAmount() + "\n");
            } 
                 System.out.println("Purchase Detail Transfered");
//              mainMenu();
        }catch(FileNotFoundException fne){
            fne.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    
    static void viewPurchase() {
       
        try{
            System.out.println("Purchase Details");
            BufferedReader in;
            in = new BufferedReader(
                new FileReader("C:\\Users\\HP\\Desktop\\Markettask\\New folder\\PurchaseListData_New.dat"));
            String r = "";
            if((r = in.readLine())!=null){
               String spl[] = r.split(",");
               for(int i=0;i<spl.length;i++){
                   System.out.println(spl[i]);
                System.out.println("");
               }
            }
            
        } catch (FileNotFoundException ex) {
           
        } catch (IOException ex) {
            
        }
        
    }

    static void updatePurchase() {
       
    }

    static void exitPurchase() {
       
    }
    
}
