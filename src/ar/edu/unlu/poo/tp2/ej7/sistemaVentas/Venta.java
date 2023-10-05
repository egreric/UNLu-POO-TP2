package ar.edu.unlu.poo.tp2.ej7.sistemaVentas;

import java.time.LocalDate;

public class Venta {
    private Cliente cliente;
    private Empleado empleado;
    private Expendedor expendedor;
    private LocalDate fecha;
    private double importe;
    private double litrosCombustible; // sabiendo que en la venta se carga el importe, para saber cuantos l

    public Venta(Cliente cliente, Empleado empleado, Expendedor expendedor, LocalDate fecha, double importe){
        this.cliente = cliente;
        this.empleado = empleado;
        this.expendedor = expendedor;
        this.fecha = fecha;
        this.importe = importe ;
        this.litrosCombustible = importe / this.expendedor.getPrecioVentaCombustible();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Expendedor getExpendedor() {
        return expendedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getImporte() {
        return importe;
    }

    public double getLitrosCombustible() {
        return litrosCombustible;
    }
}
