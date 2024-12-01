/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthapp;

/**
 *
 * @author pyaku
 */
public class StressManagement extends Mental{
    private double stressLevel;
    
     //overloaded constructor
    public StressManagement( String id, double stressLevel) {
        super(id);
        this.stressLevel = stressLevel;
         }
    
     // defult constructor
      public StressManagement() {
        this.stressLevel = 0;
           }
    
    //setters

      public void setStressLevel(double stressLevel) {
        this.stressLevel = stressLevel;
    }
    
    //getters

    public double getStressLevel() {
        return stressLevel;
    }
    
    
     @Override
    public String getDetails(){
        return super.getDetails()+",Stress Level :"+stressLevel;
    }
}
