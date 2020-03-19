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
public class FinalCustomerSolution {

    public static void main(String[] args) {
        String[] temp = new String[4];
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Markettask\\data.dat"));
            for (int i = 0; i < temp.length; i++) {
                temp[i] = in.readLine();
                System.out.println(temp[i]);
            }
            System.out.println("");
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        }

        List<Customer> customerList = new ArrayList();
        customerList.add(new Customer("Vicky", 21, "Male", LocalDate.of(2019 - 21, 10, 10)));
        customerList.add(new Customer("Ramz", 21, "Male", LocalDate.of(2019 - 21, 10, 10)));
        customerList.add(new Customer("JJ", 21, "Male", LocalDate.of(2019 - 21, 10, 10)));

        //First Loop 
        //To iterate the Customer one by one
        for (Customer c : customerList) {
            //Second Loop
            //To check what is present in the first line
            for (int i = 0; i < temp.length; i++) {
                //To get value and go to that Swtch Case for performing "Replacementā"
                switch (temp[i].substring(temp[i].lastIndexOf('{') + 1, temp[i].indexOf('}')).trim()) {
                    case "name":
                        System.out.println(temp[i].replace(
                                temp[i].substring(temp[i].indexOf('{'), temp[i].lastIndexOf('}') + 1),
                                    c.getName()));
                        break;
                    case "age":
                        System.out.println(temp[i].replace(
                                temp[i].substring(temp[i].indexOf('{'), temp[i].lastIndexOf('}') + 1), 
                                    c.getAge() + ""));
                        break;
                    case "gender":
                        System.out.println(temp[i].replace(
                                temp[i].substring(temp[i].indexOf('{'), temp[i].lastIndexOf('}') + 1), 
                                    c.getGender()));
                        break;
                    case "dob":
                        System.out.println(temp[i].replace(
                                temp[i].substring(temp[i].indexOf('{'), temp[i].lastIndexOf('}') + 1),
                                    c.getDob() + ""));
                        break;
                }
            }
            System.out.println("");
        }
    }

}
