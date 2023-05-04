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
public class FactorialNumero_4 {

    /**
     * @param args the command line arguments
     */
    
   //     Utilizando Recursividad 
    public void factorial() {
        int num = 5;
        long factorial2 = 1;
        for (int i = 1; i <= num; ++i) {
            // factorial = factorial * i;
            factorial2 *= i;
        }
        System.out.printf("Factorial of num " + factorial2);
    }
    
    public static void main(String[] args) {
//      4. Vamos a sacar el factorial de un número, con un bucle for. El factorial de un número es la multiplicación
//de todos los números que hay detrás de él.
//      OPCION A)
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero : ");
        int numero = scan.nextInt();
        int factorial = 1;
        
        for (int i = numero-1; i >= 1; i--) {
            numero = numero * i;
            for (int j = i ; j <= 1; j++) {
                factorial = numero * j;

            }

        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
      
        
//        OPCION B)
           int contador = 0;
           for (int i = numero-1; i >= 1; i--) {
               contador = i-1;
               numero = numero* i;
               contador = numero * contador;
        }
           System.out.println("El factorial de : "+numero);


    
    }

}
