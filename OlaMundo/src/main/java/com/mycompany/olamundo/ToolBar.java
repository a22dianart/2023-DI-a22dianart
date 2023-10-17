/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olamundo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author a22dianart
 */
public class ToolBar extends JPanel {

    private StringListener textListener;

    public ToolBar() {

        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        setLayout(fl);

        JButton helloBtn = new JButton("Hello");
        JButton byeBtn = new JButton("Goodbye");

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                if (clickedButton == helloBtn) {
                    if (textListener != null) {
                        textListener.textEmitted("Hello\n");
                    }
                } else if (clickedButton == byeBtn) {
                    if (textListener != null) {
                        textListener.textEmitted("Goodbye\n");
                    }
                }
            }
        };
        helloBtn.addActionListener(al);
        byeBtn.addActionListener(al);
        add(helloBtn);
        add(byeBtn);
    }

    public void setTextListener(StringListener textListener) {
        this.textListener = textListener;
    }

}
