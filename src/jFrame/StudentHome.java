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
     */
    public StudentHome() throws SQLException {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchrecord = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookrecords = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        usn = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        myrecords = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Notification");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 818, -1));

        jLabel1.setText("Available Books");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 60, -1, -1));
        getContentPane().add(searchrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 82, 471, 46));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 83, 89, 46));

        bookrecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book id", "Book name", "Author name", "Domain", "Quantity", "Rack no", "Edition"
            }
        ));
        jScrollPane1.setViewportView(bookrecords);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 151, 790, 159));

        jLabel2.setText("My Transaction");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 97, 90, -1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 351, 145, 18));
        getContentPane().add(usn, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 348, 47, 21));

        myrecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book name", "Issue Date", "Due Date", "Return Date", "Fine Amount", "Fine Paid", "Status"
            }
        ));
        jScrollPane2.setViewportView(myrecords);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 474, 818, 155));

        jLabel5.setText("Mytansaction");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 407, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel ob=(DefaultTableModel) bookrecords.getModel();
            TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(ob);
            bookrecords.setRowSorter(obj);
            obj.setRowFilter(RowFilter.regexFilter(searchrecord.getText()));

    }//GEN-LAST:event_btnSearchActionPerformed

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
    private javax.swing.JTable bookrecords;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
