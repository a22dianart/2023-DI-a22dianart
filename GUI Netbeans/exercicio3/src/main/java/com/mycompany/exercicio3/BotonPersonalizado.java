package com.mycompany.exercicio3;

import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author a22dianart
 */
public class BotonPersonalizado extends JButton implements Serializable {

    private Cor cor;
    private Cor corHover; //nova propiedade

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

    public Cor getCorHover() {
        return corHover;
    }

    public void setCorHover(Cor corHover) {
        this.corHover = corHover;
    }

}
