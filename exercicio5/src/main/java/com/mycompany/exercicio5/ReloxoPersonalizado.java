/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.time.LocalDateTime;
import static javax.management.timer.Timer.ONE_SECOND;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author a22dianart
 */
public class ReloxoPersonalizado extends JLabel implements Serializable {

    private Boolean formato24 = false;

    public ReloxoPersonalizado() {
        Timer timer = new Timer((int) ONE_SECOND, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                LocalDateTime locaDate = LocalDateTime.now();

                int hours = locaDate.getHour();
                int minutes = locaDate.getMinute();
                int seconds = locaDate.getSecond();
                if (!formato24) {
                    if (hours > 12) {
                        hours = hours - 12;
                        setText(hours + ":" + minutes + ":" + seconds + " PM");
                    } else {
                        if (hours == 12 && minutes > 0) {
                            setText(hours + ":" + minutes + ":" + seconds + " PM");
                        } else if (hours == 12 && seconds > 0) {
                            setText(hours + ":" + minutes + ":" + seconds + " PM");
                        } else {
                            setText(hours + ":" + minutes + ":" + seconds + " AM");
                        }

                    }

                } else {
                    setText(hours + ":" + minutes + ":" + seconds);

                }
            }
        });
        timer.start();
    }

    public Boolean getFormato24() {
        return formato24;
    }

    public void setFormato24(Boolean formato24) {
        this.formato24 = formato24;
    }

}
