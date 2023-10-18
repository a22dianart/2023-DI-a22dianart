/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author a22dianart
 */
public class SouthPanel extends JPanel {

    public SouthPanel() {
        FlowLayout fl = new FlowLayout();
        fl.setAlignment(WIDTH);
        setLayout(fl);

        JButton borrarBtn = new JButton("Borrar");
        JTextField insertTxt = new JTextField();
        JButton engadirBtn = new JButton("Engadir");

        add(borrarBtn);
        add(insertTxt);
        add(engadirBtn);

    }

}
