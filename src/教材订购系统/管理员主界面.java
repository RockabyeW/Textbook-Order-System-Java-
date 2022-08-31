package 教材订购系统;

import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

public class 管理员主界面 extends javax.swing.JFrame {

    public 管理员主界面() {
        initComponents();
        this.setLocation(200, 100);
        this.setTitle("管理员主界面");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jmiStudentView = new javax.swing.JMenuItem();
        jmiStudentPassword = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        newuser = new javax.swing.JMenuItem();
        modifyuser = new javax.swing.JMenuItem();
        PasswordModify = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("等线", 0, 48)); // NOI18N
        jLabel1.setText("欢迎进入教材订购系统！");
        jLabel1.setToolTipText("");

        jMenuBar1.setPreferredSize(new java.awt.Dimension(138, 30));

        jMenu1.setText("采购管理");
        jMenu1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jMenuItem2.setText("输入进书单");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jMenuItem5.setText("查询缺书单");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("销售管理");
        jMenu3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jMenuItem6.setText("查询订单状态");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jMenuItem3.setText("处理订单");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jMenuItem1.setText("查询库存表");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jMenuItem4.setText("查询进书单");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("账号管理");
        jMenu2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N

        jMenu4.setText("学生信息管理");
        jMenu4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N

        jmiStudentView.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jmiStudentView.setText("查看学生信息");
        jmiStudentView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiStudentViewActionPerformed(evt);
            }
        });
        jMenu4.add(jmiStudentView);

        jmiStudentPassword.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jmiStudentPassword.setText("管理学生密码");
        jmiStudentPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiStudentPasswordActionPerformed(evt);
            }
        });
        jMenu4.add(jmiStudentPassword);

        jMenu2.add(jMenu4);

        jMenu5.setText("用户管理");
        jMenu5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N

        newuser.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        newuser.setText("新建用户");
        newuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newuserActionPerformed(evt);
            }
        });
        jMenu5.add(newuser);

        modifyuser.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        modifyuser.setText("管理用户");
        modifyuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyuserActionPerformed(evt);
            }
        });
        jMenu5.add(modifyuser);

        jMenu2.add(jMenu5);

        PasswordModify.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        PasswordModify.setText("修改密码");
        PasswordModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordModifyActionPerformed(evt);
            }
        });
        jMenu2.add(PasswordModify);

        jMenuItem8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jMenuItem8.setText("个人信息查询");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jMenuItem7.setText("退出登录");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        查询缺书单 查询缺书单 = new 查询缺书单();
	查询缺书单.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        输入进书单 输入进书单 = new 输入进书单();
	输入进书单.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        查询库存表 查询库存表 = new 查询库存表();
	查询库存表.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "是否确定要退出系统?退出后可重新登录。");
        if (result == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        管理员个人信息查询 管理员个人信息查询 = new 管理员个人信息查询();
        管理员个人信息查询.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        查询进书单 查询进书单 = new 查询进书单();
	查询进书单.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        处理订单 处理订单 = new 处理订单();
	处理订单.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        管理员查询订单 管理员查询订单 = new 管理员查询订单();
	管理员查询订单.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jmiStudentViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiStudentViewActionPerformed
        查看学生资料 studentViewInterFrm = new 查看学生资料();
        studentViewInterFrm.setVisible(true);
    }//GEN-LAST:event_jmiStudentViewActionPerformed

    private void jmiStudentPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiStudentPasswordActionPerformed
        学生密码管理 studentPasswordInterFrm = new 学生密码管理();
        studentPasswordInterFrm.setVisible(true);
    }//GEN-LAST:event_jmiStudentPasswordActionPerformed

    private void newuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newuserActionPerformed
        添加用户 userFrm = new 添加用户();
        userFrm.setVisible(true);
    }//GEN-LAST:event_newuserActionPerformed

    private void modifyuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyuserActionPerformed
        用户管理 umf = null ;
        try {
            umf = new 用户管理();
        } catch (Exception ex) {
            Logger.getLogger(管理员主界面.class.getName()).log(Level.SEVERE, null, ex);
        }
        umf.setVisible(true);
    }//GEN-LAST:event_modifyuserActionPerformed

    private void PasswordModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordModifyActionPerformed
        管理员密码修改 passwordModifyInterFrm_1 = new 管理员密码修改();
        passwordModifyInterFrm_1.setVisible(true);
    }//GEN-LAST:event_PasswordModifyActionPerformed

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
            java.util.logging.Logger.getLogger(管理员主界面.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(管理员主界面.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(管理员主界面.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(管理员主界面.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new 管理员主界面().setVisible(true);
            }
        });
    }

    private javax.swing.JDesktopPane table;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem PasswordModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jmiStudentPassword;
    private javax.swing.JMenuItem jmiStudentView;
    private javax.swing.JMenuItem modifyuser;
    private javax.swing.JMenuItem newuser;
    // End of variables declaration//GEN-END:variables
}
