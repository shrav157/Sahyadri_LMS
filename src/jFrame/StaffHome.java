package jFrame;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pc
 */
public class StaffHome extends javax.swing.JFrame {

    /**
     * Creates new form StaffHome
     */
    public StaffHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Popup = new javax.swing.JPopupMenu();
        Student = new javax.swing.JMenuItem();
        Faculty = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnmanagebooks = new javax.swing.JButton();
        btnissuebooks = new javax.swing.JButton();
        btnreturn = new javax.swing.JButton();
        btnAllrecords = new javax.swing.JButton();
        addstudents = new javax.swing.JButton();
        btnaddfaculty = new javax.swing.JButton();
        btnissue = new javax.swing.JButton();
        btnreturnbooks = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        Student.setText("jMenuItem1");
        Popup.add(Student);

        Faculty.setText("jMenuItem1");
        Popup.add(Faculty);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, -1, -1));

        btnmanagebooks.setText("Manage Books");
        btnmanagebooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnmanagebooksMouseReleased(evt);
            }
        });
        btnmanagebooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanagebooksActionPerformed(evt);
            }
        });
        getContentPane().add(btnmanagebooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, 60));

        btnissuebooks.setText("Issue Books");
        btnissuebooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissuebooksActionPerformed(evt);
            }
        });
        getContentPane().add(btnissuebooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, 54));

        btnreturn.setText("Return Books ");
        btnreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, 55));

        btnAllrecords.setText("View All Records");
        btnAllrecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllrecordsActionPerformed(evt);
            }
        });
        getContentPane().add(btnAllrecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, -1, 53));

        addstudents.setText("Add Student");
        addstudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstudentsActionPerformed(evt);
            }
        });
        getContentPane().add(addstudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 110, 70));

        btnaddfaculty.setText("Add Faculty");
        btnaddfaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddfacultyActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddfaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 110, 70));

        btnissue.setText("Issue Books");
        btnissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissueActionPerformed(evt);
            }
        });
        getContentPane().add(btnissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 100, 60));

        btnreturnbooks.setText("Return Books");
        getContentPane().add(btnreturnbooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 100, 60));

        btnview.setText("View All Records");
        getContentPane().add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 120, 70));

        jLabel2.setText("Faculty");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 51, 0));

        jLabel1.setText("Home");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(971, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1028, -1));

        jLabel3.setText("Students");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmanagebooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanagebooksActionPerformed
        try {
            // TODO add your handling code here:
            new ManageBooks().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(StaffHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnmanagebooksActionPerformed

    private void btnissuebooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissuebooksActionPerformed
        // TODO add your handling code here:
       new IssueBook().setVisible(true);
    }//GEN-LAST:event_btnissuebooksActionPerformed

    private void btnreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnActionPerformed
        // TODO add your handling code here:
         new ReturnBooks().setVisible(true);
    }//GEN-LAST:event_btnreturnActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void btnmanagebooksMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmanagebooksMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmanagebooksMouseReleased

    private void addstudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstudentsActionPerformed
        // TODO add your handling code here:
        new StudentRegister().setVisible(true);
    }//GEN-LAST:event_addstudentsActionPerformed

    private void btnAllrecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllrecordsActionPerformed
        // TODO add your handling code here:
        new ViewRecords().setVisible(true);
    }//GEN-LAST:event_btnAllrecordsActionPerformed

    private void btnaddfacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddfacultyActionPerformed
        // TODO add your handling code here:
        new FacultyRegister().setVisible(true);
    }//GEN-LAST:event_btnaddfacultyActionPerformed

    private void btnissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissueActionPerformed
        // TODO add your handling code here:
        new FacultyIssueBook().setVisible(true);
        
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
            java.util.logging.Logger.getLogger(StaffHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Faculty;
    private javax.swing.JPopupMenu Popup;
    private javax.swing.JMenuItem Student;
    private javax.swing.JButton addstudents;
    private javax.swing.JButton btnAllrecords;
    private javax.swing.JButton btnaddfaculty;
    private javax.swing.JButton btnissue;
    private javax.swing.JButton btnissuebooks;
    private javax.swing.JButton btnmanagebooks;
    private javax.swing.JButton btnreturn;
    private javax.swing.JButton btnreturnbooks;
    private javax.swing.JButton btnview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
