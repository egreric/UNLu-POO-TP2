package ar.edu.unlu.poo.tp2.ej7.sistemaVentas;

public class DetalleExpendedorVenta {
    // esta clase se implementa como auxiliar para tratar el punto 2 de forma mas eficaz
    private  int codigoExpendedor;
    private double montoVendido;

    public DetalleExpendedorVenta(int codigoExpendedor, double montoVendido){
        this.codigoExpendedor = codigoExpendedor;
        this.montoVendido = montoVendido;
    }

    public int getCodigoExpendedor() {
        return codigoExpendedor;
    }

    public double getMontoVendido() {
        return montoVendido;
    }
}
