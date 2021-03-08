/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;

import java.util.Arrays;

/**
 *
 * @author Cris
 */
public class Asignatura {

    private Tipo asignatura;
    private double[] notas;

    public Asignatura(Tipo asigantura) {
        this.asignatura = asigantura;
        this.notas = new double[3];
    }

    public Tipo getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Tipo asignatura) {
        this.asignatura = asignatura;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void setCalificaciones(int n, int m, int p) {
        if (n >= 0 && n <= 10) {
            notas[0] = n;
        }
        if (m >= 0 && m <= 10) {
            notas[1] = m;
        }
        if (p >= 0 && p <= 10) {
            notas[2] = p;
        }
    }
    
    @Override
    public String toString() {
//        String aux = "";
//        for (int i = 0; i < 3; i++) {
//            aux += notas[i];
//        }
//        return "Asigntura=" + asignatura + ", notas=" + aux;
        return "\t" + asignatura + "\t" + Arrays.toString(notas);
    }
}
