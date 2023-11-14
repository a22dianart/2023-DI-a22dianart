/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

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

    private StringListener stringListener;

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
                    if (stringListener != null) {
                        StringEvent se = new StringEvent(this, "Hello\n");
                        stringListener.textEmitted(se);
                    }
                } else if (clickedButton == byeBtn) {
                    if (stringListener != null) {
                        StringEvent se = new StringEvent(this, "Goodbye\n");
                        stringListener.textEmitted(se);
                    }
                }
            }
        };
        helloBtn.addActionListener(al);
        byeBtn.addActionListener(al);
        add(helloBtn);
        add(byeBtn);
    }

    public void setStringListener(StringListener stringListener) {
        this.stringListener = stringListener;
    }

}
