package jFrame;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public final class AdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
        initComponents();
        try {
            Connect();
        } catch (SQLException ex) {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public void Connect() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sahyadri_library_management_system", "root", "Sahyadri@157");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Susername = new javax.swing.JTextField();
        Spassword = new javax.swing.JPasswordField();
        btnalogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnSregister = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setSize(new java.awt.Dimension(1980, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("STAFF LOGIN PAGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 130, 20));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 62, -1));

        Susername.setBackground(new java.awt.Color(204, 204, 204));
        Susername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Susername.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        Susername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Susername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SusernameActionPerformed(evt);
            }
        });
        getContentPane().add(Susername, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 310, -1));

        Spassword.setBackground(new java.awt.Color(255, 51, 51));
        Spassword.setBorder(javax.swing.BorderFactory.createTitledBorder("Password"));
        getContentPane().add(Spassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 310, -1));

        btnalogin.setText("Login");
        btnalogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnalogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 150, 30));

        jLabel4.setText("New Here? Register First");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 170, -1));

        btnSregister.setText("Register");
        btnSregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSregisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnSregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFrame/cream_bg.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SusernameActionPerformed

    private void btnaloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaloginActionPerformed
        try {
            // TODO add your handling code here:
            String user =Susername.getText();
            String pwd = new String(Spassword.getPassword());
            
            pst = con.prepareStatement("SELECT * FROM LIBRARY_STAFF WHERE susername = ? AND spassword = ?");
            pst.setString(1, user);
            pst.setString(2, pwd);
            rs = pst.executeQuery();
            
            if (rs.next()) {
                new StaffHome().setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Username or Password is Incorrect");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnaloginActionPerformed

    private void btnSregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSregisterActionPerformed
        // TODO add your handling code here:
         new AdminRegister().setVisible(true);
    }//GEN-LAST:event_btnSregisterActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Spassword;
    private javax.swing.JTextField Susername;
    private javax.swing.JButton btnSregister;
    private javax.swing.JButton btnalogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
