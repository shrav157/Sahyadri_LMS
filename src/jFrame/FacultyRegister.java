/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrame;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author pc
 */
public class FacultyRegister extends javax.swing.JFrame {

    
    public FacultyRegister() {
        initComponents();
        Connect();
    }
      
    Connection con;
    PreparedStatement pst;
    ResultSet rs=null;
    public void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/sahyadri_library_management_system", "root", "Sahyadri@157");
            showRecord();
            allrecords.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    facultyRecordsMouseClicked(evt);
                }
            }); // <-- Missing closing parenthesis here

        } catch (ClassNotFoundException | SQLException ex) {
            // Logger.getLogger(FacultyRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnaddFaculty = new javax.swing.JButton();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        fno = new javax.swing.JTextField();
        branch = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        searchfaculty = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        allrecords = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 150, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/home_24px.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 30, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 51, 0));
        jButton2.setText("    Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 96, 38));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        getContentPane().add(btnaddFaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 110, 40));

        fname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 310, 60));

        lname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 310, 60));

        email.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email_ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 310, 60));

        fno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Faculty Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(fno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 310, 60));

        branch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 310, 60));

        btnupdate.setBackground(new java.awt.Color(153, 51, 0));
        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 110, 40));

        btndelete.setBackground(new java.awt.Color(153, 51, 0));
        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 110, 40));

        btnclear.setBackground(new java.awt.Color(153, 51, 0));
        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 110, 40));
        getContentPane().add(searchfaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 480, 40));

        btnsearch.setBackground(new java.awt.Color(153, 51, 0));
        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 110, 40));

        allrecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Email-Id", "Faculty no", "Branch"
            }
        ));
        jScrollPane1.setViewportView(allrecords);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 830, 130));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFrame/brownbook_bg.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void showRecord() {
    try {
        pst = con.prepareStatement("SELECT fname, lname, emailid, faculty_number, branch FROM faculty");
        rs = pst.executeQuery();
        ResultSetMetaData rsm = rs.getMetaData();
        int n = rsm.getColumnCount();
        DefaultTableModel df = (DefaultTableModel) allrecords.getModel();
        df.setRowCount(0);

        while (rs.next()) {
            Vector obj = new Vector();
            for (int i = 1; i <= n; i++) {
                obj.add(rs.getString(i));
            }
            df.addRow(obj);
        } 
         // Make the table non-editable
        allrecords.setDefaultEditor(Object.class, null);

    } catch (SQLException ex) {
        // Handle the exception
    }
}
 private void facultyRecordsMouseClicked(java.awt.event.MouseEvent evt) {
        // Mouse Clicked on Records Table
        DefaultTableModel model = (DefaultTableModel) allrecords.getModel();
        int selectedRow = allrecords.getSelectedRow();

        if (selectedRow != -1) { // Added a check to ensure a row is selected
            fname.setText(model.getValueAt(selectedRow, 0).toString());
            lname.setText(model.getValueAt(selectedRow, 1).toString());
            email.setText(model.getValueAt(selectedRow, 2).toString());
            fno.setText(model.getValueAt(selectedRow, 3).toString());
            branch.setText(model.getValueAt(selectedRow, 4).toString());
        }
    }
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
     if (facultyExists(FacultyNumber)) {
            JOptionPane.showMessageDialog(this, "Faculty with Faculty Number " + FacultyNumber + " already exists.");
            return;
        }

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
    showRecord();
    }//GEN-LAST:event_btnaddFacultyActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
         new StaffHome().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
         fname.setText("");
        lname.setText("");
        email.setText("");
        fno.setText("");
        branch.setText("");
        allrecords.clearSelection();
    }//GEN-LAST:event_btnclearActionPerformed
     
    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
        String firstName = fname.getText();
        String lastName = lname.getText();
        String emailAddress = email.getText();
        String facultyNumber = fno.getText();
        String facultyBranch = branch.getText();

        pst = con.prepareStatement("UPDATE faculty SET fname=?, lname=?, emailid=?, branch=? WHERE faculty_number=?");
        pst.setString(1, firstName);
        pst.setString(2, lastName);
        pst.setString(3, emailAddress);
        pst.setString(4, facultyBranch);
        pst.setString(5, facultyNumber);

        int rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Record updated successfully");
            showRecord();
        } else {
            JOptionPane.showMessageDialog(this, "Update failed. Faculty member with provided Faculty Number not found.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Update failed! Error: " + ex.getMessage());
        ex.printStackTrace(); // Print stack trace for debugging
    }
    }//GEN-LAST:event_btnupdateActionPerformed
private boolean facultyExists(String faculty_number) throws SQLException {
    try (PreparedStatement pst = con.prepareStatement("SELECT COUNT(*) FROM faculty WHERE faculty_number = ?")) {
        pst.setString(1, faculty_number);
        try (ResultSet rs = pst.executeQuery()) {
            rs.next();
            int count = rs.getInt(1);
            return count > 0;
        }
    }
}

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) allrecords.getModel();
        int selectedRow = allrecords.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a record to delete.");
            return;
        }

        String id = model.getValueAt(selectedRow, 0).toString();

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                pst = con.prepareStatement("DELETE FROM faculty WHERE faculty_number=?");
                pst.setString(1, fno.getText());
                int k = pst.executeUpdate();

                if (k == 1) {
                    JOptionPane.showMessageDialog(this, "Faculty member deleted successfully");
                    fname.setText("");
                    lname.setText("");
                    email.setText("");
                    fno.setText("");
                    branch.setText("");
                    showRecord();
                } else {
                    JOptionPane.showMessageDialog(this, "Deletion failed!!");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Deletion failed! Error: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed
// Add this method to your FacultyRegister class
private boolean hasIssuedBooksForFaculty(String faculty_id) throws SQLException {
    try (PreparedStatement pst = con.prepareStatement("SELECT COUNT(*) FROM BOOK_ISSUE WHERE faculty_id = ?")) {
        pst.setString(1, faculty_id);
        try (ResultSet rs = pst.executeQuery()) {
            rs.next();
            int count = rs.getInt(1);
            return count > 0;
        }
    }
}
    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        String searchText = searchfaculty.getText();
        DefaultTableModel model = (DefaultTableModel) allrecords.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        allrecords.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText));
    }//GEN-LAST:event_btnsearchActionPerformed

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
    private javax.swing.JTable allrecords;
    private javax.swing.JTextField branch;
    private javax.swing.JButton btnaddFaculty;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fno;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField searchfaculty;
    // End of variables declaration//GEN-END:variables
}
