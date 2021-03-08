/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Cris
 */
public class Alumno {

    private String nombre;
    private String apellido;
    private String numeroExpediente;
    private ArrayList<Asignatura> LibroCalificacion;

    public Alumno(String nombre, String apellido, String numeroExpdiente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroExpediente = numeroExpdiente;
        this.LibroCalificacion = new ArrayList();
        for (Tipo nombreAsignatura : ASIGNATURAS_1DAW) {
            LibroCalificacion.add(new Asignatura(nombreAsignatura));
        }
    }

    private final Tipo[] ASIGNATURAS_1DAW = {
        Tipo.BASESDEDATOS,
        Tipo.ENTORNOS,
        Tipo.FOL,
        Tipo.LENGUAJEDEMARCAS,
        Tipo.PROGRAMACIÓN,
        Tipo.SISTEMAS
    };

    public void ponerAsignatura(Asignatura a) {
        LibroCalificacion.add(a);
    }

    public void abandonaAsignatura(Asignatura a) {
        LibroCalificacion.add(a);
    }

    public boolean haAprobadoProgramacionEsteTrimestre() {
        for (Asignatura asignatura : LibroCalificacion) {
            if (asignatura.getAsignatura().equals(Tipo.PROGRAMACIÓN)) {
                if (LibroCalificacion.get(LibroCalificacion.indexOf(asignatura))
                        .getNotas()[1] >= 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpdiente(String numeroExpdiente) {
        this.numeroExpediente = numeroExpdiente;
    }

    public ArrayList<Asignatura> getLibroCalificacion() {
        return LibroCalificacion;
    }

    public void setLibroCalificacion(ArrayList<Asignatura> LibroCalificacion) {
        this.LibroCalificacion = LibroCalificacion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.apellido);
        hash = 97 * hash + Objects.hashCode(this.numeroExpediente);
        hash = 97 * hash + Objects.hashCode(this.LibroCalificacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.numeroExpediente, other.numeroExpediente)) {
            return false;
        }
        if (!Objects.equals(this.LibroCalificacion, other.LibroCalificacion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String aux = numeroExpediente + "\t" + nombre + "\t" + apellido;
        for (Asignatura asignatura : LibroCalificacion) {
            aux += "\n" + asignatura.toString();
        }
        return aux;
    }

}
