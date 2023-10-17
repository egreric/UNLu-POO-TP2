package ar.edu.unlu.poo.tp2.ej10;

import java.time.LocalDate;

public class EmpleadoConComisionBase extends EmpleadoConComision{

    private double sumaFija;
    public EmpleadoConComisionBase(String nombre, String apellido, String telefono, String cuit, double montoVentas, int porcentaje, double sumaFija, LocalDate fechaCumple) {
        super(nombre, apellido, telefono, cuit, montoVentas, porcentaje, fechaCumple);
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
        return super.calcularSueldo() + sumaFija;
    }

    @Override
    public String toString() {
        return super.toString() + " (Contempla tambien Sueldo Base) - " + "(Sueldo = $" + (super.calcularSueldo()-premioPorCumple()) +" de comisiones + $" + sumaFija + " de suma fija + $" + premioPorCumple() + " premio de cumple)";
    }

}
