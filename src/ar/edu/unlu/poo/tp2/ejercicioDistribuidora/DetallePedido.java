package ar.edu.unlu.poo.tp2.ejercicioDistribuidora;

public class DetallePedido {
    private Articulo articulo;
    private int cantidad;
    private float precio;

    public DetallePedido(String nombreArticulo, int cantidad, float precio){
        setArticulo(nombreArticulo);
        setCantidad(cantidad);
        setPrecio(precio);
    }

    public DetallePedido(String nombreArticulo, int cantidad){
        setArticulo(nombreArticulo);
        setCantidad(cantidad);
        setPrecio(0);
    }

    private Articulo getArticulo(){
        return this.articulo;
    }

    private void setArticulo(String nombreArticulo) {
        this.articulo = new Articulo(nombreArticulo);
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

    private String getDescripcionArticulo(){
        return this.getArticulo().getDescripcion();
    }

    public String toString() {
        return (this.getDescripcionArticulo() + " - " + this.getCantidad());
    }
}
