/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.challenges;

import java.util.Scanner;

/**
 *
 * @author Alumnado
 */
public class Challenge4_4 {

    public static int kikolink() {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        return number;
    }

    public static int coñete() {
        boolean status = false;
        int a=0;
        int b=0;

            System.out.println("Introduce a");
             a = kikolink();
            while(a<0){
                System.out.println("Vuelve a introducir un numero positivo");
                a = kikolink();
            }
            System.out.println("Valor B");
            b = kikolink();
            while (b<0) {
                System.out.println("Vuelve a introducir un numero positivo");
                b = kikolink();
            }
            
        
        return a * b;
    }

    public static void main(String[] args) {
        int resultado=coñete();
        System.out.println(resultado);
    }
}
