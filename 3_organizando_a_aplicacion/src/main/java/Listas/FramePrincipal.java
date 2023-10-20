/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import java.awt.BorderLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author a22dianart
 */
public class FramePrincipal extends JFrame {

    public FramePrincipal() {
        super("Listado");

        setLayout(new BorderLayout());

        setSize(400, 300);

        CenterPanel cp = new CenterPanel();
        SouthPanel sp = new SouthPanel();

        sp.setEraseListener(new EraseListener() {
            @Override
            public void actionEmitted() {
                int index = cp.getSelectedItem();
                DefaultListModel modelo = cp.getModelo();
                if (index != -1) {
                    modelo.remove(index);
                    cp.getListaNomes().setSelectedIndex(0); //Facer o de borrar no CenterPanel
                }
            }
        });

        add(cp, BorderLayout.CENTER);
        add(sp, BorderLayout.SOUTH);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
