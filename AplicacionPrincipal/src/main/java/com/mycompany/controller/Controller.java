/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.gui.FormEvent;
import com.mycompany.model.AgeCategory;
import com.mycompany.model.Database;
import com.mycompany.model.EmploymentCategory;
import com.mycompany.model.Person;

/**
 *
 * @author a22dianart
 */
public class Controller {
// Garda unha referencia á base de datos

    private Database db = new Database();

    public void addPerson(FormEvent ev) {

        //name
        String name = ev.getName();
        //occupation
        String occupation = ev.getOccupation();
        //age
        int ageCatId = Integer.parseInt(ev.getAge());
        AgeCategory ageCategory = null;
        switch (ageCatId) {
            case 0:
                ageCategory = AgeCategory.CHILD;
                break;
            case 1:
                ageCategory = AgeCategory.SENIOR;
                break;
            case 2:
                ageCategory = AgeCategory.ADULT;

        }
        //employment
        String employment = ev.getEmployment();
        //tax
        int tax = Integer.parseInt(ev.getTax());
        //gender
        String gender = ev.getGender();

        Person person = new Person(name, occupation, ageCategory, employment, tax, gender);

        db.addPerson(person);

    }
}
