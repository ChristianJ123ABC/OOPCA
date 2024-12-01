/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthapp;

/**
 *
 * @author chris
 */
//used to grab variables from superclass
public class Physical extends User { 
    //declare variables
    protected double bmi;
    protected double activityLevel;
    private String activity;

    //overloaded constructor

    public Physical(double bmi, double activityLevel, String activity, String id, int age, String name, double weight, double height) {
        super(id, age, name, weight, height);
        this.bmi = bmi;
        this.activityLevel = activityLevel;
        this.activity = activity;
    }
    
    
    //default constructor
    public Physical(){
        super();
        bmi = 0.0;
        activityLevel = 0.0;
        activity = " ";
    }
    
    //compute method for BMI
    public void computeBmi(){
        bmi = (weight/height/height)*10000; //source: https://www.cdc.gov/growth-chart-training/hcp/using-bmi/body-mass-index.html#:~:text=A%20measure%20of%20weight%20relative%20to%20height&text=The%20equations%20for%20calculating%20BMI,)%20%2F%20%5Bheight%20(m)%5D&text=Metric%20units%3A%20BMI%20%3D%20%5Bweight,height%20(cm)%5D%20x%2010%2C000
        
    }
    
    
    //source https://reference.medscape.com/calculator/846/mifflin-st-jeor-equation
    public void calculateActivityLevel(){
        if(activity == "1"){
            activityLevel = 1.2;
        }
        
        else if (activity == "2"){
            activityLevel = 1.375;
        }
        
        else if (activity == "3"){
            activityLevel = 1.55;
        }
        
        else if (activity == "4"){
            activityLevel = 1.725;
        }
        
        else if (activity == "5"){
            activityLevel = 1.9;
        }
        
        
    }
    
    
    //setters and getters
    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public double getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(double activityLevel) {
        this.activityLevel = activityLevel;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
    
    
    
    
    
    
    
    
    
    
    
}
