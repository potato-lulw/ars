package com.mycompany.ars;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AddCustomer extends javax.swing.JInternalFrame {

    String url = "jdbc:mysql://localhost:3306/ars"; // Change DB name
    String user = "root";  // Change username
    String password = "12345678"; // Change password

    public AddCustomer() {
        initComponents();
        AutoId();
    }

    public void AutoId() {
        try {
            Connection con;
            PreparedStatement pre;
            Class.forName("com.mysql.cj.jdbc.Driver"); // FIXED: Correct driver name
            con = DriverManager.getConnection(url, user, password);

            String query = "SELECT MAX(CustomerID) FROM customer";
            pre = con.prepareStatement(query);

            ResultSet rs = pre.executeQuery();

            if (rs.next()) { // FIXED: Check if result exists
                String maxId = rs.getString(1); // Use column index instead of name

                if (maxId == null) {
                    CustomerID.setText("CS001");
                } else {
                    int id = Integer.parseInt(maxId.substring(2)); // Extract numeric part
                    id++;
                    CustomerID.setText("CS" + String.format("%03d", id)); // Format with leading zeros
                }
            } else {
                CustomerID.setText("CS001");
            }

            rs.close();
            pre.close();
            con.close(); // Always close connections

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace(); // FIXED: Print errors instead of ignoring them
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FName = new javax.swing.JTextField();
        CustomerID = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LName = new javax.swing.JTextField();
        PassNo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        NatID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Contact = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        Others = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setClosable(true);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setVisible(true);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Customer Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 790, 50);

        jPanel1.setBackground(new java.awt.Color(255, 255, 234));
        jPanel1.setLayout(new java.awt.GridLayout(5, 1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Customer Id");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("First Name");

        FName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameActionPerformed(evt);
            }
        });

        CustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(144, 144, 144))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CustomerID, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(FName))
                .addGap(12, 12, 12))
        );

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Last Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Passport No.");

        LName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNameActionPerformed(evt);
            }
        });

        PassNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PassNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(147, 147, 147))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LName, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(PassNo))
                .addContainerGap())
        );

        jPanel1.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("National Id.");

        NatID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NatIDActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Address");

        Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(NatID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(144, 144, 144))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NatID, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(Address))
                .addContainerGap())
        );

        jPanel1.add(jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Contact");

        Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Gender");

        Male.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Male);
        Male.setText("M");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });

        Female.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Female);
        Female.setText("F");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });

        Others.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Others);
        Others.setText("Others");
        Others.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OthersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(Male)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Female)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Others)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Male)
                    .addComponent(Female)
                    .addComponent(Others))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7);

        jPanel6.setBackground(new java.awt.Color(255, 255, 234));

        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton1.setText("Add Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton2.setText("Cancel");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 50, 790, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNameActionPerformed

    private void CustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerIDActionPerformed

    private void LNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNameActionPerformed

    private void PassNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassNoActionPerformed

    private void NatIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NatIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NatIDActionPerformed

    private void AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressActionPerformed

    private void ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemaleActionPerformed

    private void OthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OthersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OthersActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String CustID = CustomerID.getText();
        String FirstName = FName.getText();
        String LastName = LName.getText();
        String PassportNo = PassNo.getText();
        String NationalID = NatID.getText();
        String Addy = Address.getText();
        String ContactNo = Contact.getText();

        // Determine gender
        String gender = "U"; // Default to "Unknown"
        if (Male.isSelected()) {
            gender = "M";
        } else if (Female.isSelected()) {
            gender = "F";
        } else if (Others.isSelected()) {
            gender = "O";
        }

        Connection con = null;
        PreparedStatement pre = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Fixed driver name
            con = DriverManager.getConnection(url, user, password);

            String query = "INSERT INTO customer (CustomerID, LastName, FirstName, PassportNo, NationalID, Address, Contact, Gender) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            pre = con.prepareStatement(query);

            // Set values for placeholders
            pre.setString(1, CustID);
            pre.setString(2, LastName);
            pre.setString(3, FirstName);
            pre.setString(4, PassportNo);
            pre.setString(5, NationalID);
            pre.setString(6, Addy);
            pre.setString(7, ContactNo);
            pre.setString(8, gender);

            // Execute query
            int rowsInserted = pre.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Customer added successfully!");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Close resources
            try {
                if (pre != null) pre.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, e);
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Contact;
    private javax.swing.JTextField CustomerID;
    private javax.swing.JTextField FName;
    private javax.swing.JRadioButton Female;
    private javax.swing.JTextField LName;
    private javax.swing.JRadioButton Male;
    private javax.swing.JTextField NatID;
    private javax.swing.JRadioButton Others;
    private javax.swing.JTextField PassNo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
