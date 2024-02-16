/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4;

import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author diana
 */
public class CadroTextoPersonalizado extends JTextField implements Serializable {
    private boolean soNumeros;

    public CadroTextoPersonalizado() {
    }

    public boolean isSoNumeros() {
        return soNumeros;
    }

    public void setSoNumeros(boolean soNumeros) {
        this.soNumeros = soNumeros;
    }
    
    
}
