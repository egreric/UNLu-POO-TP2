package ar.edu.unlu.poo.tp2.ej8;

import java.time.Month;
import java.time.Year;

public class Tesis extends Publicacion{
    private String autor;
    private int mesPublicacion;
    private int anioPublicacion;

    public Tesis(String nombre, String editor, String autor, int mesPublicacion, int anioPublicacion, String telefonoProveedor) {
        super(nombre, editor, telefonoProveedor);
        this.autor = autor;
        this.mesPublicacion = mesPublicacion;
        this.anioPublicacion = anioPublicacion;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getMesPublicacion() {
        return mesPublicacion;
    }

    public void setMesPublicacion(int mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
