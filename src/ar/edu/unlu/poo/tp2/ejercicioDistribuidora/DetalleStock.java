package ar.edu.unlu.poo.tp2.ejercicioDistribuidora;

public class DetalleStock {
    Articulo articulo;
    int cantidad;

    public DetalleStock(String nombreArticulo, int cantidad, float precio){
        setArticulo(nombreArticulo);
        setCantidad(cantidad);

    }

    public Articulo getArticulo() {
        return articulo;
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
}
