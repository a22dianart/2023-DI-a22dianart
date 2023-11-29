/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

import com.mycompany.model.EmploymentCategory;
import static com.mycompany.model.EmploymentCategory.*;
import java.awt.Component;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author a22dianart
 */
public class EmploymentCategoryRenderer extends JComboBox implements TableCellRenderer {

    public EmploymentCategoryRenderer() {
        super(EmploymentCategory.values());

    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int col) {
        this.setSelectedItem(value);
        return this;
    }
}
