/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author a22dianart
 */
public class Exercicio2_4 extends JFrame {

    public Exercicio2_4() {

        setLayout(new FlowLayout());

        JButton esqButton = new JButton("Esq");
        JButton derButton = new JButton("Der");
        JLabel etiqueta = new JLabel();
        // frame.getContentPane();
        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Object comando = me.getSource();
                if (comando.equals(esqButton)) {
                    etiqueta.setText("Esquerda");
                } else {
                    etiqueta.setText("Dereita");
                }
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {

            }

            @Override
            public void mouseEntered(MouseEvent me) {

            }

            @Override
            public void mouseExited(MouseEvent me) {

            }

        };

        esqButton.addMouseListener(ml);

        derButton.addMouseListener(ml);

        add(esqButton);
        add(derButton);
        add(etiqueta);

        getContentPane().setBackground(Color.pink);
        setSize(600, 500);
        setVisible(true);
    }
}
