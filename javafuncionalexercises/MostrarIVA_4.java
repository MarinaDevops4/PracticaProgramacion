/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.javafuncionalexercises;

/**
 *
 * @author marin
 */
public class MostrarIVA_4 {

//  4.Crearemos un precio variable. Al que le sacaremos el 21% de I.V.A
    public static void main(String[] args) {
        int precio = 23;
        int iva = (precio % 21) + precio;
        System.out.println("El precio sin I.V.A es: " + precio);
        System.out.println("El precio con I.V.A es: " + iva);

    }

}
