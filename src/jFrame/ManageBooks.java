/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrame;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public final class ManageBooks extends javax.swing.JFrame {
        Connection con=null;
        Statement st=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        
    /**
     * Creates new form ManageBooks
     * @throws java.sql.SQLException
     */
    public ManageBooks() throws SQLException{
            try {
                initComponents();
               
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sahyadri_library_management_system", "root", "Sahyadri@157");
                showRecord();
                bookrecords.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookrecordsMouseClicked(evt);
            }
        });
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
        Btnupdate = new javax.swing.JButton();
        Btndelete = new javax.swing.JButton();
        searchrecord = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        bookname = new javax.swing.JTextField();
        authorname = new javax.swing.JTextField();
        domain = new javax.swing.JTextField();
        qty = new javax.swing.JTextField();
        rack = new javax.swing.JTextField();
        edition = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookrecords = new javax.swing.JTable();
        btnaddbooks = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1028, 50));

        Btnupdate.setBackground(new java.awt.Color(153, 51, 0));
        Btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        Btnupdate.setText("Update");
        Btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(Btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 550, 100, 30));

        Btndelete.setBackground(new java.awt.Color(153, 51, 0));
        Btndelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Btndelete.setForeground(new java.awt.Color(255, 255, 255));
        Btndelete.setText("Delete");
        Btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, 100, 30));
        getContentPane().add(searchrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 530, 38));

        btnSearch.setBackground(new java.awt.Color(153, 51, 0));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 123, 39));

        bookname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(bookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 310, 60));

        authorname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Author Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(authorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 310, 60));

        domain.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Domain", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        domain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domainActionPerformed(evt);
            }
        });
        getContentPane().add(domain, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 310, 60));

        qty.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quantity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 310, 60));

        rack.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rack No.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(rack, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 310, 60));

        edition.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edition", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(153, 51, 0))); // NOI18N
        getContentPane().add(edition, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 310, 60));

        bookrecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Id", "Book Name", "Author Name", "Domain", "Quantity", "Rack", "Edition"
            }
        ));
        jScrollPane1.setViewportView(bookrecords);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 930, 140));

        btnaddbooks.setBackground(new java.awt.Color(153, 51, 0));
        btnaddbooks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnaddbooks.setForeground(new java.awt.Color(255, 255, 255));
        btnaddbooks.setText("Add Books");
        btnaddbooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddbooksActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddbooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 100, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 51, 0));
        jLabel7.setText("Manage books");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 160, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFrame/brownbook_bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 780));

        jButton1.setText("     Back");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel ob=(DefaultTableModel) bookrecords.getModel();
            TableRowSorter<DefaultTableModel> obj=new TableRowSorter<>(ob);
            bookrecords.setRowSorter(obj);
            obj.setRowFilter(RowFilter.regexFilter(searchrecord.getText()));
    }//GEN-LAST:event_btnSearchActionPerformed

    private void domainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_domainActionPerformed

    private void btnaddbooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddbooksActionPerformed
        // TODO add your handling code here:
             try {
    
    String bookName = bookname.getText();
    String authorName = authorname.getText();
    String Domain = domain.getText();
    String quantity = qty.getText();
    String rackNo = rack.getText();
    String Edition = edition.getText();

    // Simple validation: Check if any of the fields are empty
    if (authorName.isEmpty() || Domain.isEmpty() || bookName.isEmpty() || quantity.isEmpty() || rackNo.isEmpty() || Edition.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields before adding a book.");
        return;  // Stop the process if any field is empty
    }

    pst = con.prepareStatement("INSERT INTO BOOKS(book_name, author_name, domain, quantity, rack_no, edition) VALUES(?,?,?,?,?,?)");
    pst.setString(1, bookName);
    pst.setString(2, authorName);
    pst.setString(3, Domain);
    pst.setString(4, quantity);
    pst.setString(5, rackNo);
    pst.setString(6, Edition);

    int k = pst.executeUpdate();
    System.out.println("Rows affected: " + k);

    if (k == 1) {
        JOptionPane.showMessageDialog(this, "Book added successfully");
        bookname.setText("");
        authorname.setText("");
        domain.setText("");
        qty.setText("");
        rack.setText("");
        edition.setText("");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to add book");
    }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Failed to add book! Error: " + ex.getMessage());
    Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
}
             showRecord();
    }//GEN-LAST:event_btnaddbooksActionPerformed
private void bookrecordsMouseClicked(java.awt.event.MouseEvent evt) {
    int rowIndex = bookrecords.getSelectedRow();

    DefaultTableModel model = (DefaultTableModel) bookrecords.getModel();
    System.out.println("Selected Row Index: " + rowIndex);

    // Print the data from the selected row
    for (int i = 0; i < model.getColumnCount(); i++) {
        System.out.println(model.getColumnName(i) + ": " + model.getValueAt(rowIndex, i));
    }

    bookname.setText(model.getValueAt(rowIndex, 1).toString());
    authorname.setText(model.getValueAt(rowIndex, 2).toString());
    domain.setText(model.getValueAt(rowIndex, 3).toString());
    qty.setText(model.getValueAt(rowIndex, 4).toString());
    rack.setText(model.getValueAt(rowIndex, 5).toString());
    edition.setText(model.getValueAt(rowIndex, 6).toString());
}


    private void BtnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnupdateActionPerformed
        try {
    pst = con.prepareStatement("UPDATE BOOKS SET author_name=?, domain=?, quantity=?, rack_no=?, edition=? WHERE book_name=?");
    pst.setString(1, authorname.getText());
    pst.setString(2, domain.getText());
    pst.setString(3, qty.getText());
    pst.setString(4, rack.getText());
    pst.setString(5, edition.getText());
    pst.setString(6, bookname.getText());
    
    pst.executeUpdate();
    showRecord();
} catch (SQLException ex) {
    Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
}

        
    }//GEN-LAST:event_BtnupdateActionPerformed

    private void BtndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtndeleteActionPerformed
        // TODO add your handling code here:
      try {
    pst = con.prepareStatement("DELETE FROM books WHERE book_name=?");
    pst.setString(1, bookname.getText());  // Assuming bookname is a JTextField or similar
    pst.executeUpdate();
    showRecord();
    // TODO add your handling code here:
} catch (SQLException ex) {
    Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
}

    }//GEN-LAST:event_BtndeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new ManageBooks().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btndelete;
    private javax.swing.JButton Btnupdate;
    private javax.swing.JTextField authorname;
    private javax.swing.JTextField bookname;
    private javax.swing.JTable bookrecords;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnaddbooks;
    private javax.swing.JTextField domain;
    private javax.swing.JTextField edition;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField rack;
    private javax.swing.JTextField searchrecord;
    // End of variables declaration//GEN-END:variables
}
