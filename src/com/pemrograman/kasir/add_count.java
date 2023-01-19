package com.pemrograman.kasir;

import javax.swing.*;
import java.awt.*;

public class add_count extends JFrame {
    private JPanel JPanel1;
    private JSpinner txt_count;
    private JTextArea txt_desc;
    private JButton JButton1;
    private JLabel JLabel1;
    private JLabel JLabel2;
    private JLabel JLabel3;
    private JLabel JLabel4;
    public int index;

    public add_count(int id) {
        add_count_innit();
        index = id;
        if(order_center.setDisplay(index) != -1){
            txt_count.setValue(order_center.order.get(index).get(1));
            txt_desc.setText(order_center.description.get(index));
        }
    }
    private void add_count_innit(){
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(700, 500);

        JLabel1.setFont(new Font("Segoe UI", 1, 18)); // NOI18N
        JLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel1.setText("Judul Makanan");
        JLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        JLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLabel2.setText("Jumlah");

        JLabel3.setText("porsi");

        JLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLabel4.setText("Keterangan");

        txt_desc.setColumns(20);
        txt_desc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_desc.setRows(5);
        //JScrollPane1.setViewportView(txt_desc);

        //Button simpan
        JButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JButton1.setText("Simpan");
        JButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_count.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_count.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        txt_count.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_countInputMethodTextChanged(evt);
            }
        });
        txt_count.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_countKeyTyped(evt);
            }
        });

    }

    //Method action button next
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int count = (Integer) txt_count.getValue();
        String desc = txt_desc.getText();

        order_center.setValue(index, count,desc);

        this.dispose();
    }


    private void txt_countKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_countKeyTyped

    }//GEN-LAST:event_txt_countKeyTyped

    private void txt_countInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_countInputMethodTextChanged

    }



    public static void main(String[] args) {
        JFrame mainFrame = new Choose_Menu();
        mainFrame.setVisible(true);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_count(0).setVisible(true);
            }
        });
    }
}
