package jFrame;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class MainOpen extends javax.swing.JFrame {
    public MainOpen() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnlibstaff = new javax.swing.JButton();
        btnstudent = new javax.swing.JButton();
        btnfaculty = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 150, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setSize(new java.awt.Dimension(1980, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("WELCOME TO SAHYADRI LIBRARY MANAGEMENT SYSTEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        btnlibstaff.setBackground(new java.awt.Color(153, 51, 0));
        btnlibstaff.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnlibstaff.setForeground(new java.awt.Color(255, 255, 255));
        btnlibstaff.setText("LIBRARY-STAFF");
        btnlibstaff.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnlibstaff.setBorderPainted(false);
        btnlibstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlibstaffActionPerformed(evt);
            }
        });
        getContentPane().add(btnlibstaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 179, 70));

        btnstudent.setBackground(new java.awt.Color(153, 51, 0));
        btnstudent.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnstudent.setForeground(new java.awt.Color(255, 255, 255));
        btnstudent.setText("STUDENTS");
        btnstudent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstudentActionPerformed(evt);
            }
        });
        getContentPane().add(btnstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 179, 70));

        btnfaculty.setBackground(new java.awt.Color(153, 51, 0));
        btnfaculty.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnfaculty.setForeground(new java.awt.Color(255, 255, 255));
        btnfaculty.setText("FACULTY");
        btnfaculty.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnfaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfacultyActionPerformed(evt);
            }
        });
        getContentPane().add(btnfaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 179, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFrame/brownbook_bg.png"))); // NOI18N
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlibstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlibstaffActionPerformed
        // TODO add your handling code here:
        new AdminRegister().setVisible(true);
    }//GEN-LAST:event_btnlibstaffActionPerformed

    private void btnfacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfacultyActionPerformed
        // TODO add your handling code here:
        new FacultyLogin().setVisible(true);
    }//GEN-LAST:event_btnfacultyActionPerformed

    private void btnstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstudentActionPerformed
        // TODO add your handling code here:
        new StudentLogin().setVisible(true);
    }//GEN-LAST:event_btnstudentActionPerformed

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
            java.util.logging.Logger.getLogger(MainOpen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainOpen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainOpen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainOpen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainOpen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfaculty;
    private javax.swing.JButton btnlibstaff;
    private javax.swing.JButton btnstudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
