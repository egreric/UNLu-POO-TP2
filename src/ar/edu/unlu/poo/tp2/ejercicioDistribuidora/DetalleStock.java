package ar.edu.unlu.poo.tp2.ejercicioDistribuidora;

public class DetalleStock {
    Articulo articulo;
    int cantidad;

    public DetalleStock(String nombreArticulo, int cantidad, double precio){
        setArticulo(nombreArticulo);
        setCantidad(cantidad);
        setPrecio(precio);
    }

    public String getNombreArticulo(){ return this.articulo.getDescripcion(); }

    private void setArticulo(String nombreArticulo) {
        this.articulo = new Articulo(nombreArticulo);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    private void setPrecio(double precio){
        this.articulo.setPrecio(precio);
    }

    public double getPrecio(){
        return this.articulo.getPrecio();
    }

    public String toString(){
        return (this.getNombreArticulo() + " - " + this.getCantidad() + " - " + this.getPrecio()); }

    public void descontar(int cantidad){
        this.cantidad -=  cantidad;
    }
}