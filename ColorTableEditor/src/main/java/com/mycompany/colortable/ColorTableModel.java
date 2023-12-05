/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colortable;

import java.awt.Color;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author a22dianart
 */
public class ColorTableModel extends AbstractTableModel {

    private List<Color> colorList;
    private String[] columnNames = {"Color"};

    public ColorTableModel() {
    }

    public void setData(List<Color> colorList) {
        this.colorList = colorList;
    }

    @Override
    public int getRowCount() {
        if (this.colorList == null) {
            return 0;
        } else {
            return this.colorList.size();
        }

    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Color color = colorList.get(row);
        if (column == 0) {
            return color;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return columnNames[0];
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return Color.class;
    }

}
