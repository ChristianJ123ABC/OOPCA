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
 * @author chris
 */
public class UserGUI extends javax.swing.JFrame {
    private ArrayList<User> userList; //arrayList to store User Details
    
    /**
     * Creates new form MenuGUI
     */
    public UserGUI() {
        initComponents();
        userList = new ArrayList<>();
        readUsers(); //loads the objects into the program on load
    }
    
    
    
    
    
   
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuTf = new javax.swing.JLabel();
        physicalMenuBtn = new javax.swing.JButton();
        mentalMenuBtn = new javax.swing.JButton();
        idLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        weightLbl = new javax.swing.JLabel();
        heightLbl = new javax.swing.JLabel();
        weightTf = new javax.swing.JTextField();
        heightTf = new javax.swing.JTextField();
        idTf = new javax.swing.JTextField();
        displayBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        ageLbl = new javax.swing.JLabel();
        ageTf = new javax.swing.JTextField();
        returnMenuBtn = new javax.swing.JButton();
        passwordLbl = new javax.swing.JLabel();
        nameTf = new javax.swing.JTextField();
        passwordPField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuTf.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        menuTf.setText("Good Health and Wellbeing");

        physicalMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        physicalMenuBtn.setText("Physical Health ");
        physicalMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                physicalMenuBtnActionPerformed(evt);
            }
        });

        mentalMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mentalMenuBtn.setText("Mental Wellbeing");
        mentalMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mentalMenuBtnActionPerformed(evt);
            }
        });

        idLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idLbl.setText("ID:");

        nameLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nameLbl.setText("Name:");

        weightLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        weightLbl.setText("Weight (in KG): ");

        heightLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        heightLbl.setText("Height (in cm)");

        weightTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        weightTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTfActionPerformed(evt);
            }
        });

        heightTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        heightTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTfActionPerformed(evt);
            }
        });

        idTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTfActionPerformed(evt);
            }
        });

        displayBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        displayBtn.setText("Display");
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });

        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        registerBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        ageLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ageLbl.setText("Age:");

        ageTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ageTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTfActionPerformed(evt);
            }
        });

        returnMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        returnMenuBtn.setText("Login Page");
        returnMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnMenuBtnActionPerformed(evt);
            }
        });

        passwordLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordLbl.setText("Password:");

        nameTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTfActionPerformed(evt);
            }
        });

        passwordPField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(weightLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(heightLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ageLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(registerBtn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weightTf, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heightTf, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageTf, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(displayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(287, 287, 287))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuTf)
                .addGap(328, 328, 328))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(idLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(39, 39, 39)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(idTf, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                .addComponent(passwordPField))))
                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mentalMenuBtn)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(returnMenuBtn)))
                    .addComponent(physicalMenuBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(mentalMenuBtn)
                        .addGap(18, 18, 18)
                        .addComponent(physicalMenuBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menuTf)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLbl)
                            .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLbl)
                            .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageTf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(weightLbl)
                    .addComponent(weightTf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightLbl)
                    .addComponent(heightTf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(displayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void weightTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightTfActionPerformed

    private void heightTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightTfActionPerformed

    private void idTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTfActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        // TODO add your handling code here:
        if(userList.isEmpty()){ //if the arrayList is empty, it will display an error message
            JOptionPane.showMessageDialog(null,"There are no users on the list");
        }
        else{
            
            for(int i = 0; i < userList.size();i++){ //checks for every object in the array and displays them
                JOptionPane.showMessageDialog(null,userList.get(i).getDetails());
            }
        }
    }//GEN-LAST:event_displayBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        if(userList.isEmpty()){ //if the arrayList is empty, it will display an error message
            JOptionPane.showMessageDialog(null,"There are no users on the list");
        }
        else{
            
            for(User u:userList){//for each user object in the list, it will search it
                if(u.getId().equalsIgnoreCase(idTf.getText())){//check if the id of object matches the user search
                    JOptionPane.showMessageDialog(null,u.getDetails());//if the id matches, print the details of that object
                }
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        if(userList.isEmpty()){ //if the arrayList is empty, it will display an error message
            JOptionPane.showMessageDialog(null,"There are no users on the list");
        }
        else{
            
            for(int i = 0; i < userList.size();i++){
                User u = userList.get(i); //fetches the user object and puts it into i
                
                if(u.getId().equalsIgnoreCase(idTf.getText())){ //if the id equals the user search, it will delete it
                    userList.remove(u);
                }
            }
        }
        saveUsers(); //saves the user information into the file
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        User u = new User(); //creates instance of User class
        //whatever the user types into the textfield, it will be put into that corresponding variable in User
        u.setId(idTf.getText());
        u.setPassword(passwordPField.getText());
        u.setName(nameTf.getText());
        u.setAge(Integer.parseInt(ageTf.getText()));
        u.setWeight(Double.parseDouble(weightTf.getText()));
        u.setHeight(Double.parseDouble(heightTf.getText()));
        
        //places those values into an array
        userList.add(u);
        JOptionPane.showMessageDialog(null, "User created! Please go back to the menu and log in");
        
        saveUsers(); //saves the user information into the file
    }//GEN-LAST:event_registerBtnActionPerformed

    private void ageTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTfActionPerformed

    private void mentalMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mentalMenuBtnActionPerformed
        // TODO add your handling code here:
        //displays the MentalGUI on click
        MentalGUI mg = new MentalGUI();
        mg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mentalMenuBtnActionPerformed

    private void physicalMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_physicalMenuBtnActionPerformed
        // TODO add your handling code here:
        //same as above
        PhysicalGUI pg = new PhysicalGUI();
        pg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_physicalMenuBtnActionPerformed

    private void returnMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnMenuBtnActionPerformed
        // TODO add your handling code here:
        IntroGUI ig = new IntroGUI();
        ig.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_returnMenuBtnActionPerformed

    private void nameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTfActionPerformed

   
    //saves the user information into the file
    private void saveUsers(){ 
        //declare objects
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        
        try{
            //create objects
            f = new File("users.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);
            
            //use objects
            oStream.writeObject(userList);
        }
        catch(IOException e){
            System.out.println("Error:"+e);
        }
    }
    
    //puts the users information into the arrayList when called
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
            java.util.logging.Logger.getLogger(UserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTf;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton displayBtn;
    private javax.swing.JLabel heightLbl;
    private javax.swing.JTextField heightTf;
    private javax.swing.JLabel idLbl;
    private javax.swing.JTextField idTf;
    private javax.swing.JButton mentalMenuBtn;
    private javax.swing.JLabel menuTf;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTf;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordPField;
    private javax.swing.JButton physicalMenuBtn;
    private javax.swing.JButton registerBtn;
    private javax.swing.JButton returnMenuBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel weightLbl;
    private javax.swing.JTextField weightTf;
    // End of variables declaration//GEN-END:variables
}
