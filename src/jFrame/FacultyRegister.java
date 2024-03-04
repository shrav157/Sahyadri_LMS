/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrame;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author pc
 */
public class FacultyRegister extends javax.swing.JFrame {

    /**
     * Creates new form FacultyRegister
     */
    public FacultyRegister() {
        initComponents();
        Connect();
    }
      
    Connection con;
    PreparedStatement pst;
    public void Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/sahyadri_library_management_system","root","Sahyadri@157");
        } catch (ClassNotFoundException | SQLException ex) {
//            Logger.getLogger(FacultyRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel1 = new javax.swing.JLabel();
        btnaddFaculty = new javax.swing.JButton();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        fno = new javax.swing.JTextField();
        branch = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("Add Faculty");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 170, 30));

        btnaddFaculty.setBackground(new java.awt.Color(153, 51, 0));
        btnaddFaculty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnaddFaculty.setForeground(new java.awt.Color(255, 255, 255));
        btnaddFaculty.setText("Add Faculty");
        btnaddFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddFacultyActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddFaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 110, 40));

        fname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 310, 50));

        lname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 310, 50));

        email.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email_ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 310, 50));

        fno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Faculty Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(fno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 310, 50));

        branch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 310, 50));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFrame/brownbook_bg.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddFacultyActionPerformed
        // TODO add your handling code here:
        String First = fname.getText();
String Last = lname.getText();
String Email = email.getText();
String FacultyNumber = fno.getText();
String FacultyBranch = branch.getText();

if (fname.getText().isEmpty() || lname.getText().isEmpty() || email.getText().isEmpty()
        || fno.getText().isEmpty() || branch.getText().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please fill in all fields before registering.");
    return;  // Stop the registration process if any field is empty
}

try {
    pst = con.prepareStatement("INSERT INTO faculty(fname, lname, emailid, faculty_number, branch) VALUES(?,?,?,?,?)");
    pst.setString(1, First);
    pst.setString(2, Last);
    pst.setString(3, Email);
    pst.setString(4, FacultyNumber);
    pst.setString(5, FacultyBranch);

    int k = pst.executeUpdate();
    System.out.println("Rows affected: " + k);

    if (k == 1) {
        JOptionPane.showMessageDialog(this, "Faculty member registered successfully");
        fname.setText("");
        lname.setText("");
        email.setText("");
        fno.setText("");
        branch.setText("");
    } else {
        JOptionPane.showMessageDialog(this, "Registration failed!!");
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Registration failed! Error: " + ex.getMessage());
//    Logger.getLogger(FacultyRegister.class.getName()).log(Level.SEVERE, null, ex);
}

    }//GEN-LAST:event_btnaddFacultyActionPerformed

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
            java.util.logging.Logger.getLogger(FacultyRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacultyRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField branch;
    private javax.swing.JButton btnaddFaculty;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    // End of variables declaration//GEN-END:variables
}
