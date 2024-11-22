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
        frequencyLbl = new javax.swing.JLabel();
        cardioTypeTf = new javax.swing.JTextField();
        saveActivityBtn = new javax.swing.JButton();
        menuPhysicalBtn = new javax.swing.JButton();
        dietBtn = new javax.swing.JButton();
        displayActivityBtn = new javax.swing.JButton();
        removeActivityBtn = new javax.swing.JButton();
        IdLbl = new javax.swing.JLabel();
        cardioTypeLbl = new javax.swing.JLabel();
        cardioDurLbl = new javax.swing.JLabel();
        workoutLbl = new javax.swing.JLabel();
        durationLbl = new javax.swing.JLabel();
        dietTypeLbl = new javax.swing.JLabel();
        IdTf = new javax.swing.JTextField();
        cardioDurTf = new javax.swing.JTextField();
        workoutTf = new javax.swing.JTextField();
        frequencyTf = new javax.swing.JTextField();
        durationTf = new javax.swing.JTextField();
        dietTypeTf = new javax.swing.JTextField();
        caloriesTf = new javax.swing.JTextField();
        caloriesLbl = new javax.swing.JLabel();
        macroRb = new javax.swing.JRadioButton();
        cardioRb = new javax.swing.JRadioButton();
        dietRb = new javax.swing.JRadioButton();
        workoutRb = new javax.swing.JRadioButton();
        dietTypeBtn = new javax.swing.JButton();
        workoutTypeBtn = new javax.swing.JButton();
        cardioTypeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        physicalLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        physicalLbl.setText("Physical Health");

        frequencyLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        frequencyLbl.setText("Frequency(per week):");

        cardioTypeTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cardioTypeTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardioTypeTfActionPerformed(evt);
            }
        });

        saveActivityBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saveActivityBtn.setText("Add");
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

        dietBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dietBtn.setText("Search");
        dietBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietBtnActionPerformed(evt);
            }
        });

        displayActivityBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        displayActivityBtn.setText("Display");
        displayActivityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActivityBtnActionPerformed(evt);
            }
        });

        removeActivityBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        removeActivityBtn.setText("Remove");
        removeActivityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActivityBtnActionPerformed(evt);
            }
        });

        IdLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IdLbl.setText("ID:");

        cardioTypeLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cardioTypeLbl.setText("Cardio Type:");

        cardioDurLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cardioDurLbl.setText("Cardio Duration:");

        workoutLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        workoutLbl.setText("Workout:");

        durationLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        durationLbl.setText("Duration Per Session:");

        dietTypeLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dietTypeLbl.setText("Diet Type:");

        IdTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IdTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTfActionPerformed(evt);
            }
        });

        cardioDurTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cardioDurTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardioDurTfActionPerformed(evt);
            }
        });

        workoutTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        workoutTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workoutTfActionPerformed(evt);
            }
        });

        frequencyTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        frequencyTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frequencyTfActionPerformed(evt);
            }
        });

        durationTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        durationTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationTfActionPerformed(evt);
            }
        });

        dietTypeTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dietTypeTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietTypeTfActionPerformed(evt);
            }
        });

        caloriesTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        caloriesTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caloriesTfActionPerformed(evt);
            }
        });

        caloriesLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        caloriesLbl.setText("Calories:");

        macroRb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        macroRb.setText("Macronutrient");

        cardioRb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cardioRb.setText("Cardio");
        cardioRb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardioRbActionPerformed(evt);
            }
        });

        dietRb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dietRb.setText("Diet");

        workoutRb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        workoutRb.setText("Workout Plan");

        dietTypeBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dietTypeBtn.setText("Types of Diet");
        dietTypeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietTypeBtnActionPerformed(evt);
            }
        });

        workoutTypeBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        workoutTypeBtn.setText("Types of Workout");
        workoutTypeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workoutTypeBtnActionPerformed(evt);
            }
        });

        cardioTypeBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cardioTypeBtn.setText("Types of Cardio");
        cardioTypeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardioTypeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(IdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(macroRb, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(caloriesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(dietTypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cardioTypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cardioDurLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(cardioRb, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(275, 275, 275)
                                        .addComponent(physicalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(dietTypeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(durationLbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(durationTf, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(frequencyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(workoutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(workoutTf, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(frequencyTf, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cardioDurTf, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cardioTypeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(IdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(caloriesTf, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(workoutRb, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(dietRb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saveActivityBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayActivityBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(dietTypeBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(removeActivityBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dietBtn))
                            .addComponent(workoutTypeBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cardioTypeBtn))
                            .addComponent(menuPhysicalBtn))))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(physicalLbl)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdLbl)
                            .addComponent(IdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cardioTypeLbl)
                            .addComponent(cardioTypeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cardioDurLbl)
                            .addComponent(cardioDurTf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(workoutLbl)
                            .addComponent(workoutTf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(frequencyLbl)
                            .addComponent(frequencyTf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(durationLbl)
                            .addComponent(durationTf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dietTypeLbl)
                            .addComponent(dietTypeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caloriesTf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caloriesLbl))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveActivityBtn)
                            .addComponent(displayActivityBtn)
                            .addComponent(removeActivityBtn)
                            .addComponent(dietBtn)
                            .addComponent(menuPhysicalBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(macroRb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardioRb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dietRb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(workoutRb)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dietTypeBtn)
                    .addComponent(workoutTypeBtn)
                    .addComponent(cardioTypeBtn))
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

    private void dietBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_dietBtnActionPerformed

    private void cardioTypeTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardioTypeTfActionPerformed
        // TODO add your handling code here:
      
       
        
        
        
    }//GEN-LAST:event_cardioTypeTfActionPerformed

    private void saveActivityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActivityBtnActionPerformed
        // TODO add your handling code here:

        
        
        
        
        
    }//GEN-LAST:event_saveActivityBtnActionPerformed

    private void displayActivityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActivityBtnActionPerformed
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_displayActivityBtnActionPerformed

    private void removeActivityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActivityBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_removeActivityBtnActionPerformed

    private void IdTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTfActionPerformed

    private void cardioDurTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardioDurTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardioDurTfActionPerformed

    private void workoutTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workoutTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workoutTfActionPerformed

    private void frequencyTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frequencyTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frequencyTfActionPerformed

    private void durationTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationTfActionPerformed

    private void dietTypeTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietTypeTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dietTypeTfActionPerformed

    private void caloriesTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caloriesTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caloriesTfActionPerformed

    private void cardioRbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardioRbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardioRbActionPerformed

    private void dietTypeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietTypeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dietTypeBtnActionPerformed

    private void workoutTypeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workoutTypeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workoutTypeBtnActionPerformed

    private void cardioTypeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardioTypeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardioTypeBtnActionPerformed

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
    private javax.swing.JLabel IdLbl;
    private javax.swing.JTextField IdTf;
    private javax.swing.JLabel caloriesLbl;
    private javax.swing.JTextField caloriesTf;
    private javax.swing.JLabel cardioDurLbl;
    private javax.swing.JTextField cardioDurTf;
    private javax.swing.JRadioButton cardioRb;
    private javax.swing.JButton cardioTypeBtn;
    private javax.swing.JLabel cardioTypeLbl;
    private javax.swing.JTextField cardioTypeTf;
    private javax.swing.JButton dietBtn;
    private javax.swing.JRadioButton dietRb;
    private javax.swing.JButton dietTypeBtn;
    private javax.swing.JLabel dietTypeLbl;
    private javax.swing.JTextField dietTypeTf;
    private javax.swing.JButton displayActivityBtn;
    private javax.swing.JLabel durationLbl;
    private javax.swing.JTextField durationTf;
    private javax.swing.JLabel frequencyLbl;
    private javax.swing.JTextField frequencyTf;
    private javax.swing.JRadioButton macroRb;
    private javax.swing.JButton menuPhysicalBtn;
    private javax.swing.JLabel physicalLbl;
    private javax.swing.JButton removeActivityBtn;
    private javax.swing.JButton saveActivityBtn;
    private javax.swing.JLabel workoutLbl;
    private javax.swing.JRadioButton workoutRb;
    private javax.swing.JTextField workoutTf;
    private javax.swing.JButton workoutTypeBtn;
    // End of variables declaration//GEN-END:variables
}
