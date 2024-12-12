/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u6_2;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class U6_2 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la primera cadena de texto:");
        String cadena1 = teclado.nextLine();

        System.out.println("Ingrese la segunda cadena de texto:");
        String cadena2 = teclado.nextLine();

        if (cadena1.length() == cadena2.length()) {
            System.out.println("Ambas cadenas tienen la misma longitud.");
        } else {
            System.out.println("Las cadenas tienen longitudes diferentes.");
        }

        if (cadena1.equals(cadena2)) {
            System.out.println("El contenido de ambas cadenas es igual.");
        } else {
            System.out.println("El contenido de las cadenas es diferente.");
        }}}