/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks.Replace;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author HP
 */
public class TemplateDemo1 {

    public static void main(String[] args) {

        try {
            List<Customer> customerList = new ArrayList();
            customerList.add(new Customer("Vicky",21,"Male", LocalDate.of(2019-21, 10, 10)));
            customerList.add(new Customer("Ramz",21,"Male", LocalDate.of(2019-21, 10, 10)));
            customerList.add(new Customer("JJ",21,"Male", LocalDate.of(2019-21, 10, 10)));

            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Markettask\\data.txt"));
            String t = null;
            String[] temp=new String[12];
            for(Customer sample:customerList)
            while ((t = in.readLine()) != null) {
                String[] arr = t.split(":");
                Customer obj=customerList.get(0);
                // while((int t1 = in.read())
//               for(String i : arr){
               // for (int i = 0; i < arr.length; i++) {
//                    if (arr[1]) {
//                        Arrays.spliterator(arr
//                    }
                    System.out.println(t.replace(arr[1],obj.getName()));
                }
            //System.out.println();
        } catch (FileNotFoundException fio) {
            fio.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

}
