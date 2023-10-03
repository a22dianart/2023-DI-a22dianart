/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import javax.swing.*;

/**
 *
 * @author a22dianart
 */
public class Exercicio3_3 extends JFrame {

    public Exercicio3_3() {
        setLayout(new FlowLayout());
        JLabel loginLabel = new JLabel("login");
        JPasswordField loginPass = new JPasswordField(10);
        JButton checkBtn = new JButton("Comprobar");

        JPanel contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        setContentPane(contentPane);//IMPORTANTE SENON NON FUNCIONA

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                char[] input = loginPass.getPassword();
                char[] correctPass = {'o', 'l', 'a'};

                if (Arrays.equals(input, correctPass)) {
                    contentPane.setBackground(Color.GREEN);

                } else {
                    contentPane.setBackground(Color.RED);

                }
            }
        };

        checkBtn.addActionListener(al);
        loginPass.addActionListener(al);

        add(loginLabel, FlowLayout.LEFT);
        add(loginPass, FlowLayout.CENTER);
        add(checkBtn, FlowLayout.RIGHT);

        setSize(400, 100);
        setVisible(true);
    }

}
