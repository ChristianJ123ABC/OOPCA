/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthapp;

/**
 *
 * @author flips
 */
public class Cardio extends Physical{
    private String type;
    private int duration;
    private double caloriesBurned;
    private double activityTime;
    private double met;

    public Cardio(String type, int duration, double caloriesBurned, double activityTime, double met, double bmi, double activityLevel, String activity, int id, int age, String name, double weight, double height) {
        super(bmi, activityLevel, activity, id, age, name, weight, height);
        this.type = type;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
        this.activityTime = activityTime;
        this.met = met;
    }
    
    public Cardio(){
        super();
        type = " ";
        duration = 0;
        caloriesBurned = 0.0;
        activityTime = 0.0;
        met = 0.0;
    }
    
    public void calculateMet(){ //calculates the MET value, the bodys expenditure for energy
        //source https://blog.nasm.org/metabolic-equivalents-for-weight-loss#:~:text=To%20determine%20calories%20expended%20by,%2F%20200%20%3D%20KCAL%2FMIN.&text=So%20in%2045%20minutes%2C%20this,NEAT%20or%20non%2Dactivity%20thermogenesis.
        if(type == "Slow Walk"){
            met = 2.0;
        }
        
        else if (type == "Moderate Run"){
            met = 11.5;
        }
        
        else if (type == "Light Cycle"){
            met = 8.0;
        }
        
        else if (type == "Light Swimming"){
            met = 7.0;
        }
    }
    
    public void calculateKcalBurned(){
        caloriesBurned = met*3.5*weight/200; //calories burned per minute
    }
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(double caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }


    public double getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(double activityTime) {
        this.activityTime = activityTime;
    }

    public double getMet() {
        return met;
    }

    public void setMet(double met) {
        this.met = met;
    }
    
    
    
}
