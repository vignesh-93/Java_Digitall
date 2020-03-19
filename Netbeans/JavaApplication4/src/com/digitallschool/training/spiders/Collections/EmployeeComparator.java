/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.Collections;

import Inherit.Employee;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author HP
 */
public class EmployeeComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
       if(Objects.equals(e1.getEmployeeid(),e2.getEmployeeid())
               &&
          Objects.equals(e1.getname(), e2.getname())){
            return 0;
            } else if(!Objects.equals(e2.getname(), e2.getname())){
            return e1.getname().compareTo(e2.getname());
            }
            else{
            return e1.getEmployeeid() - e2.getEmployeeid();
            }
    }


    
}
