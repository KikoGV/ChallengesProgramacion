/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.challenges;

/**
 *
 * @author Alumnado
 */
public class Debugg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int numero = 5;
      int factorial = 0;
 
      // n! = 1*2*3...*n
      for (int i = 1; i <= numero; i++) {
         factorial = factorial * i;
      }
      System.out.println("The Factorial of " + numero + " is " + factorial);

    }
    
}
