package com.pemrograman.kasir;

import javax.swing.*;

public class payment extends JFrame {
    private JTextField txt_pay;
    private JButton jButton1;
    private JButton jButton2;
    private JPanel jPanel1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel5;
    private JLabel jLabel4;
    private JLabel jLabel6;
    private JLabel txt_payment;
    private JLabel txt_ppn;
    private JLabel txt_totalpayment;
    private JLabel txt_change;

    int total, money, payment = 0;
    double ppn = 0;

    validation v = new validDigit();
    useFilter uFilter = new useFilter(v);

    /**
     * Creates new form payment
     */
    public payment(int price) {
        payment_init();
        total = price;
        ppn = total*0.1;
        txt_totalpayment.setText(": Rp."+total);
        txt_ppn.setText(": Rp."+ppn);
        payment = (int) (total+ppn);
        txt_payment.setText(": Rp."+(payment));
    }
    public void payment_init() {
        this.setContentPane(jPanel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700, 500);
        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pembayaran");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Total Pesanan ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("PPN");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Total");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Pembayaran");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Kembalian");

        txt_totalpayment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_totalpayment.setText("jLabel7");

        txt_ppn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_ppn.setText("jLabel8");

        txt_payment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_payment.setText("jLabel9");

        txt_pay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_payActionPerformed(evt);
            }
        });
        txt_pay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_payKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_payKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_payKeyTyped(evt);
            }
        });

        txt_change.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_change.setText(": Rp. 0");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Selesai");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
    }
    private void txt_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_payActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_payActionPerformed

    private void txt_payKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_payKeyReleased
        int value = 0;
        try{
            money = txt_pay.getText().isEmpty() ? 0 : Integer.parseInt(txt_pay.getText());
            if(money < payment == true){
                jButton1.setEnabled(false);
                value =0;
            }else{
                value = money-payment;
                jButton1.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }finally{
            txt_change.setText(": Rp."+ value);
        }
    }//GEN-LAST:event_txt_payKeyReleased

    private void txt_payKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_payKeyTyped
        if(uFilter.filterDigit(evt) == false){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Masukan Bukan Digit!","Masukan Salah",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txt_payKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        order_center.clearOrder();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_payKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_payKeyPressed

    }//GEN-LAST:event_txt_payKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String[] args) {
        //JFrame mainFrame = new payment();
        //mainFrame.setVisible(true);
    }
}