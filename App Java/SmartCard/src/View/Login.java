/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Connection.ConnectCard;
import Connection.ConnectDatabase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Login extends javax.swing.JFrame implements ActionListener{
    ConnectCard smartCard = new ConnectCard();
    /**
     * Creates new form JFrameSmartcart
     */  
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnketnoi.addActionListener(this);
        btnback.addActionListener(this);
        btndoipin.addActionListener(this);
        ConnectCard.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnketnoi = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        btndoipin = new javax.swing.JButton();
        btnResetPin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnketnoi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnketnoi.setText("KẾT NỐI");
        btnketnoi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnketnoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnketnoiActionPerformed(evt);
            }
        });

        jPasswordField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPasswordField.setText("jPasswordField1");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THẺ NHÂN VIÊN");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MÃ PIN");

        btnback.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnback.setText("Ngắt kết nối");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btndoipin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btndoipin.setText("ĐỔI PIN");
        btndoipin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btndoipin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoipinActionPerformed(evt);
            }
        });

        btnResetPin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnResetPin.setText("CÀI LẠI PIN");
        btnResetPin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnResetPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnback)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnketnoi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndoipin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResetPin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnketnoi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndoipin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetPin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnback)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnketnoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnketnoiActionPerformed
        // TODO add your handling code here:
        char[] pass1 = jPasswordField.getPassword();
        byte[] pass = null;

        pass = new byte[pass1.length];
        for (int i = 0; i < pass1.length; i++) {
            if (Character.isDigit(pass1[i])) {
                pass[i] = (byte) pass1[i];
            } else {
                JOptionPane.showMessageDialog(this, "Pin Phải là dãy số");
                return;
            }
        }

        if (ConnectCard.checkPin(pass) == 1) {
            ConnectCard.nhanVien = ConnectCard.getNhanVien();
            JOptionPane.showMessageDialog(null, "Thành công");
            new HomePage().setVisible(true);
            this.dispose();
        } else if(ConnectCard.checkPin(pass) == -1) {
            JOptionPane.showMessageDialog(null, "Nhập sai quá nhiều, thẻ đã khóa");
        } else {
            JOptionPane.showMessageDialog(null, "Sai mã pin");
        }

    }//GEN-LAST:event_btnketnoiActionPerformed

    private void btndoipinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoipinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndoipinActionPerformed

    private void btnResetPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPinActionPerformed
        // TODO add your handling code here:
        if(ConnectCard.rstPin()) {
            JOptionPane.showMessageDialog(this, "Đã khôi phục Pin gốc");
            new VerifyToUnLockPin().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại");
        }
        
    }//GEN-LAST:event_btnResetPinActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbackActionPerformed

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
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResetPin;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndoipin;
    private javax.swing.JButton btnketnoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnketnoi)){
            ketnoiClick();
        }else if(e.getSource().equals(btndoipin)){
            doipinClick();
        }
        
        else{
            backClick();
        }
    }
    public void ketnoiClick(){
        

    }
    public void doipinClick(){
       new ChangePin().setVisible(true);
       this.dispose();
    }
    
    public void backClick(){
        ConnectCard.disconnect();
       new Begin().setVisible(true);
       this.dispose();
    }
}