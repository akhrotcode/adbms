/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import DataAccess.DataAccess;
import adbms.Dept;
import adbms.Emp;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author afif
 */
public class Info_emp extends javax.swing.JFrame {

    DataAccess da = new DataAccess();
    LinkedList<Emp> emps = new LinkedList<Emp>();
    Emp e = new Emp();
    Dept d = new Dept();
    
    /**
     * Creates new form insert_emp_info
     */
    public Info_emp() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnUpdate_infoEmp = new javax.swing.JButton();
        btnDelete_infoEmp = new javax.swing.JButton();
        btnInsert_infoEmp = new javax.swing.JButton();
        btnDone_infoEmp = new javax.swing.JButton();
        txtEmpno_infoEmp = new javax.swing.JTextField();
        txtEname_infoEmp = new javax.swing.JTextField();
        txtPhno_infoEmp = new javax.swing.JTextField();
        txtDetpno_infoEmp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddr_infoEmp = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Emp No");
        jLabel1.setName("empno_label"); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 26, -1, -1));

        jLabel2.setText("Ename");
        jLabel2.setName("ename_lablel"); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, -1, -1));

        jLabel3.setText("Phone No");
        jLabel3.setName("phoneno_label"); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 113, -1, -1));

        jLabel4.setText("Address");
        jLabel4.setName("address_label"); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 148, -1, -1));

        jLabel5.setText("Dept No");
        jLabel5.setName("deptno_label"); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 26, -1, -1));

        btnUpdate_infoEmp.setText("Update");
        btnUpdate_infoEmp.setToolTipText("");
        btnUpdate_infoEmp.setName("update_empBtn"); // NOI18N
        btnUpdate_infoEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate_infoEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate_infoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        btnDelete_infoEmp.setText("Delete");
        btnDelete_infoEmp.setName("delete_empBtn"); // NOI18N
        btnDelete_infoEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_infoEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete_infoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        btnInsert_infoEmp.setLabel("Insert");
        btnInsert_infoEmp.setName("insert_empBtn"); // NOI18N
        btnInsert_infoEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsert_infoEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsert_infoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        btnDone_infoEmp.setText("Done");
        btnDone_infoEmp.setName("doneBtn"); // NOI18N
        btnDone_infoEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDone_infoEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnDone_infoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        txtEmpno_infoEmp.setName("empnoTxt_insertemp"); // NOI18N
        jPanel1.add(txtEmpno_infoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 23, 123, -1));

        txtEname_infoEmp.setName("enameTxt_insertemp"); // NOI18N
        jPanel1.add(txtEname_infoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 61, 123, -1));

        txtPhno_infoEmp.setName("phonenoTxt_insertemp"); // NOI18N
        jPanel1.add(txtPhno_infoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 110, 120, -1));

        txtDetpno_infoEmp.setName("deptnoTxt_insertemp"); // NOI18N
        jPanel1.add(txtDetpno_infoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 23, 98, -1));

        txtAddr_infoEmp.setColumns(20);
        txtAddr_infoEmp.setRows(5);
        jScrollPane1.setViewportView(txtAddr_infoEmp);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 148, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsert_infoEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsert_infoEmpActionPerformed
        if(txtEmpno_infoEmp.getText().isEmpty()){
            txtEmpno_infoEmp.requestFocus();
            
        }else if(txtEname_infoEmp.getText().isEmpty()){
            txtEname_infoEmp.requestFocus();
            
        }else if(txtDetpno_infoEmp.getText().isEmpty()){
            txtDetpno_infoEmp.requestFocus();
        }
        else{
            
            e.setEmpno(Integer.parseInt(txtEmpno_infoEmp.getText()));
            e.setEname(txtEname_infoEmp.getText());
            e.setPhoneno(txtPhno_infoEmp.getText());
            e.setAddress(txtAddr_infoEmp.getText());
            e.setDeptno(Integer.parseInt(txtDetpno_infoEmp.getText()));
//            d.setDeptno(Integer.parseInt(txtDetpno_infoEmp.getText()));
//            d.setDname(txtDname_infoEmp.getText());
//            d.setLoc(txtLoc_infoEmp.getText());
            
            da.insert_emp(e);
            
        }
                
    }//GEN-LAST:event_btnInsert_infoEmpActionPerformed

    private void btnDone_infoEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDone_infoEmpActionPerformed
        new dashboard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDone_infoEmpActionPerformed

    private void btnDelete_infoEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_infoEmpActionPerformed
        if(txtEmpno_infoEmp.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Insert empno to delete data");
            txtEmpno_infoEmp.requestFocus();
        }else{
            e.setEmpno(Integer.parseInt(txtEmpno_infoEmp.getText()));
            da.delete_emp(e);
        }
    }//GEN-LAST:event_btnDelete_infoEmpActionPerformed

    private void btnUpdate_infoEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate_infoEmpActionPerformed
        if(txtEmpno_infoEmp.getText().isEmpty()){
            txtEmpno_infoEmp.requestFocus();
        }
        else{
            e.setEmpno(Integer.parseInt(txtEmpno_infoEmp.getText()));
            e.setEname(txtEname_infoEmp.getText());
            e.setPhoneno(txtPhno_infoEmp.getText());
            e.setAddress(txtAddr_infoEmp.getText());
            e.setDeptno(Integer.parseInt(txtDetpno_infoEmp.getText()));
            
            da.update_emp(e);
        
        }
    }//GEN-LAST:event_btnUpdate_infoEmpActionPerformed

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
            java.util.logging.Logger.getLogger(Info_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info_emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Info_emp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete_infoEmp;
    private javax.swing.JButton btnDone_infoEmp;
    private javax.swing.JButton btnInsert_infoEmp;
    private javax.swing.JButton btnUpdate_infoEmp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAddr_infoEmp;
    private javax.swing.JTextField txtDetpno_infoEmp;
    private javax.swing.JTextField txtEmpno_infoEmp;
    private javax.swing.JTextField txtEname_infoEmp;
    private javax.swing.JTextField txtPhno_infoEmp;
    // End of variables declaration//GEN-END:variables

    private void insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
