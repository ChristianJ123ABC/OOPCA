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
    protected String stressLevel;
    protected String sleepHours;
    

    public Mental(String id, String stressLevel, String sleepHours) {
        this.id = id;
        this.stressLevel = stressLevel;
        this.sleepHours = sleepHours;
    }
    
     //default constructor
    public Mental(){
        id = " ";
        stressLevel = " ";
        sleepHours = " ";
 
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public void setStressLevel(String stressLevel) {
        this.stressLevel = stressLevel;
    }

    public void setSleepHours(String sleepHours) {
        this.sleepHours = sleepHours;
    }
     public String getId() {
        return id;
    }

    public String getStressLevel() {
        return stressLevel;
    }

    public String getSleepHours() {
        return sleepHours;
    }
    
     public String getDetails(){
        return "Mental Details: "+id+","+stressLevel+","+sleepHours;
    }
    
    
    
}
