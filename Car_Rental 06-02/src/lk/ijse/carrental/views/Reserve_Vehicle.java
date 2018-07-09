/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.views;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Nuwan Pradeep
 */
public class Reserve_Vehicle extends javax.swing.JFrame {

    /**
     * Creates new form Reserve_Vehicle
     */
    public Reserve_Vehicle() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        empIdText = new javax.swing.JTextField();
        empIdLabel = new javax.swing.JLabel();
        empLabel1 = new javax.swing.JLabel();
        empNameText = new javax.swing.JTextField();
        empLabel2 = new javax.swing.JLabel();
        empAddressText = new javax.swing.JTextField();
        empLabel3 = new javax.swing.JLabel();
        empTelText = new javax.swing.JTextField();
        empLabel4 = new javax.swing.JLabel();
        empEmailText = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        empHTelLabel = new javax.swing.JLabel();
        empHomeTelText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(javax.swing.UIManager.getDefaults().getColor("nb.bugtracking.modified.color"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel2.setText("Select for Vehicle");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        empIdText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        empIdText.setForeground(new java.awt.Color(0, 255, 255));
        empIdText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        empIdText.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        empIdText.setEnabled(false);
        empIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empIdTextActionPerformed(evt);
            }
        });

        empIdLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        empIdLabel.setForeground(new java.awt.Color(0, 102, 102));
        empIdLabel.setText("Customer ID");

        empLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        empLabel1.setForeground(new java.awt.Color(0, 102, 102));
        empLabel1.setText("Name");

        empNameText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        empNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNameTextActionPerformed(evt);
            }
        });
        empNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empNameTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empNameTextKeyTyped(evt);
            }
        });

        empLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        empLabel2.setForeground(new java.awt.Color(0, 102, 102));
        empLabel2.setText("Address");

        empAddressText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        empAddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empAddressTextActionPerformed(evt);
            }
        });
        empAddressText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empAddressTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empAddressTextKeyTyped(evt);
            }
        });

        empLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        empLabel3.setForeground(new java.awt.Color(0, 102, 102));
        empLabel3.setText("Telephone");

        empTelText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        empTelText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empTelTextActionPerformed(evt);
            }
        });
        empTelText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empTelTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empTelTextKeyTyped(evt);
            }
        });

        empLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        empLabel4.setForeground(new java.awt.Color(0, 102, 102));
        empLabel4.setText("Email");

        empEmailText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        empEmailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empEmailTextActionPerformed(evt);
            }
        });
        empEmailText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empEmailTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empEmailTextKeyTyped(evt);
            }
        });

        saveBtn.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(51, 51, 51));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(51, 51, 51));
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveBtn)
                .addGap(18, 18, 18)
                .addComponent(cancelBtn)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(saveBtn)
                .addComponent(cancelBtn))
        );

        empHTelLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        empHTelLabel.setForeground(new java.awt.Color(0, 102, 102));
        empHTelLabel.setText("Home Phone");

        empHomeTelText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        empHomeTelText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empHomeTelTextActionPerformed(evt);
            }
        });
        empHomeTelText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empHomeTelTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                empHomeTelTextKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(empIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(empIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(empLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(empNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(empLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(empAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(empLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(empEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(empHTelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(empLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(empTelText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(empHomeTelText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empIdLabel)
                    .addComponent(empIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empLabel1)
                    .addComponent(empNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empLabel2)
                    .addComponent(empAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empLabel3)
                    .addComponent(empTelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empHTelLabel)
                    .addComponent(empHomeTelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(552, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 1110, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empIdTextActionPerformed

    private void empNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNameTextActionPerformed
        empAddressText.requestFocus();
    }//GEN-LAST:event_empNameTextActionPerformed

    private void empNameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empNameTextKeyReleased
        if( (empAddressText.getText().length()==0)||(empTelText.getText().length()==0)||(empEmailText.getText().length()==0)){
        }else{
            saveBtn.setEnabled(true);
        }
    }//GEN-LAST:event_empNameTextKeyReleased

    private void empNameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empNameTextKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= 'A') && (c <= 'Z') ||(c >= 'a') && (c <= 'z') ||(c ==' ')||(c == KeyEvent.VK_BACK_SPACE) ||(c == KeyEvent.VK_DELETE)||(c == KeyEvent.VK_ENTER))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_empNameTextKeyTyped

    private void empAddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empAddressTextActionPerformed
        empTelText.requestFocus();
    }//GEN-LAST:event_empAddressTextActionPerformed

    private void empAddressTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empAddressTextKeyReleased
        if( (empNameText.getText().length()==0)||(empTelText.getText().length()==0)||(empEmailText.getText().length()==0)){
        }else{
            saveBtn.setEnabled(true);
        }
    }//GEN-LAST:event_empAddressTextKeyReleased

    private void empAddressTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empAddressTextKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')||(c >= 'A') && (c <= 'Z') ||(c ==' ')||(c >= 'a') && (c <= 'z') ||(c ==',')||(c =='.')||(c == KeyEvent.VK_BACK_SPACE) ||(c == KeyEvent.VK_DELETE)||(c == KeyEvent.VK_ENTER))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_empAddressTextKeyTyped

    private void empTelTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empTelTextActionPerformed
        empHomeTelText.requestFocus();
    }//GEN-LAST:event_empTelTextActionPerformed

    private void empTelTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empTelTextKeyReleased
        if( (empAddressText.getText().length()==0)||(empNameText.getText().length()==0)||(empEmailText.getText().length()==0)){
        }else{
            saveBtn.setEnabled(true);
        }
    }//GEN-LAST:event_empTelTextKeyReleased

    private void empTelTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empTelTextKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||(c == KeyEvent.VK_BACK_SPACE) ||(c == KeyEvent.VK_DELETE)||(c == KeyEvent.VK_ENTER))|empTelText.getText().length()>=10) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_empTelTextKeyTyped

    private void empEmailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empEmailTextActionPerformed
        saveBtn.requestFocus();
    }//GEN-LAST:event_empEmailTextActionPerformed

    private void empEmailTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empEmailTextKeyReleased
        if( (empAddressText.getText().length()==0)||(empTelText.getText().length()==0)||(empAddressText.getText().length()==0)){
        }else{
            saveBtn.setEnabled(true);
        }
    }//GEN-LAST:event_empEmailTextKeyReleased

    private void empEmailTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empEmailTextKeyTyped
        char c = evt.getKeyChar();
        System.out.println(c);
        if (!((c >= '0') && (c <= '9')||(c >= 'A') && (c <= 'Z') ||(c >= 'a') && (c <= 'z') ||(c =='@')||(c =='.')||(c == KeyEvent.VK_BACK_SPACE) ||(c == KeyEvent.VK_DELETE)||(c == KeyEvent.VK_ENTER))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_empEmailTextKeyTyped

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        /*String empID=empIdText.getText();
        String name=empNameText.getText();
        String address=empAddressText.getText();
        int tel=Integer.parseInt(empTelText.getText());
        int homeTel=Integer.parseInt(empHomeTelText.getText());
        String email=empEmailText.getText();

        Employee employee=new Employee(empID, name, address, tel, homeTel, email);
        try {
            int res = EmployeeController.saveEmployee(employee);

            if (res==1) {
                JOptionPane.showMessageDialog(this, "Saved Successfully");
                empIdText.setText(null);
                empNameText.setText(null);
                empAddressText.setText(null);
                empTelText.setText(null);
                empHomeTelText.setText(null);
                empEmailText.setText(null);

                try {
                    String id=EmployeeController.getId();
                    empIdText.setText(id);
                    dispose();
                } catch (ClassNotFoundException | SQLException ex) {
                    JOptionPane.showMessageDialog(this, ex);
                }
                EmployerJIFrame.refreshTable();

            } else {
                JOptionPane.showMessageDialog(this, "Failed");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
*/
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void empHomeTelTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empHomeTelTextActionPerformed
        empEmailText.requestFocus();
    }//GEN-LAST:event_empHomeTelTextActionPerformed

    private void empHomeTelTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empHomeTelTextKeyReleased

    }//GEN-LAST:event_empHomeTelTextKeyReleased

    private void empHomeTelTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empHomeTelTextKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||(c == KeyEvent.VK_BACK_SPACE) ||(c == KeyEvent.VK_DELETE)||(c == KeyEvent.VK_ENTER))|empHomeTelText.getText().length()>=10) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_empHomeTelTextKeyTyped

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
            java.util.logging.Logger.getLogger(Reserve_Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserve_Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserve_Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserve_Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reserve_Vehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JTextField empAddressText;
    private javax.swing.JTextField empEmailText;
    private javax.swing.JLabel empHTelLabel;
    private javax.swing.JTextField empHomeTelText;
    private javax.swing.JLabel empIdLabel;
    private javax.swing.JTextField empIdText;
    private javax.swing.JLabel empLabel1;
    private javax.swing.JLabel empLabel2;
    private javax.swing.JLabel empLabel3;
    private javax.swing.JLabel empLabel4;
    private javax.swing.JTextField empNameText;
    private javax.swing.JTextField empTelText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
