package ar.edu.unlu.poo.tp2.ej10.organizacion;

import java.time.LocalDate;

public class EmpleadoAsalariado extends Empleado{

    private double sumaFija;

    public EmpleadoAsalariado(String nombre, String apellido, String telefono, String cuit, double sumaFija, LocalDate fechaCumple){
        super(nombre, apellido, telefono, cuit, fechaCumple);
        this.sumaFija = sumaFija;

    }

    public double getSumaFija() {
        return sumaFija;
    }

    @Override
    protected double premioPorCumple() {
        return super.premioPorCumple() + 1000;
    }

    @Override
    public double calcularSueldo() {
        return sumaFija + super.calcularSueldo();
    }

    @Override
    public String toString() {
        return super.toString() + " - (Empleado Asalariado --> " + "Sueldo: $" + calcularSueldo() + ")";
    }
}
