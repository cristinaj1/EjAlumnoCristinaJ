/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 *
 * @author Cris
 */
public class Prueba {

    public static void main(String[] args) {

        Random random = new Random();
        Alumnado alumnado = new Alumnado();

        //crea asignaturas
        Asignatura prog1 = new Asignatura(Tipo.PROGRAMACIÓN);
        Asignatura prog2 = new Asignatura(Tipo.PROGRAMACIÓN);
        Asignatura prog3 = new Asignatura(Tipo.PROGRAMACIÓN);
        Asignatura prog4 = new Asignatura(Tipo.PROGRAMACIÓN);
        Asignatura prog5 = new Asignatura(Tipo.PROGRAMACIÓN);

        //Map
        Map<String, Alumno> escuela = new TreeMap<>();

        //crea alumnos
        Alumno prueba1 = new Alumno("Antonia", "Marín", "000001");
        Alumno prueba2 = new Alumno("Adolfo", "Suarez", "000002");
        Alumno prueba3 = new Alumno("Lucia", "Figueroa", "000003");
        Alumno prueba4 = new Alumno("Eduardo", "Camino", "000004");
        Alumno prueba5 = new Alumno("Guillermina", "Torrejon", "000005");

        //Se añade al map
        escuela.put("000001", prueba1);
        escuela.put("000002", prueba2);
        escuela.put("000003", prueba3);
        escuela.put("000004", prueba4);
        escuela.put("000005", prueba5);
        //Añadir alumnos a la signatura(para que tenga distintas notas).
        prueba1.ponerAsignatura(prog1);
        prueba2.ponerAsignatura(prog2);
        prueba3.ponerAsignatura(prog3);
        prueba4.ponerAsignatura(prog4);
        prueba5.ponerAsignatura(prog5);

        //Poner las notas
        prog1.setCalificaciones(5, 7, 0);
        prog2.setCalificaciones(4, 1, 0);
        prog3.setCalificaciones(7, 3, 0);
        prog4.setCalificaciones(2, 4, 0);
        prog5.setCalificaciones(9, 6, 0);

        //Añadir asignaturas
        for (Alumno alumno : alumnado.getAlumnado().values()) {
            for (Asignatura asignatura : alumno.getLibroCalificacion()) {
                asignatura.setCalificaciones(random.nextInt(10), random.nextInt(10), 0);
            }
        }
        //Hacer que te aparezcan la lista los alumnos 
        for (String alumno : escuela.keySet()) {
            System.out.printf("Clave %s -- Alumno %s %n", alumno, escuela.get(alumno));
        }
        //Hacer el boolean
        if (prueba1.haAprobadoProgramacionEsteTrimestre() == true) {
            System.out.println("Ha aprobado programación");
        } else {
            System.out.println("Ha suspendido programación");
        }
        if (prueba2.haAprobadoProgramacionEsteTrimestre() == true) {
            System.out.println("ha aprobado programación");
        } else {
            System.out.println("Ha suspendido programación");
        }
        if (prueba3.haAprobadoProgramacionEsteTrimestre() == true) {
            System.out.println("Ha aprobado programación");
        } else {
            System.out.println("Ha suspendido programación");
        }
        if (prueba4.haAprobadoProgramacionEsteTrimestre() == true) {
            System.out.println("Ha aprobado programación");
        } else {
            System.out.println("Ha suspendido programación");
        }
        if (prueba5.haAprobadoProgramacionEsteTrimestre() == true) {
            System.out.println("Ha aprobado programación");

        } else {
            System.out.println("Ha suspendido programación");
        }

    }

}
