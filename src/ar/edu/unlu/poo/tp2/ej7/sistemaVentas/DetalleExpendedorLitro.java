package ar.edu.unlu.poo.tp2.ej7.sistemaVentas;

public class DetalleExpendedorLitro {
    // esta clase se implementa como auxiliar para tratar el punto 3 de forma mas eficaz
    private  int codigoExpendedor;
    private double cantidadLitrosExpendidos;

    public DetalleExpendedorLitro(int codigoExpendedor, double cantidadLitrosExpendidos){
        this.codigoExpendedor = codigoExpendedor;
        this.cantidadLitrosExpendidos = cantidadLitrosExpendidos;
    }

    public int getCodigoExpendedor() {
        return codigoExpendedor;
    }

    public double getCantidadLitrosExpendidos() {
        return cantidadLitrosExpendidos;
    }
}
