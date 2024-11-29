/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthapp;

/**
 *
 * @author pyaku
 */
public class MentalActivity extends Mental {
    private double weight;
    private double frequency;
    private double met;
    private double duration;
    private double caloriesBurned;
    
    
        //overloaded constructor
     public MentalActivity(double weight, double frequency, double met, double duration, double caloriesBurned, String id, String stressLevel, String sleepHours) {
        super(id, stressLevel, sleepHours);
        this.weight = weight;
        this.frequency = frequency;
        this.met = met;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }
    
         // defult constructor
      public MentalActivity() {
        this.weight = 0;
        this.frequency = 0;
        this.met = 0;
         this.duration = 0;
        this.caloriesBurned = 0;
    }

      //setters
     public void setWeight(double weight) {
        this.weight = weight;
    }
      public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setMet(double met) {
        this.met = met;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setCaloriesBurned(double caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }    
    
    
    //getters
    public double getWeight() {
        return weight;
    }
   public double getFrequency() {
        return frequency;
    }
    public double getMet() {
        return met;
    }

    public double getDuration() {
        return duration;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    
         
    
    //compute method
    
    public  void computeCaloriesBurned(){
     caloriesBurned =  (met * weight * duration * frequency);
}
    
      @Override
    public String getDetails(){
        return super.getDetails()+",Weight :"+weight+",Frequency: "+frequency+",Met: "+met+", Duration :"+duration;
    }
}


