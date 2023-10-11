/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author a22dianart
 */
public class Exercicio4_2 extends JFrame {

    final static String GREENPANEL = "Panel verde";
    final static String ORANGEPANEL = "Panel naranxa";
    final static String REDPANEL = "Panel vermello";

    public Exercicio4_2() {

        setLayout(new BorderLayout());
        setTitle("Probando o CardLayout");
        JLabel titulo = new JLabel("Este é un título");
        JLabel nome = new JLabel("Diana");

        JButton PrBtn = new JButton("Primeira");
        JButton SgBtn = new JButton("Segunda");
        JButton TrBtn = new JButton("Terceira");
        JButton SeBtn = new JButton("Seguinte");
        JButton AnBtn = new JButton("Anterior");

        JButton PrBtn2 = new JButton("Primeira");
        JButton SgBtn2 = new JButton("Segunda");
        JButton TrBtn2 = new JButton("Terceira");
        JButton SeBtn2 = new JButton("Seguinte");
        JButton AnBtn2 = new JButton("Anterior");

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

        //cartas cardlayout
        JPanel card1 = new JPanel();
        JPanel card2 = new JPanel();
        JPanel card3 = new JPanel();
        card1.setBackground(Color.GREEN);
        card2.setBackground(Color.ORANGE);
        card3.setBackground(Color.RED);
        card1.add(new JLabel("verde"));
        card2.add(new JLabel("naranxa"));
        card3.add(new JLabel("vermello"));

        JPanel cards = new JPanel(new CardLayout()); //o que contén as cards
        cards.add(card1, GREENPANEL);
        cards.add(card2, ORANGEPANEL);
        cards.add(card3, REDPANEL);

        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) (cards.getLayout());
                String comando = e.getActionCommand();
                if (comando.equals("Primeira")) {
                    cl.show(cards, GREENPANEL);
                } else if (comando.equals("Segunda")) {
                    cl.show(cards, ORANGEPANEL);
                } else if (comando.equals("Terceira")) {
                    cl.show(cards, REDPANEL);
                } else if (comando.equals("Seguinte")) {
                    cl.next(cards);
                } else {
                    cl.previous(cards);
                }
            }
        };

        PrBtn.addActionListener(al);
        SgBtn.addActionListener(al);
        TrBtn.addActionListener(al);
        SeBtn.addActionListener(al);
        AnBtn.addActionListener(al);

        PrBtn2.addActionListener(al);
        SgBtn2.addActionListener(al);
        TrBtn2.addActionListener(al);
        SeBtn2.addActionListener(al);
        AnBtn2.addActionListener(al);

        //engadir
        add(cards, BorderLayout.CENTER);
        add(westPane, BorderLayout.WEST);
        add(northPane, BorderLayout.NORTH);
        add(southPane, BorderLayout.SOUTH);
        add(eastPane, BorderLayout.EAST);

        northPane.add(titulo);
        southPane.add(nome);

        westPane.add(PrBtn);
        westPane.add(SgBtn);
        westPane.add(TrBtn);
        westPane.add(SeBtn);
        westPane.add(AnBtn);

        eastPane.add(PrBtn2);
        eastPane.add(SgBtn2);
        eastPane.add(TrBtn2);
        eastPane.add(SeBtn2);
        eastPane.add(AnBtn2);

        setSize(400, 500);
        setVisible(true);

    }

}
