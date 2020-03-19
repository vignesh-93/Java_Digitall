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
public class Employee implements Comparable{
        
    @Override
    public int compareTo(Object t) {
          Employee that = (Employee)t;
//        Employee that = new Employee();        
//          return this.employeeid - that.employeeid;
          return this.Name.compareTo(that.Name);
        }    
    
    @Override
    public String toString(){
          return "{ Employee ID:" + employeeid + " , Employee Name:" + Name + "}";
    }
    
    private int employeeid;
        private String Name;
        final int TASK_LIMITS; 
//        int employeeTaskSize;
        Task[] employeeTaskArray;
        
        {
        TASK_LIMITS = 5;
        employeeTaskArray  = new Task[TASK_LIMITS]; 
        }
//        {
//        employeeid = 1234;
//        Name = "Vicky" ;
//        }
        
        public Employee(){
        
        }
        
        public Employee(int eid) throws IllegalArgumentException{
            super();
            employeeid = eid;
        }
        
        public Employee(int eid,String name) throws IllegalArgumentException{
            super();
            employeeid = eid;
            Name = name;
        }

        public int getid(){
            return employeeid;
        }
        
            public String getname(){
            return Name;
        }

        public void setEmployeeid(int employeeid) {
            this.employeeid = employeeid;
        }

        public int getEmployeeid() {
            return employeeid;
        }
        
        public void setName(String Name) {
            this.Name = Name;
        }
        
        
        public void assignTask(Task task) throws TaskOverFlowException{
            boolean employeeArrayBoolean = false;
            
            for(int i=0;i<employeeTaskArray.length;i++){
                if(Objects.isNull(employeeTaskArray[i])){
                        employeeTaskArray[i] = task;
                        employeeArrayBoolean = true;
                        break;
                }
                
                if(employeeArrayBoolean != false){
                    throw new TaskOverFlowException("Outer than the Index specified");
                }
            }
        }
        
        public int taskSize(){
            int count = 0;
            for(Task t : employeeTaskArray){
                if(Objects.nonNull(t)){
                    count++;
                }else{
                    break;
                }
            }
            return count;
        }

    
        
}
