/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrame;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author pc
 */
public final class FacultyHome extends javax.swing.JFrame {
Connection con=null;
        Statement st=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        
    /**
     * Creates new form FacultyHome
     */
    public FacultyHome() throws SQLException {
        
        try {
                initComponents();
               
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sahyadri_library_management_system", "root", "Sahyadri@157");
                showRecord();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
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
        Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
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
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchrecord = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookrecords = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 460));
        setPreferredSize(new java.awt.Dimension(750, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Notifies");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 823, 50));

        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("Available Books");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        searchrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchrecordActionPerformed(evt);
            }
        });
        getContentPane().add(searchrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 288, -1));

        btnSearch.setBackground(new java.awt.Color(153, 51, 0));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, -1, -1));

        jLabel2.setText("My Transaction");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, 20));

        bookrecords.setForeground(new java.awt.Color(153, 51, 0));
        bookrecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book id", "Book name", "Author name", "Domain", "Quantity", "Rack no", "Edition"
            }
        ));
        bookrecords.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(bookrecords);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 550, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFrame/brownbook_bg.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 820, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchrecordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchrecordActionPerformed

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
            java.util.logging.Logger.getLogger(FacultyHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FacultyHome().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FacultyHome.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookrecords;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchrecord;
    // End of variables declaration//GEN-END:variables
}
