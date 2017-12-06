/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;

import java.util.Scanner;

/**
 *
 * @author Carlitos
 */
public class Exepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        String nombre;
        int numero1 = 0;
        int numero2 = 0;
        int res = 0;
        Scanner leer = new Scanner(System.in);

        /**
         * System.out.println("Ingrese edad"); edad = leer.nextInt();
         * leer.nextLine(); System.out.println("Ingrese nombre"); nombre =
         * leer.nextLine();
         *
         * System.out.printf("NOMBRE %s ", nombre); System.out.printf("EDAD %d
         * ", edad); 
         * int valor = Integer.parseInt("Loja"); 
         * int x = 10 / 0;
         */
        //int valor = Integer.parseInt("Loja"); 
        System.out.println(" ");
        boolean salir = true;
        do {
            try {
                System.out.println("Ingrese Numerador");
                numero1 = leer.nextInt();
                leer.nextLine();
                System.out.println("Ingrese Denominador");
                numero2 = leer.nextInt();

                res = numero1 / numero2;
                salir = false;
            } catch (ArithmeticException a) {
                System.err.println(a);
            }
        } while (salir == true);
        System.out.printf("Cociente %s \n", res);
    }

}
