/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthapp;

/**
 *
 * @author pyaku
 */
public class MentalActivity {
    private int id;
    private String type;
    private String duration;
    private String caloriesBurned;

    public MentalActivity(int id, String type,String duration, String caloriesBurned) {
        this.id = id;
        this.type = type;
         this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setCaloriesBurned(String caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }
    
    
 

    public String getType() {
        return type;
    }

    public String getDuration() {
        return duration;
    }

    public String getCaloriesBurned() {
        return caloriesBurned;
    }

    
         
    
    //compute method
    
    public void compute(){
     
}
    
}


