
package com.mycompany.ars;


public class SignUpFrame extends javax.swing.JFrame {

   
    public SignUpFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Right1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Left1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel2.setLayout(null);

        Right1.setBackground(new java.awt.Color(0, 0, 0));
        Right1.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\ompat\\OneDrive\\Desktop\\airline reservation system\\ARS\\src\\icon\\airlines-company-logo-1C11D40F16-seeklogo.com.png")); // NOI18N

        javax.swing.GroupLayout Right1Layout = new javax.swing.GroupLayout(Right1);
        Right1.setLayout(Right1Layout);
        Right1Layout.setHorizontalGroup(
            Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Right1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(72, 72, 72))
        );
        Right1Layout.setVerticalGroup(
            Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel7)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jPanel2.add(Right1);
        Right1.setBounds(0, 0, 400, 500);

        Left1.setBackground(new java.awt.Color(255, 255, 255));
        Left1.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("SIGN UP");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Email");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Password");

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Sign Up");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel11.setText("Have an account?");

        jButton4.setText("Login");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Left1Layout = new javax.swing.GroupLayout(Left1);
        Left1.setLayout(Left1Layout);
        Left1Layout.setHorizontalGroup(
            Left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(Left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel8))
                    .addGroup(Left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jTextField3)
                        .addComponent(jPasswordField2)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
            .addGroup(Left1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Left1Layout.setVerticalGroup(
            Left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(Left1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jLabel11))
                .addGap(40, 40, 40))
        );

        jPanel2.add(Left1);
        Left1.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        LoginFrame Login = new LoginFrame();
        Login.setVisible(true);
        Login.pack();
        Login.setLocationRelativeTo(null); // center
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left1;
    private javax.swing.JPanel Right1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
