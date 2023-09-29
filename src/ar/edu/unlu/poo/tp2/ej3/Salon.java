package ar.edu.unlu.poo.tp2.ej3;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salon salon = (Salon) o;
        return capacidad == salon.capacidad && Objects.equals(nombre, salon.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, capacidad);
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() +" | Capacidad: " + getCapacidad();
    }
}
