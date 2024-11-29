/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthapp;

/**
 *
 * @author pyaku
 */
public class Mental extends User {
    
    protected String Id;
    protected String stressLevel;
    protected String sleepHours;
    

        //overloaded constructor
    public Mental(String id, String stressLevel, String sleepHours) {
        this.Id = id;
        this.stressLevel = stressLevel;
        this.sleepHours = sleepHours;
    }
    
     //default constructor
    public Mental(){
        Id = " ";
        stressLevel = " ";
        sleepHours = " ";
 
    }
    
    
    //overrides the setters from healthApp.user
    @Override
    public void setId(String id) {
        this.Id = id;
    }

    public void setStressLevel(String stressLevel) {
        this.stressLevel = stressLevel;
    }

    public void setSleepHours(String sleepHours) {
        this.sleepHours = sleepHours;
    }

    /**
     *
     * @return
     */
    
    //overrides the getters from the user
    @Override
     public String getId() {
        return Id;
    }

    public String getStressLevel() {
        return stressLevel;
    }

    public String getSleepHours() {
        return sleepHours;
    }
    
    @Override
     public String getDetails(){
        return "Mental Details: \n Your Id:"+Id+",Stress Level: "+stressLevel+",Sleep Hours: "+sleepHours;
    }
    
    
    
}
