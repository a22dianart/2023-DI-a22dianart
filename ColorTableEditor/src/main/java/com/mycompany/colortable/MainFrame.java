/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colortable;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author a22dianart
 */
public class MainFrame extends JFrame {

    public MainFrame() {
        super("Cores");
        setLayout(new BorderLayout());

        TablePanel table = new TablePanel();
        add(table, BorderLayout.CENTER);

        setSize(
                1000, 500);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);

    }

}
