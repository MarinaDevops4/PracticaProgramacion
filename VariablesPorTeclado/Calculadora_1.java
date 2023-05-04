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
public class Calculadora_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      1. Vamos a realizar una calculadora recogiendo los números que el usuario nos introduzca por teclado
//        y devolveremos su suma, la resta, la multiplicación, la división y el módulo.

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num1 = scan.nextInt();
        System.out.println("Introduce un segundo número:");
        int num2 = scan.nextInt();
        int suma = num1 + num2;
        int resta = 0;
        if (num1 < num2) {
            resta = num2 - num1;
        }else{
            resta = num1-num2;
        }

        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int modulo = num1 % num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

    }

}
