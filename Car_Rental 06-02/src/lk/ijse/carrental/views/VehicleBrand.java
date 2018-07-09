/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carrental.views;

import java.util.ArrayList;
import lk.ijse.carrental.dto.VehicleBrandDTO;

/**
 *
 * @author Nuwan Pradeep
 */
public class VehicleBrand extends javax.swing.JFrame {

    /**
     * Creates new form Vehicle_Brand
     */
    public VehicleBrand() {
        initComponents();
        asd();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        vehicleBrandDetailsPanel = new javax.swing.JPanel();
        nameText3 = new javax.swing.JLabel();
        brandNameText = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        addBrandBtn = new javax.swing.JButton();
        nameText5 = new javax.swing.JLabel();
        deleteBrandBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        vBrandTable = new javax.swing.JTable();
        setBrandNameText = new javax.swing.JTextField();
        nameText6 = new javax.swing.JLabel();
        BrandIDText = new javax.swing.JTextField();
        vBrandIDComboBox = new javax.swing.JComboBox();
        mainPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(153, 153, 153));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel2.setText("Vehicle Brand  ");
        mainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 150, -1));

        vehicleBrandDetailsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameText3.setBackground(new java.awt.Color(102, 204, 255));
        nameText3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        nameText3.setText("Brand Name :");
        vehicleBrandDetailsPanel.add(nameText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));
        vehicleBrandDetailsPanel.add(brandNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 290, -1));

        jSeparator2.setBackground(new java.awt.Color(51, 153, 255));
        vehicleBrandDetailsPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 930, 10));

        addBrandBtn.setBackground(new java.awt.Color(51, 102, 255));
        addBrandBtn.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        addBrandBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBrandBtn.setText("Add");
        addBrandBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBrandBtnMouseClicked(evt);
            }
        });
        addBrandBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBrandBtnActionPerformed(evt);
            }
        });
        vehicleBrandDetailsPanel.add(addBrandBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 140, 20));

        nameText5.setBackground(new java.awt.Color(102, 204, 255));
        nameText5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        nameText5.setText("Brand ID : ");
        vehicleBrandDetailsPanel.add(nameText5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        deleteBrandBtn.setBackground(new java.awt.Color(51, 153, 255));
        deleteBrandBtn.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        deleteBrandBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBrandBtn.setText("Delete");
        deleteBrandBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBrandBtnMouseClicked(evt);
            }
        });
        deleteBrandBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBrandBtnActionPerformed(evt);
            }
        });
        vehicleBrandDetailsPanel.add(deleteBrandBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 140, 20));

        jSeparator3.setBackground(new java.awt.Color(51, 153, 255));
        vehicleBrandDetailsPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 930, 10));

        vBrandTable.setForeground(new java.awt.Color(102, 0, 102));
        vBrandTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BrandID", "Brand Name", "Insurance method"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vBrandTable.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(vBrandTable);

        vehicleBrandDetailsPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 800, 180));

        setBrandNameText.setName(""); // NOI18N
        setBrandNameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                setBrandNameTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                setBrandNameTextFocusLost(evt);
            }
        });
        vehicleBrandDetailsPanel.add(setBrandNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 280, -1));

        nameText6.setBackground(new java.awt.Color(102, 204, 255));
        nameText6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        nameText6.setText("Brand ID : ");
        vehicleBrandDetailsPanel.add(nameText6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        BrandIDText.setName(""); // NOI18N
        BrandIDText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BrandIDTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BrandIDTextFocusLost(evt);
            }
        });
        vehicleBrandDetailsPanel.add(BrandIDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 290, -1));

        vehicleBrandDetailsPanel.add(vBrandIDComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 280, -1));

        mainPanel.add(vehicleBrandDetailsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 1030, 550));

        mainPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBrandBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBrandBtnMouseClicked
        
    }//GEN-LAST:event_addBrandBtnMouseClicked

    private void addBrandBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBrandBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBrandBtnActionPerformed

    private void deleteBrandBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBrandBtnMouseClicked
        
    }//GEN-LAST:event_deleteBrandBtnMouseClicked

    private void deleteBrandBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBrandBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBrandBtnActionPerformed

    private void BrandIDTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BrandIDTextFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BrandIDTextFocusGained

    private void BrandIDTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BrandIDTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BrandIDTextFocusLost

    private void setBrandNameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_setBrandNameTextFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_setBrandNameTextFocusLost

    private void setBrandNameTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_setBrandNameTextFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_setBrandNameTextFocusGained

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
            java.util.logging.Logger.getLogger(VehicleBrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehicleBrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehicleBrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehicleBrand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleBrand().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BrandIDText;
    private javax.swing.JButton addBrandBtn;
    private javax.swing.JTextField brandNameText;
    private javax.swing.JButton deleteBrandBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainPanel1;
    private javax.swing.JLabel nameText3;
    private javax.swing.JLabel nameText5;
    private javax.swing.JLabel nameText6;
    private javax.swing.JTextField setBrandNameText;
    private javax.swing.JComboBox vBrandIDComboBox;
    private javax.swing.JTable vBrandTable;
    private javax.swing.JPanel vehicleBrandDetailsPanel;
    // End of variables declaration//GEN-END:variables
/*private void loadVehicleBrand() {
    try {
        ArrayList<VehicleBrand> vehicleBrandList = StudentController.getAllVehicleBrands();
        for (VehicleBrand vehicleBrand : vehicleBrandList) {
            vehicleBrandComboBox.addItem(VehicleBrandDTO.getVehicleBrandName());
        }
    }*/

    private void asd() {
        int a = 001;
        a++;
        System.out.println(a);
    }
}
