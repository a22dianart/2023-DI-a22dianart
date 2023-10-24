/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import com.mycompany._organizando_a_aplicacion.StringEvent;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;

/**
 *
 * @author a22dianart
 */
public class SouthPanel extends JPanel {

    private EraseListener eraseListener; //establecese no FramePrincipal
    private AddListener addListener; //establecese no FramePrincipal

    private JButton borrarBtn;

    public SouthPanel() {
        FlowLayout fl = new FlowLayout();
        fl.setAlignment(WIDTH);
        setLayout(fl);

        borrarBtn = new JButton("Borrar");
        JSeparator separator = new JSeparator(SwingConstants.VERTICAL);
        JTextField insertTxt = new JTextField(10);
        JButton engadirBtn = new JButton("Engadir");
        engadirBtn.setEnabled(false); //por defect sen nada de texto

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (eraseListener != null) { //un unico source
                    eraseListener.actionEmitted(); //solo enviamos que o lanzamos
                }
            }
        };

        insertTxt.getDocument().addDocumentListener(new DocumentListener() {

            public void cambios() {
                int length = insertTxt.getDocument().getLength();
                if (length == 0) {
                    engadirBtn.setEnabled(false);
                } else {
                    engadirBtn.setEnabled(true);
                }
            }

            @Override
            public void insertUpdate(DocumentEvent de) {
                cambios();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                cambios();
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                cambios();
            }
        });

        ActionListener al2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (addListener != null) {
                    try {
                        //un unico source
                        addListener.actionEmitted(insertTxt.getDocument().getText(0, insertTxt.getDocument().getLength())); //solo enviamos que o lanzamos
                    } catch (BadLocationException ex) {
                        Logger.getLogger(SouthPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };

        borrarBtn.addActionListener(al);
        engadirBtn.addActionListener(al2);
        insertTxt.addActionListener(al2);

        add(borrarBtn);
        add(separator);
        add(insertTxt);
        add(engadirBtn);

    }

    /**
     * Get the value of borrarBtn
     *
     * @return the value of borrarBtn
     */
    public JButton getBorrarBtn() {
        return borrarBtn;
    }

    /**
     * Set the value of borrarBtn
     *
     * @param borrarBtn new value of borrarBtn
     */
    public void setBorrarBtn(JButton borrarBtn) {
        this.borrarBtn = borrarBtn;
    }

    public void setEraseListener(EraseListener eraseListener) {
        this.eraseListener = eraseListener;
    }

    public void setAddListener(AddListener addListener) {
        this.addListener = addListener;
    }

}
