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

    //overloaded constructor
    public Macronutrients(double calories, double waterIntake, double protein, double carbs, double fats, double bmi, String activityLevel, int id, int age, String name, double weight, double height) {
        super(bmi, activityLevel, id, age, name, weight, height);
        this.calories = calories;
        this.waterIntake = waterIntake;
        this.protein = protein;
        this.carbs = carbs;
        this.fats = fats;
    }
    
    //default constructor
    public Macronutrients(){
        super();
        calories = 0.0;
        waterIntake = 0.0;
        protein = 0.0;
        carbs = 0.0;
        fats = 0.0;
    }
    
    //compute method for Macros
    public void computeMacros(){
        //sources:
        //https://www.acko.com/calculators/water-intake-calculator/
        //https://www.bodybuilding.com/fun/macronutrients_calculator.htm
        protein = 0.4*calories;
        fats = 0.2*calories;
        carbs = 0.4*calories;
        waterIntake = weight*0.03;
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
    
    
    
}
