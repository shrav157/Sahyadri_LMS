/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrame;

import java.sql.*;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class FacultyIssueBook extends javax.swing.JFrame {

    
    public FacultyIssueBook() {
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
            
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        bookid = new javax.swing.JTextField();
        facultyid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        issuedate = new com.toedter.calendar.JDateChooser();
        duedate = new com.toedter.calendar.JDateChooser();
        btnissue = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFrame/brownbook_bg.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 150, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book_ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        bookid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookidActionPerformed(evt);
            }
        });
        getContentPane().add(bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 310, 60));

        facultyid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Faculty_ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(facultyid, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 310, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 0));
        jLabel3.setText("Issue Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 78, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 51, 0));
        jLabel4.setText("Due Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 57, -1));
        getContentPane().add(issuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 310, 50));
        getContentPane().add(duedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 310, 50));

        btnissue.setBackground(new java.awt.Color(153, 51, 0));
        btnissue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnissue.setForeground(new java.awt.Color(255, 255, 255));
        btnissue.setText("Issue");
        btnissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissueActionPerformed(evt);
            }
        });
        getContentPane().add(btnissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 90, 30));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 0));
        jLabel5.setText("FACULTY ISSUE BOOK DETAILS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 270, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons/back.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 30));

        jButton1.setBackground(new java.awt.Color(153, 51, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("      Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFrame/brownbook_bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookidActionPerformed

    private void btnissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissueActionPerformed
     SimpleDateFormat dtFormat = new SimpleDateFormat("yyyy-MM-dd");
String book_id = bookid.getText();
String Faculty_id = facultyid.getText();
String issue_date = dtFormat.format(issuedate.getDate());
String due_date = dtFormat.format(duedate.getDate());

try {
    // Check if the book exists
    PreparedStatement bookCheckStmt = con.prepareStatement("SELECT * FROM BOOKS WHERE book_id = ?");
    bookCheckStmt.setString(1, book_id);
    ResultSet rs = bookCheckStmt.executeQuery();

    if (rs.next()) {
        // Check if the student exists
        PreparedStatement facultyCheckStmt = con.prepareStatement("SELECT * FROM faculty WHERE faculty_id = ?");
        facultyCheckStmt.setString(1, Faculty_id);
        ResultSet rs1 = facultyCheckStmt.executeQuery();

        if (rs1.next()) {
            // Check if the book is available (quantity > 0)
            int quantity = rs.getInt("quantity");

            if (quantity > 0) {
                // Insert into BOOK_ISSUE table
                PreparedStatement issueStmt = con.prepareStatement("INSERT INTO BOOK_ISSUE (book_id, faculty_id, issue_date, due_date, status) VALUES (?, ?, ?, ?, ?)");
                issueStmt.setString(1, book_id);
                issueStmt.setString(2, Faculty_id);
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
                    new FacultyIssueBook().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to issue the book");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Book is not available for issue");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect FacultyID");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Incorrect bookID");
    }
} catch (SQLException e) {
JOptionPane.showMessageDialog(null, "Connection Error: " + e.getMessage());
}



// TODO add your handling code here:
    }//GEN-LAST:event_btnissueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
            new StaffHome().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FacultyIssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyIssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyIssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyIssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FacultyIssueBook().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookid;
    private javax.swing.JButton btnissue;
    private com.toedter.calendar.JDateChooser duedate;
    private javax.swing.JTextField facultyid;
    private com.toedter.calendar.JDateChooser issuedate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
