package com.pemrograman.kasir;

import javax.swing.*;

public class detail_order extends JFrame {
    private JPanel JPanel1;
    private JButton JButton2;
    private JButton btnLanjut;
    private JScrollPane JScrollPane1;
    private JTextArea txt_list;
    private JLabel JLabel1;

    query_order qOrder = new query_order();


    public detail_order() {
        detail_order_init();
        txt_list.setText(qOrder.showAllOrder());
        if(qOrder.totalPayment() <= 0){btnLanjut.setEnabled(false);}
    }

    public void detail_order_init(){
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700,500);

        JPanel1.setBackground(new java.awt.Color(153, 153, 0));

        JLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel1.setText("Daftar Pesanan");

        txt_list.setColumns(20);
        txt_list.setRows(5);
        txt_list.setEnabled(false);
        JScrollPane1.setViewportView(txt_list);

        btnLanjut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLanjut.setText("Lanjutkan");
        //btnLanjut.addActionListener(new java.awt.event.ActionListener() {
        //    public void actionPerformed(java.awt.event.ActionEvent evt) {
        //        btnLanjutActionPerformed(evt);
        //    }
        //});

        JButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JButton2.setText("Kembali");
        JButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

    }

    //private void btnLanjutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutActionPerformed
    //    payment p = new payment(qOrder.totalPayment());
    //    p.setVisible(true);
    //    dispose();
    //}//GEN-LAST:event_btnLanjutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String[] args) {
        JFrame mainFrame = new detail_order();
        mainFrame.setVisible(true);
    }

}
