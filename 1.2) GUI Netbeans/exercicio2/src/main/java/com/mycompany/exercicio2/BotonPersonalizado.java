/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author a22dianart
 */
public class BotonPersonalizado extends JButton implements Serializable {

    private Cor cor;

    public BotonPersonalizado() {
    }

    public void setCor(Cor cor) {
        this.cor = cor;
        this.setBackground(this.cor.getCorFondo());
        this.setForeground(this.cor.getCorTexto());
    }

    public Cor getCor() {
        return cor;
    }

}
