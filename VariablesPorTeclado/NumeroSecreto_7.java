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
public class NumeroSecreto_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//   Utilizando do-while , crea un programa que almacene un número secreto del 1 al 100. 
//   El programa debe preguntar al usuario que averigüe el número. Cada vez que el usuario introduzca un número,
//   el programa le dirá si el número es menor , igual o mayor al número secreto. Si el usuario adivina el número secreto
//   el programa debe felicitarle y terminar. 
      Scanner scan = new Scanner(System.in);
        int secretNumber = 68;
        int num = 0;
        do{  
            System.out.println("Introduce otro numero:");
            num = scan.nextInt();
            
            boolean numAcertado = false;
            if(num == secretNumber){
                numAcertado = true;
                System.out.println("HAS ACERTADO EL NÚMERO SECRETO!!!");

                
            }
            if(num < secretNumber){
                System.out.println("El numero secreto es MAYOR");
                
            }else if( num > secretNumber){
                System.out.println("El numero secreto es MENOR");
            }
            
            
        }while(num != secretNumber);



    }

}
