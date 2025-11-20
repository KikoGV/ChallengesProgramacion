/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.challenges;

/**
 *
 * @author Kazoku
 */
public class Debug1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1 = 1;
        int numero2 = 13;
        if (numero2 > 0) {
            System.out.println("numero2 es positivo");
        }
        if (numero1 < numero2) {
            System.out.println("numero1 no es mayor que numero2");
        }
        if (numero1 < 0 && numero2 < 0) {
            System.out.println("tanto numero1 como numero2 son negativos");
        }
        if (numero1 == 13 || numero2 == 13) {
            System.out.println("numero1 es trece o numero2 es trece");
        }

    }
    
}
