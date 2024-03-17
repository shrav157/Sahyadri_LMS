/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrame;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author pc
 */
public class StudentRegister extends javax.swing.JFrame {

    /**
     * Creates new form StudentRegister
     */
    public StudentRegister() {
        initComponents();
        Connect();
    }
    Connection con;
    Statement st=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
    public void Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/sahyadri_library_management_system","root","Sahyadri@157");
            showRecord();
            AllRecords.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        studentRecordsMouseClicked(evt);
    }
});

            // Add this code inside your constructor, after initComponents()


        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnStudent = new javax.swing.JButton();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phonenumber = new javax.swing.JTextField();
        usn = new javax.swing.JTextField();
        branch = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        searchrecords = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllRecords = new javax.swing.JTable();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 150, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("Add Students");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        btnStudent.setBackground(new java.awt.Color(153, 51, 0));
        btnStudent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnStudent.setText("Add Student");
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btnStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 110, 40));

        fname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 310, 60));

        lname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 310, 60));

        email.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 310, 60));

        phonenumber.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phone No.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 310, 60));

        usn.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "USN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        usn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usnActionPerformed(evt);
            }
        });
        getContentPane().add(usn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 310, 60));

        branch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchActionPerformed(evt);
            }
        });
        getContentPane().add(branch, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 310, 60));

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/home_24px.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 51, 0));
        jButton2.setText("    Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, 96, 38));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 50));
        getContentPane().add(searchrecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 600, 50));

        btnsearch.setBackground(new java.awt.Color(153, 51, 0));
        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 600, 120, 50));

        AllRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First name", "Last name", "Email Id", "Phone no.", "USN", "Branch"
            }
        ));
        jScrollPane1.setViewportView(AllRecords);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, 730, 130));

        btnupdate.setBackground(new java.awt.Color(153, 51, 0));
        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, -1, -1));

        btndelete.setBackground(new java.awt.Color(153, 51, 0));
        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, -1, -1));

        btnclear.setBackground(new java.awt.Color(153, 51, 0));
        btnclear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFrame/brownbook_bg.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void branchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_branchActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed
     public void showRecord() {
    try {
        pst = con.prepareStatement("SELECT fname, lname, email, phonenumber, usn, branch FROM STUDENTS");
        rs = pst.executeQuery();
        ResultSetMetaData rsm = rs.getMetaData();
        int n = rsm.getColumnCount();
        DefaultTableModel df = (DefaultTableModel) AllRecords.getModel();
        df.setRowCount(0);

        while (rs.next()) {
            Vector obj = new Vector();
            for (int i = 1; i <= n; i++) {
                obj.add(rs.getString(i));
            }
            df.addRow(obj);
        } // Make the table non-editable
        AllRecords.setDefaultEditor(Object.class, null);

    } catch (SQLException ex) {
        // Handle the exception
    }
}


    
    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        // TODO add your handling code here:
        String First = fname.getText();
        String Last = lname.getText();
        String Email = email.getText();
        String Phone = phonenumber.getText();
        String USN = usn.getText();
        String Branch = branch.getText();
         if (fname.getText().isEmpty() || lname.getText().isEmpty() || email.getText().isEmpty()
                || phonenumber.getText().isEmpty() || usn.getText().isEmpty() || branch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields before registering.");
            return;  // Stop the registration process if any field is empty
        }
        try {
             if (isUSNExists(USN)) {
            JOptionPane.showMessageDialog(this, "A student with this USN already exists.");
            return;  // Stop the registration process if the USN already exists
        }
    pst = con.prepareStatement("INSERT INTO students(fname, lname, email, phonenumber, usn, branch) VALUES(?,?,?,?,?,?)");
            pst.setString(1,First);
            pst.setString(2,Last);
             pst.setString(3,Email);
              pst.setString(4,Phone);
               pst.setString(5,USN);
                pst.setString(6,Branch);
                int k=pst.executeUpdate();
                System.out.println("ROws aaffected:"+k);
                if(k==1){
                    JOptionPane.showMessageDialog(this,"You have Registered Succesfully");
                    fname.setText("");
                     lname.setText("");
                     email.setText("");
                     phonenumber.setText("");
                     usn.setText("");
                      branch.setText("");
              }else
                {
                    JOptionPane.showMessageDialog(this,"Registation Failed!!");
                }
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Registration Failed! Error"+ex.getMessage());
            Logger.getLogger(StudentRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
        showRecord();
        
        
    }//GEN-LAST:event_btnStudentActionPerformed
private boolean isUSNExists(String usn) throws SQLException {
    // Check if the USN already exists in the database
    pst = con.prepareStatement("SELECT COUNT(*) FROM students WHERE usn = ?");
    pst.setString(1, usn);
    rs = pst.executeQuery();
    rs.next();
    int count = rs.getInt(1);
    return count > 0;
}
    private void usnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         new StaffHome().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
         try {
        if (hasIssuedBooksForStudent(usn.getText())) {
            JOptionPane.showMessageDialog(this, "Student has issued books. Cannot update until books are returned.");
            return;
        }

        pst = con.prepareStatement("UPDATE STUDENTS SET fname=?, lname=?, email=?, phonenumber=?, branch=? WHERE usn=?");
        pst.setString(1, fname.getText());
        pst.setString(2, lname.getText());
        pst.setString(3, email.getText());
        pst.setString(4, phonenumber.getText());
        pst.setString(5, branch.getText());
        pst.setString(6, usn.getText());

        int rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Record updated successfully");
            showRecord();
        } else {
            JOptionPane.showMessageDialog(this, "Update failed. Student with provided USN not found.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Update failed! Error: " + ex.getMessage());
        Logger.getLogger(StudentRegister.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
         try {
            String usnValue = usn.getText();
            if (usnValue.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter the USN for deletion.");
                return;
            }

            // Validate if the student has issued a book
            if (hasIssuedBooksForStudent(usnValue)) {
                JOptionPane.showMessageDialog(this, "Student has issued books. Cannot delete.");
                return;
            }

            String query = "DELETE FROM students WHERE usn=?";
            try (PreparedStatement pst = con.prepareStatement(query)) {
                pst.setString(1, usn.getText());

                int rowsAffected = pst.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Record deleted successfully");
                    showRecord(); // Refresh the table after deleting
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(this, "Deletion failed. Student with provided USN not found.");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Deletion failed! Error: " + ex.getMessage());
            Logger.getLogger(StudentRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

       private boolean hasIssuedBooksForStudent(String student_id) throws SQLException {
    pst = con.prepareStatement("SELECT COUNT(*) FROM BOOK_ISSUE WHERE student_id = ?");
    pst.setString(1, student_id);
    rs = pst.executeQuery();
    rs.next();
    int count = rs.getInt(1);
    return count > 0;
}

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        fname.setText("");
        lname.setText("");
        email.setText("");
        phonenumber.setText("");
        usn.setText("");
        branch.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel ob=(DefaultTableModel) AllRecords.getModel();
            TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(ob);
            AllRecords.setRowSorter(obj);
            obj.setRowFilter(RowFilter.regexFilter(searchrecords.getText()));
    }//GEN-LAST:event_btnsearchActionPerformed
    private void studentRecordsMouseClicked(java.awt.event.MouseEvent evt) {
    int rowIndex = AllRecords.getSelectedRow();

    DefaultTableModel model = (DefaultTableModel) AllRecords.getModel();
    System.out.println("Selected Row Index: " + rowIndex);
    for (int i = 0; i < model.getColumnCount(); i++) {
        System.out.println(model.getColumnName(i) + ": " + model.getValueAt(rowIndex, i));
    }
    fname.setText(model.getValueAt(rowIndex, 0).toString());
    lname.setText(model.getValueAt(rowIndex, 1).toString());
    email.setText(model.getValueAt(rowIndex, 2).toString());
    phonenumber.setText(model.getValueAt(rowIndex, 3).toString());
    usn.setText(model.getValueAt(rowIndex, 4).toString());
    branch.setText(model.getValueAt(rowIndex, 5).toString());
}


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
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new StudentRegister().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AllRecords;
    private javax.swing.JTextField branch;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField phonenumber;
    private javax.swing.JTextField searchrecords;
    private javax.swing.JTextField usn;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
