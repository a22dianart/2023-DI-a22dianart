/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author a22dianart
 */
public class CorPropertyEditorSupport extends PropertyEditorSupport {

    private CorPanel corPanel = new CorPanel();

    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return corPanel;
    }

    @Override
    public Object getValue() {
        return corPanel.getSelectedValue();
    }

    @Override
    public String getJavaInitializationString() {
        Cor cor = corPanel.getSelectedValue();
        return "new com.mycompany.exercicio2.Cor(new java.awt.Color(" + cor.getCorFondo().getRGB() + "), new java.awt.Color(" + cor.getCorTexto().getRGB() + "))";
        //return  new com.mycompany.exercicio2.Cor(new java.awt.Color(), new java.awt.Color())
    }

}
