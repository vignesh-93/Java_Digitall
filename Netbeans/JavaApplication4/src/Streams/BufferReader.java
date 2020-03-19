/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author HP
 */
public class BufferReader {
    
    public static void main(String[] args) {
        try(BufferedReader in = new BufferedReader(new FileReader("C:\\Vignesh\\paths\\City.txt"))){
            String s = in.readLine();
            System.out.println(s);
//            String t = null;
//            while((t = in.readLine()) != null){
//               String[] arr =  t.split(",");
//               for (int i = 0; i < arr.length; i++) {
//               System.out.println(arr[i]);
//            }
//          }
        } catch(IOException ioe){
            System.out.println("IOException");
        }
    }
    
}
