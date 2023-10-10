package ar.edu.unlu.poo.tp2.ej8;

import java.util.ArrayList;

public class Socio {
    private String nombre;
    private String dni;

    public Socio(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
