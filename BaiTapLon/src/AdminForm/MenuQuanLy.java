/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminForm;

import javax.swing.JOptionPane;

/**
 *
 * @author nvta1
 */
public class MenuQuanLy extends javax.swing.JFrame {

    /**
     * Creates new form MainQuanLy
     */
    public MenuQuanLy() {
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

        jLabel1 = new javax.swing.JLabel();
        btnQuanLyUser = new javax.swing.JButton();
        btnQuanLyDD = new javax.swing.JButton();
        btnQuanLyVe = new javax.swing.JButton();
        btnQuanLyTour = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Menu Quản Lý");

        btnQuanLyUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuanLyUser.setText("Quản lý user");
        btnQuanLyUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLyUserMouseClicked(evt);
            }
        });

        btnQuanLyDD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuanLyDD.setText("Quản lý địa điểm");
        btnQuanLyDD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLyDDMouseClicked(evt);
            }
        });

        btnQuanLyVe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuanLyVe.setText("Quản lý vé");
        btnQuanLyVe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLyVeMouseClicked(evt);
            }
        });

        btnQuanLyTour.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuanLyTour.setText("Quản lý tour");
        btnQuanLyTour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLyTourMouseClicked(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQuanLyUser)
                            .addComponent(btnQuanLyVe))
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQuanLyTour)
                            .addComponent(btnQuanLyDD))))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnThoat)
                .addGap(308, 308, 308))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuanLyUser)
                    .addComponent(btnQuanLyDD))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuanLyVe)
                    .addComponent(btnQuanLyTour))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnThoat)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuanLyTourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyTourMouseClicked
        // TODO add your handling code here:
        new MenuQuanLy().setVisible(false);
        new QuanLyTour().setVisible(true);
    }//GEN-LAST:event_btnQuanLyTourMouseClicked

    private void btnQuanLyVeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyVeMouseClicked
        // TODO add your handling code here:
        new MenuQuanLy().setVisible(false);
        new QuanLyVe().setVisible(true);
    }//GEN-LAST:event_btnQuanLyVeMouseClicked

    private void btnQuanLyUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyUserMouseClicked
        // TODO add your handling code here:
        new MenuQuanLy().setVisible(false);
        new QuanLyUser().setVisible(true);
    }//GEN-LAST:event_btnQuanLyUserMouseClicked

    private void btnQuanLyDDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyDDMouseClicked
        // TODO add your handling code here:
        new MenuQuanLy().setVisible(false);
        new QuanLyDiaDiem().setVisible(true);
    }//GEN-LAST:event_btnQuanLyDDMouseClicked

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        // TODO add your handling code here:
        int click=JOptionPane.showConfirmDialog(null,"Chắc chắn thoát","Thoát?",JOptionPane.YES_NO_OPTION);
          if (click==JOptionPane.YES_OPTION) {    
               System.exit(1);
          }
    }//GEN-LAST:event_btnThoatMouseClicked

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
            java.util.logging.Logger.getLogger(MenuQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuQuanLy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuanLyDD;
    private javax.swing.JButton btnQuanLyTour;
    private javax.swing.JButton btnQuanLyUser;
    private javax.swing.JButton btnQuanLyVe;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
