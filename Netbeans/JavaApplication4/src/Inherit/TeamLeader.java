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
public class TeamLeader extends Developer{
    
    private String Projectname;
//    String[] developer;
    final int TEAMLEADER_TASK_LIMITS; 
    int teamLeaderTaskSize;
    TeamLeaderTask[] teamLeaderTaskArray;
    
    {
    TEAMLEADER_TASK_LIMITS = 5;
    teamLeaderTaskArray = new TeamLeaderTask[TEAMLEADER_TASK_LIMITS];
    }
    
//    public TeamLeader(int eid,String name,String t,String s,String[] dev){
//        super(eid,name,t);
//        Projectname = s;
//        developer = dev;
//    }
    
    public TeamLeader(int eid,String name,String t,String s){
        super(eid,name,t);
        Projectname = s;
    }
    
    public String getprojname(){
        return Projectname;
    }
    
    public void assignTask(TeamLeaderTask TLtask) throws TaskOverFlowException{
            boolean tlArrayBoolean = false;
            
            for(int i=0;i<teamLeaderTaskArray.length;i++){
                if(Objects.isNull(teamLeaderTaskArray[i])){
                        teamLeaderTaskArray[i] = TLtask;
                        tlArrayBoolean = true;
                        break;
                }
                
                if(tlArrayBoolean != false){
                    throw new TaskOverFlowException("Outer than the Index specified");
                }
            }
        }
        
        public int taskSize(){
            int count = 0;
            for(Task t : teamLeaderTaskArray){
                if(Objects.nonNull(t)){
                    count++;
                }else{
                    break;
                }
            }
            return count;
        }
    
}
