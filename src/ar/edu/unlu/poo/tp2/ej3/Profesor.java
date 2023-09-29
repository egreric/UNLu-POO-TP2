package ar.edu.unlu.poo.tp2.ej3;

import java.util.Objects;

public class Profesor {
    private String nombre;
    private String apellido;
    private String dni;

    public Profesor(String nombre, String apellido, String dni){
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesor profesor = (Profesor) o;
        return Objects.equals(nombre, profesor.nombre) && Objects.equals(apellido, profesor.apellido) && Objects.equals(dni, profesor.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, dni);
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + " " + getApellido() + " | Dni: " + getDni();
    }

}
