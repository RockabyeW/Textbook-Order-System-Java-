package 教材订购系统;
import java.awt.Font;
import java.sql.Connection;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class 登录界面 extends javax.swing.JFrame {
    数据库 database=new 数据库();
    控件 co=new 控件();
    窗体对象 fo=new 窗体对象();
    public static Student currentStudent;
    public static Administrator currentAdministrator;
    
    public 登录界面() {
        Font font = new Font("Dialog", Font.PLAIN, 12);
		java.util.Enumeration keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof javax.swing.plaf.FontUIResource) {
				UIManager.put(key, font);
			}
		}
        initComponents();
        this.setTitle("登录界面");
        this.setLocationRelativeTo(null);
	this.jrb_student.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordTxt = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jrb_student = new javax.swing.JRadioButton();
        jrb_admin = new javax.swing.JRadioButton();
        jb_logOn = new javax.swing.JButton();
        jb_reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("等线", 0, 36)); // NOI18N
        jLabel1.setText("教材订购系统");

        jLabel2.setText("账号");

        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });

        jLabel3.setText("密码");

        jrb_student.setText("学生");
        jrb_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_studentActionPerformed(evt);
            }
        });

        jrb_admin.setText("管理员");
        jrb_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_adminActionPerformed(evt);
            }
        });

        jb_logOn.setText("登录");
        jb_logOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_logOnActionPerformed(evt);
            }
        });

        jb_reset.setText("重置");
        jb_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_student, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_logOn))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb_reset)
                            .addComponent(jrb_admin)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordTxt)
                        .addComponent(userNameTxt)))
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_student)
                    .addComponent(jrb_admin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_logOn)
                    .addComponent(jb_reset))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_logOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_logOnActionPerformed
            String userName = userNameTxt.getText();
	    String password = new String(passwordTxt.getPassword());
		if (字符串工具.isEmpty(userName)) {
			fo.ShowInfo(this, "用户名不能为空!");
			return;
		}
		if (字符串工具.isEmpty(password)) {
			fo.ShowInfo(this, "密码不能为空!");
			return;
		}
		Connection con=null;
		if (this.jrb_student.isSelected()) {
			Student student = new Student();
                        student.setStudentId(userName);
                        student.setStudentPassword(password);
                
			try {
				con=database.getCon();  
                               
				currentStudent = co.VerifyStudent(con,student);
				if (currentStudent != null) {
					this.dispose();
					new 学生主界面().setVisible(true);
				} else {
					JOptionPane.showMessageDialog(this, "登录失败!");
				}
			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(this, "登录失败!");
			}finally{
				try {
					database.closeCon(con);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else if (this.jrb_admin.isSelected()) {
                    Administrator administrator = new Administrator();
                        administrator.setMId(userName);
                        administrator.setMPassword(password);
                       
			try {
				con=database.getCon();  
                               
				currentAdministrator = co.VerifyAdministrator(con,administrator);
				if (currentAdministrator != null) {
					this.dispose();
					new 管理员主界面().setVisible(true);
				} else {
					JOptionPane.showMessageDialog(this, "登录失败!");
				}
			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(this, "登录失败!");
			}finally{
				try {
					database.closeCon(con);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}     
    }//GEN-LAST:event_jb_logOnActionPerformed

    private void jb_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_resetActionPerformed
        this.resetValue();
    }//GEN-LAST:event_jb_resetActionPerformed

    private void jrb_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_studentActionPerformed
        if (jrb_student.isSelected()){
            jrb_admin.setSelected(false);
        }
    }//GEN-LAST:event_jrb_studentActionPerformed

    private void jrb_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_adminActionPerformed
        if (jrb_admin.isSelected()){
            jrb_student.setSelected(false);
        }
    }//GEN-LAST:event_jrb_adminActionPerformed

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
    }//GEN-LAST:event_passwordTxtActionPerformed
    private void resetValue() {
		this.userNameTxt.setText("");
		this.passwordTxt.setText("");
		this.jrb_student.setSelected(true);
	}
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
            java.util.logging.Logger.getLogger(登录界面.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(登录界面.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(登录界面.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(登录界面.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new 登录界面().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jb_logOn;
    private javax.swing.JButton jb_reset;
    private javax.swing.JRadioButton jrb_admin;
    private javax.swing.JRadioButton jrb_student;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JFormattedTextField userNameTxt;
    // End of variables declaration//GEN-END:variables
}
