package ar.edu.unlu.poo.tp2.ej7.sistemaVentas;

import java.time.LocalDate;

public class Venta {
    private Cliente cliente;
    private Empleado empleado;
    private Expendedor expendedor;
    private LocalDate fecha;
    private double importe;
    private double litrosCombustible;

    public Venta(Cliente cliente, Empleado empleado, Expendedor expendedor, LocalDate fecha, double importe){
        this.cliente = cliente;
        this.empleado = empleado;
        this.expendedor = expendedor;
        this.fecha = fecha;
        this.importe = importe ;
        this.litrosCombustible = importe / this.expendedor.getPrecioVentaCombustible();
        cliente.agregarVenta(this);
        empleado.agregarVenta(this);
        expendedor.agregarVenta(this);
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
