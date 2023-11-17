/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

import com.mycompany.model.Person;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
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
        JPopupMenu popup = new JPopupMenu("Borrar fila");
        table = new JTable(personTableModel);
        table.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                maybeShowPopup(e);
            }

            public void mouseReleased(MouseEvent e) {
                maybeShowPopup(e);
            }

            private void maybeShowPopup(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popup.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        setLayout(new BorderLayout());
        JMenuItem removeItem = new JMenuItem("borrar fila");

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
