/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.challenges;

import java.util.Scanner;

/**
 *
 * @author Kazoku
 */
public class Debug2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNumber = 7;
        int respuesta = 7;
        while (respuesta!=secretNumber) {
            System.out.println("Introduzca un número:");
            respuesta = keyboard.nextInt();
            if (respuesta>secretNumber) {
                System.out.println("El número que buscamos es mayor");
            }
            else if (respuesta<secretNumber) {
                System.out.println("El número que buscamos es menor");
            }
            else {
                System.out.println("Has acertado");
            }
        }
    }
    
}
