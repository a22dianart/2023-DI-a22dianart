/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.io.Serializable;

/**
 *
 * @author a22dianart
 */
public enum EmploymentCategory implements Serializable {
    EMPLOYED("employed"),
    SELFEMPLOYED("self employed"),
    UNEMPLOYED("unemployed"),
    OTHER("other");

    private final String name;

    EmploymentCategory(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

}
