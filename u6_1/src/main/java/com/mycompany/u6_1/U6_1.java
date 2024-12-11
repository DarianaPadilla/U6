/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.u6_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author Dariana
 */
public class U6_1 {

    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Ingrese una fecha en el formato YYYY-MM-DD:");
        String fecha_ingresada = teclado.nextLine();

        try {
            LocalDate fecha = LocalDate.parse(fecha_ingresada, formatter);

            LocalDate unaSemanaDespues = fecha.plusWeeks(1);
            LocalDate unMesAntes = fecha.minusMonths(1);

            System.out.println("Fecha ingresada: " + fecha);
            System.out.println("Una semana después: " + unaSemanaDespues);
            System.out.println("Un mes antes: " + unMesAntes);

        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha no válido. Por favor, ingrese la fecha en el formato YYYY-MM-DD.");
        } }}

