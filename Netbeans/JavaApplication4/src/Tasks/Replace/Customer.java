/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks.Replace;

import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Customer {
    
    private String name;
    private int age;
    private String gender;
    private LocalDate dob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }


    public Customer(String name, int age, String gender, LocalDate dob) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dob = dob;
    }
    
    @Override
    public String toString() {
        return name + " " + gender + " " + age + " " + dob ;
    }
 
    
    //Refer replace solution for the output 
    
    public void replace(Customer c, String[] temp) {
        
        System.out.println(temp[0].replace("name", c.name));
        System.out.println(temp[1].replace("age", c.age+""));
        System.out.println(temp[2].replace("gender", c.gender));
        System.out.println(temp[3].replace("dob", c.dob+""));
        System.out.println("");
    }
    
}
