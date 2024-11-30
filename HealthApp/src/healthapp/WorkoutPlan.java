/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthapp;

/**
 *
 * @author Christian Joseph
 */
//used to grab variables from Phyiscal (inheritance)
public class WorkoutPlan extends Physical {
    private String type;
    private double duration;
   
    //overloaded constructor
    public WorkoutPlan(String type, double duration, double bmi, double activityLevel, String activity, String id, int age, String name, double weight, double height) {
        super(bmi, activityLevel, activity, id, age, name, weight, height);
        this.type = type;
        this.duration = duration;
        
    }
    
    //default constructor
    public WorkoutPlan(){
        super();
        type = " ";
        duration = 0.0;
        
    }
    
    //setters and getters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
    
    //overriding method of getDetails (grabbed from User SuperClass) (Polymorphism)
    @Override
    public String getDetails(){
        return " Workout Details: \n ID: "+id+"\n Workout Type: "+type+" \n Workout Duration: "+duration;
    }

   
    
    
}
