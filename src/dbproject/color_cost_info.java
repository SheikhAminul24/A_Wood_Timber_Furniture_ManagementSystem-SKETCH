/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AMINUL
 */
public class color_cost_info extends javax.swing.JFrame {

    /**
     * Creates new form color_cost
     */
    public color_cost_info() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        insertBtn1 = new javax.swing.JButton();
        updateBtn1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        backBtn1 = new javax.swing.JButton();
        showBtn1 = new javax.swing.JButton();
        delBtn1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setText("Color Cost Information");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 26, -1, 50));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel8.setText("colorName");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 113, 158, 37));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel9.setText("c_netAmount");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 162, 158, 37));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel10.setText("c_unitPrice");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 223, 148, 37));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel11.setText("requiredBurnish");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 272, 180, 37));

        jTextField4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 270, 347, 37));

        jTextField3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 220, 347, 37));

        jTextField2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 169, 347, 40));

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 110, 347, 47));

        insertBtn1.setBackground(new java.awt.Color(51, 51, 51));
        insertBtn1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        insertBtn1.setForeground(new java.awt.Color(255, 153, 0));
        insertBtn1.setText("INSERT");
        insertBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(insertBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 110, 121, 40));

        updateBtn1.setBackground(new java.awt.Color(51, 51, 51));
        updateBtn1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        updateBtn1.setForeground(new java.awt.Color(255, 153, 0));
        updateBtn1.setText("UPDATE");
        updateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 176, 121, 40));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "color_code", "colorName", "c_netAmount", "c_unitPrice", "requiredBurnish"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 371, 991, 243));

        backBtn1.setBackground(new java.awt.Color(51, 51, 51));
        backBtn1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        backBtn1.setForeground(new java.awt.Color(255, 153, 0));
        backBtn1.setText("BACK");
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 694, 106, 40));

        showBtn1.setBackground(new java.awt.Color(51, 51, 51));
        showBtn1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        showBtn1.setForeground(new java.awt.Color(255, 153, 0));
        showBtn1.setText("SHOW INFORMATION");
        showBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(showBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 694, 306, 40));

        delBtn1.setBackground(new java.awt.Color(51, 51, 51));
        delBtn1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        delBtn1.setForeground(new java.awt.Color(255, 153, 0));
        delBtn1.setText("DELETE");
        delBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(delBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 245, 123, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbproject/pic2.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void insertBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtn1ActionPerformed
        if(jTextField1.getText().equals("")||jTextField2.getText().equals("")||jTextField3.getText().equals("")||jTextField4.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Fill all the fields !!");
        }
        else{
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=sketch;selectMethod=cursor", "sa", "123456");

                String query = "insert into colorCost(colorName,c_netAmount,c_unitPrice,requiredBurnish)values(?,?,?,?)";
                PreparedStatement ps =  connection.prepareStatement(query);
                ps.setString(1, jTextField1.getText());
                ps.setString(2, jTextField2.getText());
                ps.setString(3, jTextField3.getText());
                ps.setString(4, jTextField4.getText());

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Inserted Successfully");

            }

            catch (Exception e) {
                e.printStackTrace();

            }
        }
    }//GEN-LAST:event_insertBtn1ActionPerformed

    private void updateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn1ActionPerformed
        JOptionPane.showMessageDialog(null, "Update by color code!");
        new  color_cost_update().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_updateBtn1ActionPerformed

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        cost_frame obj = new cost_frame();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtn1ActionPerformed

    private void showBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtn1ActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=sketch;selectMethod=cursor", "sa", "123456");

            Statement st = connection.createStatement();
            String query1 = "SELECT * FROM  colorCost";
            PreparedStatement pst =  connection.prepareStatement(query1);
            ResultSet rs=pst.executeQuery();
            DefaultTableModel dt =(DefaultTableModel)jTable1.getModel();
            dt.setRowCount(0);
            while(rs.next()){
                Object o[] = {rs.getInt("color_code"),rs.getString("colorName"),rs.getBigDecimal("c_netAmount") ,rs.getBigDecimal("c_unitPrice"),rs.getString("requiredBurnish"),} ;
                dt.addRow(o);
            }
        }

        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_showBtn1ActionPerformed

    private void delBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtn1ActionPerformed
        new  color_cost_delete().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_delBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(color_cost_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(color_cost_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(color_cost_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(color_cost_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new color_cost_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn1;
    private javax.swing.JButton delBtn1;
    private javax.swing.JButton insertBtn1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton showBtn1;
    private javax.swing.JButton updateBtn1;
    // End of variables declaration//GEN-END:variables
}
