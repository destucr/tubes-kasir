package com.pemrograman.kasir;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
        this.setSize(500, 500);
        //jPanel1.setBackground(new Color(0, 153, 102));

        jLabel1.setFont(new Font("Tahoma", 1, 18));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pembayaran");

        jLabel2.setFont(new Font("Tahoma", 0, 14));
        jLabel2.setText("Total Pesanan ");

        jLabel3.setFont(new Font("Tahoma", 0, 14));
        jLabel3.setText("PPN");

        jLabel4.setFont(new Font("Tahoma", 0, 14));
        jLabel4.setText("Total");

        jLabel5.setFont(new Font("Tahoma", 0, 14));
        jLabel5.setText("Pembayaran");

        jLabel6.setFont(new Font("Tahoma", 0, 14));
        jLabel6.setText("Kembalian");

        txt_totalpayment.setFont(new Font("Tahoma", 0, 14));
        txt_totalpayment.setText("jLabel7");

        txt_ppn.setFont(new Font("Tahoma", 0, 14));
        txt_ppn.setText("jLabel8");

        txt_payment.setFont(new Font("Tahoma", 0, 14));
        txt_payment.setText("jLabel9");

        txt_pay.setFont(new Font("Tahoma", 0, 14));
        txt_pay.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                txt_payKeyReleased(evt);
            }
            public void keyTyped(KeyEvent evt) {
                txt_payKeyTyped(evt);
            }
        });

        txt_change.setFont(new Font("Tahoma", 0, 14));
        txt_change.setText(": Rp. 0");

        jButton1.setFont(new Font("Tahoma", 1, 14));
        jButton1.setText("Selesai");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Kembali");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
    }

    private void txt_payKeyReleased(KeyEvent evt) {
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
    }

    private void txt_payKeyTyped(KeyEvent evt) {
        if(uFilter.filterDigit(evt) == false){
            evt.consume();
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Masukan Bukan Digit!","Masukan Salah",JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method untuk button lanjutkan
    private void jButton1ActionPerformed(ActionEvent evt) {
        order_center.clearOrder();
        dispose();
    }

    // Method untuk button kembali
    private void jButton2ActionPerformed(ActionEvent evt) {
        dispose();
    }

    public static void main(String[] args) {
        //JFrame mainFrame = new payment();
        //mainFrame.setVisible(true);
    }
}