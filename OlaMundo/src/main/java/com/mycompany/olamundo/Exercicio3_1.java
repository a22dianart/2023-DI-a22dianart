/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author a22dianart
 */
public class Exercicio3_1 extends JFrame {

    public Exercicio3_1() {

        setLayout(new BorderLayout());

        JTextField caixaEsq = new JTextField("0", 20);
        JTextField caixaDer = new JTextField("0", 20);
        JButton sumarBtn = new JButton("Sumar");
        JLabel suma = new JLabel();

        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                try {
                    double num1 = Double.parseDouble(caixaEsq.getText());
                    double num2 = Double.parseDouble(caixaDer.getText());
                    double result = num1 + num2;
                    suma.setText(String.valueOf(result));
                } catch (NumberFormatException NFE) {
                    suma.setText("error");
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
        sumarBtn.addMouseListener(ml);

        add(caixaEsq, BorderLayout.LINE_START);
        add(caixaDer, BorderLayout.LINE_END);
        add(sumarBtn, BorderLayout.PAGE_START);
        add(suma, BorderLayout.CENTER);

        setSize(800, 200);
        setVisible(true);
    }

}
