/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author a22dianart
 */
public class Exercicio2 extends JFrame {

    private JButton sairButton;

    public Exercicio2() {

        setLayout(new BorderLayout());

        sairButton = new JButton("Saír");

        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        sairButton.addActionListener(al);

        add(sairButton, BorderLayout.PAGE_END);
        setSize(600, 500);
        setVisible(true);

    }

}
