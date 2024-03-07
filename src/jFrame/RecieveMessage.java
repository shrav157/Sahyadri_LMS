/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RecieveMessage extends javax.swing.JFrame {
    private final int loggedInStudentID;
    Connection con;
    public RecieveMessage(int loggedInStudentID) {
        initComponents();
         this.loggedInStudentID = loggedInStudentID;
         Connect();
        fetchAndDisplayMessages();
        
    }    

    RecieveMessage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/sahyadri_library_management_system","root","Sahyadri@157");
        } catch (ClassNotFoundException | SQLException ex) {
//            Logger.getLogger(FacultyRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        receivemessage = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        receivemessage.setColumns(20);
        receivemessage.setRows(5);
        jScrollPane1.setViewportView(receivemessage);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jFrame/brownbook_bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void fetchAndDisplayMessages() {
        try {
            // Fetch messages for the current student from the database
            String messages = getMessagesForStudent(loggedInStudentID);

            // Display messages in the text area
            receivemessage.setText(messages);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching messages: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
   private String getMessagesForStudent(int loggedInStudentID) throws SQLException {
        StringBuilder messages = new StringBuilder();

        try {
            // Assuming there is a table named "notify" with columns "sender_id", "receiver_id", and "message"
            String query = "SELECT message FROM notify WHERE receiver_id = ?";
            try (PreparedStatement preparedStatement = con.prepareStatement(query)) {
                preparedStatement.setInt(1, loggedInStudentID);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String message = resultSet.getString("message");
                        messages.append(message).append("\n");
                    }
                }
            }
        } catch (SQLException e) {
            throw e; // Propagate the exception to handle it in fetchAndDisplayMessages
        }

        return messages.toString();
    }
   
    public void onMessageReceived(String message) {
        // Handle the received message (display in JTextArea, for example)
        receivemessage.append(message + "\n");
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
            java.util.logging.Logger.getLogger(RecieveMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecieveMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecieveMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecieveMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
    java.awt.EventQueue.invokeLater(() -> {
        int loggedInStudentID = 123; // Replace 123 with the actual ID of the logged-in student
        new RecieveMessage(loggedInStudentID).setVisible(true);
    });

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea receivemessage;
    // End of variables declaration//GEN-END:variables
}
