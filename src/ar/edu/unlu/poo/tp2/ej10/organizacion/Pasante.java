package ar.edu.unlu.poo.tp2.ej10.organizacion;

import java.time.LocalDate;

public class Pasante extends Empleado{


    public Pasante(String nombre, String apellido, String telefono, String cuit, LocalDate fechaCumple) {
        super(nombre, apellido, telefono, cuit,fechaCumple);
    }

    @Override
    protected double premioPorCumple() {
        return 0;
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " - (Pasante --> " + "Sueldo: $" + calcularSueldo() + ")";
    }
}
