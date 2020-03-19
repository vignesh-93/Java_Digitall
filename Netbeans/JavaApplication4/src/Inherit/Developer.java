/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inherit;

import java.util.Objects;

/**
 *
 * @author HP
 */
public class Developer extends Employee{
    
    private String technology;
    int developerTaskSize;
    DeveloperTask[] developerTaskArray;
    final int DEVELOPER_TASK_LIMITS; 
    
      {
      DEVELOPER_TASK_LIMITS = 5;
      developerTaskArray = new DeveloperTask[DEVELOPER_TASK_LIMITS];
      }
    
//    {
//    technology = "Java";
//    }
    
    
    public Developer(int eid,String name,String t){
        super(eid,name);
        technology = t;
    }
    
    public String gettech(){
        return technology;
    }
    
    public void assignTask(DeveloperTask Devtask) throws TaskOverFlowException{
            boolean developerArrayBoolean = false;
            
            for(int i=0;i<developerTaskArray.length;i++){
                if(Objects.isNull(developerTaskArray[i])){
                        developerTaskArray[i] = Devtask;
                        developerArrayBoolean = true;
                        break;
                }
                
                if(developerArrayBoolean != false){
                    throw new TaskOverFlowException("Outer than the Index specified");
                }
            }
        }
        
        public int taskSize(){
            int count = 0;
            for(Task t : developerTaskArray){
                if(Objects.nonNull(t)){
                    count++;
                }else{
                    break;
                }
            }
            return count;
        }
    
}
