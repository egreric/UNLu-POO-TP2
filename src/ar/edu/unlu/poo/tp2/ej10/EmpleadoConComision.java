package ar.edu.unlu.poo.tp2.ej10;

import java.time.LocalDate;

public class EmpleadoConComision extends Empleado{

    private double montoVentas;
    private int porcentaje;

    // El porcentaje tiene que ser un valor entre 1 a 100
    public EmpleadoConComision(String nombre, String apellido, String telefono, String cuit, double montoVentas,int porcentaje, LocalDate fechaCumple){
        super(nombre, apellido, telefono, cuit, fechaCumple);
        this.montoVentas = montoVentas;
        this.porcentaje = porcentaje;
    }

    public double getMontoVentas() {
        return montoVentas;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    @Override
    protected double premioPorCumple() {
        return super.premioPorCumple() + (montoVentas * 0.05);
    }

    @Override
    public double calcularSueldo() {
        return (montoVentas * ((double) porcentaje / 100)) + super.calcularSueldo();
    }

    @Override
    public String toString() {
        return super.toString() + " - (Empleado Con Comision --> " + "Sueldo: $" + calcularSueldo() + ")";
    }

}
