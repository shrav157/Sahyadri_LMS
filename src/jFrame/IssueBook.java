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
import net.sourceforge.jdatepicker.JDatePicker;
import org.jdatepicker.impl.UtilDateModel;
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
        jLabel4 = new javax.swing.JLabel();
        btnissue = new javax.swing.JButton();
        bookid = new javax.swing.JTextField();
        studentid = new javax.swing.JTextField();
        issuedate = new com.toedter.calendar.JDateChooser();
        duedate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Book ID");

        jLabel2.setText("Student ID");

        jLabel3.setText("Issue Date");

        jLabel4.setText("Due Date");

        btnissue.setText("Issue");
        btnissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissueActionPerformed(evt);
            }
        });

        bookid.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnissue))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(duedate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(issuedate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(studentid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(studentid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(issuedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(duedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnissue)
                .addContainerGap(122, Short.MAX_VALUE))
        );

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
                PreparedStatement issueStmt = con.prepareStatement("INSERT INTO BOOK_ISSUE (book_id, student_id, issue_date, due_date, status) VALUES (?, ?, ?, ?, ?)");
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
            JOptionPane.showMessageDialog(null, "Incorrect studentID");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Incorrect bookID");
    }
} catch (SQLException e) {
JOptionPane.showMessageDialog(null, "Connection Error: " + e.getMessage());
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
    private com.toedter.calendar.JDateChooser duedate;
    private com.toedter.calendar.JDateChooser issuedate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField studentid;
    // End of variables declaration//GEN-END:variables
}
