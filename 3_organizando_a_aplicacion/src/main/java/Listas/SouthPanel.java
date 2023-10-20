/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import com.mycompany._organizando_a_aplicacion.StringEvent;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author a22dianart
 */
public class SouthPanel extends JPanel {

    private EraseListener eraseListener; //establecese no FramePrincipal

    public SouthPanel() {
        FlowLayout fl = new FlowLayout();
        fl.setAlignment(WIDTH);
        setLayout(fl);

        JButton borrarBtn = new JButton("Borrar");
        JSeparator separator = new JSeparator(SwingConstants.VERTICAL);
        JTextField insertTxt = new JTextField(10);
        JButton engadirBtn = new JButton("Engadir");

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (eraseListener != null) { //un unico source
                    eraseListener.actionEmitted(); //solo enviamos que o lanzamos
                }
            }
        };

        borrarBtn.addActionListener(al);

        add(borrarBtn);
        add(separator);
        add(insertTxt);
        add(engadirBtn);

    }

    public void setEraseListener(EraseListener eraseListener) {
        this.eraseListener = eraseListener;
    }

}
