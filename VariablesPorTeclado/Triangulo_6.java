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
public class Triangulo_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//   En este ejercicio vamos a pedir por teclado un número que será el número de filas que tendrá nuestro triángulo, por ejemplo:.
//  A)  Numero de filas: 7
//#
//##
//###
//####
//#####
//######
//#######
//      A)
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = scan.nextInt();
        String simbolo = "*";
        for (int i = 1; i <= num; i = i + 1) {
            for (int j = 0; j < i; j++) {
                System.out.print(simbolo);
            }
            System.out.println("");
        }//        }

        
//      B) Numero de filas: 7
//#######
//######
//#####
//####
//###
//##
//#

//        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num2 = scan.nextInt();
        String simbolo2 = "*";
        for (int i = 1; i <= num2; i++) {
            for (int j = 1; j < num2-i; j++) {
                System.out.print(simbolo2);
            }
            System.out.println("");
        }





    }

}
