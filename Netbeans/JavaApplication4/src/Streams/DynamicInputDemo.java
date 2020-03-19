/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import Inherit.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DynamicInputDemo {
    
    
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int i = s.nextInt(16);
        
        System.out.println(i);
    }
    
    public static void main3(String[] args) {
        BufferedReader input = null;
        
        try {
            input = new BufferedReader(new InputStreamReader(System.in));
            
            Employee e = new Employee();
            
            System.out.print("Enter Name: ");
            String name = input.readLine();
            e.setName(name); 
            //System.out.println(name);
            
            System.out.print("Enter ID: ");
            int empId = Integer.parseInt(input.readLine());
            e.setEmployeeid(empId);
            //System.out.println(empId);

            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main1(String[] args) {
        System.out.println(args.length);

        for (String t : args) {
            System.out.println(t);
        }
    }

    
    //Command Line Arguments
    public static void mainCLA(String[] args) {
        System.out.println(args.length);
        for(String s : args){
        System.out.println(s);
    }
   }
}
