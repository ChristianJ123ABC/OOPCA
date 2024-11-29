/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package healthapp;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian Joseph
 */
public class PhysicalGUI extends javax.swing.JFrame {
    private ArrayList<User> userList; //arrayList to store Physical section objects
    
   
    /**
     * Creates new form PhysicalGUI
     */
    public PhysicalGUI() {
        initComponents();
        userList = new ArrayList<>();
        readUsers(); //puts the users information into the arrayList on load
        //used to change the background colour
        //source: https://stackoverflow.com/questions/1081486/setting-background-color-for-a-jframe
        getContentPane().setBackground(new java.awt.Color(3, 169, 252));
        
       
        //making the labels invisible on load;
        idLbl.setVisible(false);
        activityLbl.setVisible(false);
        cardioTypeLbl.setVisible(false);
        cardioDurLbl.setVisible(false);
        workoutLbl.setVisible(false);
        durationLbl.setVisible(false);
        dietTypeLbl.setVisible(false);
        kcalLbl.setVisible(false);
        userRemoveLbl.setVisible(false);
        workoutBackgroundLbl.setVisible(false);
        dietBackgroundLbl.setVisible(false);
        cardioBackgroundLbl.setVisible(false);
        macroBackgroundLbl.setVisible(false);
        
        //making the textfields invisible on load
        idTf.setVisible(false);
        activityTf.setVisible(false);
        cardioTypeTf.setVisible(false);
        cardioDurTf.setVisible(false);
        workoutTf.setVisible(false);
        durationTf.setVisible(false);
        dietTypeTf.setVisible(false);
        
        //makes the buttons invisible / remove background on load
        dietTypeBtn.setVisible(false);
        cardioTypeBtn.setVisible(false);
        workoutTypeBtn.setVisible(false);
        activityQuestionBtn.setVisible(false);
        recommendBtn.setVisible(false);
        refreshBtn.setVisible(false);
        addBtn.setContentAreaFilled(false);
        displayBtn.setContentAreaFilled(false);
        removeBtn.setContentAreaFilled(false);
        searchBtn.setContentAreaFilled(false);
        refreshBtn.setContentAreaFilled(false);
        dietTypeBtn.setContentAreaFilled(false);
        workoutTypeBtn.setContentAreaFilled(false);
        cardioTypeBtn.setContentAreaFilled(false);
        activityQuestionBtn.setContentAreaFilled(false);
        menuPhysicalBtn.setContentAreaFilled(false);
        recommendBtn.setContentAreaFilled(false);
        
        cardioRb.setContentAreaFilled(false);
        dietRb.setContentAreaFilled(false);
        workoutRb.setContentAreaFilled(false);
        macroRb.setContentAreaFilled(false);
        
        
    }
    
    
    
    //used to grab the information from the User ArrayList (aka grab the users details)
    private void readUsers(){
        //declare objects
        File f;
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        try{
            //create objects
            f = new File("users.dat");
            fStream = new FileInputStream(f);
            oStream = new ObjectInputStream(fStream);
            
            //use objects
            userList = (ArrayList<User>)oStream.readObject();
            
            oStream.close();
        }
        catch(IOException|ClassNotFoundException e){
            System.out.println("Error: "+e);
        }
    }
    
    //display the macros into the program when you start the app
    private void readMacros(){
        //declare objects
        File f;
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        try{
            //create objects
            f = new File("macros.dat");
            fStream = new FileInputStream(f);
            oStream = new ObjectInputStream(fStream);
            
            //use objects
            userList = (ArrayList<User>)oStream.readObject();
            
            oStream.close();
        }
        catch(IOException|ClassNotFoundException e){
            System.out.println("Error: "+e);
        }
    }
    
    //save the macros to a file
    private void saveMacros(){
        //declare objects
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        
        try{
            //create objects
            f = new File("macros.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);
            
            //use objects
            oStream.writeObject(userList);
        }
        catch(IOException e){
            System.out.println("Error:"+e);
        }
    }
    
    //the same as above
    private void readCardio(){
        //declare objects
        File f;
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        try{
            //create objects
            f = new File("cardio.dat");
            fStream = new FileInputStream(f);
            oStream = new ObjectInputStream(fStream);
            
            //use objects
            userList = (ArrayList<User>)oStream.readObject();
            
            oStream.close();
        }
        catch(IOException|ClassNotFoundException e){
            System.out.println("Error: "+e);
        }
    }
    
    
    private void saveCardio(){
       
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        
        try{
            
            f = new File("cardio.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);
            
            
            oStream.writeObject(userList);
        }
        catch(IOException e){
            System.out.println("Error:"+e);
        }
    }
    
    private void readDiet(){
        
        File f;
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        try{
            f = new File("diet.dat");
            fStream = new FileInputStream(f);
            oStream = new ObjectInputStream(fStream);
            
            userList = (ArrayList<User>)oStream.readObject();
            
            oStream.close();
        }
        catch(IOException|ClassNotFoundException e){
            System.out.println("Error: "+e);
        }
    }
    
    private void saveDiet(){
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        
        try{
            f = new File("diet.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);
            
            oStream.writeObject(userList);
        }
        catch(IOException e){
            System.out.println("Error:"+e);
        }
    }
    
    private void readWorkout(){
        File f;
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        try{
            f = new File("workout.dat");
            fStream = new FileInputStream(f);
            oStream = new ObjectInputStream(fStream);
            
            userList = (ArrayList<User>)oStream.readObject();
            
            oStream.close();
        }
        catch(IOException|ClassNotFoundException e){
            System.out.println("Error: "+e);
        }
    }
    
    private void saveWorkout(){
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        
        try{
            f = new File("workout.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);
            
            oStream.writeObject(userList);
        }
        catch(IOException e){
            System.out.println("Error:"+e);
        }
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBtnGrp = new javax.swing.ButtonGroup();
        physicalLbl = new javax.swing.JLabel();
        cardioTypeTf = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        menuPhysicalBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        displayBtn = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        idLbl = new javax.swing.JLabel();
        cardioTypeLbl = new javax.swing.JLabel();
        cardioDurLbl = new javax.swing.JLabel();
        workoutLbl = new javax.swing.JLabel();
        durationLbl = new javax.swing.JLabel();
        dietTypeLbl = new javax.swing.JLabel();
        idTf = new javax.swing.JTextField();
        cardioDurTf = new javax.swing.JTextField();
        workoutTf = new javax.swing.JTextField();
        durationTf = new javax.swing.JTextField();
        dietTypeTf = new javax.swing.JTextField();
        macroRb = new javax.swing.JRadioButton();
        cardioRb = new javax.swing.JRadioButton();
        dietRb = new javax.swing.JRadioButton();
        workoutRb = new javax.swing.JRadioButton();
        dietTypeBtn = new javax.swing.JButton();
        workoutTypeBtn = new javax.swing.JButton();
        cardioTypeBtn = new javax.swing.JButton();
        warningLbl = new javax.swing.JLabel();
        activityLbl = new javax.swing.JLabel();
        activityTf = new javax.swing.JTextField();
        activityQuestionBtn = new javax.swing.JButton();
        recommendBtn = new javax.swing.JButton();
        kcalLbl = new javax.swing.JLabel();
        userRemoveLbl = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();
        macroBackgroundLbl = new javax.swing.JLabel();
        cardioBackgroundLbl = new javax.swing.JLabel();
        workoutBackgroundLbl = new javax.swing.JLabel();
        dietBackgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        physicalLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        physicalLbl.setForeground(new java.awt.Color(255, 51, 51));
        physicalLbl.setText("Physical Health");
        getContentPane().add(physicalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, -1));

        cardioTypeTf.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        cardioTypeTf.setBorder(null);
        cardioTypeTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardioTypeTfActionPerformed(evt);
            }
        });
        getContentPane().add(cardioTypeTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 128, 204, 23));

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addBtn.setForeground(new java.awt.Color(102, 255, 102));
        addBtn.setText("Add");
        addBtn.setBorder(null);
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 473, 50, -1));

        menuPhysicalBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        menuPhysicalBtn.setForeground(new java.awt.Color(51, 255, 0));
        menuPhysicalBtn.setText("Back to Login");
        menuPhysicalBtn.setBorder(null);
        menuPhysicalBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPhysicalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPhysicalBtnActionPerformed(evt);
            }
        });
        getContentPane().add(menuPhysicalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 473, -1, -1));

        searchBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(204, 204, 0));
        searchBtn.setText("Search");
        searchBtn.setBorder(null);
        searchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 473, -1, -1));

        displayBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        displayBtn.setForeground(new java.awt.Color(255, 102, 51));
        displayBtn.setText("Display");
        displayBtn.setBorder(null);
        displayBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });
        getContentPane().add(displayBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 473, -1, -1));

        removeBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        removeBtn.setForeground(new java.awt.Color(255, 51, 51));
        removeBtn.setText("Remove");
        removeBtn.setBorder(null);
        removeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(removeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 473, -1, -1));

        idLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idLbl.setText("ID:");
        getContentPane().add(idLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 53, 131, -1));

        cardioTypeLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cardioTypeLbl.setForeground(new java.awt.Color(255, 51, 51));
        cardioTypeLbl.setText("Cardio Type:");
        getContentPane().add(cardioTypeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 127, 131, -1));

        cardioDurLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cardioDurLbl.setForeground(new java.awt.Color(255, 51, 51));
        cardioDurLbl.setText("Cardio Duration (in min):");
        getContentPane().add(cardioDurLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 170, 228, -1));

        workoutLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        workoutLbl.setForeground(new java.awt.Color(51, 102, 255));
        workoutLbl.setText("Workout:");
        getContentPane().add(workoutLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 213, 131, -1));

        durationLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        durationLbl.setForeground(new java.awt.Color(51, 102, 255));
        durationLbl.setText("Session Duration (in min):");
        getContentPane().add(durationLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 256, -1, -1));

        dietTypeLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dietTypeLbl.setForeground(new java.awt.Color(0, 204, 0));
        dietTypeLbl.setText("Diet Type:");
        getContentPane().add(dietTypeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 298, 131, -1));

        idTf.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        idTf.setBorder(null);
        idTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTfActionPerformed(evt);
            }
        });
        getContentPane().add(idTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 54, 204, 23));

        cardioDurTf.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        cardioDurTf.setBorder(null);
        cardioDurTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardioDurTfActionPerformed(evt);
            }
        });
        getContentPane().add(cardioDurTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 171, 204, 23));

        workoutTf.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        workoutTf.setBorder(null);
        workoutTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workoutTfActionPerformed(evt);
            }
        });
        getContentPane().add(workoutTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 204, 23));

        durationTf.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        durationTf.setBorder(null);
        durationTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationTfActionPerformed(evt);
            }
        });
        getContentPane().add(durationTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 204, 23));

        dietTypeTf.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        dietTypeTf.setBorder(null);
        dietTypeTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietTypeTfActionPerformed(evt);
            }
        });
        getContentPane().add(dietTypeTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 299, 204, 23));

        pBtnGrp.add(macroRb);
        macroRb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        macroRb.setForeground(new java.awt.Color(255, 153, 0));
        macroRb.setText("Macronutrients");
        macroRb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        macroRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macroRbActionPerformed(evt);
            }
        });
        getContentPane().add(macroRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, -1, -1));

        pBtnGrp.add(cardioRb);
        cardioRb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cardioRb.setForeground(new java.awt.Color(255, 51, 51));
        cardioRb.setText("Cardio");
        cardioRb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cardioRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardioRbActionPerformed(evt);
            }
        });
        getContentPane().add(cardioRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, -1, -1));

        pBtnGrp.add(dietRb);
        dietRb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dietRb.setForeground(new java.awt.Color(0, 204, 0));
        dietRb.setText("Diet");
        dietRb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dietRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietRbActionPerformed(evt);
            }
        });
        getContentPane().add(dietRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 70, -1));

        pBtnGrp.add(workoutRb);
        workoutRb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        workoutRb.setForeground(new java.awt.Color(51, 102, 255));
        workoutRb.setText("Workout Plan");
        workoutRb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        workoutRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workoutRbActionPerformed(evt);
            }
        });
        getContentPane().add(workoutRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, 150, -1));

        dietTypeBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dietTypeBtn.setForeground(new java.awt.Color(0, 204, 0));
        dietTypeBtn.setText("Types of Diet");
        dietTypeBtn.setBorder(null);
        dietTypeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dietTypeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietTypeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(dietTypeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 524, -1, -1));

        workoutTypeBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        workoutTypeBtn.setForeground(new java.awt.Color(51, 102, 255));
        workoutTypeBtn.setText("Types of Workout");
        workoutTypeBtn.setBorder(null);
        workoutTypeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        workoutTypeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workoutTypeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(workoutTypeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 524, -1, -1));

        cardioTypeBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cardioTypeBtn.setForeground(new java.awt.Color(255, 51, 51));
        cardioTypeBtn.setText("Types of Cardio");
        cardioTypeBtn.setBorder(null);
        cardioTypeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cardioTypeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardioTypeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cardioTypeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 524, -1, -1));

        warningLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        warningLbl.setText("Please press one of the radio buttons on the right to activate the program");
        getContentPane().add(warningLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 435, 661, -1));

        activityLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        activityLbl.setForeground(new java.awt.Color(255, 153, 0));
        activityLbl.setText("Activity Level:");
        getContentPane().add(activityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 84, 131, -1));

        activityTf.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        activityTf.setBorder(null);
        activityTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityTfActionPerformed(evt);
            }
        });
        getContentPane().add(activityTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 85, 204, 23));

        activityQuestionBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        activityQuestionBtn.setForeground(new java.awt.Color(255, 153, 0));
        activityQuestionBtn.setText("What is Activity Level?");
        activityQuestionBtn.setBorder(null);
        activityQuestionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        activityQuestionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityQuestionBtnActionPerformed(evt);
            }
        });
        getContentPane().add(activityQuestionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 524, -1, -1));

        recommendBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        recommendBtn.setForeground(new java.awt.Color(255, 153, 0));
        recommendBtn.setText("Recommended Intake");
        recommendBtn.setBorder(null);
        recommendBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recommendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recommendBtnActionPerformed(evt);
            }
        });
        getContentPane().add(recommendBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, -1, -1));

        kcalLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kcalLbl.setText("Click this with your ID in the ID textfield but NOT submitted");
        getContentPane().add(kcalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, -1, -1));

        userRemoveLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userRemoveLbl.setText("Click remove button twice to remove all details (user+category)");
        getContentPane().add(userRemoveLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 396, -1, -1));

        refreshBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(0, 255, 255));
        refreshBtn.setText("Refresh Page");
        refreshBtn.setBorder(null);
        refreshBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        getContentPane().add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 473, -1, -1));

        macroBackgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PhysicalGUI Images/macros.png"))); // NOI18N
        macroBackgroundLbl.setText("jLabel1");
        getContentPane().add(macroBackgroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 270, 280));

        cardioBackgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PhysicalGUI Images/cardio.png"))); // NOI18N
        cardioBackgroundLbl.setText("jLabel1");
        getContentPane().add(cardioBackgroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 270, 280));

        workoutBackgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PhysicalGUI Images/workout.png"))); // NOI18N
        workoutBackgroundLbl.setText("jLabel1");
        getContentPane().add(workoutBackgroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 270, 280));

        dietBackgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PhysicalGUI Images/diet.png"))); // NOI18N
        dietBackgroundLbl.setText("jLabel1");
        getContentPane().add(dietBackgroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 270, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuPhysicalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPhysicalBtnActionPerformed
        // TODO add your handling code here:
        //clicking on the menu button returns you to the register screen
        IntroGUI ig = new IntroGUI();
        ig.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuPhysicalBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        if(userList.isEmpty()){ //if the arrayList is empty, it will display an error message
            JOptionPane.showMessageDialog(null,"There are no users on the list");
        }
        else{
            
            if(macroRb.isSelected()){
                if(idTf.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Textfield is empty, please type an ID to search");
                }
                for(User u:userList){//for each user object in the list, it will search it
                    if(u.getId().equalsIgnoreCase(idTf.getText())){//check if the id of object matches the user search
                        if(u instanceof Macronutrients){ //if User, u,  is an instance of Macronutrients, run the statement
                            JOptionPane.showMessageDialog(null,((Macronutrients)u).getDetails());//print the macronutrients GetDetails method
                            break;
                        }
                    }
                }
            }
            
            //the  same as above for the rest
            else if(cardioRb.isSelected()){
                if(idTf.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Textfield is empty, please type an ID to search");
                }
                for(User u:userList){
                    if(u.getId().equalsIgnoreCase(idTf.getText())){
                        if (u instanceof Cardio){
                            JOptionPane.showMessageDialog(null, ((Cardio)u).getDetails());
                            break;
                        }
                    }
                }
            }
            
            else if(dietRb.isSelected()){
                if(idTf.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Textfield is empty, please type an ID to search");
                }
                for(User u:userList){
                    if(u.getId().equalsIgnoreCase(idTf.getText())){
                        if (u instanceof Diet){
                            JOptionPane.showMessageDialog(null, ((Diet)u).getDetails());
                            break;
                        }
                    }
                }
            }
            else if(workoutRb.isSelected()){
                if(idTf.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Textfield is empty, please type an ID to search");
                }
                for(User u:userList){
                    if(u.getId().equalsIgnoreCase(idTf.getText())){
                        if (u instanceof WorkoutPlan){
                            JOptionPane.showMessageDialog(null, ((WorkoutPlan)u).getDetails());
                            break;
                        }
                    }
                }
            }
            
           
            
            //if neither of the radio buttons are not clicked and the user trys to click search, it will tell them to press one
            if(!workoutRb.isSelected() && !dietRb.isSelected() && !cardioRb.isSelected() && !macroRb.isSelected()){
                JOptionPane.showMessageDialog(null, "Press a radio button to activate the program");
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void cardioTypeTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardioTypeTfActionPerformed
        // TODO add your handling code here:
      
       
        
        
        
    }//GEN-LAST:event_cardioTypeTfActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        
        //if none of the radio buttons are clicked and the user presses delete, it will tell them to press one to activate the program
        if(!workoutRb.isSelected() && !dietRb.isSelected() && !cardioRb.isSelected() && !macroRb.isSelected()){
                JOptionPane.showMessageDialog(null, "Press a radio button to activate the program");
                
        }
        //if macro radio button is clicked, grab the user details and make an instance of Macronutrients
        if(macroRb.isSelected()){
            readUsers();
            Macronutrients m = new Macronutrients();
            boolean flag = false; //flag to check if something is true or false
            
            
                for(User u:userList){ //for every object in User, run it through this if statement
                    if(u.getId().equals(idTf.getText())){ //if the user id in the array is equal to the id in the textfield, run this
                        readMacros();
                        flag = true;
                        int age = u.getAge();
                        double height = u.getHeight();
                        double weight = u.getWeight();
                        double activityLevel = 0;
                        //if the users activity is equal to a certain activityLevel, change the value accordingly
                        if(activityTf.getText().equals("1")){
                           activityLevel = 1.2;
                         }

                        else if(activityTf.getText().equals("2")){
                            activityLevel = 1.375;
                        }

                        else if (activityTf.getText().equals("3")){
                            activityLevel = 1.55;
                        }

                        else if(activityTf.getText().equals("4")){
                            activityLevel = 1.725;
                        }

                        else if (activityTf.getText().equals("5")){
                            activityLevel = 1.9;
                        }

                        //compute method for macros
                        double bmr = (10*weight)+(6.25*height)-(5*age)+5;
                        double calories = Math.round(bmr*activityLevel);
                        double protein = Math.rint((0.4*calories)/4); //divides by how many kcal are in 1 gram of that macronutrient, to turn it into grams
                        double fats = Math.rint((0.2*calories)/9);
                        double carbs = Math.rint((0.4*calories)/4);
                        double waterIntake = weight*0.03;
                        
                        //place the ID, calories and activityLevel into the userList under, m.
                        m.setId(idTf.getText());
                        m.setCalories(calories);
                        m.setActivityLevel(activityLevel);
                        userList.add(m);


                        
                        JOptionPane.showMessageDialog(null, "Based on your calories on your activity level of: "+activityLevel+" your maintenance calories are "+calories+".");
                        JOptionPane.showMessageDialog(null, "Here are your macronutrients: \n Protein: "+protein+" \n Carbohydrates: "+carbs+" \n Fats: "+fats+" \n Water Intake: "+waterIntake+" Litres");
                        //save the userList details into a macros.dat file
                        saveMacros();
                        break; //break when complete
                        

                    }
                    
                }
                    //if flag is false / incorrect ID, display error
                    if (!flag){
                        JOptionPane.showMessageDialog(null, "Invalid ID, please enter a correct one.");
                        
                    }
                
        }
        
        //the same as above for the rest
        else if (cardioRb.isSelected()){
            readUsers();
            Cardio c = new Cardio();
            boolean flag = false;
            
                for(User u:userList){
                    if(u.getId().equals(idTf.getText())){
                        readCardio();
                        flag = true;
                        double weight = u.getWeight();
                        double met = 0;
                        String activityName =  " ";
                        if(cardioTypeTf.getText().equals("1")){ //slow walk
                            met = 5.0;
                            activityName = "Slow Walk";
                        }
        
                        else if (cardioTypeTf.getText().equals("2")){ //moderate run
                             met = 11.5; 
                             activityName = "Moderate Run";
                        }
        
                        else if (cardioTypeTf.getText().equals("3")){ //light cycling
                            met = 8.0;
                            activityName = "Light Cycling";
                        }
        
                        else if (cardioTypeTf.getText().equals("4")){ //light swimming
                             met = 6.0;
                             activityName = "Light Swimming";
                        }
                        double caloriesBurned = Math.round((met*Integer.parseInt(cardioDurTf.getText())*weight)/200);
                        
                        c.setId(idTf.getText());
                        c.setActivityName(activityName);
                        c.setDuration(Integer.parseInt(cardioDurTf.getText()));
                        userList.add(c);
                        
                        JOptionPane.showMessageDialog(null, "You have chosen: "+activityName+" for "+cardioDurTf.getText()+" minutes, resulting in your burning: "+caloriesBurned+" calories");
                        saveCardio();
                        break;
                        

                    }
                }
                    if (!flag){
                        JOptionPane.showMessageDialog(null, "Invalid ID, please enter a correct one.");
                        
                    }
                
        }
        
        else if (dietRb.isSelected()){
            readUsers();
            Diet d = new Diet();
            boolean flag = false;
            
                for(User u:userList){
                    if(u.getId().equals(idTf.getText())){
                        readDiet();
                        flag = true;
                        String mealType = " ";
                        
                        //sources:
                        //https://www.omnicalculator.com/health/keto
                        //https://www.carbmanager.com/article/y3o50xaaabh0cmjd/paleo-macros-do-you-need-to-track-them#:~:text=An%20initial%20Paleo%20macros%20ratio,better%20at%20higher%20carb%20intakes.
                        //https://my.clevelandclinic.org/health/articles/16037-mediterranean-diet
                        if(dietTypeTf.getText().equals("1")){ 
                            mealType = "Keto";
                            JOptionPane.showMessageDialog(null, "Keto is a low carb, high fat diet, so you should adjust your calories accordingly: \n 5% of your calories as carbs \n 70% as fats \n 25% protein");

                        }
        
                        else if (dietTypeTf.getText().equals("2")){ 
                             mealType = "Paleo";
                             JOptionPane.showMessageDialog(null, "Paleo consists mainly of meat and fish, followed by vegetables, so you should adjust your calories accordingly: \n 25% of your calories as carbs \n 50% as fats \n 25% protein");

                        }
        
                        else if (dietTypeTf.getText().equals("3")){ //light cycling
                            mealType = "Mediterranean";
                            JOptionPane.showMessageDialog(null, "Mediterranean focuses on plant-based foods and healthy fats, so you should adjust your calories accordingly: \n 40-50% of your calories as carbs \n 25-35% as fats \n 20-30% protein");

                        }
        
                        else if (dietTypeTf.getText().equals("4")){ //light swimming
                             mealType = "Carnivore";
                             JOptionPane.showMessageDialog(null, "Carnivore ONLY consists of meat, fish and other animal products such as eggs or dairy products so you should adjust your calories accordingly: \n 0-5% of your calories as carbs \n 70-80% as fats \n 20-30% protein");

                        }
                        
                        else if(dietTypeTf.getText().equals("5")){
                            mealType = "Non-Restrictive";
                            JOptionPane.showMessageDialog(null, "Non-restrictive basically means you can eat whatever, however we still suggest using this macro split: \n 40% of your calories as carbs \n 30% as fats \n 30% protein");

                        }
                        
                        d.setId(idTf.getText());
                        d.setMealType(mealType);
                        userList.add(d);
                        saveDiet();
                        break;
                        

                    }
                }
                    if (!flag){
                        JOptionPane.showMessageDialog(null, "Invalid ID, please enter a correct one.");
                        
                    }
                
        }
        else if (workoutRb.isSelected()){
            readUsers();
            WorkoutPlan w = new WorkoutPlan();
            boolean flag = false;
            
                for(User u:userList){
                    if(u.getId().equals(idTf.getText())){
                        readWorkout();
                        String type = " ";
                        flag = true;
                        double duration = 0.0;
                        String frequency =  " ";
                        //sources:
                        //https://runningonrealfood.com/crossfit-style-workouts/
                        //https://www.hevyapp.com/2-day-split-workout/
                        //https://fitnessprogramer.com/calisthenics-workout-plan/#Sample_Calisthenics_Workout_Plan
                        //https://www.pinterest.com/pin/the-intermediate-powerlifting-sample-program--644859240409704732/
                        if(workoutTf.getText().equalsIgnoreCase("1")){
                            if(Double.parseDouble(durationTf.getText()) < 90){
                                JOptionPane.showMessageDialog(null, "We recommend doing a different workout since this category of workout requires long rest times, therefore long gym sessions. We recommend calisthenics or crossfit");
                            }
                            type = "Crossfit";
                            JOptionPane.showMessageDialog(null, "Here is a sample AMRAP workout for "+type+": \n 15 Minute AMRAP: \n 15 burpees \n 15 sit ups \n 15 Ten Inch box jumps \n Complete as many reps as possible in 15 minutes ");
                        }
                        
                        else if(workoutTf.getText().equalsIgnoreCase("2")){
                            type = "Bodybuilding";
                            JOptionPane.showMessageDialog(null, "Here is a sample 2 day Full Body workout for "+type+" \n Recommended Split: D1-Rest-Rest-D2-Rest-Rest-Rest \n Day 1 Upper: \n Bench Press 2x8-10 @ RPE8-9 \n Cable Row 2x6-8 @ RPE 8-9 \n Machine Shoulder Press 2x10-12 @ RPE 8-9 \n Wide Grip Lat Pulldown 3x10-12 @ RPE 7-8 \n Cable Flys 3x12-15 @ RPE 7-8 \n DB Lateral Raise 3x12-15 @ RPE 8-9 \n Cable Curl 2x8-10 @ RPE9-10 \n Double Rope Tricep Pushdown 2x15-20 @ RPE 9-10");
                            JOptionPane.showMessageDialog(null, "Day 2: \n Barbell Squat 3x5-8 @ RPE7-8 \n Barbell RDL 3x8-10 @ RPE 7-8 \n Leg Extension 3x8-10 @ RPE 7-8 \n Hamstring Curl 3x12-15 @ RPE 7-8 \n Seated Calf Raise 3x15-20 @ RPE 8-9 \n Barbell Hip-Thrust 3x10-12 @RPE7-8");
                            
                        }
                        
                        else if(workoutTf.getText().equalsIgnoreCase("3")){
                            type = "Calisthenics";
                            JOptionPane.showMessageDialog(null, "Here is a sample workout for "+type+" \n 3 Rounds (rest 2 minutes each round, 45 seconds each exercise): \n Windmill 10 reps \n Archer push-up 10 reps \n Pull-Up 10 reps \n Tricep Dips 10 reps \n Close Grip push up 10 reps \n Air Squats 10 reps \n Hip-thrust jumps 10 reps \n Scissor Kick 10 reps");
                            
                        }
                        
                        else if(workoutTf.getText().equalsIgnoreCase("4")){
                            if(Double.parseDouble(durationTf.getText()) < 120){
                                JOptionPane.showMessageDialog(null, "We recommend doing a different workout since this category of workout requires long rest times, therefore long gym sessions. We recommend calisthenics or crossfit");
                            }
                            type = "Powerlifting";
                            JOptionPane.showMessageDialog(null, "Here is a 4 day workout for "+type+" \n Recommended Split: D1-D2-Rest-D3-Rest-D4-Rest \n Day 1: \n Barbell Squat 3x7-9 @ RPE 6-7 \n Bench Press 4x7-9 @ RPE 6-7 \n RDL 3x4-6 @ RPE 8-9 \n Lat Pulldown 3x7-9 @ RPE 6-7");
                            JOptionPane.showMessageDialog(null, "Day 2: \n Barbell Squat 3x3-5 @ RPE 8-9 \n Bench Press 4x3-5 @ RPE 8-9 \n Overhead Press 3x4-6 @ RPE 8-9 \n Cable Row 3x4-6 @ RPE 8-9");
                            JOptionPane.showMessageDialog(null, "Day 3: \n Barbell Squat 3x3-5 @ RPE 8-9 \n Bench Press 4x3-5 @ RPE 8-9 \n Overhead Press 3x4-6 @ RPE 8-9 \n Cable Row 3x4-6 @ RPE 8-9");
                            JOptionPane.showMessageDialog(null, "Day 4: \n Low Bar Squat 3x4-6 @ RPE 8-9 \n Close Grip Bench Press 4x4-6 @ RPE 8-9 \n Deadlift 3x3-5 @ RPE 8-9");
                        }
                        
                        w.setId(idTf.getText());
                        w.setType(type);
                        w.setDuration(Double.parseDouble(durationTf.getText()));
                        userList.add(w);
                        saveWorkout();
                        break;
                        

                    }
                }
                    if (!flag){
                        JOptionPane.showMessageDialog(null, "Invalid ID, please enter a correct one.");
                        
                    }
                
        }
        
        
        
        
        
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        // TODO add your handling code here:
        
            //if the arrayList is empty, it will display an error message
            if(userList.isEmpty()){ 
                JOptionPane.showMessageDialog(null,"There are no users on the list");
            }


            else{
                //display each object in the userList
                for(int i = 0; i < userList.size();i++){ 
                        JOptionPane.showMessageDialog(null,  userList.get(i).getDetails()); //grab the details of each user
                    }
                }
          
        
        
        
    }//GEN-LAST:event_displayBtnActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        //if the arrayList is empty, it will display an error message
        if(userList.isEmpty()){
            JOptionPane.showMessageDialog(null,"Sorry, there are no users on the list");
        }
        else if(!userList.isEmpty()){
            
            //if the userID equals the id in the textfield and its respective category is selected, delete the user from that ArrayList
            for(int i = 0; i < userList.size();i++){
                User u = userList.get(i);
                if(u.getId().equalsIgnoreCase(idTf.getText()) && macroRb.isSelected()){
                    userList.remove(u);
                    JOptionPane.showMessageDialog(null, "Macro Details Removed");
                    saveMacros();
                }
                else if(u.getId().equalsIgnoreCase(idTf.getText()) && cardioRb.isSelected()){
                    userList.remove(u);
                    JOptionPane.showMessageDialog(null, "Cardio Details Removed");
                    saveCardio();
                }
                else if(u.getId().equalsIgnoreCase(idTf.getText()) && dietRb.isSelected()){
                    userList.remove(u);
                    JOptionPane.showMessageDialog(null, "Diet Details Removed");
                    saveDiet();
                }
                else if(u.getId().equalsIgnoreCase(idTf.getText()) && workoutRb.isSelected()){
                    userList.remove(u);
                    JOptionPane.showMessageDialog(null, "Workout Details Removed");
                    saveWorkout();
                }
                //if none of the radio buttons are clicked and the user presses delete, it will tell them to press one to activate the program
                else if(!workoutRb.isSelected() && !dietRb.isSelected() && !cardioRb.isSelected() && !macroRb.isSelected()){
                    JOptionPane.showMessageDialog(null, "Press a radio button to activate the program");
                    
                }
                
                //if the ID textfield is empty, display error
                if(idTf.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Textfield is empty, please type an ID to delete");
                    break;
                }
                
                
                
            }
            
        }
        
        
        
    }//GEN-LAST:event_removeBtnActionPerformed

    private void idTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTfActionPerformed

    private void cardioDurTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardioDurTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardioDurTfActionPerformed

    private void workoutTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workoutTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workoutTfActionPerformed

    private void durationTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationTfActionPerformed

    private void dietTypeTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietTypeTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dietTypeTfActionPerformed

    private void cardioRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardioRbActionPerformed
        // TODO add your handling code here:
        //make the ID, warning message, cardio type and duration visible, then load the .dat file for that respective category so its in the userList
        
        readCardio();
        idLbl.setVisible(true);
        cardioTypeLbl.setVisible(true);
        cardioDurLbl.setVisible(true);
        workoutLbl.setVisible(false);
        durationLbl.setVisible(false);
        dietTypeLbl.setVisible(false);
        activityLbl.setVisible(false);
        warningLbl.setVisible(false);
        kcalLbl.setVisible(false);
        userRemoveLbl.setVisible(true);
        workoutBackgroundLbl.setVisible(false);
        dietBackgroundLbl.setVisible(false);
        cardioBackgroundLbl.setVisible(true);
        macroBackgroundLbl.setVisible(false);
        
        idTf.setVisible(true);
        cardioTypeTf.setVisible(true);
        cardioDurTf.setVisible(true);
        workoutTf.setVisible(false);
        durationTf.setVisible(false);
        dietTypeTf.setVisible(false);
        activityTf.setVisible(false);
        
        dietTypeBtn.setVisible(false);
        cardioTypeBtn.setVisible(true);
        workoutTypeBtn.setVisible(false);
        activityQuestionBtn.setVisible(false);
        recommendBtn.setVisible(false);
        refreshBtn.setVisible(true);
       
    }//GEN-LAST:event_cardioRbActionPerformed

    private void dietTypeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietTypeBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Depending on your preference of food, you could try these following diets: \n Keto (1), Paleo (2), Mediterranean (3), Carnivore (4), Non-restrictive (5)"); 
    }//GEN-LAST:event_dietTypeBtnActionPerformed

    private void workoutTypeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workoutTypeBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Here is an example of a few workouts: \n Crossfit (1), Bodybuilding (2), Bodyweight training / Calisthenics (3), Powerlifting (4)");
    }//GEN-LAST:event_workoutTypeBtnActionPerformed

    private void cardioTypeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardioTypeBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Different types of Cardio: \n Slow walk <3mph (1), moderate running pace(2), Light cycling (3), light swimming (4)");
    }//GEN-LAST:event_cardioTypeBtnActionPerformed

    private void macroRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macroRbActionPerformed
        // TODO add your handling code here:
        //make the ID, warning message, calorie message, activity button  and recommended intake button appear, then load the .dat file for that respective category so its in the userList
        readMacros();
        idLbl.setVisible(true);
        cardioTypeLbl.setVisible(false);
        cardioDurLbl.setVisible(false);
        workoutLbl.setVisible(false);
        durationLbl.setVisible(false);
        dietTypeLbl.setVisible(false);
        activityLbl.setVisible(true);
        warningLbl.setVisible(false);
        kcalLbl.setVisible(true);
        userRemoveLbl.setVisible(true);
        workoutBackgroundLbl.setVisible(false);
        dietBackgroundLbl.setVisible(false);
        cardioBackgroundLbl.setVisible(false);
        macroBackgroundLbl.setVisible(true);
        
        idTf.setVisible(true);
        cardioTypeTf.setVisible(false);
        cardioDurTf.setVisible(false);
        workoutTf.setVisible(false);
        durationTf.setVisible(false);
        dietTypeTf.setVisible(false);
        activityTf.setVisible(true);
        
        dietTypeBtn.setVisible(false);
        cardioTypeBtn.setVisible(false);
        workoutTypeBtn.setVisible(false);
        activityQuestionBtn.setVisible(true);
        recommendBtn.setVisible(true);
        refreshBtn.setVisible(true);
        
           
        
    }//GEN-LAST:event_macroRbActionPerformed

    private void dietRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietRbActionPerformed
        // TODO add your handling code here:
        //make the ID, Diet type, warning message and types of diet button visible, then load the .dat file for that respective category so its in the userList
        readDiet();
        idLbl.setVisible(true);
        cardioTypeLbl.setVisible(false);
        cardioDurLbl.setVisible(false);
        workoutLbl.setVisible(false);
        durationLbl.setVisible(false);
        dietTypeLbl.setVisible(true);
        warningLbl.setVisible(false);
        kcalLbl.setVisible(false);
        userRemoveLbl.setVisible(true);
        workoutBackgroundLbl.setVisible(false);
        dietBackgroundLbl.setVisible(true);
        cardioBackgroundLbl.setVisible(false);
        macroBackgroundLbl.setVisible(false);
        
        idTf.setVisible(true);
        cardioTypeTf.setVisible(false);
        cardioDurTf.setVisible(false);
        workoutTf.setVisible(false);
        durationTf.setVisible(false);
        dietTypeTf.setVisible(true);
        activityTf.setVisible(false);
        
        dietTypeBtn.setVisible(true);
        cardioTypeBtn.setVisible(false);
        workoutTypeBtn.setVisible(false);
        activityQuestionBtn.setVisible(false);
        recommendBtn.setVisible(false);
        refreshBtn.setVisible(true);
    }//GEN-LAST:event_dietRbActionPerformed

    private void workoutRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workoutRbActionPerformed
        // TODO add your handling code here:
        //makes the ID, workout duration, frequency, duration, warning message and the types of workout button visible, then load the .dat file for that respective category so its in the userList
        readWorkout(); 
        idLbl.setVisible(true);
        cardioTypeLbl.setVisible(false);
        cardioDurLbl.setVisible(false);
        workoutLbl.setVisible(true);
        durationLbl.setVisible(true);
        dietTypeLbl.setVisible(false);
        warningLbl.setVisible(false);
        activityLbl.setVisible(false);
        kcalLbl.setVisible(false);
        userRemoveLbl.setVisible(true);
        workoutBackgroundLbl.setVisible(true);
        dietBackgroundLbl.setVisible(false);
        cardioBackgroundLbl.setVisible(false);
        macroBackgroundLbl.setVisible(false);
        
        idTf.setVisible(true);
        cardioTypeTf.setVisible(false);
        cardioDurTf.setVisible(false);
        workoutTf.setVisible(true);
        durationTf.setVisible(true);
        dietTypeTf.setVisible(false);
        activityTf.setVisible(false);
        
        dietTypeBtn.setVisible(false);
        cardioTypeBtn.setVisible(false);
        workoutTypeBtn.setVisible(true);
        activityQuestionBtn.setVisible(false);
        recommendBtn.setVisible(false);
        refreshBtn.setVisible(true);
    }//GEN-LAST:event_workoutRbActionPerformed

    private void activityTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activityTfActionPerformed

    private void activityQuestionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityQuestionBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Sedentary: (office worker getting little activity) (type 1) \n Slightly Active: (Person who workouts every now and then) (type 2) \n Moderately Active: (1hr daily exercise / large part of the day standing) (type 3) \n Active: (2hrs exercise daily / mailman) (type 4) \n Extremely Active: (Competitive Athlete / >3 hours exercise daily) (type 5)");
    }//GEN-LAST:event_activityQuestionBtnActionPerformed

    private void recommendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recommendBtnActionPerformed
        // TODO add your handling code here:
        
        //instances of Macronutrients and Physical
        Macronutrients m = new Macronutrients();
        Physical p = new Physical();
        
        //retrieve user details
        readUsers();
        
        //source
        https://stackoverflow.com/questions/16583604/formatting-numbers-using-decimalformat
        //for each User, go through each object
        for(User u: userList){
            
            //if the userid equals the id in the textfield, run this statement
            if(u.getId().equals(idTf.getText())){
                DecimalFormat df = new DecimalFormat("#.00"); //used to round something to 2 decimal places
                
                //compute method for Macronutrients + user details
                double bmi = (u.getWeight()/u.getHeight()/u.getHeight()*10000);
                int age = u.getAge();
                double height = u.getHeight();
                double weight = u.getWeight();
                double activityLevel = 1.2;
                double bmr = (10*weight)+(6.25*height)-(5*age)+5;
                double calories = bmr*activityLevel;
                
               
                //checks the BMI and displays a message depending on it
                if(bmi>24.9){
                    JOptionPane.showMessageDialog(null, "Based on your BMI of "+df.format(bmi)+",we suggest that you should reduce your maintenance calories by 300-500");
                    JOptionPane.showMessageDialog(null, "Maintenance Calories based on sedentary activity level (default preset): "+calories);
                }
                
                else if(bmi>18.5 && bmi<=24.9){
                    JOptionPane.showMessageDialog(null, "Based on your BMI of "+df.format(bmi)+",we suggest that you should stay at your maintenance calories");
                    JOptionPane.showMessageDialog(null, "Maintenance Calories based on sedentary activity level (default preset): "+calories);
                }
                
                else{
                    JOptionPane.showMessageDialog(null, "Based on your BMI of "+df.format(bmi)+",we suggest that you should increase your maintenance calories by 300-500");
                    JOptionPane.showMessageDialog(null, "Maintenance Calories based on sedentary activity level (default preset): "+calories);
                    
                }
                
            }
        }
    }//GEN-LAST:event_recommendBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        PhysicalGUI p = new PhysicalGUI();
        p.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_refreshBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PhysicalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhysicalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhysicalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhysicalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhysicalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activityLbl;
    private javax.swing.JButton activityQuestionBtn;
    private javax.swing.JTextField activityTf;
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel cardioBackgroundLbl;
    private javax.swing.JLabel cardioDurLbl;
    private javax.swing.JTextField cardioDurTf;
    private javax.swing.JRadioButton cardioRb;
    private javax.swing.JButton cardioTypeBtn;
    private javax.swing.JLabel cardioTypeLbl;
    private javax.swing.JTextField cardioTypeTf;
    private javax.swing.JLabel dietBackgroundLbl;
    private javax.swing.JRadioButton dietRb;
    private javax.swing.JButton dietTypeBtn;
    private javax.swing.JLabel dietTypeLbl;
    private javax.swing.JTextField dietTypeTf;
    private javax.swing.JButton displayBtn;
    private javax.swing.JLabel durationLbl;
    private javax.swing.JTextField durationTf;
    private javax.swing.JLabel idLbl;
    private javax.swing.JTextField idTf;
    private javax.swing.JLabel kcalLbl;
    private javax.swing.JLabel macroBackgroundLbl;
    private javax.swing.JRadioButton macroRb;
    private javax.swing.JButton menuPhysicalBtn;
    private javax.swing.ButtonGroup pBtnGrp;
    private javax.swing.JLabel physicalLbl;
    private javax.swing.JButton recommendBtn;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel userRemoveLbl;
    private javax.swing.JLabel warningLbl;
    private javax.swing.JLabel workoutBackgroundLbl;
    private javax.swing.JLabel workoutLbl;
    private javax.swing.JRadioButton workoutRb;
    private javax.swing.JTextField workoutTf;
    private javax.swing.JButton workoutTypeBtn;
    // End of variables declaration//GEN-END:variables
}
