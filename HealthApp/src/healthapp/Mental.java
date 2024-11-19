/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthapp;

/**
 *
 * @author pyaku
 */
public class Mental {
    
    private int id;
    private String stressLevel;
    private float sleepHours;
    

    public Mental(int id, String stressLevel, float sleepHours) {
        this.id = id;
        this.stressLevel = stressLevel;
        this.sleepHours = sleepHours;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStressLevel(String stressLevel) {
        this.stressLevel = stressLevel;
    }

    public void setSleepHours(float sleepHours) {
        this.sleepHours = sleepHours;
    }

    public String getStressLevel() {
        return stressLevel;
    }

    public float getSleepHours() {
        return sleepHours;
    }
    
     public String getDetails(){
        return "Mental Details: "+id+","+stressLevel+","+sleepHours;
    }
    
    
    
}
