/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.javafuncionalexercises.VariablesPorTeclado;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class TablaMultiplicar_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      3. Crear la tabla de multiplicar pasándole el número por teclado 

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el numero de la tabla de multiplicar: ");
        int numero = scan.nextInt();
        System.out.println("La tabla del " + numero + " es:");
        for (int i = 1; i <= 10; i++) {
            int tabla = numero * i;
            System.out.println(numero + " X " + i + " = " + tabla);
        }

    }

}