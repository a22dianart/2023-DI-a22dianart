package com.mycompany.exercicio4;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.Serializable;
import javax.swing.JButton;

import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author a22dianart
 */
public class TextoPersonalizado extends JTextField implements Serializable {

    private Boolean soNumeros = false;

    public TextoPersonalizado() {
        this.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (soNumeros == true) {
                    // Verificar si la tecla pulsada no es un digito
                    if (!Character.isDigit(caracter)) {
                        e.consume();
                    }
                }
            }
        });
    }

    public Boolean getSoNumeros() {
        return soNumeros;
    }

    public void setSoNumeros(Boolean soNumeros) {
        this.soNumeros = soNumeros;
    }

}
