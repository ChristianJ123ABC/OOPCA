/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthapp;

/**
 *
 * @author pyaku
 */
public class MentalDiet extends Mental {
    private String dietType;
    private double calories;

    
     //overloaded constructor
    public MentalDiet(String dietType, double calories, String id) {
        super(id);
        this.dietType = dietType;
        this.calories = calories;
    }
    
    
    // defult constructor
      public MentalDiet(){
        super();
        this.dietType = " ";
        this.calories = 0;
    }

        //setters
    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    
        //getters
    public String getDietType() {
        return dietType;
    }

    public double getCalories() {
        return calories;
    }
    
           

      @Override
    public String getDetails(){
        return super.getDetails()+", Diet Type:"+dietType+", Calories Intake:"+calories;
    }
   
}