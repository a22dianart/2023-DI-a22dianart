/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author a22dianart
 */
public class Exercicio3_6 extends JFrame {

    public Exercicio3_6() {
        setLayout(new GridBagLayout());

        //NUMBERS
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        JFormattedTextField numbersText = new JFormattedTextField(numberFormat);
        numbersText.setColumns(20);
        numbersText.setValue(0.5);
        JLabel numberLbl = new JLabel("numeros");
        JButton printNumberBtn = new JButton("Imprimir numeros");
        printNumberBtn.setActionCommand("print numbers");

        //DATE
        DateFormat dateFormat = DateFormat.getDateInstance();
        JFormattedTextField dateText = new JFormattedTextField(dateFormat);
        dateText.setColumns(20);
        dateText.setValue(DateFormat.DATE_FIELD);
        JLabel dateLbl = new JLabel("data");
        JButton printDateBtn = new JButton("Imprimir data");
        printDateBtn.setActionCommand("print date");

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String comando = e.getActionCommand();
                if (comando.equals("print numbers")) {
                    System.out.println(numbersText.getText());
                } else {
                    System.out.println(dateText.getText());
                }
            }
        };

        printNumberBtn.addActionListener(al);
        printDateBtn.addActionListener(al);

        //Numbers Label
        GridBagConstraints gbcNumberLbl = new GridBagConstraints();
        gbcNumberLbl.gridx = 0;
        gbcNumberLbl.gridy = 0;
        add(numberLbl, gbcNumberLbl);

        //Numbers
        GridBagConstraints gbcNumbersTxt = new GridBagConstraints();
        gbcNumbersTxt.gridx = 0;
        gbcNumbersTxt.gridy = 1;
        add(numbersText, gbcNumbersTxt);

        //Numbers Button
        GridBagConstraints gbcNumberBtn = new GridBagConstraints();
        gbcNumberBtn.gridx = 0;
        gbcNumberBtn.gridy = 2;
        add(printNumberBtn, gbcNumberBtn);

        //Date Label
        GridBagConstraints gbcDateLbl = new GridBagConstraints();
        gbcDateLbl.gridx = 1;
        gbcDateLbl.gridy = 0;
        add(dateLbl, gbcDateLbl);

        //Date
        GridBagConstraints gbcDateTxt = new GridBagConstraints();
        gbcDateTxt.gridx = 1;
        gbcDateTxt.gridy = 1;
        add(dateText, gbcDateTxt);

        //Date Button
        GridBagConstraints gbcDateBtn = new GridBagConstraints();
        gbcDateBtn.gridx = 1;
        gbcDateBtn.gridy = 2;
        add(printDateBtn, gbcDateBtn);

        setSize(1000, 300);
        setVisible(true);
    }

}
