/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthapp;

/**
 *
 * @author flips
 */
public class WorkoutPlan extends Physical {
    private String type;
    private double duration;
    private String frequency;

    public WorkoutPlan(String type, double duration, String frequency, double bmi, double activityLevel, String activity, int id, int age, String name, double weight, double height) {
        super(bmi, activityLevel, activity, id, age, name, weight, height);
        this.type = type;
        this.duration = duration;
        this.frequency = frequency;
    }
    
    public WorkoutPlan(){
        super();
        type = " ";
        duration = 0.0;
        frequency = " ";
    }

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

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
    
    
}
