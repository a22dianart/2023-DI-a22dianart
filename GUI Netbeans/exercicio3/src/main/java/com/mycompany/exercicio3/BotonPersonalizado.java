package com.mycompany.exercicio3;

import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.UIManager;

/**
 *
 * @author a22dianart
 */
public class BotonPersonalizado extends JButton implements Serializable {

    private Cor cor;
    private Cor corHover; //nova propiedade

    public BotonPersonalizado() {
        this.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setBackground(corHover.getCorFondo());
                setForeground(corHover.getCorTexto());
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                setBackground(cor.getCorFondo());
                setForeground(cor.getCorTexto());
            }
        });
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

    public BotonPersonalizado(Cor cor, Cor corHover) {
        this.cor = cor;
        this.corHover = corHover;
    }

}
