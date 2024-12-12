/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u6_003;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class U6_003 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto:");
        String texto = teclado.nextLine();

        if (esPalindromo(texto)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }
    public static boolean esPalindromo(String texto) {
        
        String textoLimpio = texto.replaceAll("\\s+", "").toLowerCase();

        String reverso = new StringBuilder(textoLimpio).reverse().toString();
        return textoLimpio.equals(reverso);
    }
}
