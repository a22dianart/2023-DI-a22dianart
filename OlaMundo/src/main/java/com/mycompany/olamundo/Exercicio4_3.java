/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;

/**
 *
 * @author a22dianart
 */
public class Exercicio4_3 extends JFrame {

    public Exercicio4_3() {

        setLayout(new GridBagLayout());
        setTitle("Calculadora");
        GridBagConstraints gbc = new GridBagConstraints();

        Font font = new Font("Verdana", Font.BOLD, 14);
        JTextArea input = new JTextArea();
        input.setFont(font);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 1;
        gbc.weightx = 1;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0, 0, 0, 0);
        add(input, gbc);

        JButton setBtn = new JButton("7");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(setBtn, gbc);

        JButton oitBtn = new JButton("8");
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(oitBtn, gbc);

        JButton novBtn = new JButton("9");
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(novBtn, gbc);

        JButton barBtn = new JButton("/");
        gbc.gridx = 3;
        gbc.gridy = 1;
        add(barBtn, gbc);

        JButton catBtn = new JButton("4");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(catBtn, gbc);

        JButton cinBtn = new JButton("5");
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(cinBtn, gbc);

        JButton seiBtn = new JButton("6");
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(seiBtn, gbc);

        JButton astBtn = new JButton("*");
        gbc.gridx = 3;
        gbc.gridy = 2;
        add(astBtn, gbc);

        JButton unBtn = new JButton("1");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(unBtn, gbc);

        JButton douBtn = new JButton("2");
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(douBtn, gbc);

        JButton treBtn = new JButton("3");
        gbc.gridx = 2;
        gbc.gridy = 3;
        add(treBtn, gbc);

        JButton menBtn = new JButton("-");
        gbc.gridx = 3;
        gbc.gridy = 3;
        add(menBtn, gbc);

        JButton cerBtn = new JButton("0");
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(cerBtn, gbc);

        JButton punBtn = new JButton(".");
        gbc.gridx = 1;
        gbc.gridy = 4;
        add(punBtn, gbc);

        JButton iguBtn = new JButton("=");
        gbc.gridx = 2;
        gbc.gridy = 4;
        add(iguBtn, gbc);

        JButton maiBtn = new JButton("+");
        gbc.gridx = 3;
        gbc.gridy = 4;
        add(maiBtn, gbc);

        setSize(400, 500);
        setVisible(true);

    }

}
