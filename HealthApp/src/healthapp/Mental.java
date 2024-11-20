/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthapp;

import java.io.Serializable;

/**
 *
 * @author pyaku
 */
public class Mental implements Serializable {
    
    protected String id;
    protected double stressLevel;
    protected float sleepHours;
    

    public Mental(String id, double stressLevel, float sleepHours) {
        this.id = id;
        this.stressLevel = stressLevel;
        this.sleepHours = sleepHours;
    }
    
     //default constructor
    public Mental(){
        id = " ";
        stressLevel = 0;
        sleepHours = 0;
 
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public void setStressLevel(double stressLevel) {
        this.stressLevel = stressLevel;
    }

    public void setSleepHours(float sleepHours) {
        this.sleepHours = sleepHours;
    }

    public double getStressLevel() {
        return stressLevel;
    }

    public float getSleepHours() {
        return sleepHours;
    }
    
     public String getDetails(){
        return "Mental Details: "+id+","+stressLevel+","+sleepHours;
    }
    
    
    
}
