package ar.edu.unlu.poo.tp2.ej2;

public class Excursion {
    private String nombre;
    private double costo;
    private Proveedor proveedor;

    public Excursion(String nombre, double costo, Proveedor proveedor){
        setNombre(nombre);
        setCosto(costo);
        setProveedor(proveedor);
    }

    public String getNombre(){
        return this.nombre;
    }
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto(){
        return this.costo;
    }

    private void setCosto(double costo){
        this.costo = costo;
    }

    public Proveedor getProveedor(){
        return this.proveedor;
    }

    private void setProveedor(Proveedor proveedor){
        this.proveedor = proveedor;
    }

    public boolean esIgual(Excursion excursion) {
        return this.getNombre().equals(excursion.getNombre());
    }
}
