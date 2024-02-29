/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrame;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;
import javax.swing.JOptionPane;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnissue = new javax.swing.JButton();
        bookid = new javax.swing.JTextField();
        studentid = new javax.swing.JTextField();
        duedate = new rojeru_san.componentes.RSDateChooser();
        issuedate = new rojeru_san.componentes.RSDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 46, 37, -1));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 113, 37, -1));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 188, 37, -1));

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 320, 37, -1));

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 110, 37, -1));

        btnissue.setText("Issue");
        btnissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissueActionPerformed(evt);
            }
        });
        getContentPane().add(btnissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 459, -1, -1));
        getContentPane().add(bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 110, 71, -1));
        getContentPane().add(studentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 185, 71, -1));
        getContentPane().add(duedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 391, -1, -1));
        getContentPane().add(issuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 309, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissueActionPerformed
    String BookID = bookid.getText();
String StudentID = studentid.getText();
String DueDate = duedate.getDatoFecha().toString(); // Assuming this gets the selected date
String IssueDate = issuedate.getDatoFecha().toString(); // Assuming this gets the selected date

String Status = "Issued";
//
//if (bookid.isEmpty() || studentid.isEmpty() || duedate == null || issuedate == null) {
//    JOptionPane.showMessageDialog(this, "Please fill in all fields and select dates before issuing the book.");
//    return;
//}

try {
    // Check if the book exists and is available
    PreparedStatement bookCheckStmt = con.prepareStatement("SELECT * FROM books WHERE book_id = ? AND status = 'Available'");
    bookCheckStmt.setString(1, BookID);
    ResultSet bookCheckResult = bookCheckStmt.executeQuery();

    if (!bookCheckResult.next()) {
        JOptionPane.showMessageDialog(this, "Book not available for issuing. Check the book ID.");
        return;
    }

    // Check if the student exists
    PreparedStatement studentCheckStmt = con.prepareStatement("SELECT * FROM students WHERE studentid = ?");
    studentCheckStmt.setString(1, StudentID);
    ResultSet studentCheckResult = studentCheckStmt.executeQuery();

    if (!studentCheckResult.next()) {
        JOptionPane.showMessageDialog(this, "Student not found. Check the student ID.");
        return;
    }

    // Proceed with issuing the book
    pst = con.prepareStatement("INSERT INTO issued_books(book_id, student_id, due_date, issue_date, status) VALUES(?,?,?,?,?,?)");
    pst.setString(1, BookID);
    pst.setString(2, StudentID);
    pst.setString(4, DueDate);
    pst.setString(5, IssueDate);
    pst.setString(6, Status);

    int k = pst.executeUpdate();

    if (k == 1) {
        // Update the book status to 'Issued' in the books table
        PreparedStatement updateBookStatusStmt = con.prepareStatement("UPDATE books SET status = 'Issued' WHERE bookid = ?");
        updateBookStatusStmt.setString(1, BookID);
        updateBookStatusStmt.executeUpdate();

        JOptionPane.showMessageDialog(this, "Book Issued Successfully");
        bookid.setText("");
        studentid.setText("");
        duedate.setDatoFecha(null);
        issuedate.setDatoFecha(null);
    } else {
        JOptionPane.showMessageDialog(this, "Issuing Book Failed!!");
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Issuing Book Failed! Error: " + ex.getMessage());
    Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
}

        
        
    }//GEN-LAST:event_btnissueActionPerformed

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
    private rojeru_san.componentes.RSDateChooser duedate;
    private rojeru_san.componentes.RSDateChooser issuedate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField studentid;
    // End of variables declaration//GEN-END:variables
}
