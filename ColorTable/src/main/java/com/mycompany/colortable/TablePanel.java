/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colortable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author a22dianart
 */
public class TablePanel extends JPanel {

    private JTable table;
    private ColorTableModel colorTableModel;

    public TablePanel() {
        colorTableModel = new ColorTableModel();
        List<Color> cores = new ArrayList<>();
        cores.add(Color.blue);
        cores.add(Color.green);
        colorTableModel.setData(cores);

        table = new JTable(colorTableModel);

        table.setDefaultRenderer(Color.class,
                new ColorRenderer());

        table.setRowHeight(30);

        setLayout(new BorderLayout());

        add(new JScrollPane(table), BorderLayout.CENTER);
    }

}
