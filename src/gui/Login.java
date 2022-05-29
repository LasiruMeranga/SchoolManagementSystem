package gui;

import java.sql.*;
import java.sql.Statement;
import db.DatabaseConnection;
import javax.swing.ImageIcon;

/**
 *
 * @author Lasiru
 */
public class Login extends javax.swing.JFrame {

    Connection connection = null;
    Statement stmt = null;

    public Login() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        connection = DatabaseConnection.getconnection();
        lbl_error.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        school_icon = new javax.swing.JLabel();
        password_lbl = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        username_lbl = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        lbl_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("School Management System");
        setUndecorated(true);

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 40));

        school_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/school.png"))); // NOI18N
        jPanel1.add(school_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        password_lbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        password_lbl.setForeground(new java.awt.Color(153, 153, 153));
        password_lbl.setText("PASSWORD");
        jPanel1.add(password_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 270, 30));

        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 270, 30));

        username_lbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        username_lbl.setForeground(new java.awt.Color(153, 153, 153));
        username_lbl.setText("USERNAME");
        jPanel1.add(username_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 270, 30));

        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 270, 30));

        login.setBackground(java.awt.Color.lightGray);
        login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login.setText("LOGIN");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 100, 30));

        cancel.setBackground(java.awt.Color.lightGray);
        cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 100, 30));

        lbl_error.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_error.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbl_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 240, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed

    }//GEN-LAST:event_usernameActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

        String Username = username.getText();
        String Password = new String(password.getPassword());

        if (Username != null && !Username.equals("") && (Password != null && !Password.equals(""))) {
            try {
                String query = "SELECT * FROM admin where username=? and password=?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, Username);
                preparedStatement.setString(2, Password);

                ResultSet rs = preparedStatement.executeQuery();

                if (rs.next()) {

                    Menu view = new Menu();
                    view.setVisible(true);
                    dispose();
                } else {
                    lbl_error.setVisible(true);
                    lbl_error.setText("Incorrect USERNAME or PASSWORD!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            lbl_error.setVisible(true);
            lbl_error.setText("Please Enter Username and password.");
        }

        if (Username != null && !Username.equals("") && (Password != null && !Password.equals(""))) {
            try {
                String query = "SELECT * FROM users where username=? and password=?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, Username);
                preparedStatement.setString(2, Password);

                ResultSet rs = preparedStatement.executeQuery();

                if (rs.next()) {

                    Menu2 view = new Menu2();
                    view.setVisible(true);
                    dispose();
                } else {
                    lbl_error.setVisible(true);
                    lbl_error.setText("Incorrect USERNAME or PASSWORD!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            lbl_error.setVisible(true);
            lbl_error.setText("Please Enter Username and password.");
        }

    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel password_lbl;
    private javax.swing.JLabel school_icon;
    private javax.swing.JTextField username;
    private javax.swing.JLabel username_lbl;
    // End of variables declaration//GEN-END:variables
}
