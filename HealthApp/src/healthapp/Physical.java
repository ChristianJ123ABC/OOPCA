/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthapp;

/**
 *
 * @author chris
 */
public class Physical extends User { //used to grab variables from superclass
    private double bmi;
    private String activityLevel;

    //overloaded constructor
    public Physical(double bmi, String activityLevel, int id, int age, String name, double weight, double height) {
        super(id, age, name, weight, height);
        this.bmi = bmi;
        this.activityLevel = activityLevel;
    }
    
    //default constructor
    public Physical(){
        super();
        bmi = 0.0;
        activityLevel = " ";
    }
    
    public void computeBmi(){
        bmi = (weight/height/height)*10000; //source: https://www.cdc.gov/growth-chart-training/hcp/using-bmi/body-mass-index.html#:~:text=A%20measure%20of%20weight%20relative%20to%20height&text=The%20equations%20for%20calculating%20BMI,)%20%2F%20%5Bheight%20(m)%5D&text=Metric%20units%3A%20BMI%20%3D%20%5Bweight,height%20(cm)%5D%20x%2010%2C000
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }
    
    
    
    
    
    
    
    
}
