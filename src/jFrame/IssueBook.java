/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrame;

import java.text.SimpleDateFormat;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import net.sourceforge.jdatepicker.JDatePicker;
//import org.jdatepicker.impl.UtilDateModel;
/**
 *
 * @author pc
 */
public class IssueBook extends javax.swing.JFrame {

    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
        initComponents();
        Connect();
    }Connection con;
    PreparedStatement pst;
    public void Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/sahyadri_library_management_system","root","Sahyadri@157");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentRegister.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnissue = new javax.swing.JButton();
        bookid = new javax.swing.JTextField();
        studentid = new javax.swing.JTextField();
        issuedate = new com.toedter.calendar.JDateChooser();
        duedate = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 150, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 0));
        jLabel3.setText("Issue Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 51, 0));
        jLabel4.setText("Due Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 68, -1));

        btnissue.setBackground(new java.awt.Color(153, 51, 0));
        btnissue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnissue.setForeground(new java.awt.Color(255, 255, 255));
        btnissue.setText("Issue");
        btnissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissueActionPerformed(evt);
            }
        });
        getContentPane().add(btnissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 80, 30));

        bookid.setText(" ");
        bookid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 310, 60));

        studentid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        studentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentidActionPerformed(evt);
            }
        });
        getContentPane().add(studentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 310, 60));
        getContentPane().add(issuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 310, 50));
        getContentPane().add(duedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 310, 50));

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/home_24px.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 51, 0));
        jButton2.setText("    Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, 96, 38));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 0));
        jLabel5.setText("Student Issue Book");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 180, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFrame/brownbook_bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 550));

        jButton1.setText("      Back");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 70, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissueActionPerformed
    // Assuming 'Issued' is the default status
    // Assuming you have a valid database connection 'con'
     SimpleDateFormat dtFormat = new SimpleDateFormat("yyyy-MM-dd");
String book_id = bookid.getText();
String student_id = studentid.getText();
String issue_date = dtFormat.format(issuedate.getDate());
String due_date = dtFormat.format(duedate.getDate());

try {
    // Check if the book exists
    PreparedStatement bookCheckStmt = con.prepareStatement("SELECT * FROM BOOKS WHERE book_id = ?");
    bookCheckStmt.setString(1, book_id);
    ResultSet rs = bookCheckStmt.executeQuery();

    if (rs.next()) {
        // Check if the student exists
        PreparedStatement studentCheckStmt = con.prepareStatement("SELECT * FROM STUDENTS WHERE student_id = ?");
        studentCheckStmt.setString(1, student_id);
        ResultSet rs1 = studentCheckStmt.executeQuery();

        if (rs1.next()) {
            // Check if the book is available (quantity > 0)
            int quantity = rs.getInt("quantity");

            if (quantity > 0) {
                // Insert into BOOK_ISSUE table
                PreparedStatement issueStmt = con.prepareStatement("INSERT INTO BOOK_ISSUE (book_id,student_id, issue_date, due_date, status) VALUES (?, ?, ?, ?, ?)");
                issueStmt.setString(1, book_id);
                issueStmt.setString(2, student_id);
                issueStmt.setDate(3, java.sql.Date.valueOf(issue_date)); // Assuming issue_date is in "yyyy-MM-dd" format
issueStmt.setDate(4, java.sql.Date.valueOf(due_date));
                issueStmt.setString(5, "Issued"); // Assuming 'Issued' is the default status

                int rowsInserted = issueStmt.executeUpdate();

                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Book successfully issued");

                    // Update the book quantity in the BOOK table
                    PreparedStatement updateBookQuantityStmt = con.prepareStatement("UPDATE BOOKS SET quantity = quantity - 1 WHERE book_id = ?");
                    updateBookQuantityStmt.setString(1, book_id);
                    updateBookQuantityStmt.executeUpdate();

                    setVisible(false);
                    new IssueBook().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to issue the book");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Book is not available for issue");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect usn");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Incorrect bookID");
    }
} catch (SQLException e) {
JOptionPane.showMessageDialog(null, "Connection Error: " + e.getMessage());
}



    }//GEN-LAST:event_btnissueActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here
        setVisible(false);
         new StaffHome().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void studentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentidActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookid;
    private javax.swing.JButton btnissue;
    private com.toedter.calendar.JDateChooser duedate;
    private com.toedter.calendar.JDateChooser issuedate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField studentid;
    // End of variables declaration//GEN-END:variables
}
