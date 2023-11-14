/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.controller;

import com.mycompany.gui.MainFrame;

/**
 *
 * @author a22dianart Esta aplicación esta feita hasta o de separar polo MVC
 */
public class App {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainFrame principal = new MainFrame();

            }
        });
    }
}
