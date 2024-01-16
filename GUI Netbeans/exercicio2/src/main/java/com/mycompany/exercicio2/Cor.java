/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author a22dianart
 */
class Cor implements Serializable {

    private Color corFondo;
    private Color corTexto;

    public Cor() {
    }

    public Cor(Color corFondo, Color corTexto) {
        this.corFondo = corFondo;
        this.corTexto = corTexto;
    }

    public Color getCorFondo() {
        return corFondo;
    }

    public void setCorFondo(Color corFondo) {
        this.corFondo = corFondo;
    }

    public Color getCorTexto() {
        return corTexto;
    }

    public void setCorTexto(Color corTexto) {
        this.corTexto = corTexto;
    }

}
