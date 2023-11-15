/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

import com.mycompany.model.Person;
import java.awt.BorderLayout;
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
    private PersonTableModel personTableModel;

    public TablePanel() {
        personTableModel = new PersonTableModel();
        table = new JTable(personTableModel);
        setLayout(new BorderLayout());
        add(new JScrollPane(table), BorderLayout.CENTER);
    }

    public void setData(List<Person> personList) {
        personTableModel.setData(personList);
    }
// para notificar á vista de que o modelo de datos cambiou

    public void refresh() {
        personTableModel.fireTableDataChanged();
    }
}
