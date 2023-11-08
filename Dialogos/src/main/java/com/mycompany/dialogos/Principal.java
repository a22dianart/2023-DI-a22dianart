/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dialogos;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author a22dianart
 */
public class Principal extends JFrame {

    public Principal() {
        super("Aplicación");

        setLayout(new FlowLayout());

        JButton messageButton = new JButton("Message");

        JButton confirmButton = new JButton("Confirm");

        JButton inputButton = new JButton("Input");

        JButton optionButton = new JButton("Option");

        JFrame jf = this; //???
        messageButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(jf, "Información", "TÍTULO", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(jf, "Aviso", "TÍTULO", JOptionPane.WARNING_MESSAGE);
                JOptionPane.showMessageDialog(jf, "Erro", "TÍTULO", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(jf, "Plano", "TÍTULO", JOptionPane.PLAIN_MESSAGE);
                Icon casinha = createIcon("/casinha.png");
                JOptionPane.showMessageDialog(jf, "Icono personalizado", "TÍTULO", JOptionPane.PLAIN_MESSAGE, casinha);
            }
        });

        confirmButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int confirmado = JOptionPane.showConfirmDialog(jf, "Confirmas?", "TITULO DA VENTÁ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                switch (confirmado) {
                    case JOptionPane.YES_OPTION:
                        System.out.println("Pulsouse a opción de \"Si\" ");
                        break;
                    case JOptionPane.NO_OPTION:
                        System.out.println("Pulsouse a opción de \"No\"");
                        break;
                    case JOptionPane.CANCEL_OPTION:
                        System.out.println("Pulsouse a opción de \"Cancelar\" ");
                        break;
                    case JOptionPane.CLOSED_OPTION:
                        System.out.println("Saiuse da ventá ");
                        break;
                    default:
                        break;
                }
            }
        });

        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //caixa de texto
                String name = JOptionPane.showInputDialog(jf, "Escribe algo", "CON TEXTO", JOptionPane.INFORMATION_MESSAGE);
                System.out.println(name); //imprimo por consola

                //con opcions
                int opcion = JOptionPane.showInputDialog(null, "Método con 7 parámetros", "Título del diálogo", createIcon("/casinha.png");,JOptionPane.INFORMATION_MESSAGE, new Object[]{"Opción 1", "Opción 2", "Opción 3", "Opción 4"}




        ,
                        "Opción 2"); //<----CONTINUAR   AQUI
            }
        });
        setSize(
                600, 500);

        add(messageButton);
        add(confirmButton);
        add(inputButton);
        add(optionButton);

        setSize(600, 500);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }

    private ImageIcon createIcon(String path) {
        URL url = getClass().getResource(path);
        if (url == null) {
            System.err.println("Unable to load image: " + path);
        }
        ImageIcon icon = new ImageIcon(url);
        return icon;
    }

}
