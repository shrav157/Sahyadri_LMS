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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jLabel2.setText("Book ID");

        jLabel3.setText("Faculty ID");

        jLabel4.setText("Issue Date");

        jLabel5.setText("due date");

        jLabel6.setText("retrun date");

        jLabel7.setText("Fine Paid");

        btnsubmit.setText("Return");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        bookid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookidActionPerformed(evt);
            }
        });

        Fine_Paid.add(Yes);
        Yes.setText("Yes");

        Fine_Paid.add(No);
        No.setText("No");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(133, 133, 133)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Yes, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)
                                        .addComponent(No, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(duedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(issuedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(facultyid, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(returndate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(btnsubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearch)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(facultyid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4))
                    .addComponent(issuedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(duedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returndate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Yes)
                            .addComponent(No))
                        .addGap(32, 32, 32)))
                .addComponent(btnsubmit)
                .addGap(49, 49, 49))
        );

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private com.toedter.calendar.JDateChooser returndate;
    // End of variables declaration//GEN-END:variables
}