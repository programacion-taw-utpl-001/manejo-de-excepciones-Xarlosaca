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
public class Asignacion {

    Estudiante[] lista;
    double[] n_matematicas;
    double[] n_sociales;

    public Asignacion(Estudiante[] e, double[] n_m, double[] n_s) {
        setLista(e);
        setNota_m(n_m);
        setNota_s(n_s);
    }

    public void setLista(Estudiante[] e) {
        lista = e;
    }

    public Estudiante[] getLista() {
        return lista;
    }

    public void setNota_m(double[] n_m) {
        n_matematicas = n_m;
    }

    public double[] getNota_m() {
        return n_matematicas;
    }

    public void setNota_s(double[] n_s) {
        n_sociales = n_s;
    }

    public double[] getNota_s() {
        return n_sociales;
    }

    public double Promedio(){
        double prom = 0;
        double[] M = getNota_m();
        double[] S = getNota_s();
        
         int valor = (int) S[];
        for(int i=0;i < M.length;i++){
             double me = M[i];
            prom += (me.getNota_m()+getNota_s())/2;
        }
        
        return prom;
    }
    @Override
    public String toString() {
        String alumnos = "";
        Estudiante[] A = getLista();
        for (Estudiante A1 : A) {
            alumnos = String.format("%s%s", alumnos, A1);
        }
        String nota1 = "";
        double [] b = getNota_m();
        for (Estudiante A1 : A) {
            nota1 = String.format("%s%s", nota1, A1);
        }
        String nota2 = "";
        double[] c = getNota_s();
        for (Estudiante A1 : A) {
            nota1 = String.format("%s%s", nota1, A1);
        }
        String cadena = String.format("%s\n"
                + "VENTAS: $ %.2f\n"
                + "SUCURSALES: %s\n \n",
                 alumnos, nota1, nota2);
        return cadena; //To change body of generated methods, choose Tools | Templates.
    }

}
