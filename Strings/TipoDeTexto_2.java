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
public class TipoDeTexto_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2) Introduce por teclado un texto y di si el texto introducido tiene minúsculas ,
        //    mayúsculas o si tiene un conjunto de ambos.

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un texto: ");
        String texto = scan.nextLine();
        String mayus = texto.toUpperCase();
        String minus = texto.toLowerCase();

        if (texto.equals(mayus)) {
            System.out.println("El texto está en mayusculas");
        } else if (texto.equals(minus)) {

            System.out.println("El texto está en minúsculas");
        } else {
            System.out.println("El texto contiene ambos, minusculas y mayusculas");
        }

    }

}
