/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import static assignment.Menu.mainMenu;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import jv1.date;

/**
 *
 * @author Sathiyaseelan
 */
public class Customer {
    private int customer_Id;
    private String customer_Name;
    private String Mobile;
    private String address;
    private LocalDate addedOn;
    private double pendingAmount;
    public static List<Customer> customerList= new ArrayList();
    
    
    
    public Customer(int cusid, String cusname, String mob, String address, Double penamo){
        setCustomer_Id(cusid);
        setCustomer_Name(cusname);
        setMobile(mob);
        setAddress(address);
        setPendingAmount(penamo);
    }
    
    @Override
    public String toString(){
        return "[" + customer_Id + ", " + customer_Name + ", " + Mobile + ", " + address +","
                + pendingAmount + "]";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    public static void setCustomerList(List<Customer> customerList) {
        Customer.customerList = customerList;
    }
    

    public int getCustomer_Id() {
        return customer_Id;
    }

    public void setCustomer_Id(int customer_Id) {
        this.customer_Id = customer_Id;
    }

    public String getCustomer_Name() {
        return customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        this.customer_Name = customer_Name;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public LocalDate getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(LocalDate addedOn) {
        this.addedOn = addedOn;
    }

    public double getPendingAmount() {
        return pendingAmount;
    }

    public void setPendingAmount(double pendingAmount) {
        this.pendingAmount = pendingAmount;
    }
    static void addCustomer() {
       Scanner s = new Scanner(System.in);
       
       System.out.println("Enter customer ID :");
       int cid = s.nextInt();
       System.out.println("Enter customer Name :");
       String name = s.next();
       System.out.println("Enter customer Mobile :");
       String mob = s.next();
       System.out.println("Enter Customer Address :");
       String add = s.next();
       System.out.println("Enter customer Pending amount :");
       Double pa = s.nextDouble();
       
       customerList.add(new Customer( cid, name, mob, add, pa));
       
         try (FileWriter out = new FileWriter("C:\\Users\\HP\\Desktop\\Markettask\\CustomerListData_1.dat")) {
           for (Customer c : customerList) {
               
               out.write(c.getCustomer_Id() + ",");
               out.write(c.getCustomer_Name() + ",");
               out.write(c.getMobile() + ",");
               out.write(c.getAddedOn() + ",");
               out.write(c.getPendingAmount() + "\n");
               
               System.out.println(c);
           }
             System.out.println("File Copied Succesfully");
               mainMenu();
       } catch (IOException ioe) {
           ioe.printStackTrace();
       }
         
   }
    static void customerViewMenu(){
        
    }
    static void customerStatistics(){
        
    }
    static void customerExit(){
        mainMenu();
    }

}
        
