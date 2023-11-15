/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;

/**
 *
 * @author a22dianart
 */
public class FormPanel extends JPanel {

    private FormListener formListener;

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
        JLabel ageLbl = new JLabel("Age:");
        JLabel emploLbl = new JLabel("Employment:");
        JLabel usLbl = new JLabel("US Citizen:");
        JLabel taxLbl = new JLabel("Tax ID:");
        JLabel genderLbl = new JLabel("Gender:");

        //Lista
        JList listaIdades = new JList();
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement(new AgeCategory(0, "Under 18"));
        modelo.addElement(new AgeCategory(1, "18 to 25"));
        modelo.addElement(new AgeCategory(2, "65 or over"));
        listaIdades.setModel(modelo);
        listaIdades.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //só selecccione un de cada vez
        listaIdades.setSelectedIndex(1); //para selecccionar o segundo
        JScrollPane jsp = new JScrollPane(listaIdades);
        jsp.setPreferredSize(new Dimension(115, 50));
        //Combo
        String comboBoxItems[] = {"employed", "self-employed", "unemployed"};
        JComboBox cb = new JComboBox(comboBoxItems);
        cb.setSelectedIndex(0);
        cb.setEditable(true);
        cb.setPreferredSize(new Dimension(115, 20));

        //Checkbox
        JCheckBox usChk = new JCheckBox();
        usChk.setSelected(true);
        //TextField
        JTextField taxTxt = new JTextField();
        taxTxt.setPreferredSize(new Dimension(115, 20));

        usChk.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    taxLbl.setEnabled(true);
                    taxTxt.setEnabled(true);
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    taxLbl.setEnabled(false);
                    taxTxt.setEnabled(false);
                }
            }
        });

        //RadioButtons
        JRadioButton maleBtn = new JRadioButton("male");
        maleBtn.setActionCommand("male"); //para que nos devolva o texto
        JRadioButton femaleBtn = new JRadioButton("female");
        femaleBtn.setActionCommand("female");

        ButtonGroup group = new ButtonGroup();
        group.add(maleBtn);
        group.add(femaleBtn);
        maleBtn.setSelected(true); //seleccionamos o male pro defecto

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                if (clickedButton == okBtn) {
                    if (formListener != null) {
                        FormEvent se = new FormEvent(this, nameTxt.getText(), occuTxt.getText(), listaIdades.getName(), cb.getSelectedItem().toString(), taxTxt.getText(), group.getSelection().getActionCommand());
                        formListener.textEmitted(se);
                    }
                }
                nameTxt.setText("");
                occuTxt.setText("");
                listaIdades.setSelectedIndex(1);
                cb.setSelectedIndex(0);
                usChk.setSelected(true);
                taxTxt.setText("");
                maleBtn.setSelected(true);

            }
        };
        okBtn.addActionListener(al);

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
        //Third Row
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        gbc.insets = new Insets(0, 0, 0, 5);
        add(ageLbl, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(0, 0, 0, 0);
        add(jsp, gbc);

        //Fourth Row
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        gbc.insets = new Insets(0, 0, 0, 5);
        add(emploLbl, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(0, 0, 0, 0);
        add(cb, gbc);
        //5 row
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        gbc.insets = new Insets(0, 0, 0, 5);
        add(usLbl, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(0, 0, 0, 0);
        add(usChk, gbc);
        //6 row
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        gbc.insets = new Insets(0, 0, 0, 5);
        add(taxLbl, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(0, 0, 0, 0);
        add(taxTxt, gbc);

        //7 row
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        gbc.insets = new Insets(0, 0, 0, 5);
        add(genderLbl, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(0, 0, 0, 0);
        add(maleBtn, gbc);

        //8 row
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(0, 0, 0, 0);
        add(femaleBtn, gbc);

        //Last Row///
        gbc.weightx = 1;
        gbc.weighty = 2.0;

        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.gridy = 8;

        add(okBtn, gbc);
    }

    public void setFormListener(FormListener formListener) {
        this.formListener = formListener;
    }

}

class AgeCategory { //distinta AgeCategory que a do modelo

    private int id;
    private String text;

    public AgeCategory(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

}
