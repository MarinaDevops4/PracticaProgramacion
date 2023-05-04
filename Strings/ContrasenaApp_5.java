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
public class ContrasenaApp_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 5) Escribe una aplicación con un String que contenga una contraseña cualquiera. 
//        Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá más
//        la contraseña y mostrará un mensaje diciendo «Enhorabuena». Piensa bien en la condición de salida
//        (3 intentos y si acierta sale, aunque le queden intentos).
        Scanner sc = new Scanner(System.in);
        String contraseña="HelloMagicWorld";
  
        final int INTENTOS = 3;
        boolean acierto=false;
  
        String password;
        for (int i=0;i<INTENTOS && !acierto;i++){
            System.out.println("Introduce una contraseña: ");
            password = sc.next();
  
            //Comprobamos si coincide, no usamos ==, usamos el metodo equals
            if (password.equals(contraseña)){
                System.out.println("Enhorabuena, acertaste");
                acierto=true;
            }
        }
        

    }

}
