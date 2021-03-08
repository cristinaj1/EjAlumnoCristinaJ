/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cris
 */
public class Alumnado {

    private Map<String, Alumno> alumnado;

    public Alumnado() {
        alumnado = new HashMap<>();
    }

    public void addAlumno(Alumno alumno) {
        alumnado.put(alumno.getNumeroExpediente(), alumno);
    }

    public Map<String, Alumno> getAlumnado() {
        return alumnado;
    }

    public Alumno consultaExpediente(String expediente) {
        return alumnado.get(expediente);
    }

    @Override
    public String toString() {
        String txt = "";
        for (Alumno alumno : alumnado.values()) {
            txt += alumno + "\n";
        }
        return txt;
    }
}
