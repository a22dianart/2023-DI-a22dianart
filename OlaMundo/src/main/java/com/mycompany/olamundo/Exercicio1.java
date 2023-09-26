/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author a22dianart
 */
public class Exercicio1 extends JFrame implements ActionListener {
// Declarar os compoñentes como variables privadas de instancia

    private JTextArea textArea;
    private JButton aceptarButton;
    private JLabel label1;

    public Exercicio1() {
        super("Ola Mundo!");
// Establecer o Layout
        setLayout(new BorderLayout());
// Inicializar os compoñentes
        textArea = new JTextArea();
        aceptarButton = new JButton("Aceptar");
        aceptarButton.addActionListener(new ActionListener() { //faria os dous se ponho mais dun
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pulsaches o botón");
            }

        }); //clase anonima

        aceptarButton.addActionListener((ae) -> { //fai primeiro o ultimo
            System.out.println("Lambda");

        }); //lambda

        /*
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Botón pulsado");
            }
        }; //OUTRA FORMA (NESTE PODO REUTILIZAR al)
         */
        aceptarButton.addActionListener(this); //necesitamos o implements sen esta opcion no
        label1 = new JLabel("Diana", SwingConstants.CENTER); //o texto do label centrado
        label1.setFont(new Font("Arial", Font.ITALIC, 24)); //caracteristicas da fonte

// engadir os compoñentes
        add(textArea, BorderLayout.CENTER);
        add(aceptarButton, BorderLayout.PAGE_END);
        add(label1, BorderLayout.PAGE_START);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //centrado
        setResizable(false);//non poder cambiar tamaño
        setVisible(true); //SEMPRE DE ULTIMO

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Implementando a interface");
    }
}
