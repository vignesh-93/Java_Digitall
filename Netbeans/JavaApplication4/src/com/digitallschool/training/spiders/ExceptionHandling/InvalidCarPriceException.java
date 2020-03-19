/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.ExceptionHandling;

/**
 *
 * @author HP
 */
public class InvalidCarPriceException extends IllegalArgumentException{
    
    public InvalidCarPriceException(){
        super();
    }
    
    public InvalidCarPriceException(String message){
        super(message);
    }
    
    public InvalidCarPriceException(Throwable problem){
        super(problem);
    }
    
    public InvalidCarPriceException(String message,Throwable problem){
        super(message,problem);
    }
    
}
