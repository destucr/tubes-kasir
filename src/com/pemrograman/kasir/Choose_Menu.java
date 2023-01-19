package com.pemrograman.kasir;

import javax.swing.*;
import java.awt.*;

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
        JButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JButton1.setText("Nasi Goreng");
        JButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButton1.addActionListener(evt -> jButton1ActionPerformed(evt));

        JButton2.setFont(new Font("Segoe UI", 1, 24)); // NOI18N
        JButton2.setText("Sate Ayam");
        JButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }


        });

        JButton3.setFont(new Font("Segoe UI", 1, 24)); // NOI18N
        JButton3.setText("Teh Botol");

        JButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        JButton4.setFont(new Font("Segoe UI", 1, 24)); // NOI18N
        JButton4.setText("Es Teh Manis");
        JButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }


        });

        JButton5.setFont(new Font("Segoe UI", 1, 24)); // NOI18N
        JButton5.setText("Ayam Bakar");
        JButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        JButton6.setFont(new Font("Segoe UI", 1, 24)); // NOI18N
        JButton6.setText("Mie Goreng");
        JButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }

        });

        JButton7.setFont(new Font("Segoe UI", 1, 24)); // NOI18N
        JButton7.setText("Kwetiau");
        JButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }

        });

        JButton8.setFont(new Font("Segoe UI", 1, 24)); // NOI18N
        JButton8.setText("Ayam Goreng");
        JButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }


        });

        JButton9.setFont(new Font("Segoe UI", 1, 24)); // NOI18N
        JButton9.setText("Es Jeruk");
        JButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });


        //Button Next
        JButton10.setFont(new Font("Segoe UI", 1, 18)); // NOI18N
        JButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        detail_order asd = new detail_order();
        asd.setVisible(true);// TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        add_count ac = new add_count(0);
        ac.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        add_count ac = new add_count(1);
        ac.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        add_count ac = new add_count(2);
        ac.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        add_count ac = new add_count(3);
        ac.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        add_count ac = new add_count(4);
        ac.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        add_count ac = new add_count(5);
        ac.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        add_count ac = new add_count(6);
        ac.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        add_count ac = new add_count(7);
        ac.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        add_count ac = new add_count(8);
        ac.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed




    public static void main(String[] args) {
        JFrame mainFrame = new Choose_Menu();
        mainFrame.setVisible(true);
    }
}
