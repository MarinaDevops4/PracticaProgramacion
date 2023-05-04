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
public class BucleFor_ListarNumeros_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      2. Utilizando un bucle ‘for’ , introduce 2 números por teclado y muestra todos los numeros hasta llegar al num1 al num2 ambos incluidos.

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num1 = scan.nextInt();
        System.out.println("Introduce otro numero:");
        int num2 = scan.nextInt();
        for (int i = num1; i <= num2; i++) {

            System.out.println(i);
        }

    }

}
