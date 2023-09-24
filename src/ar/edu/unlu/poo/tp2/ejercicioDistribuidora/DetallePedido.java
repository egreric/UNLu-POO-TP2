package ar.edu.unlu.poo.tp2.ejercicioDistribuidora;

public class DetallePedido {
    private Articulo articulo;
    private int cantidad;
    private double precio;

    public DetallePedido(String nombreArticulo, int cantidad, double precio){
        setArticulo(nombreArticulo);
        setCantidad(cantidad);
        setPrecio(precio);
    }

    public DetallePedido(String nombreArticulo, int cantidad){
        setArticulo(nombreArticulo);
        setCantidad(cantidad);
        setPrecio(0);
    }


    public String getDescripcionArticulo(){ return this.articulo.getDescripcion(); }

    private void setArticulo(String nombreArticulo) {
        this.articulo = new Articulo(nombreArticulo);
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

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString() {
        return (this.getDescripcionArticulo() + " - " + this.getCantidad());
    }
}
