/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author a22dianart
 */
public class Exercicio4_1 extends JFrame {

    public Exercicio4_1() {
        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Este é un título");
        JLabel nome = new JLabel("Diana");
        JTextArea texto = new JTextArea();

        JButton PrBtn = new JButton("Primeiro");
        JButton SgBtn = new JButton("Segundo");
        JButton TrBtn = new JButton("Terceiro");
        JButton CtBtn = new JButton("Cuarto");
        JButton QtBtn = new JButton("Quinto");

        JButton PrBtn2 = new JButton("Primeiro");
        JButton SgBtn2 = new JButton("Segundo");
        JButton TrBtn2 = new JButton("Terceiro");
        JButton CtBtn2 = new JButton("Cuarto");
        JButton QtBtn2 = new JButton("Quinto");

        JPanel northPane = new JPanel();
        FlowLayout northLayout = new FlowLayout();
        northLayout.setAlignment(FlowLayout.CENTER); //antes de asignalo
        northPane.setLayout(northLayout);

        JPanel southPane = new JPanel();
        southPane.setLayout(northLayout); //ten o mesmo que o north

        JPanel westPane = new JPanel();
        GridLayout westLayout = new GridLayout(5, 1);
        westPane.setLayout(westLayout);

        JPanel eastPane = new JPanel();
        eastPane.setLayout(westLayout);

        add(westPane, BorderLayout.WEST);
        add(northPane, BorderLayout.NORTH);
        add(southPane, BorderLayout.SOUTH);
        add(eastPane, BorderLayout.EAST);

        northPane.add(titulo);
        southPane.add(nome);

        add(texto, BorderLayout.CENTER);

        westPane.add(PrBtn);
        westPane.add(SgBtn);
        westPane.add(TrBtn);
        westPane.add(CtBtn);
        westPane.add(QtBtn);

        eastPane.add(PrBtn2);
        eastPane.add(SgBtn2);
        eastPane.add(TrBtn2);
        eastPane.add(CtBtn2);
        eastPane.add(QtBtn2);

        setSize(400, 500);
        setVisible(true);

    }

}
