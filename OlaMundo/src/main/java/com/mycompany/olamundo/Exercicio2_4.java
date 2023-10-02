/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;


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
        
        JPanel contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        setContentPane(contentPane);
        
        contentPane.addMouseListener(new MouseAdapter() { //usamos o MouseAdapter porque queremos solo ao facer click
            @Override
            public void mouseClicked(MouseEvent e) {
                if(contentPane.getBackground()==Color.WHITE){ //IMPORTANTE!!
                contentPane.setBackground(Color.CYAN);}
                else{
                    contentPane.setBackground(Color.WHITE);
                }
            }
        });
        
        
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

        setSize(600, 500);
        setVisible(true);
    }
}
