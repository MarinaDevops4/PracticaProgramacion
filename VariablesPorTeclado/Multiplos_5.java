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
public class Multiplos_5 {

    /**
     * @param args the command line arguments
     */
    

    
    public static void main(String[] args) {
//      5. Muestra los números del 1 al 100 que son múltiplos de 4 (4,8,12,16…). Después modifica el programa para mostrar 
//      los múltiplos de 4 que no son múltiplos de 5 (40,100, …).
//      A) Mostramos los numeros del 1 al 100
        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
        
//   B) Ahora mostramos los números múltiplos de 4 pero no los de 5 : EJERCICIO RESUELTO
        for (int i = 1; i <= 100; i++) {
                   if (i % 4 == 0 && i % 5 != 0) {
                       System.out.println(i);
                   }
               } 


     
    
    }

}
