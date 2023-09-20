package ar.edu.unlu.poo.tp2.ejercicioDistribuidora;

public class Articulo {
    private String descripcion;
    private int cantidad;
    private float precio;

    public Articulo(String descripcion, int cantidad, float precio){
        setDescripcion(descripcion);
        setCantidad(cantidad);
        setPrecio(precio);
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

    public float getPrecio() {
        return precio;
    }

    private void setPrecio(float precio) {
        this.precio = precio;
    }
}
