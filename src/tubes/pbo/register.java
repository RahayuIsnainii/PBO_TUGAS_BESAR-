/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.pbo;

/**
 *
 * @author LENOVO PC
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
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

        jPanel3 = new javax.swing.JPanel();
        jTextFieldUsername = new javax.swing.JTextField();
        jTextFieldUsername1 = new javax.swing.JTextField();
        jTextFieldUsername2 = new javax.swing.JTextField();
        jTextFieldUsername3 = new javax.swing.JTextField();
        jTextFieldUsername4 = new javax.swing.JTextField();
        jButtonCreate1 = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelMin = new javax.swing.JLabel();
        jLabelExit = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(726, 409));
        jPanel3.setLayout(null);

        jTextFieldUsername.setBackground(new java.awt.Color(255, 255, 217));
        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldUsername);
        jTextFieldUsername.setBounds(10, 120, 220, 30);

        jTextFieldUsername1.setBackground(new java.awt.Color(255, 255, 217));
        jTextFieldUsername1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsername1ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldUsername1);
        jTextFieldUsername1.setBounds(10, 300, 220, 30);

        jTextFieldUsername2.setBackground(new java.awt.Color(255, 255, 217));
        jTextFieldUsername2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsername2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldUsername2);
        jTextFieldUsername2.setBounds(10, 60, 220, 30);

        jTextFieldUsername3.setBackground(new java.awt.Color(255, 255, 217));
        jTextFieldUsername3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsername3ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldUsername3);
        jTextFieldUsername3.setBounds(10, 180, 220, 30);

        jTextFieldUsername4.setBackground(new java.awt.Color(255, 255, 217));
        jTextFieldUsername4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsername4ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldUsername4);
        jTextFieldUsername4.setBounds(10, 240, 220, 30);

        jButtonCreate1.setBackground(new java.awt.Color(34, 167, 240));
        jButtonCreate1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCreate1.setForeground(new java.awt.Color(240, 240, 240));
        jButtonCreate1.setText("Create");
        jButtonCreate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreate1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonCreate1);
        jButtonCreate1.setBounds(530, 300, 80, 40);

        jButtonCancel.setBackground(new java.awt.Color(242, 36, 19));
        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(240, 240, 240));
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonCancel);
        jButtonCancel.setBounds(620, 300, 80, 40);

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });
        jPanel3.add(jLabelMin);
        jLabelMin.setBounds(670, 0, 30, 30);

        jLabelExit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelExit.setText("X");
        jLabelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelExitMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelExitMousePressed(evt);
            }
        });
        jPanel3.add(jLabelExit);
        jLabelExit.setBounds(700, 0, 30, 30);

        jLabel7.setFont(new java.awt.Font("Bradley Hand ITC", 1, 36)); // NOI18N
        jLabel7.setText("REGISTER");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(500, 140, 200, 30);

        jLabel5.setText("Password");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 220, 90, 14);

        jLabel4.setText("Re-type Password");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 280, 130, 14);

        jLabel6.setText("E-mail");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 160, 50, 14);

        jLabel3.setText("Alamat");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 100, 50, 14);

        jLabel2.setText("Nama");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 40, 80, 14);
        jPanel3.add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 180);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jTextFieldUsername1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsername1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsername1ActionPerformed

    private void jTextFieldUsername2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsername2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsername2ActionPerformed

    private void jTextFieldUsername3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsername3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsername3ActionPerformed

    private void jTextFieldUsername4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsername4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsername4ActionPerformed

    private void jButtonCreate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreate1ActionPerformed
        // TODO add your handling code here:
        tubesimk lgf = new tubesimk();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonCreate1ActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        tubesimk lgf = new tubesimk();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabelExitMouseEntered

    private void jLabelExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabelExitMousePressed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCreate1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JTextField jTextFieldUsername1;
    private javax.swing.JTextField jTextFieldUsername2;
    private javax.swing.JTextField jTextFieldUsername3;
    private javax.swing.JTextField jTextFieldUsername4;
    // End of variables declaration//GEN-END:variables
}
