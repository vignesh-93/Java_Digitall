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
public class GitSolution2 {
    
    public static void main(String[] args) {
        String[] template = new String[4];

        try (BufferedReader in = new BufferedReader(
                new FileReader("C:\\Users\\HP\\Desktop\\Markettask\\data.dat"))) {
            for (int i = 0; i < template.length; i++) {
                template[i] = in.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        }
        List<Customer> customerList = new ArrayList<>();
//        customerList.add(new Customer("James", 60, "Male", LocalDate.of(2019 - 60, 10, 10)));
//        customerList.add(new Customer("Dennis", 30, "Female", LocalDate.of(2019 - 30, 8, 5)));
//        customerList.add(new Customer("Johnson", 45, "Male", LocalDate.of(2019 - 45, 6, 22)));
          customerList.add(new Customer("Vicky",21,"Male", LocalDate.of(2019-21, 10, 10)));
          customerList.add(new Customer("Ramz",21,"Male", LocalDate.of(2019-21, 10, 10)));
          customerList.add(new Customer("JJ",21,"Male", LocalDate.of(2019-21, 10, 10)));
        
        for (Customer current : customerList) {
            
            for (int i = 0; i < template.length; i++) {
//                System.out.println(template[i]
//                        .substring(template[i].lastIndexOf('{')+1,
//                                template[i].indexOf('}')).trim());
                switch (template[i]
                        .substring(template[i].lastIndexOf('{') + 1,
                                template[i].indexOf('}')).trim()) {
                    case "name":
                        System.out.println(
                                template[i].replace(
                                        template[i].substring(template[i].indexOf('{'),
                                                template[i].lastIndexOf('}') + 1),
                                        current.getName())
                        );
                        break;
                    case "age":
                        System.out.println(
                                template[i].replace(
                                        template[i].substring(template[i].indexOf('{'),
                                                template[i].lastIndexOf('}') + 1),
                                        current.getAge() + "")
                        );
                        break;
                    case "gender":
                        System.out.println(
                                template[i].replace(
                                        template[i].substring(template[i].indexOf('{'),
                                                template[i].lastIndexOf('}') + 1),
                                        current.getGender())
                        );
                        break;
                    case "dob":
                        System.out.println(
                                template[i].replace(
                                        template[i].substring(template[i].indexOf('{'),
                                                template[i].lastIndexOf('}') + 1),
                                        current.getDob() + "")
                        );
                        break;
                }
            }
            System.out.println("");
        }
    }
    
}
