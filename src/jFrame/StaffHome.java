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
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        Student.setText("jMenuItem1");
        Popup.add(Student);

        Faculty.setText("jMenuItem1");
        Popup.add(Faculty);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 150, 0, 0));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, -1, -1));

        btnmanagebooks.setBackground(new java.awt.Color(153, 51, 0));
        btnmanagebooks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnmanagebooks.setForeground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(btnmanagebooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 490, 40));

        btnissuebooks.setBackground(new java.awt.Color(153, 51, 0));
        btnissuebooks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnissuebooks.setForeground(new java.awt.Color(255, 255, 255));
        btnissuebooks.setText("Issue Books");
        btnissuebooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissuebooksActionPerformed(evt);
            }
        });
        getContentPane().add(btnissuebooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 130, 53));

        btnreturn.setBackground(new java.awt.Color(153, 51, 0));
        btnreturn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnreturn.setForeground(new java.awt.Color(255, 255, 255));
        btnreturn.setText("Return Books ");
        btnreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnreturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 130, 53));

        btnAllrecords.setBackground(new java.awt.Color(153, 51, 0));
        btnAllrecords.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAllrecords.setForeground(new java.awt.Color(255, 255, 255));
        btnAllrecords.setText("View All Records");
        btnAllrecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllrecordsActionPerformed(evt);
            }
        });
        getContentPane().add(btnAllrecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 130, 53));

        addstudents.setBackground(new java.awt.Color(153, 51, 0));
        addstudents.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addstudents.setForeground(new java.awt.Color(255, 255, 255));
        addstudents.setText("Add Student");
        addstudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstudentsActionPerformed(evt);
            }
        });
        getContentPane().add(addstudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 130, 53));

        btnaddfaculty.setBackground(new java.awt.Color(153, 51, 0));
        btnaddfaculty.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnaddfaculty.setForeground(new java.awt.Color(255, 255, 255));
        btnaddfaculty.setText("Add Faculty");
        btnaddfaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddfacultyActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddfaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 130, 53));

        btnissue.setBackground(new java.awt.Color(153, 51, 0));
        btnissue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnissue.setForeground(new java.awt.Color(255, 255, 255));
        btnissue.setText("Issue Books");
        btnissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissueActionPerformed(evt);
            }
        });
        getContentPane().add(btnissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 130, 53));

        btnreturnbooks.setBackground(new java.awt.Color(153, 51, 0));
        btnreturnbooks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnreturnbooks.setForeground(new java.awt.Color(255, 255, 255));
        btnreturnbooks.setText("Return Books");
        btnreturnbooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreturnbooksActionPerformed(evt);
            }
        });
        getContentPane().add(btnreturnbooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 130, 53));

        btnview.setBackground(new java.awt.Color(153, 51, 0));
        btnview.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnview.setForeground(new java.awt.Color(255, 255, 255));
        btnview.setText("View All Records");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        getContentPane().add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 130, 53));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 51, 0));
        jLabel2.setText("Manage Faculty");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 120, 30));

        jPanel2.setBackground(new java.awt.Color(153, 51, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 51, 0));
        jButton1.setText("About ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 51, 0));
        jButton3.setText("Log Out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 0));
        jLabel3.setText("Manage Student");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFrame/brownbook_bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmanagebooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanagebooksActionPerformed
        try {
            // TODO add your handling code here:
            setVisible(false);
            new ManageBooks().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(StaffHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnmanagebooksActionPerformed

    private void btnissuebooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissuebooksActionPerformed
        // TODO add your handling code here:
        setVisible(false);
       new IssueBook().setVisible(true);
    }//GEN-LAST:event_btnissuebooksActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void btnmanagebooksMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmanagebooksMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmanagebooksMouseReleased

    private void addstudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstudentsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new StudentRegister().setVisible(true);
    }//GEN-LAST:event_addstudentsActionPerformed

    private void btnAllrecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllrecordsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ViewRecords().setVisible(true);
    }//GEN-LAST:event_btnAllrecordsActionPerformed

    private void btnaddfacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddfacultyActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new FacultyRegister().setVisible(true);
    }//GEN-LAST:event_btnaddfacultyActionPerformed

    private void btnissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissueActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new FacultyIssueBook().setVisible(true);
        
    }//GEN-LAST:event_btnissueActionPerformed

    private void btnreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ReturnBooks().setVisible(true);
    }//GEN-LAST:event_btnreturnActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        setVisible(false);
         new FacultyViewRecords().setVisible(true);
    }//GEN-LAST:event_btnviewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
         new AboutUs().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
         new AdminLogin().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnreturnbooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreturnbooksActionPerformed
        // TODO add your handling code here:
        setVisible(false);
         new FacultyReturnBooks().setVisible(true);
    }//GEN-LAST:event_btnreturnbooksActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
