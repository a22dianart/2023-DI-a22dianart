/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

import com.mycompany.model.Person;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author a22dianart
 */
public class PersonTableModel extends AbstractTableModel {

    private List<Person> personList;
    private String[] columnNames = {"ID", "Name", "Occupation", "Age Category",
        "Employment Category", "US Citizen", "Tax ID", "Gender"};

    public PersonTableModel() {
    }

    public void setData(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public int getRowCount() {// o número de filas da táboa será o número de persoas na lista
        if (this.personList == null) {
            return 0;
        } else {
            return this.personList.size();
        }

    }

    @Override
    public int getColumnCount() {// devolver o número de columnas
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Person persoa = personList.get(row);
        switch (column) {
            case 0:
                return persoa.getId();
            case 1:
                return persoa.getName();
            case 2:
                return persoa.getOccupation();
            case 3:
                return persoa.getAgeCategory();
            case 4:
                return persoa.getEmpCat();
            case 5:
                return persoa.isUsCitizen();
            case 6:
                return persoa.getTaxId();
            case 7:
                return persoa.getGender();
            default:
                return null;

        }
    }

    @Override
    public String getColumnName(int column) {
        if (column < 0 || column >= getColumnCount()) {
            throw new ArrayIndexOutOfBoundsException(column);
        } else {
            return columnNames[column];
        }
    }

    public void removePerson(int row) {
        personList.remove(row);
        fireTableRowsDeleted(row, row);
    }

}
