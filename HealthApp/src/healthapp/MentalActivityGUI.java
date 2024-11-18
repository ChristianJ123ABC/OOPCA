/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package healthapp;

/**
 *
 * @author flips
 */
public class MentalActivityGUI extends javax.swing.JFrame {

    /**
     * Creates new form ActivityGUI
     */
    public MentalActivityGUI() {
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

        mActivityMenuLbl = new javax.swing.JLabel();
        mActivityLevelLbl = new javax.swing.JLabel();
        mActivityLevelTf = new javax.swing.JTextField();
        mActivityDurationLbl = new javax.swing.JLabel();
        mActivityDurationTf = new javax.swing.JTextField();
        mActivitySubmitBtn = new javax.swing.JButton();
        mentalMenuBtn = new javax.swing.JButton();
        mActivityTypeBtn = new javax.swing.JButton();
        mActivityTypeLbl = new javax.swing.JLabel();
        mActivityTypeTf = new javax.swing.JTextField();
        mAgeLbl = new javax.swing.JLabel();
        mAgeTf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mActivityMenuLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mActivityMenuLbl.setText("Mental Wellbeing Activity");

        mActivityLevelLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mActivityLevelLbl.setText("Activity Level:");

        mActivityLevelTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mActivityDurationLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mActivityDurationLbl.setText("Activity Duration:");

        mActivityDurationTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mActivitySubmitBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mActivitySubmitBtn.setText("Save");

        mentalMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mentalMenuBtn.setText("Back to Mental Menu");
        mentalMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mentalMenuBtnActionPerformed(evt);
            }
        });

        mActivityTypeBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mActivityTypeBtn.setText("Types of Activity");
        mActivityTypeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActivityTypeBtnActionPerformed(evt);
            }
        });

        mActivityTypeLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mActivityTypeLbl.setText("Activity Type:");
        mActivityTypeLbl.setMaximumSize(new java.awt.Dimension(120, 25));
        mActivityTypeLbl.setMinimumSize(new java.awt.Dimension(120, 25));
        mActivityTypeLbl.setPreferredSize(new java.awt.Dimension(120, 25));

        mActivityTypeTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mAgeLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mAgeLbl.setText("Age:");

        mAgeTf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mActivityLevelLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mActivityLevelTf, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mActivityDurationLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mActivityDurationTf, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(mActivitySubmitBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(mActivityMenuLbl)
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(mActivityTypeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addComponent(mentalMenuBtn)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mActivityTypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mActivityTypeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mAgeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mAgeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mActivityMenuLbl)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mActivityLevelLbl)
                    .addComponent(mActivityLevelTf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mActivityTypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mActivityTypeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mActivityDurationLbl)
                    .addComponent(mActivityDurationTf, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mAgeLbl)
                    .addComponent(mAgeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(mActivitySubmitBtn)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mentalMenuBtn)
                    .addComponent(mActivityTypeBtn))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mentalMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mentalMenuBtnActionPerformed
        // TODO add your handling code here:
        MentalGUI mg = new MentalGUI();
        mg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mentalMenuBtnActionPerformed

    private void mActivityTypeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActivityTypeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mActivityTypeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MentalActivityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MentalActivityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MentalActivityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MentalActivityGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MentalActivityGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel mActivityDurationLbl;
    private javax.swing.JTextField mActivityDurationTf;
    private javax.swing.JLabel mActivityLevelLbl;
    private javax.swing.JTextField mActivityLevelTf;
    private javax.swing.JLabel mActivityMenuLbl;
    private javax.swing.JButton mActivitySubmitBtn;
    private javax.swing.JButton mActivityTypeBtn;
    private javax.swing.JLabel mActivityTypeLbl;
    private javax.swing.JTextField mActivityTypeTf;
    private javax.swing.JLabel mAgeLbl;
    private javax.swing.JTextField mAgeTf;
    private javax.swing.JButton mentalMenuBtn;
    // End of variables declaration//GEN-END:variables
}
