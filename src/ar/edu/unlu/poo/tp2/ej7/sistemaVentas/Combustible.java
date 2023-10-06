package ar.edu.unlu.poo.tp2.ej7.sistemaVentas;

public class Combustible {
    private String tipo;
    private double precioVenta;

    public Combustible(String tipo, double precioVenta){
        this.tipo = tipo;
        this.precioVenta = precioVenta;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }


}
