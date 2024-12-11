/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u6_02;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class U6_02 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Ingresa tu edad: ");
       int edad = teclado.nextInt();
       
       if (puedeVotar(edad)){
       System.out.println("Puede votar");}
       else{
       System.out.println("No puede votar");}
    }
    public static boolean puedeVotar(int edad){
    return edad>=18;
    }
   
}
