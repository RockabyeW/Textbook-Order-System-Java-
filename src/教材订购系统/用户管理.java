package 教材订购系统;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.print.Book;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import 教材订购系统.控件;
import 教材订购系统.Student;
import 教材订购系统.窗体对象;

public class 用户管理 extends javax.swing.JFrame {
    控件 co=new 控件();
    窗体对象 fo=new 窗体对象();
    数据库 db=new 数据库();
    Student student=new Student();

    public 用户管理() throws Exception {
        initComponents();
	int windowWidth = this.getWidth(); 
        int windowHeight = this.getHeight(); 
        Toolkit kit = Toolkit.getDefaultToolkit(); 
        Dimension screenSize = kit.getScreenSize(); 
        int screenWidth = screenSize.width; 
        int screenHeight = screenSize.height; 
        this.setLocation(screenWidth / 2 - 800 / 2, screenHeight / 2 - 600 / 2);
        this.setExtendedState(JFrame.NORMAL);
        this.setSize(700,700);
        this.setTitle("用户管理");
        this.fillTable("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        userIdTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SexText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        majorText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        teleText = new javax.swing.JTextField();
        dpText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        IdTxt = new javax.swing.JTextField();
        jb_search = new javax.swing.JButton();
        jb_modify = new javax.swing.JButton();
        jb_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "学号", "密码", "姓名", "性别", "学院", "专业", "电话"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTableMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(userTable);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("用户信息"));

        userIdTxt.setEditable(false);
        userIdTxt.setBackground(new java.awt.Color(255, 255, 255));
        userIdTxt.setEnabled(false);

        jLabel4.setText("学号");

        jLabel5.setText("姓名");

        jLabel6.setText("性别");

        jLabel7.setText("密码");

        jLabel2.setText("专业");

        jLabel3.setText("电话");

        jLabel8.setText("学院");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(userIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SexText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dpText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(majorText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(25, 25, 25)
                                .addComponent(teleText, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(dpText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(majorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SexText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(teleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("搜索条件"));

        jLabel1.setText("学号");

        jb_search.setText("查询");
        jb_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(IdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jb_search, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jb_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jb_modify.setText("修改");
        jb_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modifyActionPerformed(evt);
            }
        });

        jb_delete.setText("删除");
        jb_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jb_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jb_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jb_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void fillTable(String student_id) throws Exception {
		DefaultTableModel dtm = (DefaultTableModel) userTable.getModel();
		dtm.setRowCount(0);
		Connection con = null;
		con = db.getCon();
                
                ResultSet rs =co.QueryList(con,"student","student_id",student_id);
                            while (rs.next()) {
                                    Vector v = new Vector();
                                    v.add(rs.getString("student_id"));
                                    v.add(rs.getString("student_password"));
                                    v.add(rs.getString("student_name"));
                                    v.add(rs.getString("student_sex"));
                                    v.add(rs.getString("student_department"));
                                    v.add(rs.getString("student_major"));
                                    v.add(rs.getString("student_tele"));
                                    dtm.addRow(v);
                            }
                        }
  private void resetValue() 
        {
		this.userIdTxt.setText("");
		this.userNameTxt.setText("");
		this.passwordTxt.setText("");
		this.SexText.setText("");
                this.majorText.setText ("");
                this.teleText.setText("");
	}
    private void userTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMousePressed
        // TODO add your handling code here:
       
		int row = userTable.getSelectedRow();
		this.userIdTxt.setText((String) userTable.getValueAt(row, 0));
		this.passwordTxt.setText((String) userTable.getValueAt(row, 1));
		this.userNameTxt.setText((String) userTable.getValueAt(row, 2));
		this.SexText.setText((String) userTable.getValueAt(row, 3));
                this.dpText.setText((String) userTable.getValueAt(row, 4));
		this.majorText.setText((String) userTable.getValueAt(row, 5));
		this.teleText.setText((String) userTable.getValueAt(row, 6));
    }//GEN-LAST:event_userTableMousePressed

    private void jb_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_searchActionPerformed
        // TODO add your handling code here:
        String Id = this.IdTxt.getText();        
        try {
            this.fillTable(Id);
        } catch (Exception ex) {
            Logger.getLogger(用户管理.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_searchActionPerformed

    private void jb_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modifyActionPerformed
       
            // TODO add your handling code here:
            String Id = this.userIdTxt.getText();
            String userName = this.userNameTxt.getText();
            String userPassword = this.passwordTxt.getText();
            String userSex=this.SexText.getText();
            String userdp=this.dpText.getText();
            String userMajor=this.majorText.getText();
            String userTele=this.teleText.getText();
            student.setStudentId(Id);
            student.setStudentName(userName);
            student.setStudentPassword(userPassword);
            student.setStudentSex(userSex);
            student.setStudentDepartment(userdp);
            student.setStudentMajor(userMajor);
            student.setStudentTele(userTele);
            
            
            
            if (字符串工具.isEmpty(Id)) {
                fo.ShowInfo(this, "用户学号不能为空!");
                return;
            }
            if (字符串工具.isEmpty(userName)) {
                fo.ShowInfo(this, "用户姓名不能为空!");
                return;
            }
            if (字符串工具.isEmpty(userPassword)) {
                fo.ShowInfo(this, "用户密码不能为空!");
                return;
            }
            Connection con = null;
        try {
            con = db.getCon();
        } catch (Exception ex) {
            Logger.getLogger(用户管理.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            if (co.CanModify(con, "student", "student_id", Id))
            { 
                try {
                    int modifyNum = 0;
                    modifyNum = co.studentModify(con,student);
                    if (modifyNum == 1) {
                        fo.ShowInfo(this, "修改成功!");
                        this.resetValue();
                        this.fillTable("");
                    }
                }catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    fo.ShowInfo(this, "错误!");
                } finally {
                    try {
                        db.closeCon(con);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                
            }
            else
            {
                fo.ShowInfo(this, "没有这个用户");
            }
        } catch (SQLException ex) {
            Logger.getLogger(用户管理.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jb_modifyActionPerformed

    private void jb_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_deleteActionPerformed
        // TODO add your handling code here:
        String Id = this.userIdTxt.getText();
        int deleteNum = 0;
	if (字符串工具.isEmpty(Id)) {
		fo.ShowInfo(this, "学号不能为空!");
		return;
		}
		
        int n = co.ConfirmDelete(this,"用户", Id);
        if (n == JOptionPane.YES_OPTION) {
	Connection con = null;
            try {
                con = db.getCon();
            } catch (Exception ex) {
                Logger.getLogger(用户管理.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                deleteNum=co.studentDelete(con,Id);
            } catch (SQLException ex) {
                Logger.getLogger(用户管理.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        else{
            return;
        }
                                                               
	if (deleteNum == 1) {
            fo.ShowInfo(this, "删除成功!");
            this.resetValue();
            try {
                this.fillTable("");
            } catch (Exception ex) {
                Logger.getLogger(用户管理.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
	 else {
	    fo.ShowInfo(this, "删除失败!");
            };
			
    }//GEN-LAST:event_jb_deleteActionPerformed
    

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
            java.util.logging.Logger.getLogger(用户管理.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(用户管理.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(用户管理.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(用户管理.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new 用户管理().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(用户管理.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdTxt;
    private javax.swing.JTextField SexText;
    private javax.swing.JTextField dpText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jb_delete;
    private javax.swing.JButton jb_modify;
    private javax.swing.JButton jb_search;
    private javax.swing.JTextField majorText;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField teleText;
    private javax.swing.JTextField userIdTxt;
    private javax.swing.JTextField userNameTxt;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
