package gui;

import db.DatabaseConnection;
import java.sql.*;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import net.proteanit.sql.DbUtils;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Lasiru
 */
public class Teachers2 extends javax.swing.JFrame {

    Connection connection = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Teachers2() {
        initComponents();

        connection = DatabaseConnection.getconnection();
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        CurrentDate();
        Count2();
        Record2();
    }

    public void Record2() {
        try {

            Statement stmt = connection.createStatement();

            String sql = "select * from teacher";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                String Id = String.valueOf(rs.getInt("Teacher_Id"));
                String Name = rs.getString("Name");
                String Nic = rs.getString("Nic_No");
                String Age = rs.getString("Age");
                String Gender = rs.getString("Gender");
                String Address = rs.getString("Address");
                String Contact = rs.getString("Contact_No");
                String Class = rs.getString("Class");
                String Subject = rs.getString("Subject");
                String Qualifications = rs.getString("Qualifications");

                String tbData[] = {Id, Name, Nic, Age, Gender, Address, Contact, Class, Subject, Qualifications};
                DefaultTableModel tblModel = (DefaultTableModel) table_teachers.getModel();
                tblModel.addRow(tbData);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CurrentDate() {
        Calendar cal = new GregorianCalendar();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        date.setText((month + 1) + "/" + day + "/" + year);
    }

    public void Count2() {
        try {

            Statement stmt = connection.createStatement();

            String query = "select count(*) from teacher";

            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            int count2 = rs.getInt(1);
            tea_total.setText("Total Teachers : " + count2);
        } catch (Exception e) {
            e.printStackTrace();
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
        jPanel2 = new javax.swing.JPanel();
        menu_name = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        menu_btn = new javax.swing.JButton();
        menu_btn1 = new javax.swing.JButton();
        menu_btn2 = new javax.swing.JButton();
        menu_btn3 = new javax.swing.JButton();
        menu_btn4 = new javax.swing.JButton();
        log_out_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_teachers = new javax.swing.JTable();
        tea_total = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txt_filter = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("School Management System");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1230, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(1230, 100));

        menu_name.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        menu_name.setForeground(new java.awt.Color(204, 204, 204));
        menu_name.setText("SCHOOL MANAGEMENT SYSTEM");

        date.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        date.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(menu_name, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 598, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu_name, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        jPanel3.setBackground(java.awt.Color.darkGray);

        menu_btn.setBackground(new java.awt.Color(51, 51, 51));
        menu_btn.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        menu_btn.setForeground(new java.awt.Color(153, 153, 153));
        menu_btn.setText("Menu");
        menu_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menu_btn.setBorderPainted(false);
        menu_btn.setContentAreaFilled(false);
        menu_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_btn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        menu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_btnActionPerformed(evt);
            }
        });

        menu_btn1.setBackground(new java.awt.Color(51, 51, 51));
        menu_btn1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        menu_btn1.setForeground(new java.awt.Color(153, 153, 153));
        menu_btn1.setText("Students");
        menu_btn1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menu_btn1.setBorderPainted(false);
        menu_btn1.setContentAreaFilled(false);
        menu_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_btn1ActionPerformed(evt);
            }
        });

        menu_btn2.setBackground(new java.awt.Color(51, 51, 51));
        menu_btn2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        menu_btn2.setForeground(new java.awt.Color(153, 153, 153));
        menu_btn2.setText("Teachers");
        menu_btn2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menu_btn2.setBorderPainted(false);
        menu_btn2.setContentAreaFilled(false);
        menu_btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_btn2ActionPerformed(evt);
            }
        });

        menu_btn3.setBackground(new java.awt.Color(51, 51, 51));
        menu_btn3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        menu_btn3.setForeground(new java.awt.Color(153, 153, 153));
        menu_btn3.setText("Subjects");
        menu_btn3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menu_btn3.setBorderPainted(false);
        menu_btn3.setContentAreaFilled(false);
        menu_btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_btn3ActionPerformed(evt);
            }
        });

        menu_btn4.setBackground(new java.awt.Color(51, 51, 51));
        menu_btn4.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        menu_btn4.setForeground(new java.awt.Color(153, 153, 153));
        menu_btn4.setText("Classes");
        menu_btn4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menu_btn4.setBorderPainted(false);
        menu_btn4.setContentAreaFilled(false);
        menu_btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_btn4ActionPerformed(evt);
            }
        });

        log_out_btn.setBackground(java.awt.Color.darkGray);
        log_out_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        log_out_btn.setForeground(new java.awt.Color(51, 51, 51));
        log_out_btn.setText("Log Out");
        log_out_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        log_out_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_out_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(log_out_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(menu_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(menu_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(menu_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(menu_btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(menu_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                .addComponent(log_out_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 680));

        table_teachers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher_Id", "Name", "Nic_No", "Age", "Gender", "Address", "Contact_No", "Class", "Subject", "Qualifications"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_teachers);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 219, 940, 430));

        tea_total.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tea_total.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(tea_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 440, 110));

        jButton2.setBackground(java.awt.Color.lightGray);
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 170, 60, 30));

        txt_filter.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_filter.setText("Search...");
        txt_filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_filterMouseClicked(evt);
            }
        });
        txt_filter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filterKeyReleased(evt);
            }
        });
        jPanel1.add(txt_filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 360, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_btnActionPerformed

        Menu2 view = new Menu2();
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_btnActionPerformed

    private void menu_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_btn1ActionPerformed

        Students2 view = new Students2();
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_btn1ActionPerformed

    private void menu_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_btn2ActionPerformed

    private void menu_btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_btn3ActionPerformed

        Subjects2 s = new Subjects2();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_btn3ActionPerformed

    private void menu_btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_btn4ActionPerformed

        Classes2 view = new Classes2();
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_menu_btn4ActionPerformed

    private void log_out_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_out_btnActionPerformed

        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_log_out_btnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Statement stmt = connection.createStatement();
            String query = "select * from teacher";
            ResultSet rs = stmt.executeQuery(query);
            table_teachers.setModel(DbUtils.resultSetToTableModel(rs));

            String ccc = "select count(*) from teacher";

            ResultSet cc = stmt.executeQuery(ccc);
            cc.next();
            int count = cc.getInt(1);
            tea_total.setText("Total Teachers : " + count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_filterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_filterMouseClicked
        txt_filter.setText("");
    }//GEN-LAST:event_txt_filterMouseClicked

    private void txt_filterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filterKeyReleased
        filter(txt_filter.getText());
    }//GEN-LAST:event_txt_filterKeyReleased

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
            java.util.logging.Logger.getLogger(Teachers2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teachers2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teachers2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teachers2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Teachers2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton log_out_btn;
    private javax.swing.JButton menu_btn;
    private javax.swing.JButton menu_btn1;
    private javax.swing.JButton menu_btn2;
    private javax.swing.JButton menu_btn3;
    private javax.swing.JButton menu_btn4;
    private javax.swing.JLabel menu_name;
    private javax.swing.JTable table_teachers;
    private javax.swing.JLabel tea_total;
    private javax.swing.JTextField txt_filter;
    // End of variables declaration//GEN-END:variables
void filter(String query) {
        DefaultTableModel tblModel = (DefaultTableModel) table_teachers.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(tblModel);
        table_teachers.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(query));
    }
}
