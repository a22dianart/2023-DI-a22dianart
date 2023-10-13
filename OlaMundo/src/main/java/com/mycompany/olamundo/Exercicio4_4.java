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
public class Exercicio4_4 extends JFrame {

    public Exercicio4_4() {

        setLayout(new GridBagLayout());
        setTitle("Formulario");
        GridBagConstraints gbc = new GridBagConstraints();

        //setBorder(BorderFactory.createTitledBorder("Add Person"));
        JLabel nameLbl = new JLabel("Name: ");
        JLabel occuLbl = new JLabel("Occupation: ");
        JTextArea nameTxt = new JTextArea();
        JTextArea occuTxt = new JTextArea();
        JButton okBtn = new JButton("OK");

        gbc.gridx = 0;
        gbc.gridy = 0;

        setSize(400, 500);
        setVisible(true);

    }

}
