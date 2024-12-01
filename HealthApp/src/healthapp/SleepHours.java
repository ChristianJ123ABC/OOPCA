/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthapp;

/**
 *
 * @author pyaku
 */
public class SleepHours extends Mental {
    private double sleepHours;
    
     //overloaded constructor
    public SleepHours( String id,  double sleepHours) {
        super(id);
        this.sleepHours = sleepHours;
    }
    
    // defult constructor
      public SleepHours() {
        this.sleepHours = 0;
           }
    
    //setters

    public void setSleepHours(double sleepHours) {
        this.sleepHours = sleepHours;
    }

    //getters

    public double getSleepHours() {
        return sleepHours;
    }
    
    
     @Override
    public String getDetails(){
        return super.getDetails()+",Sleep Hours: "+sleepHours;
    }
}
