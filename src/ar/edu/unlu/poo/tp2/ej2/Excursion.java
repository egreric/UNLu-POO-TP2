package ar.edu.unlu.poo.tp2.ej2;

public class Excursion {
    private String nombre;
    private double costo;
    private Proveedor proveedor;

    public Excursion(String nombre, double costo, String nombreProveedor, String cuitProveedor){
        setNombre(nombre);
        setCosto(costo);
        setProveedor(nombreProveedor, cuitProveedor);
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

    private void setProveedor(String nombre, String cuit){
        this.proveedor = new Proveedor(nombre,cuit,TipoProveedor.EXCURSION);
    }

    public boolean esIgual(Excursion excursion) {
        return this.getNombre().equals(excursion.getNombre());
    }
}
