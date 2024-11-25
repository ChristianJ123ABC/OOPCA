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
    private String activityName;
    private double met;

    //overloaded constructor
    public Cardio(String type, int duration, double caloriesBurned, String activityName, double met, double bmi, double activityLevel, String activity, String id, int age, String name, double weight, double height) {
        super(bmi, activityLevel, activity, id, age, name, weight, height);
        this.type = type;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
        this.activityName = activityName;
        this.met = met;
    }
    
    //default constructor
    public Cardio(){
        super();
        type = " ";
        duration = 0;
        caloriesBurned = 0.0;
        activityName = " ";
        met = 0.0;
    }
    
    //calculates the MET value, the bodys expenditure for energy
    public void calculateMet(){ 
        //source https://www.calculator.net/calories-burned-calculator.html?activity=1&activity2=Running%3A+fast&chour=1&cmin=30&cweight=160&cweightunit=k&ctype=1&x=Calculate
        //source 2 https://www.healthline.com/health/what-are-mets
        if(type == "1"){ //slow walk
            met = 5.0;
            activityName = "Slow Walk";
        }
        
        else if (type == "2"){ //moderate run
            met = 11.5; 
            activityName = "Moderate Run";
        }
        
        else if (type == "3"){ //light cycling
            met = 8.0;
            activityName = "Light Cycling";
        }
        
        else if (type == "4"){ //light swimming
            met = 6.0;
            activityName = "Light Swimming";
        }
    }
    
    //compute method for calories burnt
    public void calculateKcalBurned(){
        caloriesBurned = (duration*met*weight/200); //calories burned per minute
    }
    
    //setters and getters
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


    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public double getMet() {
        return met;
    }

    public void setMet(double met) {
        this.met = met;
    }
    
    //overriding method of getDetails (grabbed from User SuperClass)
    @Override
    public String getDetails(){
        return " Cardio Details: \n ID: "+id+"\n Cardio Type: "+activityName+"\n Duration of Session: "+duration+" minutes";
    }
    
    
}
