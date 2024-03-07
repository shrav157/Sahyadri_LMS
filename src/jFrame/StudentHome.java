/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrame;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.Vector;


/**
 *
 * @author pc
 */
public final class StudentHome extends javax.swing.JFrame {
    Connection con=null;
        Statement st=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
    
        

    /**
     * Creates new form StudentHome
     * @param loggedInStudentID
     */
    public StudentHome(String loggedInStudentID) throws SQLException {
        try {
            initComponents();

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sahyadri_library_management_system", "root", "Sahyadri@157");
            showRecord();
            showStudentDetails(loggedInStudentID);
            showMyRecords(loggedInStudentID);
}catch (ClassNotFoundException ex) {
            
        
    }
}

    

    
public void showRecord(){
       
            try {
        pst = con.prepareStatement("SELECT * FROM BOOKS");
        rs = pst.executeQuery();
        ResultSetMetaData rsm = rs.getMetaData();
        int n = rsm.getColumnCount();
        DefaultTableModel df = (DefaultTableModel) bookrecords.getModel();
        df.setRowCount(0);

        while (rs.next()) {
            Vector obj = new Vector();
            for (int i = 1; i <= n; i++) {
                obj.add(rs.getString(i));
            }
            df.addRow(obj);
        }
    } catch (SQLException ex) {
        
    }
}

             private void showStudentDetails(String studentID) {
        try {
            pst = con.prepareStatement("SELECT * FROM STUDENTS WHERE student_id = ?");
            pst.setString(1, studentID);
            rs = pst.executeQuery();

            if (rs.next()) {
                name.setText(rs.getString("fname"));
                usn.setText(rs.getString("usn"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //myrecords
   private void showMyRecords(String studentID) {
        try {
            String query = "SELECT books.book_name, book_issue.issue_date, book_issue.due_date, " +
               "book_issue.return_date, book_issue.status, book_issue.fine_amount, book_issue.fine_paid " +
               "FROM book_issue " +
               "JOIN books ON book_issue.book_id = books.book_id " +
               "WHERE book_issue.student_id = ?";

        
        pst = con.prepareStatement(query);
        pst.setString(1, studentID);
          rs = pst.executeQuery();
            DefaultTableModel df = (DefaultTableModel) myrecords.getModel();
            df.setRowCount(0);

            while (rs.next()) {
                Vector obj = new Vector();
                obj.add(rs.getString("book_name"));
                obj.add(rs.getString("issue_date"));
                obj.add(rs.getString("due_date"));
                obj.add(rs.getString("return_date"));
                obj.add(rs.getString("fine_amount"));
                obj.add(rs.getString("fine_paid"));
                obj.add(rs.getString("status"));
                df.addRow(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentHome.class.getName()).log(Level.SEVERE, null, ex);
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
        searchrecord = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookrecords = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        myrecords = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Btnnotify = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        usn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 150, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("Available Books");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));
        getContentPane().add(searchrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 350, 46));

        btnSearch.setBackground(new java.awt.Color(153, 51, 0));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 89, 46));

        bookrecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book id", "Book name", "Author name", "Domain", "Quantity", "Rack no", "Edition"
            }
        ));
        jScrollPane1.setViewportView(bookrecords);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 790, 160));

        myrecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book name", "Issue Date", "Due Date", "Return Date", "Fine Amount", "Fine Paid", "Status"
            }
        ));
        jScrollPane2.setViewportView(myrecords);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 818, 155));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 0));
        jLabel5.setText("My Transaction");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btnnotify.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btnnotify.setForeground(new java.awt.Color(153, 51, 0));
        Btnnotify.setText("Notifies");
        Btnnotify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnnotifyActionPerformed(evt);
            }
        });
        jPanel1.add(Btnnotify, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 51, 0));
        jButton1.setText("About ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 51, 0));
        jButton3.setText("Log Out");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 50));

        name.setBorder(javax.swing.BorderFactory.createTitledBorder("Name"));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 160, 60));
        getContentPane().add(usn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder("USN"));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 150, 60));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFrame/brownbook_bg.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel ob=(DefaultTableModel) bookrecords.getModel();
            TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(ob);
            bookrecords.setRowSorter(obj);
            obj.setRowFilter(RowFilter.regexFilter(searchrecord.getText()));

    }//GEN-LAST:event_btnSearchActionPerformed

    private void BtnnotifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnnotifyActionPerformed
        // TODO add your handling code here:
       
       
    }//GEN-LAST:event_BtnnotifyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      java.awt.EventQueue.invokeLater(() -> {
        try {
            // Provide the loggedInStudentID here
            new StudentHome("loggedInStudentID").setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(StudentHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnnotify;
    private javax.swing.JTable bookrecords;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable myrecords;
    private javax.swing.JLabel name;
    private javax.swing.JTextField searchrecord;
    private javax.swing.JLabel usn;
    // End of variables declaration//GEN-END:variables
}
