/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u6_3;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class U6_3 {

    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un texto largo:");
        String texto = teclado.nextLine();

        String palabraClave = "ingenieria";
        int contador = 0;
        String[] palabras = texto.split("\\s+"); 

        for (String palabra : palabras) {
            if (palabra.equalsIgnoreCase(palabraClave)) {
                contador++;
            }
        }

        System.out.println("La palabra \"ingeniería\" aparece " + contador + " veces en el texto ingresado.");}}