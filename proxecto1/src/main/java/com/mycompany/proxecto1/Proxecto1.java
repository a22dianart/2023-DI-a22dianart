/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proxecto1;

/**
 *
 * @author a22dianart
 */
public class Proxecto1 {

    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
        // n! = 1*2*3...*n
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("The Factorial of " + n + " is " + factorial);
    }
}
