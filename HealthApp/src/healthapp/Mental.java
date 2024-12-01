/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthapp;

/**
 *
 * @author pyaku
 */
public class Mental extends User {
    
    protected String Id;
  
    

        //overloaded constructor
    public Mental(String id) {
        this.Id = id;
        
    }
    
     //default constructor
    public Mental(){
        Id = " ";
    
    }
    
    
    //overrides the setters from healthApp.user
    @Override
    public void setId(String id) {
        this.Id = id;
    }

   
    /**
     *
     * @return
     */
    
    //overrides the getters from the user
    @Override
     public String getId() {
        return Id;
    }

    
    @Override
     public String getDetails(){
        return "Mental Details: \n Your Id:"+Id;
    }
    
    
    
}
