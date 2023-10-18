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

    public CenterPanel() {
        BorderLayout bl = new BorderLayout();
        bl.setHgap(0);
        bl.setVgap(0);
        setLayout(bl);

        JList listaNomes = new JList();
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement(new Dato(0, "Ana"));
        modelo.addElement(new Dato(1, "Erea"));
        modelo.addElement(new Dato(2, "Navia"));
        listaNomes.setModel(modelo);

        listaNomes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //só selecccione un de cada vez
        listaNomes.setSelectedIndex(0); //para selecccionar o primeiro

        add(listaNomes);

    }

}
