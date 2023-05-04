/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author marin
 */
public class ContieneLaPalabra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 3) Pasa por teclado un texto variable. 
//        El programa debe decir si la variable contiene la palabra “hello” o si no la contiene.
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String texto = scan.nextLine().toLowerCase();
        if (texto.contains("hello")) {
            System.out.println("Tu texto contiene la palabra  'hello'.");
        } else {

            System.out.println("Tu texto No contiene la palabra  'hello'.");

        }

    }

}
