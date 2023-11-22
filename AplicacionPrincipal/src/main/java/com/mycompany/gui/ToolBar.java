/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

/**
 *
 * @author a22dianart
 */
public class ToolBar extends JToolBar {

    private StringListener stringListener;

    public ToolBar() {

        JButton importBtn = new JButton();
        importBtn.setIcon(createIcon("/Import16.gif"));
        JButton saveBtn = new JButton();
        saveBtn.setIcon(createIcon("/Save16.gif"));

        importBtn.setToolTipText("Import");
        saveBtn.setToolTipText("Save");

        add(importBtn);
        add(saveBtn);
        setFloatable(false); //para que non se poida mover
    }

    public void setStringListener(StringListener stringListener) {
        this.stringListener = stringListener;
    }

    private ImageIcon createIcon(String path) {
        URL url = getClass().getResource(path);
        if (url == null) {
            System.err.println("Unable to load image: " + path);
        }
        ImageIcon icon = new ImageIcon(url);
        return icon;
    }

}
