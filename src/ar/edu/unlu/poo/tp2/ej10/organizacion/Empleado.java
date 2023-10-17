package ar.edu.unlu.poo.tp2.ej10.organizacion;

import java.time.LocalDate;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String telefono;
    private String cuit;
    private LocalDate fechaCumpleanios;

    public Empleado(String nombre, String apellido, String telefono, String cuit, LocalDate fechaCumple){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cuit = cuit;
        this.fechaCumpleanios = fechaCumple;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCuit() {
        return cuit;
    }

    public String getTelefono() {
        return telefono;
    }

    public LocalDate getFechaCumpleanios() {
        return fechaCumpleanios;
    }

    private boolean esMesDelCumple(){
        return this.fechaCumpleanios.getMonthValue() == LocalDate.now().getMonthValue();
    }

    protected double premioPorCumple(){
        return 2000;
    }

    public double calcularSueldo(){
        if (esMesDelCumple()){
            return premioPorCumple();
        } else {
            return 0;
        }
    }


    @Override
    public String toString() {
        return "Nombre y Apellido: " + nombre + " " + apellido + " - CUIT: " + cuit + " - Telefono: " + this.telefono + " Fecha Cumpleanios: " + fechaCumpleanios;
    }
}
