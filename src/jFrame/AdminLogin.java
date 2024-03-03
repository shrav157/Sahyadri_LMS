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
        setSize(new java.awt.Dimension(700, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STAFF LOGIN PAGE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 410, 40));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 62, -1));

        Susername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Susername.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        Susername.setCaretColor(new java.awt.Color(255, 255, 255));
        Susername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Susername.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Susername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SusernameActionPerformed(evt);
            }
        });
        getContentPane().add(Susername, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 310, -1));
        Susername.getAccessibleContext().setAccessibleName("Username");

        Spassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        Spassword.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Spassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Spassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 310, -1));

        btnalogin.setBackground(new java.awt.Color(153, 51, 0));
        btnalogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnalogin.setForeground(new java.awt.Color(255, 255, 255));
        btnalogin.setText("Login");
        btnalogin.setBorder(new javax.swing.border.MatteBorder(null));
        btnalogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnalogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 150, 30));

        jLabel4.setText("New Here? Register First");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 170, -1));

        btnSregister.setBackground(new java.awt.Color(153, 51, 0));
        btnSregister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSregister.setForeground(new java.awt.Color(255, 255, 255));
        btnSregister.setText("Register");
        btnSregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSregisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnSregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFrame/brownbook_bg.png"))); // NOI18N
        jLabel3.setText("jLabel3");
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

    private void SpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpasswordActionPerformed

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
