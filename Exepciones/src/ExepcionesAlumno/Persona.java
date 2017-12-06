/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExepcionesAlumno;

/**
 *
 * @author Carlitos
 */
public class Persona {

    private String nombres;

    public Persona(String n) {
        setNombres(n);
    }

    public void setNombres(String n) {
        nombres = n;
    }

    public String getNombres() {
        return nombres;

    }

    @Override
    public String toString() {
        String cadena = String.format(
                "NOMBRES: $ %s\n",
                getNombres());
        return cadena; //To change body of generated methods, choose Tools | Templates.
    }

}
