/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author a22dianart
 */
public class Exercicio4_3 extends JFrame {

    public Exercicio4_3() {

        setLayout(new BorderLayout());
        setTitle("Calculadora");
        JTextArea input = new JTextArea();

        JPanel botons = new JPanel();

        add(input, BorderLayout.PAGE_START);
        setSize(400, 500);
        setVisible(true);

    }

}
