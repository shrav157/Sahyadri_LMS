/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrame;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author pc
 */
public final class ViewRecords extends javax.swing.JFrame {

    /**
     * Creates new form ViewRecords
     */
    public ViewRecords() {
        initComponents();
        Connect();
         displayAllRecords();
    }Connection con;
    PreparedStatement pst;
    
    public void Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/sahyadri_library_management_system","root","Sahyadri@157");
        } catch (ClassNotFoundException | SQLException ex) {
           
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
        search = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllRecords = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 150, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("STUDENT RECORDS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 200, -1));
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 110, 670, 49));

        btnsearch.setBackground(new java.awt.Color(153, 51, 0));
        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 80, 50));

        AllRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Id", "Student Id", "Student name", "Book name", "Issue Date", "Due Date", "Return Date", "Status", "Fine Amount", "Fine Paid"
            }
        ));
        AllRecords.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                AllRecordsComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(AllRecords);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 170, 773, 297));

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 51, 0));
        jButton2.setText("    Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 6, 96, 38));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFrame/brownbook_bg.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AllRecordsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_AllRecordsComponentShown
 
    }//GEN-LAST:event_AllRecordsComponentShown
        private void displayAllRecords() {
        try {
            String query = "SELECT "
                    + "bi.book_id, "
                    + "bi.student_id, "
                    + "b.book_name, "
                    + "s.fname, "
                    + "bi.issue_date, "
                    + "bi.due_date, "
                    + "bi.return_date, "
                    + "bi.status, "
                    + "bi.fine_amount, "
                    + "bi.fine_paid "
                    + "FROM book_issue bi "
                    + "JOIN books b ON bi.book_id = b.book_id "
                    + "JOIN students s ON bi.student_id = s.student_id";

            pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            // Create columns for the table
            String[] columns = {"Book Id", "Student Id", "Book Name", "Student Name", "Issue Date", "Due Date", "Return Date", "Status", "Fine Amount", "Fine Paid"};

            // Create DefaultTableModel with columns
            DefaultTableModel model = new DefaultTableModel(columns, 0);

            // Iterate through the ResultSet and add rows to the model
            while (rs.next()) {
                Object[] rowData = {
                        rs.getString("book_id"),
                        rs.getString("student_id"),
                        rs.getString("book_name"),
                        rs.getString("fname"),
                        rs.getDate("issue_date"),
                        rs.getDate("due_date"),
                        rs.getDate("return_date"),
                        rs.getString("status"),
                        rs.getDouble("fine_amount"),
                        rs.getString("fine_paid")
                };
                model.addRow(rowData);
            }
             AllRecords.setDefaultEditor(Object.class, null);
            // Set the model to your JTable (AllRecords)
            AllRecords.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching records: " + e.getMessage());
        }
     }
    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel ob=(DefaultTableModel) AllRecords.getModel();
            TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(ob);
            AllRecords.setRowSorter(obj);
            obj.setRowFilter(RowFilter.regexFilter(search.getText()));
    }//GEN-LAST:event_btnsearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ViewRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewRecords().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AllRecords;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
