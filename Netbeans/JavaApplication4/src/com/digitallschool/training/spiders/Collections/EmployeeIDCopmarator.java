/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.Collections;

import Inherit.Employee;
import java.util.Comparator;

/**
 *
 * @author HP
 */
public class EmployeeIDCopmarator implements Comparator{
    
    @Override
    public int compare(Object a, Object b){
        Employee x = (Employee)a;
        Employee y = (Employee)b;
        
        return x.getEmployeeid() - y.getEmployeeid();
    }

}
