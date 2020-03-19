/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import com.digitallschool.training.spiders.Animal;

/**
 *
 * @author HP
 */
public class Cat extends Animal implements Jumper,Hunter{

    public void jump() {
        System.out.println("The Cat is Jumping");
    }

    public void hunt() {
        System.out.println("The Cat is Hunting");
    }
        
    public void move(int distance)
    {
        System.out.println("Cat is moving: " + distance + " distance");
    }
    
}
