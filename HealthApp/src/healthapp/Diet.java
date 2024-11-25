/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthapp;

/**
 *
 * @author flips
 */
public class Diet extends Physical {
    private String mealType;
    
    //overloaded constructor
    public Diet(String mealType, double bmi, double activityLevel, String activity, String id, int age, String name, double weight, double height) {
        super(bmi, activityLevel, activity, id, age, name, weight, height);
        this.mealType = mealType;
    }
    
    //default constructor
    public Diet(){
        super();
        mealType = " ";
        
    }
   
    //setters and getters
    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }
    
    //overriding method of getDetails (grabbed from User SuperClass)
    @Override
    public String getDetails(){
        return " Diet Details: \n ID: "+id+"\n Type of Diet: "+mealType;
    }
    
    
}
