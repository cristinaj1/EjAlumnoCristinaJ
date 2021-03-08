/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;

/**
 *
 * @author Cris
 */
public enum Tipo {
    BASESDEDATOS("Base de Datos"),
    PROGRAMACIÓN("Programación"),
    ENTORNOS("Entornos"),
    LENGUAJEDEMARCAS("Lenguaje de Marcas"),
    SISTEMAS("Sistemas Informáticos"),
    FOL("Formación y orientación laboral");

    private final String nomAsignatura;

    private Tipo(String nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
    }

    public static Tipo getBASESDEDATOS() {
        return BASESDEDATOS;
    }

    public static Tipo getPROGRAMACIÓN() {
        return PROGRAMACIÓN;
    }

    public static Tipo getENTORNOS() {
        return ENTORNOS;
    }

    public static Tipo getLENGUAJEDEMARCAS() {
        return LENGUAJEDEMARCAS;
    }

    public static Tipo getSISTEMAS() {
        return SISTEMAS;
    }

    public static Tipo getFOL() {
        return FOL;
    }

    public String getNomAsignatura() {
        return nomAsignatura;
    }

}
