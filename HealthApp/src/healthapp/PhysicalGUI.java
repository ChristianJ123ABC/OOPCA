/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package healthapp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author flips
 */
public class PhysicalGUI extends javax.swing.JFrame {
   
    /**
     * Creates new form PhysicalGUI
     */
    public PhysicalGUI() {
        initComponents();
                
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        physicalLbl = new javax.swing.JLabel();
        activityLbl = new javax.swing.JLabel();
        activityBtn = new javax.swing.JButton();
        activityTf = new javax.swing.JTextField();
        macroBtn = new javax.swing.JButton();
        cardioBtn = new javax.swing.JButton();
        saveActivityBtn = new javax.swing.JButton();
        menuPhysicalBtn = new javax.swing.JButton();
        workoutBtn = new javax.swing.JButton();
        dietBtn = new javax.swing.JButton();
        displayActivityBtn = new javax.swing.JButton();
        removeActivityBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        physicalLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        physicalLbl.setText("Physical Health");

        activityLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        activityLbl.setText("Activity Level:");

        activityBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        activityBtn.setText("What is Activity level?");
        activityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityBtnActionPerformed(evt);
            }
        });

        activityTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        activityTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityTfActionPerformed(evt);
            }
        });

        macroBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        macroBtn.setText("Macronutrients");
        macroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                macroBtnActionPerformed(evt);
            }
        });

        cardioBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cardioBtn.setText("Cardio");
        cardioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardioBtnActionPerformed(evt);
            }
        });

        saveActivityBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveActivityBtn.setText("Save");
        saveActivityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActivityBtnActionPerformed(evt);
            }
        });

        menuPhysicalBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        menuPhysicalBtn.setText("Menu");
        menuPhysicalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPhysicalBtnActionPerformed(evt);
            }
        });

        workoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        workoutBtn.setText("Workout Plan");
        workoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workoutBtnActionPerformed(evt);
            }
        });

        dietBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dietBtn.setText("Diet");
        dietBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietBtnActionPerformed(evt);
            }
        });

        displayActivityBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        displayActivityBtn.setText("Display");
        displayActivityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActivityBtnActionPerformed(evt);
            }
        });

        removeActivityBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeActivityBtn.setText("Remove");
        removeActivityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActivityBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(physicalLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(saveActivityBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayActivityBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeActivityBtn)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(activityBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(activityLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(activityTf, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(menuPhysicalBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(macroBtn)
                                .addGap(18, 18, 18)
                                .addComponent(cardioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addComponent(dietBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(workoutBtn)))
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(physicalLbl)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activityLbl)
                    .addComponent(activityTf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveActivityBtn)
                    .addComponent(displayActivityBtn)
                    .addComponent(removeActivityBtn))
                .addGap(39, 39, 39)
                .addComponent(activityBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(menuPhysicalBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(macroBtn)
                    .addComponent(cardioBtn)
                    .addComponent(dietBtn)
                    .addComponent(workoutBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuPhysicalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPhysicalBtnActionPerformed
        // TODO add your handling code here:
        UserGUI mg = new UserGUI();
        mg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuPhysicalBtnActionPerformed

    private void macroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_macroBtnActionPerformed
        // TODO add your handling code here:
        MacroGUI mg = new MacroGUI();
        mg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_macroBtnActionPerformed

    private void cardioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardioBtnActionPerformed
        // TODO add your handling code here:
        PhysicalCardioGUI pcg = new PhysicalCardioGUI();
        pcg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cardioBtnActionPerformed

    private void workoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workoutBtnActionPerformed
        // TODO add your handling code here:
        WorkoutGUI wg = new WorkoutGUI();
        wg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_workoutBtnActionPerformed

    private void dietBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietBtnActionPerformed
        // TODO add your handling code here:
        PhysicalDietGUI pdg = new PhysicalDietGUI();
        pdg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dietBtnActionPerformed

    private void activityTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityTfActionPerformed
        // TODO add your handling code here:
       
        
        
        
    }//GEN-LAST:event_activityTfActionPerformed

    private void saveActivityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActivityBtnActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_saveActivityBtnActionPerformed

    private void displayActivityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActivityBtnActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_displayActivityBtnActionPerformed

    private void removeActivityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActivityBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_removeActivityBtnActionPerformed

    private void activityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Sedentary (type 1): Little to no exercise: \n Lightly Active (type 2): Spend most of the day on your feet \n Moderately Active (type 3): Spend a majority of the day doing physical activities (mailman, waitress) \n Very Active (type 4): Spend almost your entire day doing physical activity (carpenters) \n Extremely Active (type 5): Perform high amounts of exercise AND physical work (competitive athlete)");
    }//GEN-LAST:event_activityBtnActionPerformed

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
    private javax.swing.JButton activityBtn;
    private javax.swing.JLabel activityLbl;
    private javax.swing.JTextField activityTf;
    private javax.swing.JButton cardioBtn;
    private javax.swing.JButton dietBtn;
    private javax.swing.JButton displayActivityBtn;
    private javax.swing.JButton macroBtn;
    private javax.swing.JButton menuPhysicalBtn;
    private javax.swing.JLabel physicalLbl;
    private javax.swing.JButton removeActivityBtn;
    private javax.swing.JButton saveActivityBtn;
    private javax.swing.JButton workoutBtn;
    // End of variables declaration//GEN-END:variables
}
