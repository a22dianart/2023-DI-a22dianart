/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.BorderLayout;
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
        // Establecer o Layout
        setLayout(new BorderLayout());
// Inicializar os compoñentes
        textArea = new JTextArea();
        aceptarButton = new JButton("Aceptar");
// engadir os compoñentes
        add(textArea, BorderLayout.CENTER); //non fai falta meterlle o contentPane (xa o fai por defecto)
        add(aceptarButton, BorderLayout.PAGE_END);
        setSize(600, 500);
        // Establece a funcionalidade ao cerrar o frame (pulsar X)
        // saír do programa
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Fai o frame visible (por defecto é invisible)
        setVisible(true);
    }

}
