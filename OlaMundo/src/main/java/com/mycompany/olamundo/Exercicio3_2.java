/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author a22dianart
 */
public class Exercicio3_2 extends JFrame {

    public Exercicio3_2() {
        setLayout(new BorderLayout());

        JTextArea conTa = new JTextArea("0");
        JButton incrBtn = new JButton("Increments");
        JButton restartBtn = new JButton("Restart");
        conTa.setEditable(false);//para non modificar o de dentro por teclado

        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Object comando = me.getSource();
                if (comando.equals(incrBtn)) {
                    int number = Integer.parseInt(conTa.getText());
                    int result = number + 1;
                    conTa.setText(String.valueOf(result));
                } else {
                    conTa.setText("0");

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
        incrBtn.addMouseListener(ml);
        restartBtn.addMouseListener(ml);

        add(conTa, BorderLayout.PAGE_START);
        add(incrBtn, BorderLayout.LINE_START);
        add(restartBtn, BorderLayout.LINE_END);

        setSize(400, 100);
        setVisible(true);

    }

}
