/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthapp;

/**
 *
 * @author pyaku
 */
public class MentalDiet {
    private int id;
    private String mealType;
    private String calories;

    public MentalDiet(int id, String mealType, String calories) {
        this.id = id;
        this.mealType = mealType;
        this.calories = calories;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getMealType() {
        return mealType;
    }

    public String getCalories() {
        return calories;
    }
    
    public void compute(){
    
    }
       }
