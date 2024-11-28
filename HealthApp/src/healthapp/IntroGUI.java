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
public class IntroGUI extends javax.swing.JFrame {
    public ArrayList<User> userList;//arrayList to store Login Details

    /**
     * Creates new form Intro
     */
    public IntroGUI() {
        initComponents(); 
        userList = new ArrayList<>();
        readUsers();//puts the users information into the arrayList on load
    }
    
    
    
    
    //create a file to store the loginDetails and then place them into the userList when called
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        titleLbl = new javax.swing.JLabel();
        messageLbl = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        idLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        idTf = new javax.swing.JTextField();
        mLoginRb = new javax.swing.JRadioButton();
        pLoginRb = new javax.swing.JRadioButton();
        passwordPField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(996, 570));

        titleLbl.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLbl.setText("Health Improvement 101");

        messageLbl.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        messageLbl.setText("We aim to improve the overall health of anyone who uses this by providing a variety of options for either their mental or physical wellbeing");

        createBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        createBtn.setText("Create Account");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        exitBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        idLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idLbl.setText("ID:");

        passwordLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordLbl.setText("Password:");

        idTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTfActionPerformed(evt);
            }
        });

        buttonGroup1.add(mLoginRb);
        mLoginRb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mLoginRb.setText("Mental Login");

        buttonGroup1.add(pLoginRb);
        pLoginRb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pLoginRb.setText("Physical Login");
        pLoginRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pLoginRbActionPerformed(evt);
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
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordLbl)
                                    .addComponent(idLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idTf, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(passwordPField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginBtn)
                                .addGap(269, 269, 269)
                                .addComponent(createBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mLoginRb)
                        .addGap(18, 18, 18)
                        .addComponent(pLoginRb)))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(messageLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(titleLbl)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mLoginRb)
                    .addComponent(pLoginRb))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLbl)
                    .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl)
                    .addComponent(passwordPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(exitBtn)
                    .addComponent(createBtn))
                .addGap(103, 103, 103))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        UserGUI myGUI = new UserGUI();
        myGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        
        //source https://stackoverflow.com/questions/53983811/java-passing-arraylist-to-another-jframe
        //source 2 https://stackoverflow.com/questions/60320923/how-do-i-set-a-boolean-inside-a-for-loop-to-true-if-a-value-is-reached
            boolean flag = false; //boolean to check if login is true or not
            for(User u: userList){ //for each object in U,search each of them
                //if the ID or password from the User equals their login details, send them to Mental
                if(u.getId().equals(idTf.getText()) && u.getPassword().equals(passwordPField.getText()) && mLoginRb.isSelected()){ 
                    MentalGUI m = new MentalGUI();
                    m.setVisible(true);
                    this.dispose();
                    flag = true;
                    break;
                    
                }
                //if the ID or password from the User equals their login details, send them to Physical
                else if(u.getId().equals(idTf.getText()) && u.getPassword().equals(passwordPField.getText()) && pLoginRb.isSelected()){
                    PhysicalGUI p = new PhysicalGUI();
                    p.setVisible(true);
                    this.dispose();
                    flag = true;
                    break;
                    
                }
            }
                //if the ID or password from the User does NOT equals their login details / boolean flag is false, run this statement
                if(flag == false){
                //if no parameter is selected or the details are wrong, send an error message
                    if(!pLoginRb.isSelected() && !mLoginRb.isSelected()){
                        JOptionPane.showMessageDialog(null, "Please accept a parameter before you log in");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Incorrect login details, please try again");
                    }
                }
            
             
    }//GEN-LAST:event_loginBtnActionPerformed

    private void idTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTfActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_idTfActionPerformed

    private void pLoginRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pLoginRbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pLoginRbActionPerformed

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
            java.util.logging.Logger.getLogger(IntroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntroGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel idLbl;
    public javax.swing.JTextField idTf;
    private javax.swing.JButton loginBtn;
    private javax.swing.JRadioButton mLoginRb;
    private javax.swing.JLabel messageLbl;
    private javax.swing.JRadioButton pLoginRb;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordPField;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
