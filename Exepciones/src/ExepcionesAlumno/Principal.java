/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExepcionesAlumno;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Carlitos
 */
public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int numero_alumnos = 4;
        int contador;
        int calif1;
        int calif2;
        int cont =0;
        Estudiante[] lista = new Estudiante[4];
        double[] n_matematicas = new double[4];
        double[] n_sociales = new double[4];

        
        do {
            try {
                
                System.out.println("Ingrese Alumno");
                nombre = leer.next();
                leer.nextLine();
                System.out.println("Igrese Calificacion en Matematicas");
                calif1 = leer.nextInt();
                System.out.println("Igrese Calificacion en Sociales");
                calif2 = leer.nextInt();

                cont ++;
            } catch (ArithmeticException a) {
                System.err.println("ArithmeticException: " + a.getMessage());
            } catch (InputMismatchException a) { // handle your exception
                System.err.println("InputMismatchException"
                        + ": " + a.getMessage());
            }
        } while ( cont == numero_alumnos);
    }

}
