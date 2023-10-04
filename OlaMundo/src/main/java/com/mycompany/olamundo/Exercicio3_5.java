/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author diana
 */
public class Exercicio3_5 extends JFrame {

    public Exercicio3_5() {
        setLayout(new BorderLayout());

        JTextArea allText = new JTextArea();
        JTextField userText = new JTextField();//JTextField xa que o outro non ten para engadir o ActionListener
        allText.setEditable(false);//non editable

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                allText.append(" " + userText.getText());
                userText.setSelectionStart(0);
                userText.setSelectionEnd(userText.getText().length());
            }
        };
        userText.addActionListener(al);
        add(allText, BorderLayout.CENTER);
        add(userText, BorderLayout.PAGE_END);
        setSize(400, 500);
        setVisible(true);

    }

}
