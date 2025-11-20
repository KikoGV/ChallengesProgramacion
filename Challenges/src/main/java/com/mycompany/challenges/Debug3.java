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
public class Debug3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce el primer nombre:");
        String nombre1 = keyboard.nextLine();
        System.out.println("Introduce el segundo nombre:");
        String nombre2 = keyboard.nextLine();
        char inicial1 = nombre1.charAt(0);
        char inicial2 = nombre2.charAt(0);
        int longitud1 = nombre1.length();
        int longitud2 = nombre2.length();
        char final1 = nombre1.charAt(longitud1);
        char final2 = nombre1.charAt(longitud1);
        if (inicial1==inicial2 && final1==final2) {
            System.out.println("Coincidence");
        }
        else {
            System.out.println("There is NO coincidence");
        }
        
    }
    
}
