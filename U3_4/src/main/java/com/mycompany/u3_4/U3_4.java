/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u3_4;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class U3_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) {

            System.out.println("Ingrese un nombre completo en minúsculas (o escriba 'salir' para terminar):");
            String entrada = teclado.nextLine();

            if (entrada.equalsIgnoreCase("salir")) {
                System.out.println("Programa terminado.");
                break;
            }

            String[] palabras = entrada.split(" "); 
            StringBuilder nombreConvertido = new StringBuilder();

            for (String palabra : palabras) {
                if (!palabra.isEmpty()) {

                    nombreConvertido.append(Character.toUpperCase(palabra.charAt(0)))
                                    .append(palabra.substring(1).toLowerCase())
                                    .append(" ");
                }
            }

            System.out.println("Nombre en formato título: " + nombreConvertido.toString().trim());
        }}}