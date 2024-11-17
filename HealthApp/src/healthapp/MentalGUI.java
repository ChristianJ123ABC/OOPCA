/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package healthapp;

/**
 *
 * @author flips
 */
public class MentalGUI extends javax.swing.JFrame {

    /**
     * Creates new form MentalGUI
     */
    public MentalGUI() {
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

        mentalLbl = new javax.swing.JLabel();
        stressLbl = new javax.swing.JLabel();
        stressTf = new javax.swing.JTextField();
        dietBtn = new javax.swing.JButton();
        activityBtn = new javax.swing.JButton();
        menuMentalBtn = new javax.swing.JButton();
        displayStressBtn = new javax.swing.JButton();
        removeStressBtn = new javax.swing.JButton();
        saveStressBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mentalLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mentalLbl.setText("Mental Wellbeing");

        stressLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stressLbl.setText("Stress Level: ");

        stressTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        dietBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dietBtn.setText("Diet");
        dietBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dietBtnActionPerformed(evt);
            }
        });

        activityBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        activityBtn.setText("Activity");
        activityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityBtnActionPerformed(evt);
            }
        });

        menuMentalBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        menuMentalBtn.setText("Menu");
        menuMentalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMentalBtnActionPerformed(evt);
            }
        });

        displayStressBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        displayStressBtn.setText("Display");

        removeStressBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeStressBtn.setText("Remove");

        saveStressBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveStressBtn.setText("Save");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(activityBtn)
                        .addGap(572, 572, 572))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mentalLbl)
                                .addGap(244, 244, 244))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(menuMentalBtn)
                                .addGap(190, 190, 190)
                                .addComponent(dietBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stressLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveStressBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayStressBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeStressBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(mentalLbl)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stressLbl)
                    .addComponent(stressTf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveStressBtn)
                    .addComponent(displayStressBtn)
                    .addComponent(removeStressBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dietBtn)
                    .addComponent(activityBtn)
                    .addComponent(menuMentalBtn))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMentalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMentalBtnActionPerformed
        // TODO add your handling code here:
        MenuGUI mg = new MenuGUI();
        mg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuMentalBtnActionPerformed

    private void activityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityBtnActionPerformed
        // TODO add your handling code here:
        MentalActivityGUI mag = new MentalActivityGUI();
        mag.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_activityBtnActionPerformed

    private void dietBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dietBtnActionPerformed
        // TODO add your handling code here:
        MentalDietGUI mdg = new MentalDietGUI();
        mdg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dietBtnActionPerformed

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
                new MentalGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton activityBtn;
    private javax.swing.JButton dietBtn;
    private javax.swing.JButton displayStressBtn;
    private javax.swing.JLabel mentalLbl;
    private javax.swing.JButton menuMentalBtn;
    private javax.swing.JButton removeStressBtn;
    private javax.swing.JButton saveStressBtn;
    private javax.swing.JLabel stressLbl;
    private javax.swing.JTextField stressTf;
    // End of variables declaration//GEN-END:variables
}
