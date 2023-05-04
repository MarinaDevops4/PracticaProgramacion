/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.javafuncionalexercises;

/**
 *
 * @author marin
 */
public class Condicional_IF_3 {

//   3.Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
//    Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
    public static void main(String[] args) {

//Ejemplo 1
        int num1 = 63;
        int num2 = 64;
        
        if(num1<num2){
            System.out.println("Num1 es menor a num2");
        }else if(num1 == num2){
            System.out.println("Num1 es igual a num2");
        }else {
        
            System.out.println("Num2 es menor a num1");
        }

    }

}
