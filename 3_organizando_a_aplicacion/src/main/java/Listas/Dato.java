/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author a22dianart
 */
public class Dato {

    private int indice;
    private String nome;

    public Dato(int indice, String nome) {
        this.indice = indice;
        this.nome = nome;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() { //para que saia o nome de cada unha e non un número de obxecto
        return this.nome;
    }

}
