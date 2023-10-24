/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import java.awt.BorderLayout;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

/**
 *
 * @author a22dianart
 */
public class CenterPanel extends JPanel {

    private JList listaNomes;
    private DefaultListModel modelo;

    public CenterPanel() {
        BorderLayout bl = new BorderLayout();
        bl.setHgap(0);
        bl.setVgap(0);
        setLayout(bl);

        listaNomes = new JList();
        modelo = new DefaultListModel();
        modelo.addElement("Ana");
        modelo.addElement("Erea");
        modelo.addElement("Navia");
        listaNomes.setModel(modelo);

        listaNomes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //só selecccione un de cada vez
        listaNomes.setSelectedIndex(0); //para selecccionar o primeiro

        add(listaNomes);
        System.out.println(listaNomes.getSelectedIndex());

    }

    public JList getListaNomes() {
        return listaNomes;
    }

    public void setListaNomes(JList listaNomes) {
        this.listaNomes = listaNomes;
    }

    public DefaultListModel getModelo() {
        return modelo;
    }

    public int getSelectedItem() {
        return this.listaNomes.getSelectedIndex();
    }

}
