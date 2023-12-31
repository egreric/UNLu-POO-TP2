package ar.edu.unlu.poo.tp2.ej2;

public class Hospedaje {
    private String nombre;
    private double costo;
    private TipoHospedaje tipoHospedaje;

    private Proveedor proveedor;

    public Hospedaje(String nombre, double costo, TipoHospedaje tipoHospedaje, String nombreProveedor, String cuitProveedor){
        setNombre(nombre);
        setCosto(costo);
        setTipoHospedaje(tipoHospedaje);
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

    private void setCosto(double costo) {
        this.costo = costo;
    }

    public TipoHospedaje getTipoHospedaje() {
        return tipoHospedaje;
    }

    private void setTipoHospedaje(TipoHospedaje tipoHospedaje) {
        this.tipoHospedaje = tipoHospedaje;
    }

    public Proveedor getProveedor(){
        return this.proveedor;
    }

    private void setProveedor(String nombre, String cuit) {

        this.proveedor = new Proveedor(nombre, cuit,TipoProveedor.HOSPEDAJE);
    }

    public boolean esIgual(Hospedaje hospedaje) {
        return this.getNombre().equals(hospedaje.getNombre());
    }
}
