package ar.edu.unlu.poo.tp2.ej6.sistemaVentas;

public class Combustible {
    private String tipo;
    private double precioVenta;
    private int cantidadVentas;

    public Combustible(String tipo, double precioVenta){
        this.tipo = tipo;
        this.precioVenta = precioVenta;
        this.cantidadVentas = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getCantidadVentas(){ return this.cantidadVentas; }

    public void incrementarVenta(){ this.cantidadVentas++; }

}
