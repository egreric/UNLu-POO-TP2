package ar.edu.unlu.poo.tp2.ej6.sistemaVentas;

public class DetalleEmpleadoVenta {
    // esta clase se implementa como auxiliar para tratar el punto 4 de forma mas eficaz
    private String dniEmpleado;
    private double montoVendido;

    public DetalleEmpleadoVenta(String dniEmpleado, double montoVendido){
        this.dniEmpleado = dniEmpleado;
        this.montoVendido = montoVendido;
    }

    public String getDniEmpleado() {
        return dniEmpleado;
    }

    public double getMontoVendido() {
        return montoVendido;
    }
}
