package ar.edu.unlu.poo.tp2.ej10;

import java.time.LocalDate;

public class EmpleadoPorHora extends Empleado{

    private double precioHora;
    private double horasTrabajadas;

    public EmpleadoPorHora(String nombre, String apellido, String telefono, String cuit, double precioHora, int horasTrabajadas, LocalDate fechaCumple) {
        super(nombre, apellido, telefono, cuit,fechaCumple);
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        double sueldo = horasTrabajadas * precioHora;
        if (horasTrabajadas > 40){
            sueldo *= 1.20;
        }
        return super.calcularSueldo() + sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " - (Empleado por Hora --> " + "Sueldo: $" + calcularSueldo() + ")";
    }
}
