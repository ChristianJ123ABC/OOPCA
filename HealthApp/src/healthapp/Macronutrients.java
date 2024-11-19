/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthapp;

/**
 *
 * @author chris
 */
public class Macronutrients extends Physical { //used to grab variables from superclass
    //declare variables
    private double calories;
    private double waterIntake;
    private double protein;
    private double carbs;
    private double fats;
    private double bmr;
    private String bmiCheck;

    //overloaded constructor

    public Macronutrients(double calories, double waterIntake, double protein, double carbs, double fats, double bmr, String bmiCheck, double bmi, double activityLevel, String activity, String id, int age, String name, double weight, double height) {
        super(bmi, activityLevel, activity, id, age, name, weight, height);
        this.calories = calories;
        this.waterIntake = waterIntake;
        this.protein = protein;
        this.carbs = carbs;
        this.fats = fats;
        this.bmr = bmr;
        this.bmiCheck = bmiCheck;
    }

    
    
    
    //default constructor
    public Macronutrients(){
        super();
        calories = 0.0;
        waterIntake = 0.0;
        protein = 0.0;
        carbs = 0.0;
        fats = 0.0;
        bmr = 0.0;
        bmiCheck = " ";
    }
    
    //compute method for Macros
    public void computeMacros(){
        //sources:
        //https://www.acko.com/calculators/water-intake-calculator/
        //https://www.bodybuilding.com/fun/macronutrients_calculator.htm
        //https://www.calculator.net/calorie-calculator.html
        bmr = (10*weight)+(6.25*height)-(5*age)+5;
        calories = bmr*activityLevel;
        protein = Math.rint((0.4*calories)/4); //divides by how many kcal are in 1 gram of that macronutrient, to turn it into grams
        fats = Math.rint((0.2*calories)/9);
        carbs = Math.rint((0.4*calories)/4);
        waterIntake = weight*0.03;
        
    }
    
    public void checkBmi(){
        //source https://www.pacehospital.com/bmi-calculator-ranges-importance
        if(bmi>=35){
            bmiCheck = "Extremely Obese";
        }
        
        else if(bmi>30 && bmi<=34.9){
            bmiCheck = "Obese";
        }
        
        else if(bmi>24.9 && bmi<=29.9){
            bmiCheck = "Overweight";
        }
        
        else if (bmi>18.5 && bmi<=24.9){
            bmiCheck = "Normal weight";
        }
        
        else{
            bmiCheck = "Underweight";
        }
    }
    
    
    

    //setters and getters

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getWaterIntake() {
        return waterIntake;
    }

    public void setWaterIntake(double waterIntake) {
        this.waterIntake = waterIntake;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public double getBmr() {
        return bmr;
    }

    public void setBmr(double bmr) {
        this.bmr = bmr;
    }

    public String getBmiCheck() {
        return bmiCheck;
    }

    public void setBmiCheck(String bmiCheck) {
        this.bmiCheck = bmiCheck;
    }
    
    
    
    
}
