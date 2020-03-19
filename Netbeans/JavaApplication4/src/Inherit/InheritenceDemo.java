/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inherit;

import Interface.Cat;
import com.digitallschool.training.spiders.Animal;
import com.digitallschool.training.spiders.AnimalUtilities;
import com.digitallschool.training.spiders.Bird;
import com.digitallschool.training.spiders.Snake;
import com.digitallschool.training.spiders.Parrot;
import javaapplication4.Car;
import javaapplication4.Engine;


/**
 *
 * @author HP
 */
public class InheritenceDemo {
    
    public static void main(String[] args) {                                 //LOOK IN "com.digitallschool.training.spiders" 
        Employee e1 = new Employee(123,"BV");                                  // FOR THE CREATED CLASSES
        e1.assignTask(new Task(1278, "Some Assigned work"));                   //CONTAINS (Task,Employee,Developer,DeveloperTask,
                                                                               //TeamLeader,TeamLeaderTask)
        e1.assignTask(new Task(1278, "Some Assigned work"));
        e1.assignTask(new Task(1296, "Work on employee induction"));
        
        System.out.println(e1.taskSize());

//        System.out.println(e1.assignTask(Task[tasks]));
        
    }
    
    public static void main11(String[] args) {
        Bird b1 = new Bird();
        b1.eating();
    }
    
    public static void main10(String[] args) {
        Animal p1 = new Parrot();
        p1.move(20);
    }
    
    public static void main9(String[] args) {
        Cat c1 = new Cat();
        c1.hunt();
        c1.jump();
        c1.move(50);
    }
    
    public static void main8(String[] args) {
       Bird.whoAmI();
    }
    
    public static void main7(String[] args) {
        int[] a = {2,4,7,3,9};
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[j]>a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            }
    }
    
    
    public static void main6(String[] args) {
        Animal a1 = new Bird(true);
        a1.move(150);
    }
    
    
    //This throws an error because the Animal Class is made Abstarct 
    public static void main5(String[] args) {
//        Animal a1 = new Animal();
        Animal a2 = new Bird();
        
        Bird b1 = new Bird();
        
//        a1.whoAmI();
        a2.whoAmI();
        
//        a1.move(100);
        a2.move(100);
    }
    
    //This throws an error because the Animal Class is made Abstarct 
    public static void main4(String[] args) {
//        Animal a1 = new Animal();
//        Animal a2 = new Animal();

        Animal a3 = new Bird();
        Animal a4 = new Bird();

        Bird b1 = new Bird();
        Bird b2 = new Bird();
        Parrot p1 = new Parrot();
        Parrot p2 = new Parrot();

        Snake s1 = new Snake();
        Snake s2 = new Snake();

        /*AnimalUtilities.compete(a1, a2);
        AnimalUtilities.compete(a3, a4);
        AnimalUtilities.compete(a1, b2);
        AnimalUtilities.compete(b1, a2);
        AnimalUtilities.compete(b1, b2);
        AnimalUtilities.compete(s1, s2);
        AnimalUtilities.compete(a1, s2);*/

        AnimalUtilities au = new AnimalUtilities();
        
//        au.compete(a1, a2);
//        System.out.println("");
//        au.compete(a3, a4);
//        System.out.println("");
//        au.compete(a1, b2);
//        System.out.println("");
//        au.compete(b1, a2);
//        System.out.println("");
//        au.compete(b1, b2);
//        System.out.println("");
//        au.compete(s1, s2);
//        System.out.println("");
//        au.compete(a1, s2);
//        System.out.println("");
//        
//        au.competeAgain(a1, b2);
//        au.competeAgain(b1, a2);
        //au.competeAgain(b1, b2);
        
        au.max(10.0, 20);
        au.max(10, 20.0);
        //au.max(10, 20);
    }

    public static void main3(String[] args) {
        Snake s1 = new Snake();

        System.out.println(s1.name);
        System.out.println(s1.type);

        s1.eat();
        s1.move(80);
    }

    public static void main2(String[] args) {
        Bird b1 = new Bird();

        System.out.println(b1.name);
        System.out.println(b1.type);

        b1.eat();
        b1.move(80);
        b1.move(80);

    }

    
    //This throws an error because the Animal Class is made Abstarct 
    public static void main1(String[] args) {
//        Animal a1 = new Animal();

//        System.out.println(a1.name);
//        System.out.println(a1.type);
//
//        a1.eat();
//        a1.move(100);
    }

    
   public static void mainemp(String[] args) {
        
        TeamLeader tl = new TeamLeader(1234,"Vicky","Java","Java Tech");
        System.out.println(tl.getname() + ": Name");
        System.out.println(tl.getprojname() + ": Project Name");
        System.out.println(tl.gettech() + ": Technology");
        System.out.println(tl.getid() + ": ID");
    }
    
}
