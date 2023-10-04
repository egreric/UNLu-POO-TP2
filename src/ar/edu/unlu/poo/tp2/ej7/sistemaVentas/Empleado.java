package ar.edu.unlu.poo.tp2.ej6.sistemaVentas;

public class Empleado {
    private String nombre;
    private String dni;

    public Empleado(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
}
