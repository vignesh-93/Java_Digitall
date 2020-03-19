/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class SwitchCaseDemo {
    public static void main(String[] args) {
        {
        int month = 6;
        
        switch(month) 
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
                
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
                
            default:
                System.out.println("Invalid Month"); 
                
//            case 1: 
//            System.out.println("Jan 31"); 
//            break; 
//        case 2: 
//            System.out.println("Feb 28/29"); 
//            break; 
//        case 3: 
//            System.out.println("Mar 31"); 
//            break; 
//        case 4: 
//            System.out.println("Apl 30"); 
//            break; 
//        case 5: 
//            System.out.println("May 31"); 
//            break; 
//        case 6: 
//            System.out.println("Jun 30"); 
//            break; 
//        case 7: 
//            System.out.println("Jul 31");  
//            break; 
//        case 8: 
//            System.out.println("Aug 31");  
//            break;
//        case 9: 
//            System.out.println("Sept 30");  
//            break;
//        case 10: 
//            System.out.println("Oct 31");  
//            break;
//        case 11: 
//            System.out.println("Nov 30");  
//            break;
//        case 12: 
//            System.out.println("Dec 31");  
//            break;
//        default: 
//            System.out.println("Invalid Month"); 
//            break; 
        }
        }
    }
}
