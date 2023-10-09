package ar.edu.unlu.poo.tp2.ej8;

import java.time.Year;
import java.util.ArrayList;

public class Libro extends PublicacionPrestable {
    private ArrayList<String> autores = new ArrayList<>();
    private String ISBN;
    private int anioPublicacion;


    public Libro(String titulo, String autor, int anioPublicacion, String editor, String telefonoProveedor, int cantidadPaginas, int cantidadEjemplares){
        super(titulo, editor, telefonoProveedor, cantidadPaginas, cantidadEjemplares);
        this.anioPublicacion = anioPublicacion;
        this.autores.add(autor);
        this.ISBN = "";


    }

    public Libro(String titulo, String autor, int anioPublicacion, String editor, String ISBN, String telefonoProveedor, int cantidadPaginas, int cantidadEjemplares){
        super(titulo, editor, telefonoProveedor, cantidadPaginas, cantidadEjemplares);
        this.anioPublicacion = anioPublicacion;
        this.autores.add(autor);
        this.ISBN = ISBN;


    }

    public String getDescripcion(){
        return "El libro: " + this.getNombre() +
                ", creado por el autor: " + getAutores() +
                ", tiene: " + getCantidadPaginas() + " paginas" +
                ", quedan: " + getCantidadEjemplaresDisponibles() + " ejemplares disponibles" +
                " y se prestaron: " + getCantidadEjemplaresPrestados() + " ejemplares.";
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAutores() {
        String s = "";
        for (String autor: autores){
            s += autor + " - ";
        }
        return s;
    }

    public void agregarAutor(String autor){
        this.autores.add(autor);
    }
}
