/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks.Replace;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class GitSolution1 {
     public static void main(String[] args) {
        String[] template = new String[8];
        
        try(BufferedReader in = new BufferedReader(
                new FileReader("C:\\Users\\HP\\Desktop\\Markettask\\data.dat"))){
            for(int i=0; i<8; i+=2){
                String input = in.readLine();
                System.out.println(input);
                template[i] = input.substring(0, input.indexOf("{"));
                template[i+1] = input.substring(input.indexOf("{"));
            }
        }catch(FileNotFoundException fno){
            fno.printStackTrace();
            return;
        }catch(IOException ioe){
            ioe.printStackTrace();
            return;
        }
        List<Customer> customerList = new ArrayList<>();
//        customerList.add(new Customer("James", 60, "Male", LocalDate.of(2019-60, 10, 10)));
//        customerList.add(new Customer("Dennis", 30, "Female", LocalDate.of(2019-30, 8, 5)));
//        customerList.add(new Customer("Johnson", 45, "Male", LocalDate.of(2019-45, 6, 22)));
            customerList.add(new Customer("Vicky",21,"Male", LocalDate.of(2019-21, 10, 10)));
            customerList.add(new Customer("Ramz",21,"Male", LocalDate.of(2019-21, 10, 10)));
            customerList.add(new Customer("JJ",21,"Male", LocalDate.of(2019-21, 10, 10)));

        for(Customer current: customerList){
            for(int i=0; i<template.length; i++){
                String s = template[i];
                if(s.contains("{{")){
                    switch(s.substring(2, s.length()-2).trim()){
                        case "name":
                            System.out.println(template[i-1] + current.getName());
                            break;
                        case "age":
                            System.out.println(template[i-1] + current.getAge());                            
                            break;
                        case "gender":
                            System.out.println(template[i-1] + current.getGender());                            
                            break;
                        case "dob":
                            System.out.println(template[i-1] + current.getDob());
                            break;
                    }
                }
            }
            System.out.println("");
        }
    }

}
