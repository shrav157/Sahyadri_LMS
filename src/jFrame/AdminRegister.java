package jFrame;

import jFrame.AdminLogin;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public final class AdminRegister extends javax.swing.JFrame {

   
    public AdminRegister() {
        initComponents();
        Connect();
    }

    Connection con;
    PreparedStatement pst;
    public void Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/sahyadri_library_management_system", "root", "Sahyadri@157");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AdminRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Sname = new javax.swing.JTextField();
        Semail = new javax.swing.JTextField();
        Susername = new javax.swing.JTextField();
        Spassword = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLabel1.setText("Register as Staff");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        Sname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Name", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 10), new java.awt.Color(204, 204, 204))); // NOI18N
        Sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SnameActionPerformed(evt);
            }
        });
        getContentPane().add(Sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 310, 50));

        Semail.setBorder(javax.swing.BorderFactory.createTitledBorder("Email"));
        Semail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemailActionPerformed(evt);
            }
        });
        getContentPane().add(Semail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 330, 60));

        Susername.setBorder(javax.swing.BorderFactory.createTitledBorder("Username"));
        getContentPane().add(Susername, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 330, 50));

        Spassword.setBorder(javax.swing.BorderFactory.createTitledBorder("Password"));
        getContentPane().add(Spassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 340, 50));

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, -1));

        jLabel6.setText("Already registered?? ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFrame/bg4.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1010, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        try {
            // TODO add your handling code here:
            String name = Sname.getText();
            String email = Semail.getText();
            String user = Susername.getText();
            String pass = new String(Spassword.getPassword());
            
              // Simple validation: Check if any of the fields are empty
        if (name.isEmpty() || email.isEmpty() || user.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields before registering.");
            return;  // Stop the registration process if any field is empty
        }
            
            pst = con.prepareStatement("INSERT INTO library_staff(sname,semail,susername,spassword)VALUES(?,?,?,?)");
            pst.setString(1,name);
            pst.setString(2,email);
            pst.setString(3,user);
            pst.setString(4,pass);
            
            int k=pst.executeUpdate();
            System.out.println("Rows affected: " + k);
            if(k==1){
                JOptionPane.showMessageDialog(this,"You have Succesfully Registered!!");
                Sname.setText("");
                Semail.setText("");
                Susername.setText("");
                Spassword.setText("");
            }
            else{
                 JOptionPane.showMessageDialog(this,"Registration Failed!!");
            }
        } 
    catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Registration Failed!! Error: " + ex.getMessage());
}

        
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void SemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SemailActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        new AdminLogin().setVisible(true);
    }//GEN-LAST:event_btnloginActionPerformed

    private void SnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SnameActionPerformed

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
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminRegister().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Semail;
    private javax.swing.JTextField Sname;
    private javax.swing.JPasswordField Spassword;
    private javax.swing.JTextField Susername;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
