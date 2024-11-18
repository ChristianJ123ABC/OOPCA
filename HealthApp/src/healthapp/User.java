/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthapp;

import java.io.Serializable;

/**
 *
 * @author Christian Joseph - created the entire User superclass
 */
public abstract class User implements Serializable {
    protected int id;
    protected String name;
    protected double weight;
    protected double height;
    
    //overloaded constructor
    public User(int id, String name, double weight, double height) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    
    //default constructor
    public User(){
        id = 0;
        name = " ";
        weight = 0.0;
        height = 0.0;
    }
    
    //setters and getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    //used to quickly add the details of the user
    public String getDetails(){
        return "ID: "+id+"\n Name: "+name+"\n Weight: "+weight+"\n Height: "+height;
    }
    
    
    
}
