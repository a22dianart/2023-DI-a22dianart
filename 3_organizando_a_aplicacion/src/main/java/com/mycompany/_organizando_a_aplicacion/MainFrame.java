/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._organizando_a_aplicacion;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author a22dianart
 */
public class MainFrame extends JFrame {

    private JTextArea textArea;
    private JButton aceptarButton;

    public MainFrame() {

        super("Ola Mundo");

        setLayout(new BorderLayout());

        TextPanel textPanel = new TextPanel();
        FormPanel formPanel = new FormPanel();

        ToolBar toolbar = new ToolBar();
        toolbar.setTextListener(new StringListener() {
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });

        aceptarButton = new JButton("Aceptar");

        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                textPanel.appendText("holaMundo\n");
            }
        });

        add(textPanel, BorderLayout.CENTER);

        add(toolbar, BorderLayout.NORTH);

        add(aceptarButton, BorderLayout.PAGE_END);

        add(formPanel, BorderLayout.LINE_START);

        setSize(
                600, 500);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(
                true);
    }

}
