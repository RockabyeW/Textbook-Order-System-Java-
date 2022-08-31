package 教材订购系统;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 删除订单 extends javax.swing.JFrame {
        数据库 database = new 数据库();
	Orderlist orderlist = new Orderlist();
        控件 co=new 控件();
        窗体对象 fo=new 窗体对象();
        数据库 db=new 数据库();
        Student student=new Student();
        操作订单方法 selectbook=new 操作订单方法();

    public 删除订单() {
        initComponents();
	this.setLocation(500,150);
        this.setSize(870,570);
        this.setTitle("删除订单");
	this.fillTable(orderlist);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jb_selectionCancel1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "学号", "姓名", "图书编号", "书名"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderTable);

        jLabel1.setFont(new java.awt.Font("等线", 0, 24)); // NOI18N
        jLabel1.setText("输入图书编号后点击删除：");

        jLabel2.setFont(new java.awt.Font("等线", 0, 24)); // NOI18N
        jLabel2.setText("图书编号：");

        jTextField1.setFont(new java.awt.Font("等线", 0, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("等线", 0, 24)); // NOI18N
        jButton1.setText("关闭");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jb_selectionCancel1.setFont(new java.awt.Font("等线", 0, 24)); // NOI18N
        jb_selectionCancel1.setText("确认删除");
        jb_selectionCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_selectionCancel1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_selectionCancel1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_selectionCancel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButton1))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void fillTable(Orderlist orderlist) {
		DefaultTableModel dtm = (DefaultTableModel) orderTable.getModel();
		dtm.setRowCount(0);
		Connection con = null;
		try {
			con = database.getCon();
                        String currentstudentId = 登录界面.currentStudent.getStudentId();
			ResultSet rs = co.StudentQueryOrder(con, currentstudentId);
			while (rs.next()) {
				Vector v = new Vector();
				v.add(rs.getString("student_id"));
                                v.add(rs.getString("student_name"));
				v.add(rs.getString("book_id"));
                                v.add(rs.getString("book_name"));
				dtm.addRow(v);
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				database.closeCon(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jb_selectionCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_selectionCancel1ActionPerformed
        String currentbookId= this.jTextField1.getText();
        Connection con = null;
        try{
            con = db.getCon();
                            
            String isExisted=selectbook.isExisted(con, currentbookId);

            if (字符串工具.isEmpty(currentbookId)) {
                fo.ShowInfo(this, "编号不能为空!");
                return;
            }
            else if (currentbookId == "") {
                JOptionPane.showMessageDialog(this, "请输入图书编号！");
                return;
            }
            else if(isExisted==""){
                JOptionPane.showMessageDialog(this, "图书编号输入有误，请重新输入！");
                jTextField1.setText("");
                return;
            }

            int n;
            
            n = JOptionPane.showConfirmDialog(this, "确定要删除此订单？");

            if (n == 0) {
                selectbook.setBookId(currentbookId);
                Orderlist orderlist=new Orderlist();
                String currentstudentId = 登录界面.currentStudent.getStudentId();

                try {
                        con = database.getCon();

                        int SelectionCancel = selectbook.SelectionCancel(con, currentstudentId, currentbookId);
                        
                        if (SelectionCancel == 1) {
                            JOptionPane.showMessageDialog(this, "删除成功！");
                            jTextField1.setText("");

                            this.fillTable(new Orderlist());
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "删除失败！");
                            jTextField1.setText("");
                        }
              } catch (Exception e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "异常错误！");
                    jTextField1.setText("");
                } finally {
                    try {
                        database.closeCon(con);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                database.closeCon(con);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jb_selectionCancel1ActionPerformed
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
            java.util.logging.Logger.getLogger(删除订单.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(删除订单.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(删除订单.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(删除订单.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new 删除订单().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jb_selectionCancel1;
    private javax.swing.JTable orderTable;
    // End of variables declaration//GEN-END:variables
}
