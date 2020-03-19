/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks.string;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class StringDemo {
 public static void main(String[] args) {
       int data;
       int TotalCount = 0;
       int lowerCount = 0;
       int upperCount = 0;
       int lineCount = 0;
       int numberCount = 0;
       int splCount = 0;
       
       FileInputStream in = null;
       try {
           in = new FileInputStream("C:\\Vignesh\\paths\\TTD.txt");
    
    while((data = in.read())!= -1)
          {
                 if(data =='\n'){
                 lineCount++;
                 }
                 else if(data>=65&&data<=95){
                 upperCount++;
                 }else if(data>=97&&data<=122){
                 lowerCount++;
                 }
                 else if(data>='0'&&data<='9'){
                 numberCount++;
                 }
                 else if(data !=' '&&data !='\n'){
                 splCount++;}
                TotalCount = lowerCount+upperCount+numberCount+splCount;
       }
           System.out.println(TotalCount + " Total");
           System.out.println(lowerCount + " Lower");
           System.out.println(upperCount + " Upper");
           System.out.println(numberCount + " Number");
           System.out.println(splCount + " Spl");
           System.out.println(lineCount + " Line Count");
       } catch (FileNotFoundException fnfe) {
       } catch (IOException ioe) {
           ioe.printStackTrace();
       } finally {
           if (Objects.nonNull(in)) {
               try {
                   in.close();
               } catch (IOException ioe) {
               }
           }
       }
   }   
}