/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.BorderLayout;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author a22dianart
 */
public class Exercicio3_7 extends JFrame {

    public Exercicio3_7() {

        setLayout(new BorderLayout());

        JLabel codLbl = new JLabel("Cod. Postal");

        MaskFormatter pattern;
        try { //SE NON SE PON NO TRY NON FUNCIONAAA
            pattern = new MaskFormatter("#####");
            JFormattedTextField codText = new JFormattedTextField(pattern);
            codText.setText("13075");
            add(codText, BorderLayout.CENTER);
        } catch (ParseException ex) {
            Logger.getLogger(Exercicio3_7.class.getName()).log(Level.SEVERE, null, ex);
        }

        JButton textBtn = new JButton("Print");

        add(codLbl, BorderLayout.NORTH);

        add(textBtn, BorderLayout.SOUTH);

        setSize(1000, 300);
        setVisible(true);

    }

}
