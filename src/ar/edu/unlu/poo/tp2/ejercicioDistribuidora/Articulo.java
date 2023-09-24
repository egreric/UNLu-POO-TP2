package ar.edu.unlu.poo.tp2.ejercicioDistribuidora;

public class Articulo {
    private String descripcion;
    private double precio;

    public Articulo(String descripcion, double precio){
        setDescripcion(descripcion);
        setPrecio(precio);
    }

    public Articulo(String descripcion){
        setDescripcion(descripcion);
        setPrecio(0);
    }
    public String getDescripcion() {
        return descripcion;
    }

    private void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString(){
        return ("Descripcion: " + this.getDescripcion() + " - Precio: " + this.getPrecio());
    }
}
