/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.javafuncionalexercises;

/**
 *
 * @author marin
 */
public class CalculoNumeros_2 {

//   2.Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, 
//    resta, multiplicación, división y módulo (resto de la división).
    public static void main(String[] args) {

//Ejemplo 1
        int num1 = 5;
        int num2 = 8;

        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + (num1 + num2));
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + (num2 - num1));
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es:     " + (num1 * num2));
        System.out.println("La división de " + num1 + " y " + num2 + " es: " + (num1 / num2));
        System.out.println("El módulo de " + num1 + " y " + num2 + " es: " + (num1 % num2));

//Ejemplo 2 
        int numero1 = 5;
        int numero2 = 8;
        int suma = numero1 + numero2;
        int resta = numero2 - numero1;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int modulo = numero1 % numero2;

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resta);
        System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es:     " + multiplicacion);
        System.out.println("La división de " + numero1 + " y " + numero2 + " es: " + division);
        System.out.println("El módulo de " + numero1 + " y " + numero2 + " es: " + modulo);

    }

}
