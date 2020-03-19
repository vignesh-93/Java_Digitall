/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks.MarketTask;

import static Tasks.MarketTask.MainMenu.Customer;
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

/**
 *
 * @author HP
 */
public class Customer {

    private int customerId;
    private String name;
    private Integer mobileNumber;
    private String address;
    private int pendingAmount;
    static List<Customer> CustomerDetailList = new ArrayList();
    private LocalDate addedOn;

    private Customer(int id, String name, int cmn, String ca,LocalDate addedOn, int pa) {
        customerId = id;
        this.name = name;
        mobileNumber = cmn;
        address = ca;
        this.addedOn = addedOn;
        pendingAmount = pa;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPendingAmount() {
        return pendingAmount;
    }

    public void setPendingAmount(int pendingAmount) {
        this.pendingAmount = pendingAmount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    public LocalDate getAddedOn() {
        return addedOn;
    }

    public void setAddedOn(LocalDate addedOn) {
        this.addedOn = addedOn;
    }

    public Customer(int customerId, String name, Integer mobileNumber) {
        this.customerId = customerId;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public Customer(String name) {
//        this.customerId = customerId;
        this.name = name;
//        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return name + " " + mobileNumber + " " + customerId + " " + 
                        address + " " + addedOn+ " " + pendingAmount;
    }
    
    
    static void addCustomer() {

        Scanner add = new Scanner(System.in);
        System.out.println("Customer ID");
        int id = add.nextInt();
        System.out.println("Customer Name");
        String name = add.next();
        System.out.println("Customer Mobile Number");
        int cmn = add.nextInt();
        System.out.println("Customer Address");
        String ca = add.next();
        LocalDate date = LocalDate.now();
        System.out.println("Pending Amount");
        int pa = add.nextInt();

        CustomerDetailList.add(new Customer(id, name, cmn, ca,date, pa));

        try (FileWriter out = new FileWriter
                ("C:\\Users\\HP\\Desktop\\Markettask\\New folder\\CustomerListData_New.dat", true)) {
            for (Customer c : CustomerDetailList) {
                out.write(c.getCustomerId() + " ");
                out.write(c.getName() + " ");
                out.write(c.getMobileNumber() + " ");
                out.write(c.getAddress() + " ");
                out.write(c.getAddedOn() + ",");
                out.write(c.getPendingAmount() + "\n");
                System.out.println(c);
            }
            System.out.println("Customer Data Transfer Completed");
//           mainMenu();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Create a file to transfer data");
        } catch (IOException ioe) {

        }
    }

    static void viewCustomer() {
             try{
                 System.out.println("Customer Details");
            BufferedReader in;
            in = new BufferedReader(
                new FileReader("C:\\Users\\HP\\Desktop\\Markettask\\New folder\\CustomerListData_New.dat"));
            String r = " ";
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

    static void updateCustomer() {

    }

    static void exitCustomer() {

    }
}
