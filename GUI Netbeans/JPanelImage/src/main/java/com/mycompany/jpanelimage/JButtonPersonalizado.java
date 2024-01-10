/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpanelimage;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author a22dianart
 */
public class JButtonPersonalizado extends JButton implements Serializable {

    private Color corFondo;
    private Color corTexto;

    public JButtonPersonalizado(Color corFondo, Color corTexto) {
        this.corFondo = corFondo;
        this.corTexto = corTexto;
    }

    public Color getCorFondo() {
        return corFondo;
    }

    public void setCorFondo(Color corFondo) {
        this.corFondo = corFondo;
        this.setBackground(corFondo);
    }

    public Color getCorTexto() {
        return corTexto;

    }

    public void setCorTexto(Color corTexto) {
        this.corTexto = corTexto;
        this.setForeground(corTexto);
    }

}
