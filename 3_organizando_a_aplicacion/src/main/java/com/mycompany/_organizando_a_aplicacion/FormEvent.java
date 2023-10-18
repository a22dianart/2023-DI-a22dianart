/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._organizando_a_aplicacion;

import java.util.EventObject;

/**
 *
 * @author a22dianart
 */
public class FormEvent extends EventObject {

    private String text;

    public FormEvent(Object source) {
        super(source);
    }

    public FormEvent(Object source, String text) {
        super(source);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
