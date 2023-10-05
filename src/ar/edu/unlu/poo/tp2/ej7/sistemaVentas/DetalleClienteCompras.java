package ar.edu.unlu.poo.tp2.ej7.sistemaVentas;

public class DetalleClienteCompras{
    // esta clase se implementa como auxiliar para tratar el punto 5 de forma mas eficaz
    private String patenteCliente;
    private double montoGastado;

    public DetalleClienteCompras(String patenteCliente, double montoGastado){
        this.patenteCliente = patenteCliente;
        this.montoGastado = montoGastado;
    }

    public String getPatenteCliente() {
        return patenteCliente;
    }

    public double getMontoGastado() {
        return montoGastado;
    }
}
