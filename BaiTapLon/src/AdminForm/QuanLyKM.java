/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminForm;

/**
 *
 * @author quang
 */
public class QuanLyKM extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyKM
     */
    public QuanLyKM() {
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

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSoDT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        jlable6 = new javax.swing.JLabel();
        txtSoNguoi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbQuanLyUser = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtMaUser = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        txtHoTen = new javax.swing.JTextField();
        btnThoai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Số điện thoại");

        jLabel6.setText("Địa chỉ");

        jLabel5.setText("Email");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jlable6.setText("Số người");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Quản Lý Khuyến Mại");

        tbQuanLyUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbQuanLyUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbQuanLyUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbQuanLyUser);

        jLabel2.setText("Mã user");

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel3.setText("Họ tên");

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThoai.setText("Thoát");
        btnThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtMaUser))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSoDT, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtEmail))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlable6)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSoNguoi, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(txtDiaChi))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btnThem)
                .addGap(121, 121, 121)
                .addComponent(btnSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoa)
                .addGap(135, 135, 135)
                .addComponent(btnThoai)
                .addGap(121, 121, 121))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlable6)
                    .addComponent(txtSoNguoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnThoai)
                    .addComponent(btnThem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        boolean isSuccess = true;
        ArrayList<Validator> data = new ArrayList<>();
        Validator MaUsers = new Validator(txtMaUser.getText(), new String[]{"required"}, "Mã User"),
        HoTen = new Validator(txtHoTen.getText(), new String[]{"required", "isString"}, "Họ tên"),
        SoDT = new Validator(txtSoDT.getText(), new String[]{"required", "isDecimal"}, "Số điện thoại"),
        Email = new Validator(txtEmail.getText(), new String[]{"required", "isEmail"}, "Email"),
        soNguoi = new Validator(txtSoNguoi.getText(), new String[]{"required", "isDecimal"}, "Số người"),
        DiaChi = new Validator(txtDiaChi.getText(), new String[]{"required", "isString"}, "Địa chỉ");
        data.add(MaUsers);
        data.add(HoTen);
        data.add(SoDT);
        data.add(Email);
        data.add(soNguoi);
        data.add(DiaChi);
        for (Validator s : data) {
            if (!s.setTextField(this)) {
                isSuccess = false;
            }
        }
        if (isSuccess) {
            Users item;
            item = new Users(MaUsers.getText(), HoTen.getText(), SoDT.getText(), Email.getText(), DiaChi.getText(), Integer.parseInt(soNguoi.getText()));
            if (new DAOuser().addItem(item)) {
                this.showTable();
                JOptionPane.showMessageDialog(this, "Thêm mới thành công!");
                clearText();
            } else {
                JOptionPane.showMessageDialog(this, "Địa Điểm đã tồn tại!");
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tbQuanLyUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbQuanLyUserMouseClicked
        // TODO add your handling code here:
        int row = tbQuanLyUser.getSelectedRow();
        txtMaUser.setText(model.getValueAt(row, 1).toString());
        txtHoTen.setText(model.getValueAt(row, 2).toString());
        txtSoDT.setText(model.getValueAt(row, 3).toString());
        txtEmail.setText(model.getValueAt(row, 4).toString());
        txtDiaChi.setText(model.getValueAt(row, 5).toString());
        txtSoNguoi.setText(model.getValueAt(row, 6).toString());
    }//GEN-LAST:event_tbQuanLyUserMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        boolean isSuccess = true;
        ArrayList<Validator> data = new ArrayList<>();
        Validator MaUsers = new Validator(txtMaUser.getText(), new String[]{"required"}, "Mã User"),
        HoTen = new Validator(txtHoTen.getText(), new String[]{"required", "isString"}, "Họ tên"),
        SoDT = new Validator(txtSoDT.getText(), new String[]{"required", "isDecimal"}, "Số điện thoại"),
        Email = new Validator(txtEmail.getText(), new String[]{"required", "isEmail"}, "Email"),
        soNguoi = new Validator(txtSoNguoi.getText(), new String[]{"required", "isDecimal"}, "Số người"),
        DiaChi = new Validator(txtDiaChi.getText(), new String[]{"required", "isString"}, "Địa chỉ");
        data.add(MaUsers);
        data.add(HoTen);
        data.add(SoDT);
        data.add(Email);
        data.add(soNguoi);
        data.add(DiaChi);
        for (Validator s : data) {
            if (!s.setTextField(this)) {
                isSuccess = false;
            }
        }
        if (isSuccess) {
            Users item = new Users(txtMaUser.getText(), txtHoTen.getText(), txtSoDT.getText(), txtEmail.getText(), txtDiaChi.getText(), Integer.parseInt(txtSoNguoi.getText()));
            if (new DAOuser().updateItem(item)) {
                this.showTable();
                JOptionPane.showMessageDialog(this, "Sửa mới thành công!");
                clearText();
            } else {
                JOptionPane.showMessageDialog(this, "Không sửa được");
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        Users item = new Users(txtMaUser.getText(), txtHoTen.getText(), txtSoDT.getText(), txtEmail.getText(), txtDiaChi.getText(), Integer.parseInt(txtSoNguoi.getText()));
        if (new DAOuser().deleteItem(item)) {
            this.showTable();
            JOptionPane.showMessageDialog(this, "Xóa thành công!");
            clearText();
        } else {
            JOptionPane.showMessageDialog(this, "Không xóa được!");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoaiActionPerformed
        // TODO add your handling code here:
        MenuQuanLy  a =  new  MenuQuanLy();
        a.show();
        this.dispose();
    }//GEN-LAST:event_btnThoaiActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyKM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoai;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlable6;
    private javax.swing.JTable tbQuanLyUser;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaUser;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtSoNguoi;
    // End of variables declaration//GEN-END:variables
}
