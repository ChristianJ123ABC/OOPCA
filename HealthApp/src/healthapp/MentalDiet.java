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

    public MentalDiet(String dietType, double calories, String id, String stressLevel, String sleepHours) {
        super(id, stressLevel, sleepHours);
        this.dietType = dietType;
        this.calories = calories;
    }
    
      public MentalDiet(){
        super();
        this.dietType = " ";
        this.calories = 0;
    }


    public void setDietType(String dietType) {
        this.dietType = dietType;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public String getDietType() {
        return dietType;
    }

    public double getCalories() {
        return calories;
    }
    
     public void compute(){
    
    }
       

      @Override
    public String getDetails(){
        return super.getDetails()+","+dietType+","+calories;
    }
   
}