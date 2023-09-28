package ar.edu.unlu.poo.tp2.ej3;

public class Salon {
    private String nombre;
    private int capacidad;

    public Salon(String nombre, int capacidad){
        setNombre(nombre);
        setCapacidad(capacidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
