/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;

import com.mycompany.gui.FormEvent;
import com.mycompany.model.AgeCategory;
import com.mycompany.model.Database;
import com.mycompany.model.EmploymentCategory;
import com.mycompany.model.Gender;
import com.mycompany.model.Person;
import java.io.File;
import java.io.IOException;
import java.util.List;

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
        if (name == null) {
            name = "";
        }
        //occupation
        String occupation = ev.getOccupation();
        if (occupation == null) {
            occupation = "";
        }
        //age
        String age = ev.getAge();
        AgeCategory ageCategory = null;
        if (age == null) {
            ageCategory = AgeCategory.SENIOR;
        } else {
            int ageCatId = Integer.parseInt(age);
            switch (ageCatId) {
                case 0:
                    ageCategory = AgeCategory.CHILD;
                    break;
                case 1:
                    ageCategory = AgeCategory.SENIOR;
                    break;
                case 2:
                    ageCategory = AgeCategory.ADULT;
                    break;

            }
        }

        //employment
        String employment = ev.getEmployment();
        EmploymentCategory employmentCategory = null;
        switch (employment) {
            case "employed":
                employmentCategory = EmploymentCategory.EMPLOYED;
                break;
            case "self-employed":
                employmentCategory = EmploymentCategory.SELFEMPLOYED;
                break;
            case "unemployed":
                employmentCategory = EmploymentCategory.UNEMPLOYED;
                break;
            default:
                employmentCategory = EmploymentCategory.OTHER;
                break;

        }
        //tax
        String tax = ev.getTax();
        //usCitizen
        boolean usCitizen = true;
        if (tax.equals("")) {
            usCitizen = false;
        }
        //gender
        Gender genderCategory = null;
        String gender = ev.getGender();
        switch (gender) {
            case "male":
                genderCategory = Gender.MALE;
                break;
            case "female":
                genderCategory = Gender.FEMALE;
                break;
        }

        Person person = new Person(name, occupation, ageCategory, employmentCategory, tax, usCitizen, genderCategory);

        db.addPerson(person);

    }

    public List<Person> getPeople() {

        return this.db.getPeople();

    }

    public void saveToFile(File file) throws IOException {
        db.saveToFile(file);
    }

    public void loadFromFile(File file) throws IOException {
        db.loadFromFile(file);
    }

    public void removePerson(int index) { //elimina da nosa bd a persoa borrada da taboa
        db.removePerson(index);

    }
}
