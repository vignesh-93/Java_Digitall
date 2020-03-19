/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inherit;

/**
 *
 * @author HP
 */
class TaskOverFlowException extends RuntimeException {
    
    public TaskOverFlowException(){
       super();
    }
    
    public TaskOverFlowException(String message){
        super(message);
    }
    
}
