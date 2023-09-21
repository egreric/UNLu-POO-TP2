package ar.edu.unlu.poo.tp2.ejercicioDistribuidora;

public class Articulo {
    private String descripcion;
    private int cantidad;
    private double precio;

    public Articulo(String descripcion, int cantidad, double precio){
        setDescripcion(descripcion);
        setCantidad(cantidad);
        setPrecio(precio);
    }

    public Articulo(String descripcion, int cantidad){
        setDescripcion(descripcion);
        setCantidad(cantidad);
        setPrecio(0);
    }

    public Articulo(String descripcion){
        setDescripcion(descripcion);
        setCantidad(0);
        setPrecio(0);
    }
    public String getDescripcion() {
        return descripcion;
    }

    private void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    private void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    private void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString(){
        return (this.getDescripcion() + " - " + this.getCantidad() + " - " + this.getPrecio());
    }
}
