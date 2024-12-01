/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package healthapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author flips
 */
public class MentalGUI extends javax.swing.JFrame {
    private ArrayList<User> userList;


    /**
     * Creates new form MentalGUI
     */
    public MentalGUI() {
        initComponents();
        userList = new ArrayList<>();
        readUsers(); //reads the users details into the arrayListwhen program runs
        
        //used to change the background colour
        //source: https://stackoverflow.com/questions/1081486/setting-background-color-for-a-jframe
          getContentPane().setBackground(new java.awt.Color(248, 245, 238));
        
        
        //To make the jlabel, textfield and buttons invisible when the program runs
        frequencyLbl.setVisible(false);
        frequencyTf.setVisible(false);
        activityTLbl.setVisible(false);
        activityTTf.setVisible(false);
        metLbl.setVisible(false);
        metTf.setVisible(false);
        activityDLbl.setVisible(false);
        activityDTf.setVisible(false);
        dietTypeLbl.setVisible(false);
        dietTTf.setVisible(false);
        caloriesLbl.setVisible(false);
        caloriesTf.setVisible(false);
        activitiesMBtn.setVisible(false);
        dietMBtn.setVisible(false);
        caloriesBBtn.setVisible(false);
        mentalDILbl.setVisible(false);
        mentalAILbl.setVisible(false);
        sleepHLbl.setVisible(false);
        stressLbl.setVisible(false);
        sleepHTf.setVisible(false);
        stressTf.setVisible(false);
    }
    
    
    //reads the App user details 
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
            System.out.println("Error:"+e);
        }
    }
    
     //display the activities details into the program 
    private void readMentalActivities(){
        //declare objects
        File f;
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        try{
            //create objects
            f = new File("Mentalactivities.dat");
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
    
    //save the activities details to a file
    private void saveMentalActivities(){
        //declare objects
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        
        try{
            //create objects
            f = new File("Mentalactivities.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);
            
            //use objects
            oStream.writeObject(userList);
        }
        catch(IOException e){
            System.out.println("Error:"+e);
        }
    }
    
      //display the mental Diet  into the program when you start the app
    private void readMentalDiet(){
        //declare objects
        File f;
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        try{
            //create objects
            f = new File("Mentaldiet.dat");
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
    
    //save the mental diets details to a file
    private void saveMentalDiet(){
        //declare objects
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        
        try{
            //create objects
            f = new File("Mentaldiet.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);
            
            //use objects
            oStream.writeObject(userList);
        }
        catch(IOException e){
            System.out.println("Error:"+e);
        }
    }
      
        //display the mental sleep  into the program when you start the app
    private void readSleepHours(){
        //declare objects
        File f;
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        try{
            //create objects
            f = new File("Mentalsleep.dat");
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
    
    //save the mental sleep details to a file
    private void saveSleepHours(){
        //declare objects
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        
        try{
            //create objects
            f = new File("Mentalsleep.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);
            
            //use objects
            oStream.writeObject(userList);
        }
        catch(IOException e){
            System.out.println("Error:"+e);
        }
    }
    
        //display the mental stress  into the program when you start the app
    private void readStressManagement(){
        //declare objects
        File f;
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        try{
            //create objects
            f = new File("Mentalstress.dat");
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
    
    //save the mental stress details to a file
    private void saveStressManagement(){
        //declare objects
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        
        try{
            //create objects
            f = new File("Mentalstress.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);
            
            //use objects
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

        mBtnGrp = new javax.swing.ButtonGroup();
        mentalLbl = new javax.swing.JLabel();
        dietTypeLbl = new javax.swing.JLabel();
        IdTf = new javax.swing.JTextField();
        caloriesBBtn = new javax.swing.JButton();
        menuMBtn = new javax.swing.JButton();
        displayMBtn = new javax.swing.JButton();
        removeMBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        caloriesLbl = new javax.swing.JLabel();
        IdLbl = new javax.swing.JLabel();
        frequencyLbl = new javax.swing.JLabel();
        metLbl = new javax.swing.JLabel();
        activityDLbl = new javax.swing.JLabel();
        stressLbl = new javax.swing.JLabel();
        sleepHLbl = new javax.swing.JLabel();
        frequencyTf = new javax.swing.JTextField();
        stressTf = new javax.swing.JTextField();
        activityDTf = new javax.swing.JTextField();
        metTf = new javax.swing.JTextField();
        dietTTf = new javax.swing.JTextField();
        caloriesTf = new javax.swing.JTextField();
        sleepHTf = new javax.swing.JTextField();
        activitiesMBtn = new javax.swing.JButton();
        dietMBtn = new javax.swing.JButton();
        activitiesRB = new javax.swing.JRadioButton();
        dietRb = new javax.swing.JRadioButton();
        activityTLbl = new javax.swing.JLabel();
        activityTTf = new javax.swing.JTextField();
        refreshMBtn = new javax.swing.JButton();
        mWLbl = new javax.swing.JLabel();
        mentalAILbl = new javax.swing.JLabel();
        mentalDILbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sleepRb = new javax.swing.JRadioButton();
        stressRb = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mentalLbl.setBackground(new java.awt.Color(0, 204, 204));
        mentalLbl.setFont(new java.awt.Font("Onyx", 1, 36)); // NOI18N
        mentalLbl.setForeground(new java.awt.Color(102, 0, 102));
        mentalLbl.setText("Mental Wellbeing");
        getContentPane().add(mentalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 180, -1));

        dietTypeLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dietTypeLbl.setForeground(new java.awt.Color(0, 102, 102));
        dietTypeLbl.setText("Diet Type:");
        getContentPane().add(dietTypeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 150, -1));

        IdTf.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        IdTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTfActionPerformed(evt);
            }
        });
        getContentPane().add(IdTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 204, 30));

        caloriesBBtn.setBackground(new java.awt.Color(0, 204, 204));
        caloriesBBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        caloriesBBtn.setForeground(new java.awt.Color(0, 102, 102));
        caloriesBBtn.setText("Calories Burned");
        caloriesBBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        caloriesBBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caloriesBBtnActionPerformed(evt);
            }
        });
        getContentPane().add(caloriesBBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        menuMBtn.setBackground(new java.awt.Color(0, 204, 204));
        menuMBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        menuMBtn.setForeground(new java.awt.Color(102, 102, 255));
        menuMBtn.setText("Back to Login");
        menuMBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMBtnActionPerformed(evt);
            }
        });
        getContentPane().add(menuMBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, -1, -1));

        displayMBtn.setBackground(new java.awt.Color(0, 204, 204));
        displayMBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        displayMBtn.setForeground(new java.awt.Color(255, 51, 0));
        displayMBtn.setText("Display");
        displayMBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        displayMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayMBtnActionPerformed(evt);
            }
        });
        getContentPane().add(displayMBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 100, -1));

        removeMBtn.setBackground(new java.awt.Color(0, 204, 204));
        removeMBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        removeMBtn.setForeground(new java.awt.Color(51, 51, 0));
        removeMBtn.setText("Remove");
        removeMBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removeMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMBtnActionPerformed(evt);
            }
        });
        getContentPane().add(removeMBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 110, -1));

        addBtn.setBackground(new java.awt.Color(0, 204, 204));
        addBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 51, 51));
        addBtn.setText("Add");
        addBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 60, -1));

        caloriesLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        caloriesLbl.setForeground(new java.awt.Color(0, 102, 51));
        caloriesLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        caloriesLbl.setText("Calories:");
        getContentPane().add(caloriesLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 150, 30));

        IdLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        IdLbl.setForeground(new java.awt.Color(0, 51, 51));
        IdLbl.setText("Id:");
        getContentPane().add(IdLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 160, -1));

        frequencyLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        frequencyLbl.setForeground(new java.awt.Color(102, 51, 0));
        frequencyLbl.setText("Frequency:");
        getContentPane().add(frequencyLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 160, -1));

        metLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        metLbl.setForeground(new java.awt.Color(102, 0, 153));
        metLbl.setText("MET Value:");
        getContentPane().add(metLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 150, -1));

        activityDLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        activityDLbl.setForeground(new java.awt.Color(51, 102, 0));
        activityDLbl.setText("Activity Duration:");
        getContentPane().add(activityDLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        stressLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        stressLbl.setForeground(new java.awt.Color(153, 153, 0));
        stressLbl.setText("Stress Level:");
        getContentPane().add(stressLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 160, 20));

        sleepHLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sleepHLbl.setForeground(new java.awt.Color(51, 0, 204));
        sleepHLbl.setText("Sleep Hours:");
        getContentPane().add(sleepHLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, -1));

        frequencyTf.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        frequencyTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frequencyTfActionPerformed(evt);
            }
        });
        getContentPane().add(frequencyTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 204, 30));

        stressTf.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        stressTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stressTfActionPerformed(evt);
            }
        });
        getContentPane().add(stressTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 200, 30));

        activityDTf.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        activityDTf.setToolTipText("Duration Format In Hours");
        activityDTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityDTfActionPerformed(evt);
            }
        });
        getContentPane().add(activityDTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 204, 30));

        metTf.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        metTf.setToolTipText("Check Activity Types For MET Value");
        metTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metTfActionPerformed(evt);
            }
        });
        getContentPane().add(metTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 204, 30));

        dietTTf.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        dietTTf.setToolTipText("click Types of Diet button to choose diet.");
        dietTTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietTTfActionPerformed(evt);
            }
        });
        getContentPane().add(dietTTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 204, -1));

        caloriesTf.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        caloriesTf.setToolTipText("Check diet type button to know calories of your diet.");
        caloriesTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caloriesTfActionPerformed(evt);
            }
        });
        getContentPane().add(caloriesTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 204, 30));

        sleepHTf.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        sleepHTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sleepHTfActionPerformed(evt);
            }
        });
        getContentPane().add(sleepHTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 204, 30));

        activitiesMBtn.setBackground(new java.awt.Color(0, 204, 204));
        activitiesMBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        activitiesMBtn.setForeground(new java.awt.Color(0, 102, 51));
        activitiesMBtn.setText("Types Of Activity");
        activitiesMBtn.setToolTipText("Choose Activity Types and MET value.");
        activitiesMBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        activitiesMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activitiesMBtnActionPerformed(evt);
            }
        });
        getContentPane().add(activitiesMBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));

        dietMBtn.setBackground(new java.awt.Color(0, 204, 204));
        dietMBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dietMBtn.setForeground(new java.awt.Color(153, 51, 0));
        dietMBtn.setText("Types Of Diet");
        dietMBtn.setToolTipText("Choose Your Diet Type.");
        dietMBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dietMBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dietMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietMBtnActionPerformed(evt);
            }
        });
        getContentPane().add(dietMBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        activitiesRB.setBackground(new java.awt.Color(248, 245, 238));
        mBtnGrp.add(activitiesRB);
        activitiesRB.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        activitiesRB.setForeground(new java.awt.Color(255, 102, 0));
        activitiesRB.setText("Activities");
        activitiesRB.setBorder(null);
        activitiesRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activitiesRBActionPerformed(evt);
            }
        });
        getContentPane().add(activitiesRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 98, -1));

        dietRb.setBackground(new java.awt.Color(248, 245, 238));
        mBtnGrp.add(dietRb);
        dietRb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dietRb.setForeground(new java.awt.Color(102, 51, 0));
        dietRb.setText("Diet");
        dietRb.setBorder(null);
        dietRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietRbActionPerformed(evt);
            }
        });
        getContentPane().add(dietRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 98, -1));

        activityTLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        activityTLbl.setForeground(new java.awt.Color(102, 0, 153));
        activityTLbl.setText("Activity Type:");
        activityTLbl.setToolTipText("");
        getContentPane().add(activityTLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 140, 26));

        activityTTf.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        activityTTf.setToolTipText("check Activity Types Below");
        activityTTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityTTfActionPerformed(evt);
            }
        });
        getContentPane().add(activityTTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 205, 30));

        refreshMBtn.setBackground(new java.awt.Color(0, 204, 204));
        refreshMBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        refreshMBtn.setForeground(new java.awt.Color(51, 0, 153));
        refreshMBtn.setText("Refresh");
        refreshMBtn.setToolTipText("");
        refreshMBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshMBtnActionPerformed(evt);
            }
        });
        getContentPane().add(refreshMBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 100, -1));

        mWLbl.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        mWLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MentalGUI Images/mentalwellbeing1.jpg"))); // NOI18N
        mWLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        mWLbl.setDoubleBuffered(true);
        mWLbl.setRequestFocusEnabled(false);
        getContentPane().add(mWLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 270, 290));
        mWLbl.getAccessibleContext().setAccessibleName("");

        mentalAILbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MentalGUI Images/mentalActivity.jpg"))); // NOI18N
        mentalAILbl.setToolTipText("");
        getContentPane().add(mentalAILbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 270, 290));

        mentalDILbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MentalGUI Images/mentalDiet.png"))); // NOI18N
        getContentPane().add(mentalDILbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 270, 290));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Choose Radio Button To Activate The Program.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 280, 30));

        sleepRb.setBackground(new java.awt.Color(248, 245, 238));
        mBtnGrp.add(sleepRb);
        sleepRb.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        sleepRb.setForeground(new java.awt.Color(0, 102, 153));
        sleepRb.setText("SleepManage");
        sleepRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sleepRbActionPerformed(evt);
            }
        });
        getContentPane().add(sleepRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        stressRb.setBackground(new java.awt.Color(248, 245, 238));
        mBtnGrp.add(stressRb);
        stressRb.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        stressRb.setForeground(new java.awt.Color(153, 0, 102));
        stressRb.setText("StressLevel");
        stressRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stressRbActionPerformed(evt);
            }
        });
        getContentPane().add(stressRb, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMBtnActionPerformed
        // TODO add your handling code here:
        IntroGUI ig = new IntroGUI();//To returns you to the register screen when clicked to menu button.
        ig.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuMBtnActionPerformed

    private void caloriesBBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caloriesBBtnActionPerformed
        // TODO add your handling code here:
        
        //function to see if the button is selected
      if (caloriesBBtn.isSelected()) {
    JOptionPane.showMessageDialog(null, "Sorry, there are no details in the system to calculate calories burned");  //message box to sho if there's no any information
                } 
      
        else {
           // Check if inputs are valid
      
           try {
             double frequency = Double.parseDouble(frequencyTf.getText());
             double met = Double.parseDouble(metTf.getText());
             double duration = Double.parseDouble(activityDTf.getText());
        
             boolean userFound = false;

            // Traverse userList
             for (User u : userList) { //runs through array list called userList
                      if (u.getId().equals(IdTf.getText())) { //if function to see entered id matches to the arraylist 
                       double weight = u.getWeight();
                      double caloriesBurned = met * weight * duration * frequency;// calculates the calories burned

                      JOptionPane.showMessageDialog(null, "Calories Burned: " + caloriesBurned);// message box to show the calculated calories
                        userFound = true;
                        break; // Exit loop once user is found and calculation is done
                      }
                 }
                 if (!userFound) { //if the id doesn't match the given message pops up
                     JOptionPane.showMessageDialog(null, "User ID not found in the system");
                      }
                 
                } 
           
           //catch function to see if the given details matches the format for mental activities
                catch (NumberFormatException e) {
                  JOptionPane.showMessageDialog(null, "Invalid input! Please enter valid numbers for frequency, MET, and duration.");
                }
           
            }
    }//GEN-LAST:event_caloriesBBtnActionPerformed

    private void IdTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTfActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        if(activitiesRB.isSelected()){
            readUsers(); //load Users
            readMentalActivities();  //load MentalActivities
            MentalActivity a = new MentalActivity();
              boolean flag = false;
               
             
             for(User u:userList){  //runs through array list called userList
                  if( u.getId().equals(IdTf.getText())) {  //if function to see entered id matches to the arraylist.
                      flag = true; //if the id is true
                  //Get the inputs entered in Mental Activities
                   a.setId(IdTf.getText());
                   a.setAType(activityTTf.getText());
                   a.setFrequency (Double.parseDouble(frequencyTf.getText()));
                   a.setMet(Double.parseDouble(metTf.getText()));
                   a.setDuration(Double.parseDouble(activityDTf.getText()));
                       
                   //adds the entered Activities to users
                   userList.add(a);
           
                  //show message box with the details user input in mental diet field
                  JOptionPane.showMessageDialog(null, "You Id: "+IdTf.getText()+" \n "
                      + "Activity Type:"+activityTTf.getText()+" \n"
                      + "Frequency:"+frequencyTf.getText()+" \n"
                      + "MET Value:"+metTf.getText()+" \n"
                      + "Activity Duration:"+activityDTf.getText());
                     
                           saveMentalActivities();// save to mental Activities
                           break;
                }  
              }  
        if (!flag){
                        JOptionPane.showMessageDialog(null, "Invalid ID, please enter a correct one.");   
      }
            
  }           

        
        
        else if(dietRb.isSelected()){
               readUsers(); //load Users
               readMentalDiet();//loads mental diets
             MentalDiet d = new MentalDiet();
             boolean flag = false;
             
                   for(User u:userList){ //runs through th earraylist 
                   if( u.getId().equals(IdTf.getText())) {// checks if  the id entered matche s with the id in arraylist
                       
                         flag = true;//if the id is true
                         //Get the inputs entered in Diet section
                         d.setId(IdTf.getText());
                         d.setDietType (dietTTf.getText());
                         d.setCalories (Double.parseDouble(caloriesTf.getText()));
                         
                         //Add diet types and calories to user list
                         userList.add(d);
                         
                         //show message box with the details user input in mental diet field
                      JOptionPane.showMessageDialog(null, "You Id: "+IdTf.getText()+" \n "
                      + "Diet Type:"+dietTTf.getText()+" \n"
                      + "Calories Intake:"+caloriesTf.getText());
            
                      saveMentalDiet();// saves the new details entered to mental Diet
                      break;
             }   
          }
             if(!flag) {
                        JOptionPane.showMessageDialog(null, "Invalid ID, please enter a correct one.");          
            }          
       
      } 
        
        
        
                else if(sleepRb.isSelected()){
               readUsers(); //load Users
               readSleepHours();//loads mental sleep details
             SleepHours s = new SleepHours();
             boolean flag = false;
             
                   for(User u:userList){ //runs through th earraylist 
                   if( u.getId().equals(IdTf.getText())) {// checks if  the id entered matche s with the id in arraylist
                       
                         flag = true;//if the id is true
                         //Get the inputs entered in sleep section
                         s.setId(IdTf.getText());
                         s.setSleepHours(Double.parseDouble(sleepHTf.getText()));
                                               
                         //Add sleep hours to 
                         userList.add(s);
                         
                         //show message box with the details user input in sleep hours field
                      JOptionPane.showMessageDialog(null, "You Id: "+IdTf.getText()+" \n "
                      + "SleepHours: "+sleepHTf.getText());
            
                      saveSleepHours();// saves the new details entered to  mental sleepHours
                      break;
             }   
          }
             if(!flag) {
                        JOptionPane.showMessageDialog(null, "Invalid ID, please enter a correct one.");          
            }          
       
      }
        
        
        
        
                else if(stressRb.isSelected()){
               readUsers(); //load Users
               readStressManagement();//loads mental stress management
             StressManagement sm = new StressManagement();
             boolean flag = false;
             
                   for(User u:userList){ //runs through th earraylist 
                   if( u.getId().equals(IdTf.getText())) {// checks if  the id entered matche s with the id in arraylist
                       
                         flag = true;//if the id is true
                         //Get the inputs entered in stress  section
                         sm.setId(IdTf.getText());
                         sm.setStressLevel(Double.parseDouble(stressTf.getText()));                     
                         
                         //Add diet types and calories to user list
                         userList.add(sm);
                         
                         //show message box with the details user input in mental diet field
                      JOptionPane.showMessageDialog(null, "You Id: "+IdTf.getText()+" \n "
                      + "StressLevel: "+stressTf.getText());
            
                      saveStressManagement();// saves the new details entered to mental stress management
                      break;
             }   
          }
             if(!flag) {
                        JOptionPane.showMessageDialog(null, "Invalid ID, please enter a correct one.");          
            }          
       
      }
        clearFields();
    }//GEN-LAST:event_addBtnActionPerformed
                  
   
   
   
   
   
    private void displayMBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayMBtnActionPerformed
        // TODO add your handling code here:
          if(userList.isEmpty()){  // if the array list is empty then it displays the sorry message.
            JOptionPane.showMessageDialog(null,"Sorry, there are no information in the system");
        }
        else{
            //traversing an ArrayList
            for(int i = 0; i < userList.size();i++){
                JOptionPane.showMessageDialog(null,userList.get(i).getDetails());
            }
          }
    }//GEN-LAST:event_displayMBtnActionPerformed

    private void removeMBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMBtnActionPerformed
        // TODO add your handling code here:
         if(userList.isEmpty()){   //if the array list is empty then it displays the sorry message.
             JOptionPane.showMessageDialog(null,"Sorry, there are no information in the system");
        }
        else{
            // Traverse the user list to find and remove the matching user.
            for(int i = 0; i < userList.size();i++){
                User m = userList.get(i);// Get the current user object.
                // Check if the user's ID matches the input and if the "Activities" option is selected.
                if(m.getId().equalsIgnoreCase(IdTf.getText()) && activitiesRB.isSelected()){
                 userList.remove(m);// Remove the user from the list.
                 saveMentalActivities();
                 
                 JOptionPane.showMessageDialog(null, "Activity record for ID: " + m.getId() + " has been removed.");
                 saveMentalActivities();
                    break; // Exit the loop after removing the user to avoid `ConcurrentModificationException`.
               
                }
                
                // Checks if the user's ID matches the input and if the Diet option is selected.
                else if(m.getId().equalsIgnoreCase(IdTf.getText()) && dietRb.isSelected()){
                    userList.remove(m);// Remove the user from the list.
                    
                    JOptionPane.showMessageDialog(null, "Diet record for ID: " + m.getId() + " has been removed.");
                    saveMentalDiet();
                         break; // Exit the loop after removing the user to avoid `ConcurrentModificationException`.
                    }
                
                // Checks if the user's ID matches the input and if the stress option is selected.
                else if(m.getId().equalsIgnoreCase(IdTf.getText()) && stressRb.isSelected()){
                    userList.remove(m);// Remove the user from the list.
                    
                    JOptionPane.showMessageDialog(null, "stressManagement record for ID: " + m.getId() + " has been removed.");
                    saveStressManagement();
                         break; // Exit the loop after removing the user to avoid `ConcurrentModificationException`.
                    }
                
                // Checks if the user's ID matches the input and if the sleep option is selected.
                else if(m.getId().equalsIgnoreCase(IdTf.getText()) && sleepRb.isSelected()){
                    userList.remove(m);// Remove the user from the list.
                    
                    JOptionPane.showMessageDialog(null, "SleepHours record for ID: " + m.getId() + " has been removed.");
                    saveSleepHours();
                         break; // Exit the loop after removing the user to avoid `ConcurrentModificationException`.
                    }
                
                
             }
      }
       clearFields();
    }//GEN-LAST:event_removeMBtnActionPerformed

    private void frequencyTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frequencyTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frequencyTfActionPerformed

    private void stressTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stressTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stressTfActionPerformed

    private void activityDTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityDTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activityDTfActionPerformed

    private void metTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metTfActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_metTfActionPerformed

    private void caloriesTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caloriesTfActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_caloriesTfActionPerformed

    private void sleepHTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sleepHTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sleepHTfActionPerformed

    private void activitiesRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activitiesRBActionPerformed
        // TODO add your handling code here:
        
        readMentalActivities();
        
        //makes the named jlabel and textfield  not visible
        dietTypeLbl.setVisible(false);
        dietTTf.setVisible(false);
        caloriesLbl.setVisible(false);
        caloriesTf.setVisible(false);
        dietMBtn.setVisible(false);
        mentalDILbl.setVisible(false);
        mWLbl.setVisible(false);
        sleepHLbl.setVisible(false);
        stressLbl.setVisible(false);
        sleepHTf.setVisible(false);
        stressTf.setVisible(false);
        
        //makes the named jlabel and textfield visible
        frequencyLbl.setVisible(true);
        frequencyTf.setVisible(true);
        metLbl.setVisible(true);
        metTf.setVisible(true);
        activityDLbl.setVisible(true);
        activityDTf.setVisible(true);
        activitiesMBtn.setVisible(true);
        caloriesBBtn.setVisible(true);
        activityTLbl.setVisible(true);
        activityTTf.setVisible(true);
        mentalAILbl.setVisible(true);
        
        //To change Activity page background colour
        getContentPane().setBackground(new java.awt.Color(190, 245, 143));
        
    }//GEN-LAST:event_activitiesRBActionPerformed

    private void dietRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietRbActionPerformed
        // TODO add your handling code here:
        
        readMentalDiet();
        
        //makes the named jlabel and textfield  not visible
        frequencyLbl.setVisible(false);
        frequencyTf.setVisible(false);
        metLbl.setVisible(false);
        metTf.setVisible(false);
        activityDLbl.setVisible(false);
        activityDTf.setVisible(false);
        activitiesMBtn.setVisible(false);
        caloriesBBtn.setVisible(false);
        activityTLbl.setVisible(false);
        activityTTf.setVisible(false);
        mentalAILbl.setVisible(false);
        mWLbl.setVisible(false);
        sleepHLbl.setVisible(false);
        stressLbl.setVisible(false);
        sleepHTf.setVisible(false);
        stressTf.setVisible(false);
        
        //makes the named jlabel and textfield visible
        dietTypeLbl.setVisible(true);
        dietTTf.setVisible(true);
        caloriesLbl.setVisible(true);
        caloriesTf.setVisible(true);
        dietMBtn.setVisible(true);
        mentalDILbl.setVisible(true);
       
        //To change Diet page background colour
        getContentPane().setBackground(new java.awt.Color(217, 175, 122));
      
    }//GEN-LAST:event_dietRbActionPerformed

    private void activitiesMBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activitiesMBtnActionPerformed
        // TODO add your handling code here:
        
        //source:
        //https://positivepsychology.com/mental-health-exercises-interventions/
        //https://www.whyiexercise.com/metabolic-equivalent.html
        // displays the message box with activities and METs values of the respective activities 
      JOptionPane.showMessageDialog(null,"Here are MET values and some exapmples of activities a person can do to improve their mental health: \n "
              + "(1)Physical Activities (MET Values) \n  Yoga: 2.5 METs (light effort, Hatha yoga) \n Walking in Nature: 3.8 METs (moderate walking, 4 mph)"
              + "\n Running or Jogging: 7.0-11.0 METs (depends on pace, 6 mph = 9.8 METs) \n Dancing: 4.8-7.8 METs (ballroom = 3.0, fast dancing = 7.8)"
              + "\n Swimming: 5.8-10.0 METs (depends on speed and stroke) "
              
              + "\n (2)Social Activities (MET Values): \n Volunteering: 2.0-3.0 METs (light effort, standing or moving) \n  Joining Support Groups: 1.5 METs (seated discussion)"
              + "\n Team Sports: 4.0-10.0 METs (depending on sport, e.g., volleyball = 4.0, soccer = 7.0+) \n "
              
              + "(3) Mindfulness and Relaxation Activities (MET Values): \n Meditation: 1.0 METs (resting equivalent) \n"
              + " Deep Breathing Exercises: 1.0 METs (resting equivalent) \n  Progressive Muscle Relaxation: 1.0-1.3 METs " );
    }//GEN-LAST:event_activitiesMBtnActionPerformed

    private void dietTTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietTTfActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_dietTTfActionPerformed

    
     private void clearFields(){
        IdTf.setText("");
        stressTf.setText("");
        sleepHTf.setText("");
        frequencyTf.setText("");
        metTf.setText("");
        dietTTf.setText("");
        caloriesTf.setText("");
        activityDTf.setText("");
        activityTTf.setText("");
    }
    
    
    private void refreshMBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshMBtnActionPerformed
        // TODO add your handling code here:
        MentalGUI m = new MentalGUI();//To returns you to the Mental menu screen when clicked to refresh button.
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_refreshMBtnActionPerformed

    private void dietMBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietMBtnActionPerformed
        // TODO add your handling code here:
        
        //source:
        //https://barbend.com/types-of-diets/
        //https://www.twinkl.ie/blog/everything-you-need-to-know-about-different-types-of-diets
        //https://www.healthline.com/nutrition/9-weight-loss-diets-reviewed#TOC_TITLE_HDR_5
        // Displays the message box for Types of diet and calories it contain for improvement of persons mental wellbeing.
        JOptionPane.showMessageDialog(null,"Here are some types of diet and calories they are equal to which is helpful for persons mental wellbeing: \n"
                + "(1) Mediterranean Diet: Focuses on plant-based foods, healthy fats, and lean proteins like fish."
                + "\n Calories: 2,000–2,500 kcal/day (moderate activity level). \n"
                + " (2) Ketogenic (Keto) Diet: A low-carb, high-fat diet that shifts the body into ketosis, where fat is burned for energy instead of carbohydrates. \n"
                + " Calories: ~1,500–2,000 kcal/day (varies with goal and macro breakdown). \n "
                + "(3) Plant-Based Diet:  Focuses on foods derived from plants, including vegetables, fruits, grains, legumes, and nuts. \n"
                + " Calories: 1,800–2,200 kcal/day. \n "
                + "(4) DASH Diet (Dietary Approaches to Stop Hypertension): Designed to reduce high blood pressure, emphasizing fruits, vegetables, lean proteins, and  \n "
                + "low-fat dairy while reducing sodium. Improves both physical and mental well-being.  \n "
                + " Calories: 2,000 kcal/day (based on standard guidelines). \n "
                + "(5) Low-Sugar Diet: Limits added sugars and focuses on complex carbs, proteins, and healthy fats to stabilize blood sugar and reduce mood swings.\n"
                + " Calories: 1,500–2,000 kcal/day.");
    }//GEN-LAST:event_dietMBtnActionPerformed

    private void activityTTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityTTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activityTTfActionPerformed

    private void sleepRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sleepRbActionPerformed
        // TODO add your handling code here:
        
          
        //makes the named jlabel and textfield  not visible
        frequencyLbl.setVisible(false);
        frequencyTf.setVisible(false);
        metLbl.setVisible(false);
        metTf.setVisible(false);
        activityDLbl.setVisible(false);
        activityDTf.setVisible(false);
        activitiesMBtn.setVisible(false);
        caloriesBBtn.setVisible(false);
        activityTLbl.setVisible(false);
        activityTTf.setVisible(false);
        mentalAILbl.setVisible(false);
        mWLbl.setVisible(false);
        dietTypeLbl.setVisible(false);
        dietTTf.setVisible(false);
        caloriesLbl.setVisible(false);
        caloriesTf.setVisible(false);
        dietMBtn.setVisible(false);
        mentalDILbl.setVisible(false);
        stressLbl.setVisible(false);
        stressTf.setVisible(false);
        
        //makes the named jlabel and textfield visible
       sleepHLbl.setVisible(true);
       sleepHTf.setVisible(true);
       
    }//GEN-LAST:event_sleepRbActionPerformed

    private void stressRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stressRbActionPerformed
        // TODO add your handling code here:
        
              //makes the named jlabel and textfield  not visible
        frequencyLbl.setVisible(false);
        frequencyTf.setVisible(false);
        metLbl.setVisible(false);
        metTf.setVisible(false);
        activityDLbl.setVisible(false);
        activityDTf.setVisible(false);
        activitiesMBtn.setVisible(false);
        caloriesBBtn.setVisible(false);
        activityTLbl.setVisible(false);
        activityTTf.setVisible(false);
        mentalAILbl.setVisible(false);
        mWLbl.setVisible(false);
        dietTypeLbl.setVisible(false);
        dietTTf.setVisible(false);
        caloriesLbl.setVisible(false);
        caloriesTf.setVisible(false);
        dietMBtn.setVisible(false);
        mentalDILbl.setVisible(false);
       sleepHLbl.setVisible(false);
       sleepHTf.setVisible(false);
        
        //makes the named jlabel and textfield visible
       stressLbl.setVisible(true);
       stressTf.setVisible(true);
        
    }//GEN-LAST:event_stressRbActionPerformed

  
    
    
 
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
            java.util.logging.Logger.getLogger(MentalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MentalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MentalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MentalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MentalGUI().setVisible(true);// a new window called mentalGUI is created and the layout is visible when the program runs.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdLbl;
    private javax.swing.JTextField IdTf;
    private javax.swing.JButton activitiesMBtn;
    private javax.swing.JRadioButton activitiesRB;
    private javax.swing.JLabel activityDLbl;
    private javax.swing.JTextField activityDTf;
    private javax.swing.JLabel activityTLbl;
    private javax.swing.JTextField activityTTf;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton caloriesBBtn;
    private javax.swing.JLabel caloriesLbl;
    private javax.swing.JTextField caloriesTf;
    private javax.swing.JButton dietMBtn;
    private javax.swing.JRadioButton dietRb;
    private javax.swing.JTextField dietTTf;
    private javax.swing.JLabel dietTypeLbl;
    private javax.swing.JButton displayMBtn;
    private javax.swing.JLabel frequencyLbl;
    private javax.swing.JTextField frequencyTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup mBtnGrp;
    private javax.swing.JLabel mWLbl;
    private javax.swing.JLabel mentalAILbl;
    private javax.swing.JLabel mentalDILbl;
    private javax.swing.JLabel mentalLbl;
    private javax.swing.JButton menuMBtn;
    private javax.swing.JLabel metLbl;
    private javax.swing.JTextField metTf;
    private javax.swing.JButton refreshMBtn;
    private javax.swing.JButton removeMBtn;
    private javax.swing.JLabel sleepHLbl;
    private javax.swing.JTextField sleepHTf;
    private javax.swing.JRadioButton sleepRb;
    private javax.swing.JLabel stressLbl;
    private javax.swing.JRadioButton stressRb;
    private javax.swing.JTextField stressTf;
    // End of variables declaration//GEN-END:variables
}
