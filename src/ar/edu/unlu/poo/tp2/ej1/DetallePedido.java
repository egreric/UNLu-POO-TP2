package ar.edu.unlu.poo.tp2.ej1;

public class DetallePedido {
    private Articulo articulo;
    private int cantidad;
    private float precio;

    public DetallePedido(Articulo articulo, int cantidad, float precio){
        setArticulo(articulo);
        setCantidad(cantidad);
        setPrecio(precio);
    }

    public Articulo getArticulo() {
        return articulo;
    }

    private void setArticulo(Articulo articulo) {
        this.articulo = articulo;
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
