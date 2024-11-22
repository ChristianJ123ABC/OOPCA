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
public class User implements Serializable { //creates an abstract class and prevents any GUI errors 
    protected String id;
    protected String name;
    protected double weight;
    protected double height;
    protected int age;
    protected String password;
    
    
    
    //overloaded constructor
    public User(String id, int age, String name, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    
    //default constructor
    public User(){
        id = " ";
        age = 0;
        name = " ";
        weight = 0.0;
        height = 0.0;
        password = " ";
    }
    
    //setters and getters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
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
    
    
    
    //method used to retrieve details easier
    public String getDetails(){
        return "ID: "+id+"\n Age: "+age+"\n Name: "+name+"\n Weight: "+weight+"\n Height: "+height;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
}
