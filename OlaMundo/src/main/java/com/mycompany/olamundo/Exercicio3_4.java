/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author a22dianart
 */
public class Exercicio3_4 extends JFrame {

    public Exercicio3_4() {
        setLayout(new BorderLayout());
        JTextField userText = new JTextField();
        userText.setBounds(0, 0, 5, 20);

        add(userText, BorderLayout.PAGE_START);
        setSize(400, 500);
        setVisible(true);
    }

}
