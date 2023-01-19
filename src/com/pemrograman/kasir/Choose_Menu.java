package com.pemrograman.kasir;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Choose_Menu extends JFrame {
    private JPanel menuPanel;
    private JLabel JLabel1;
    private JButton JButton1;
    private JButton JButton2;
    private JButton JButton6;
    private JButton JButton5;
    private JButton JButton7;
    private JButton JButton8;
    private JButton JButton3;
    private JButton JButton4;
    private JButton JButton9;
    private JButton JButton10;

    public Choose_Menu(){
        this.setContentPane(menuPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700,500);


        // Ubah Font MenuJlabel (KASIR RESTORAN)
        JLabel1.setFont(JLabel1.getFont().deriveFont(JLabel1.getFont().getStyle() | java.awt.Font.BOLD, JLabel1.getFont().getSize()+28));

        // Ubah Button Nasi Goreng
        JButton1.setFont(new Font("Segoe UI", Font.BOLD, 24));
        JButton1.setText("Nasi Goreng");
        JButton1.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
        JButton1.addActionListener(evt -> jButton1ActionPerformed(evt));

        JButton2.setFont(new Font("Segoe UI", 1, 24));
        JButton2.setText("Sate Ayam");
        JButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }


        });

        JButton3.setFont(new Font("Segoe UI", 1, 24));
        JButton3.setText("Teh Botol");

        JButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        JButton4.setFont(new Font("Segoe UI", 1, 24));
        JButton4.setText("Es Teh Manis");
        JButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }


        });

        JButton5.setFont(new Font("Segoe UI", 1, 24));
        JButton5.setText("Ayam Bakar");
        JButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        JButton6.setFont(new Font("Segoe UI", 1, 24));
        JButton6.setText("Mie Goreng");
        JButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }

        });

        JButton7.setFont(new Font("Segoe UI", 1, 24));
        JButton7.setText("Kwetiau");
        JButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }

        });

        JButton8.setFont(new Font("Segoe UI", 1, 24));
        JButton8.setText("Ayam Goreng");
        JButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }


        });

        JButton9.setFont(new Font("Segoe UI", 1, 24));
        JButton9.setText("Es Jeruk");
        JButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });


        //Button Next
        JButton10.setFont(new Font("Segoe UI", 1, 18));
        JButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
    }

    // ============ Method untuk action listener ==============
    private void jButton10ActionPerformed(ActionEvent evt) {
        detail_order asd = new detail_order();
        asd.setVisible(true);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        add_count ac = new add_count(0);
        ac.setVisible(true);
    }
    private void jButton6ActionPerformed(ActionEvent evt) {
        add_count ac = new add_count(1);
        ac.setVisible(true);
    }
    private void jButton7ActionPerformed(ActionEvent evt) {
        add_count ac = new add_count(2);
        ac.setVisible(true);
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        add_count ac = new add_count(3);
        ac.setVisible(true);
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        add_count ac = new add_count(4);
        ac.setVisible(true);
    }

    private void jButton8ActionPerformed(ActionEvent evt) {
        add_count ac = new add_count(5);
        ac.setVisible(true);
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        add_count ac = new add_count(6);
        ac.setVisible(true);
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        add_count ac = new add_count(7);
        ac.setVisible(true);
    }

    private void jButton9ActionPerformed(ActionEvent evt) {
        add_count ac = new add_count(8);
        ac.setVisible(true);
    }


    public static void main(String[] args) {
        JFrame mainFrame = new Choose_Menu();
        mainFrame.setVisible(true);
    }
}
