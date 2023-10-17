/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._organizando_a_aplicacion;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author a22dianart
 */
public class FormPanel extends JPanel {

    public FormPanel() {
        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(dim);

        setLayout(new GridBagLayout());

        Border innerBorder = BorderFactory.createTitledBorder("Add Person");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        JLabel nameLbl = new JLabel("Name:");
        JTextField nameTxt = new JTextField(10);
        JTextField occuTxt = new JTextField(10);
        JLabel occuLbl = new JLabel("Occupation: ");
        JButton okBtn = new JButton("OK");

        GridBagConstraints gbc = new GridBagConstraints();
        ////First row////

        gbc.weightx = 1;
        gbc.weighty = 0.1;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.NONE; //que ocupen o necesario
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.insets = new Insets(0, 0, 0, 5);
        add(nameLbl, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(0, 0, 0, 0);
        add(nameTxt, gbc);

        ////Second Row/////
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.insets = new Insets(0, 0, 0, 5);
        add(occuLbl, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(0, 0, 0, 0);
        add(occuTxt, gbc);

        //Last Row///
        gbc.weightx = 1;
        gbc.weighty = 2.0;

        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.gridy = 2;
        add(okBtn, gbc);
    }

}
