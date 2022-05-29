package gui;

import db.DatabaseConnection;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author Lasiru
 */
public class TeacherSearch extends javax.swing.JFrame {

    Connection connection = null;
    Statement stmt = null;
    ResultSet rs = null;

    /**
     * Creates new form Student
     */
    public TeacherSearch() {
        initComponents();

        connection = DatabaseConnection.getconnection();
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
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
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        teacher_name = new javax.swing.JTextField();
        teacher_age = new javax.swing.JTextField();
        teacher_nic = new javax.swing.JTextField();
        teacher_id = new javax.swing.JTextField();
        teacher_address = new javax.swing.JTextField();
        teacher_contact = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        teacher_subject = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        teacher_gender = new javax.swing.JComboBox<>();
        teacher_class = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        teacher_qualifications = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teacher");
        setBackground(java.awt.Color.darkGray);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(384, 545));

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setMinimumSize(new java.awt.Dimension(330, 520));
        jPanel1.setPreferredSize(new java.awt.Dimension(291, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(java.awt.Color.lightGray);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel11.setText("Search Teacher");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 180, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout (1).png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 50, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 40));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 40));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Teacher Id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 40));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Age");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 40));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Nic No.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, 40));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Address");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, 40));

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 40));

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Class");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 100, 40));

        teacher_name.setEditable(false);
        teacher_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(teacher_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 220, 30));

        teacher_age.setEditable(false);
        teacher_age.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(teacher_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 220, 30));

        teacher_nic.setEditable(false);
        teacher_nic.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(teacher_nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 220, 30));

        teacher_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        teacher_id.setText("enter teacher id");
        teacher_id.setToolTipText("");
        teacher_id.setName(""); // NOI18N
        teacher_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacher_idMouseClicked(evt);
            }
        });
        jPanel1.add(teacher_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 220, 30));

        teacher_address.setEditable(false);
        teacher_address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(teacher_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 220, 30));

        teacher_contact.setEditable(false);
        teacher_contact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(teacher_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 220, 30));

        jLabel12.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Contact No.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 100, 40));

        teacher_subject.setEditable(false);
        teacher_subject.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(teacher_subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 220, 30));

        jLabel13.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Subject");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 120, 40));

        teacher_gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        teacher_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        teacher_gender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        teacher_gender.setEnabled(false);
        jPanel1.add(teacher_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 100, 30));

        teacher_class.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        teacher_class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5", "Grade 6", "Grade 7", "Grade 8", "Grade 9", "Grade 10", "Grade 11", "Grade 12", "Grade 13" }));
        teacher_class.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        teacher_class.setEnabled(false);
        jPanel1.add(teacher_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 100, 30));

        jLabel15.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Qualifications");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, 40));

        teacher_qualifications.setEditable(false);
        teacher_qualifications.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        teacher_qualifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_qualificationsActionPerformed(evt);
            }
        });
        jPanel1.add(teacher_qualifications, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 220, 30));

        btn_search.setBackground(java.awt.Color.lightGray);
        btn_search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_search.setText("Search");
        btn_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        btn_clear.setBackground(java.awt.Color.lightGray);
        btn_clear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void teacher_qualificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_qualificationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacher_qualificationsActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        try {

            stmt = connection.createStatement();
            int tId = 0;
            try {
                tId = Integer.parseInt(teacher_id.getText());
            } catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(rootPane, "Invalid Teacher Id!");
            }
            String query = "select * from teacher";
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                if (tId == rs.getInt("Teacher_Id")) {
                    teacher_name.setText(rs.getString("Name"));
                    teacher_nic.setText(rs.getString("Nic_No"));
                    teacher_age.setText(rs.getString("Age"));
                    teacher_gender.setSelectedItem(rs.getString("Gender"));
                    teacher_address.setText(rs.getString("Address"));
                    teacher_contact.setText(String.format(0 + "%s", rs.getInt("Contact_No")));
                    teacher_class.setSelectedItem(rs.getString("Class"));
                    teacher_subject.setText(rs.getString("Subject"));
                    teacher_qualifications.setText(rs.getString("Qualifications"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        teacher_id.setText("");
        teacher_name.setText("");
        teacher_nic.setText("");
        teacher_age.setText("");
        teacher_gender.setSelectedItem("Male");
        teacher_address.setText("");
        teacher_contact.setText("");
        teacher_class.setSelectedItem(" ");
        teacher_subject.setText("");
        teacher_qualifications.setText("");
    }//GEN-LAST:event_btn_clearActionPerformed

    private void teacher_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher_idMouseClicked
        teacher_id.setText("");
    }//GEN-LAST:event_teacher_idMouseClicked

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
            java.util.logging.Logger.getLogger(TeacherSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField teacher_address;
    private javax.swing.JTextField teacher_age;
    private javax.swing.JComboBox<String> teacher_class;
    private javax.swing.JTextField teacher_contact;
    private javax.swing.JComboBox<String> teacher_gender;
    private javax.swing.JTextField teacher_id;
    private javax.swing.JTextField teacher_name;
    private javax.swing.JTextField teacher_nic;
    private javax.swing.JTextField teacher_qualifications;
    private javax.swing.JTextField teacher_subject;
    // End of variables declaration//GEN-END:variables
}
