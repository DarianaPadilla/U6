/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u6_01;

import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class U6_01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo: ");
        double radio = teclado.nextDouble();
        double area = calcularArea(radio);
        double perimetro = calcularPeri(radio);
        System.out.println("El area es: "+ area);
        System.out.println("El perimetro es: "+ perimetro);
        
    }
    public static double calcularArea(double radio){
    return Math.PI *Math.pow(radio, 2);
    }
    public static double calcularPeri(double radio){
    return 2* Math.PI *radio;
    }
}
