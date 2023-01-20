package com.pemrograman.kasir;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
        this.setSize(400, 500);

        JLabel1.setFont(new Font("Segoe UI", 1, 18));
        JLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel1.setText("Judul Makanan");
        JLabel1.setHorizontalTextPosition(SwingConstants.CENTER);

        JLabel2.setFont(new Font("Segoe UI", 0, 14));
        JLabel2.setText("Jumlah");

        JLabel3.setText("porsi");

        JLabel4.setFont(new Font("Segoe UI", 0, 14));
        JLabel4.setText("Keterangan");

        txt_desc.setColumns(20);
        txt_desc.setFont(new Font("Segoe UI", 0, 14));
        txt_desc.setRows(5);

        //Button simpan
        JButton1.setFont(new Font("Segoe UI", 0, 14));
        JButton1.setText("Simpan");
        JButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_count.setFont(new Font("Segoe UI", 0, 14));
        txt_count.setModel(new SpinnerNumberModel(0, 0, null, 1));
    }

    //Method action button next
    private void jButton1ActionPerformed(ActionEvent evt) {
        int count = (Integer) txt_count.getValue();
        String desc = txt_desc.getText();

        order_center.setValue(index, count,desc);

        this.dispose();
    }

    public static void main(String[] args) {

    }
}
