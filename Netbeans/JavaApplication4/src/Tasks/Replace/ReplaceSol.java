/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks.Replace;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ReplaceSol {
 
      public static void main(String[] args) {
        String[] temp = new String[4];
        try (BufferedReader in = new BufferedReader(
                new FileReader("C:\\Users\\HP\\Desktop\\Markettask\\data.dat"))) {
            for (int i = 0; i < temp.length; i++) {
                temp[i] = in.readLine();
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Vicky",21,"Male", LocalDate.of(2019-21, 10, 10)));
        customerList.add(new Customer("Ramz",21,"Male", LocalDate.of(2019-21, 10, 10)));
        customerList.add(new Customer("JJ",21,"Male", LocalDate.of(2019-21, 10, 10)));
        for (Customer c : customerList) {
            c.replace(c, temp);
        }
    }
    
}
