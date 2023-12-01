/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

import com.mycompany.model.EmploymentCategory;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author a22dianart
 */
public class EmploymentCategoryEditor extends AbstractCellEditor implements TableCellEditor {

    private JComboBox combo;

    public EmploymentCategoryEditor() {
// inicializar o JComboBox cos valores da clase EmploymentCategory
        combo = new JComboBox(EmploymentCategory.values());
    }

    @Override
    public Object getCellEditorValue() {
        return combo.getSelectedItem();
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {
// value é o valor actual da cela a ser renderizada
        combo.setSelectedItem(value);
        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
// para parar de usar o editor e facer que se mostre o renderer
// e actualizar o valor no TableModel
                fireEditingStopped();
            }
        });
        return combo;
    }
}
