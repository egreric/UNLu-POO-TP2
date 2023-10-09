package ar.edu.unlu.poo.tp2.ej8;

import java.time.Year;

public class Revista extends PublicacionPrestable{
    private String ISSN;
    private int anioPublicacion;
    private int numero;

    public Revista(String nombre, String editor, int anioPublicacion, int numero, String telefonoProveedor, int cantidadPaginas, int cantidadEjemplares) {
        super(nombre, editor, telefonoProveedor, cantidadPaginas, cantidadEjemplares);
        this.anioPublicacion = anioPublicacion;
        this.numero = numero;
        this.ISSN = "";
    }

    public Revista(String nombre, String editor, int anioPublicacion, int numero, String ISSN, String telefonoProveedor, int cantidadPaginas, int cantidadEjemplares) {
        super(nombre, editor, telefonoProveedor, cantidadPaginas, cantidadEjemplares);
        this.anioPublicacion = anioPublicacion;
        this.numero = numero;
        this.ISSN = ISSN;
    }

    public String getISSN() {
        return ISSN;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public int getNumero() {
        return numero;
    }

}
