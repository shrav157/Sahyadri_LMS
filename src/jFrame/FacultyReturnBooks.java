/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrame;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
/**
 *
 * @author pc
 */
public class FacultyReturnBooks extends javax.swing.JFrame {

    /**
     * Creates new form FacultyReturnBooks
     */
    public FacultyReturnBooks() {
        initComponents();
        try {
            Connect();
        } catch (SQLException ex) {
            Logger.getLogger(FacultyReturnBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
        }  Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public void Connect() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sahyadri_library_management_system", "root", "Sahyadri@157");

        } catch (ClassNotFoundException | SQLException ex) {  // Fix the try-catch block
//            Logger.getLogger(ReturnBooks.class.getName()).log(Level.SEVERE, null, ex);
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

        Fine_Paid = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JButton();
        bookid = new javax.swing.JTextField();
        facultyid = new javax.swing.JTextField();
        issuedate = new com.toedter.calendar.JDateChooser();
        duedate = new com.toedter.calendar.JDateChooser();
        returndate = new com.toedter.calendar.JDateChooser();
        Yes = new javax.swing.JRadioButton();
        No = new javax.swing.JRadioButton();
        btnSearch = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 150, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 51, 0));
        jLabel4.setText("Issue Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 0));
        jLabel5.setText("Due Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 80, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 51, 0));
        jLabel6.setText("Return Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 80, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 51, 0));
        jLabel7.setText("Fine Paid");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 70, -1));

        btnsubmit.setBackground(new java.awt.Color(153, 51, 0));
        btnsubmit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnsubmit.setText("Return");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 80, 30));

        bookid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        bookid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookidActionPerformed(evt);
            }
        });
        getContentPane().add(bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 310, 60));

        facultyid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Faculty ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(facultyid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 310, 60));
        getContentPane().add(issuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 310, 50));
        getContentPane().add(duedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 310, 50));
        getContentPane().add(returndate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 310, 50));

        Fine_Paid.add(Yes);
        Yes.setText("Yes");
        getContentPane().add(Yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 98, -1));

        Fine_Paid.add(No);
        No.setText("No");
        getContentPane().add(No, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 98, -1));

        btnSearch.setBackground(new java.awt.Color(153, 51, 0));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("  Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 80, 40));

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/home_24px.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 30));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("Faculty Return Book");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFrame/brownbook_bg.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookidActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
          String bookID = bookid.getText();
        String facultyID = facultyid.getText();

try {
    
      PreparedStatement bookIssueCheckStmt = con.prepareStatement("SELECT * FROM book_issue WHERE book_id = ? AND faculty_id = ?");
    bookIssueCheckStmt.setString(1, bookID);
    bookIssueCheckStmt.setString(2, facultyID);
    ResultSet rs = bookIssueCheckStmt.executeQuery();
// Assuming 'issuedate' and 'duedate' are instances of com.toedter.calendar.JDateChooser
if (rs.next()) {
    // Book is issued to this account
    java.sql.Date issueDate = rs.getDate("issue_date");
    java.sql.Date dueDate = rs.getDate("due_date");

    issuedate.setDate(issueDate);
    duedate.setDate(dueDate);

    bookid.setEditable(false);
    facultyid.setEditable(false);
} else {
    // Book is not issued to this account
    JOptionPane.showMessageDialog(null, "Book is not issued to this account");

    // Clear the dates
    issuedate.setDate(null);
    duedate.setDate(null);

    // Make the text fields editable
    bookid.setEditable(true);
    facultyid.setEditable(true);
}

  
} catch (SQLException e) {
           // Handle the SQL exception separately from Exception

} 
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
              SimpleDateFormat dtFormat = new SimpleDateFormat("yyyy-MM-dd");
String bookID = bookid.getText();
String facultyID = facultyid.getText();

try {
    // Assuming 'returndate' is a JTextField where you get the return date
    String return_date = dtFormat.format(returndate.getDate());

    // Update book_issue table status to "Due"
    String updateStatusQuery = "UPDATE book_issue SET status='Due' WHERE faculty_id=? AND book_id=?";
    pst = con.prepareStatement(updateStatusQuery);
    pst.setString(1, facultyID);
    pst.setString(2, bookID);

    int rowsUpdatedStatus = pst.executeUpdate();

    if (rowsUpdatedStatus > 0) {
        // Status updated to "Due"

        // Calculate fine if the book is returned after the due date
        String dueDateQuery = "SELECT due_date FROM book_issue WHERE faculty_id=? AND book_id=?";
        pst = con.prepareStatement(dueDateQuery);
        pst.setString(1, facultyID);
        pst.setString(2, bookID);
        ResultSet dueDateResult = pst.executeQuery();

        if (dueDateResult.next()) {
            java.sql.Date dueDate = dueDateResult.getDate("due_date");

            // Compare return date with due date
            if (returndate.getDate() != null && returndate.getDate().after(dueDate)) {
                long daysLate = (returndate.getDate().getTime() - dueDate.getTime()) / (24 * 60 * 60 * 1000);
                double fineAmount = daysLate * 4.0; // Assuming Rs. 4 per day fine

                // Display fine in a dialog box
                JOptionPane.showMessageDialog(null, "Book returned late! Fine: Rs. " + fineAmount);

                // Update fine_amount in the book_issue table
                String updateFineQuery = "UPDATE book_issue SET fine_amount=? WHERE faculty_id=? AND book_id=?";
                pst = con.prepareStatement(updateFineQuery);
                pst.setDouble(1, fineAmount);
                pst.setString(2, facultyID);
                pst.setString(3, bookID);
                int rowsUpdatedFine = pst.executeUpdate();

                if (rowsUpdatedFine > 0) {
                    // Fine amount updated in the book_issue table

                    // Check if fine is paid
                    // Assuming FinePaidYes and FinePaidNo are your JRadioButtons
    
                        ButtonGroup finePaidGroup = new ButtonGroup();
finePaidGroup.add(Yes);  // Assuming FinePaidYes is the radio button for "Yes"
finePaidGroup.add(No);   // Assuming FinePaidNo is the radio button for "No"

// Now, retrieve the selected value
String finePaid = Yes.isSelected() ? "Yes" : "No";
                

                    // Update fine_paid and status in the book_issue table
                    String updateIssueQuery = "UPDATE book_issue SET status='Returned', return_date=?, fine_paid=? WHERE faculty_id=? AND book_id=?";
                    pst = con.prepareStatement(updateIssueQuery);
                    pst.setString(1, return_date);
                    pst.setString(2, finePaid); 
                    pst.setString(3, facultyID);
                    pst.setString(4, bookID);

                    int rowsUpdatedIssue = pst.executeUpdate();

                    if (rowsUpdatedIssue > 0) {
                        // Book successfully returned in book_issue table

                        // Update quantity in book table
                        String updateBookQuery = "UPDATE books SET quantity = quantity + 1 WHERE book_id=?";
                        pst = con.prepareStatement(updateBookQuery);
                        pst.setString(1, bookID);

                        int rowsUpdatedBook = pst.executeUpdate();

                        if (rowsUpdatedBook > 0) {
                            // Quantity updated in the book table

                            JOptionPane.showMessageDialog(null, "Book successfully returned");

                            // Hide the current window and open the returnBook window
                            setVisible(false);
                            new ReturnBooks().setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Failed to update book quantity.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Failed to update book_issue table.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to update fine_amount in the book_issue table.");
                }
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Failed to update status to 'Due'.");
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Connection Error: " + e.getMessage());
}
                // TODO add your handling code here:
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
         new StaffHome().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FacultyReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FacultyReturnBooks().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Fine_Paid;
    private javax.swing.JRadioButton No;
    private javax.swing.JRadioButton Yes;
    private javax.swing.JTextField bookid;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnsubmit;
    private com.toedter.calendar.JDateChooser duedate;
    private javax.swing.JTextField facultyid;
    private com.toedter.calendar.JDateChooser issuedate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser returndate;
    // End of variables declaration//GEN-END:variables
}
