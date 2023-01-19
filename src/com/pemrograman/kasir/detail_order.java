package com.pemrograman.kasir;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        this.setSize(500,500);

        JPanel1.setBackground(new Color(215, 215, 215));

        JLabel1.setFont(new Font("Segoe UI", 1, 18));
        JLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel1.setText("Daftar Pesanan");

        txt_list.setColumns(20);
        txt_list.setRows(5);
        txt_list.setEnabled(false);
        JScrollPane1.setViewportView(txt_list);

        btnLanjut.setFont(new Font("Segoe UI", 0, 14));
        btnLanjut.setText("Lanjutkan");
        btnLanjut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnLanjutActionPerformed(evt);
            }
        });

        JButton2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        JButton2.setText("Kembali");
        JButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

    }

    // ================ Method Action ============================
    private void btnLanjutActionPerformed(ActionEvent evt) {
        payment p = new payment(qOrder.totalPayment());
        p.setVisible(true);
        dispose();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        this.dispose();
    }

    public static void main(String[] args) {
        JFrame mainFrame = new detail_order();
        mainFrame.setVisible(true);
    }

}
