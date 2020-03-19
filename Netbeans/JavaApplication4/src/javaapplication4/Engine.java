/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.Serializable;
/**
 *
 * @author HP
 */
public class Engine implements Serializable{
    
    private String brand;
    private String model;
    private String type;
    private double price;
    private double hp;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }
    
                 {
                 brand = "tata";
                 model = "TDSI";
                 type = "Diesel";
                 hp = 1299;
                 price = 115000;
                 }

    
    
    public void Engine(String b,String m,String t,int hp1,int p){
        brand = b;
        model = m;
        type = t;
        hp = hp1;
        price = p;
    }
    
}
