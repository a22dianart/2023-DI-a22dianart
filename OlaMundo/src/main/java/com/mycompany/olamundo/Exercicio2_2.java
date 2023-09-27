/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author a22dianart
 */
public class Exercicio2_2 extends JFrame {

    public Exercicio2_2() {

        setLayout(new FlowLayout());

        JButton esqButton = new JButton("Esquerda");
        JButton cenButton = new JButton("Centro");
        JButton derButton = new JButton("Dereita");

        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //setTitle("anflnal");
                String comando = e.getActionCommand();
                if (comando.equals("Esquerda")) {
                    setTitle("Esquerda");
                } else if (comando.equals("Centro")) {
                    setTitle("Centro");
                } else {
                    setTitle("Dereita");
                }
            }
        };

        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                //seria o mesmo que o actionlistener
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {

            }

            @Override
            public void mouseEntered(MouseEvent me) {
                getContentPane().setBackground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                getContentPane().setBackground(Color.BLUE);
            }

        };
        esqButton.addActionListener(al);
        cenButton.addActionListener(al);
        derButton.addActionListener(al);
        esqButton.addMouseListener(ml);
        cenButton.addMouseListener(ml);
        derButton.addMouseListener(ml);

        add(esqButton);
        add(cenButton);
        add(derButton);

        getContentPane().setBackground(Color.BLUE);
        setSize(600, 500);
        setVisible(true);
    }

}
