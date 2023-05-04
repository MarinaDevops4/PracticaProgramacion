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
public class Contrasena_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 4) Pasa un texto por teclado. Imagina que este texto será una contraseña.
//          A) Debemos decir cuantas mayúsculas y minusculas tiene. 
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce una contraseña:");
        String password = scan.nextLine();
        int countMayus = 0;
        int countMinus = 0;
        for (int i = 0; i < password.length(); i++) {
            char characters = password.charAt(i);
            if (Character.isUpperCase(characters)) {

                countMayus++;
            } else {

                countMinus++;
            }
        }
        System.out.println("La contraseña tiene: " + countMayus + " carácteres en Mayuscula y " + countMinus + " carácteres en minuscula");
        //         B) Decir si la password tiene además de minúsculas y mayúsculas , si posee algún carácter especial. 
//        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce una contraseña:");
        String password2 = scan.nextLine();
        boolean special = false;
        boolean mayus = false;
        boolean minus = false;
        int countMayus2 = 0;
        int countMinus2 = 0;
        
        for (int i = 0; i < password2.length(); i++) {
            char characters = password2.charAt(i);
            if (characters >= 65 && characters <= 90 || characters == 165) {
                mayus = true;
                countMayus2++;
            }
            if (characters >= 32 && characters <= 64) {
                special = true;
            }

            if (characters >= 97 && characters <= 127 || characters == 164) {
                minus = true;
                countMinus2++;
            }

        }

        if (special != false) {
            System.out.println("Hay caracteres especiales");
        }
        if (mayus != false) {
            System.out.println("Hay "+countMayus2+" Mayúsculas");
        }
        if (minus != false) {
            System.out.println("Hay "+countMinus2+" Minúsculas");
        }

    }

}
