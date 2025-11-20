/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.challenges;

import java.util.Scanner;

/**
 *
 * @author Alumnado
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void netprice(float price, int category) {
        float iva = 0;
        if (category == 1) {
            iva = (float) 0.04;
        } else if (category == 2) {
            iva = (float) 0.10;
        } else if (category == 3) {
            iva = (float) 0.21;
        } else {
            System.out.println("Ese numero no es posible");
        }

        float taxes = price * iva;

        float finalprice = price + taxes;

        if (finalprice < 50) {
            finalprice = finalprice + 8;
        }
        System.out.println("The final Price is " + finalprice);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce el precio");
        Scanner keyboard = new Scanner(System.in);
        float price = keyboard.nextFloat();
        System.out.println(" if the product is in the category of “super-reduced” VAT (4%), “reduced” (10%) or general (21%). Select 1,2 or 3 ");
        int categoria = keyboard.nextInt();
        netprice(price, categoria);
        System.out.println("Introduce el precio");
        price = keyboard.nextFloat();
        System.out.println(" if the product is in the category of “super-reduced” VAT (4%), “reduced” (10%) or general (21%). Select 1,2 or 3 ");
        price = keyboard.nextFloat();;
        netprice(price, categoria);
        System.out.println("Introduce el precio");
        price = keyboard.nextFloat();
        System.out.println(" if the product is in the category of “super-reduced” VAT (4%), “reduced” (10%) or general (21%). Select 1,2 or 3 ");
        price = keyboard.nextFloat();;
        netprice(price, categoria);

    }

}
