/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author a22dianart
 */
public class Exercicio3_4 extends JFrame {

    public Exercicio3_4() {
        setLayout(new BorderLayout());
        JTextArea userText = new JTextArea(5,20); //com textField não, con este o texto vai aumentando para abaixo
        JScrollPane panelDeslizable = new JScrollPane(userText);
        
        panelDeslizable.setViewportView(userText); //metemola
        panelDeslizable.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); //que apareza soamente cando se precise (por defecto)
        panelDeslizable.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);//que apareza soamente cando se precise
        userText.setLineWrap(true); //para que cambie para outra linha no JTextArea
        userText.setWrapStyleWord(true); //para que non corte as palabras
        
        add(panelDeslizable, BorderLayout.PAGE_START); //poñemos solo o Pane
        
        setSize(400, 500);
        setVisible(true);
    }

}
