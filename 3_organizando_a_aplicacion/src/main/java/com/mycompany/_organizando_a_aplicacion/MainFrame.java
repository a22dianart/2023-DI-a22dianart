/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._organizando_a_aplicacion;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import javax.swing.*;

/**
 *
 * @author a22dianart
 */
public class MainFrame extends JFrame {

    private JTextArea textArea;
    private JButton aceptarButton;
    private FormPanel formPanel;

    public MainFrame() {

        super("Ola Mundo");

        setLayout(new BorderLayout());

        TextPanel textPanel = new TextPanel();
        formPanel = new FormPanel(); //antes que o menu bar
        ToolBar toolbar = new ToolBar();

        setJMenuBar(createMenuBar()); //O MENU BAR

        toolbar.setStringListener(new StringListener() {
            @Override
            public void textEmitted(StringEvent se) {
                textPanel.appendText(se.getText());
            }
        });

        formPanel.setFormListener(new FormListener() {
            @Override
            public void textEmitted(FormEvent e) {
                textPanel.appendText(e.getText());
            }

        });

        aceptarButton = new JButton("Aceptar");

        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                textPanel.appendText("holaMundo\n");
            }
        });

        add(textPanel, BorderLayout.CENTER);

        add(toolbar, BorderLayout.NORTH);

        add(aceptarButton, BorderLayout.PAGE_END);

        add(formPanel, BorderLayout.LINE_START);

        setSize(
                600, 500);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        JMenuItem exItem = new JMenuItem("Export Data...");
        exItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        JMenuItem imItem = new JMenuItem("Import Data...");
        imItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        exitItem.setMnemonic(KeyEvent.VK_X);
        fileMenu.add(exItem);
        fileMenu.add(imItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        JMenu winMenu = new JMenu("Window");
        JMenu showMenu = new JMenu("Show");
        JCheckBoxMenuItem personItem = new JCheckBoxMenuItem("Person Form");
        personItem.setSelected(true);
        showMenu.add(personItem);
        winMenu.add(showMenu);

        menuBar.add(fileMenu);
        menuBar.add(winMenu);

        //Listeners
        ActionListener exitListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        exitItem.addActionListener(exitListener);
        personItem.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    formPanel.setVisible(true);
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    formPanel.setVisible(false);
                }
            }
        });
        return menuBar;
    }

}
