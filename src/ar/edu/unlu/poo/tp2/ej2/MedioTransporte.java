package ar.edu.unlu.poo.tp2.ej2;

public class MedioTransporte {
    private String nombre;
    private double costo;
    private TipoMedioTransporte tipoMedioTransporte;

    private Proveedor proveedor;

    public MedioTransporte(String nombre, double costo, TipoMedioTransporte tipoMedioTransporte, Proveedor proveedor){
        setNombre(nombre);
        setCosto(costo);
        setTipoMedioTransporte(tipoMedioTransporte);
        setProveedor(proveedor);
   }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    private void setCosto(double costo) {
        this.costo = costo;
    }

    public TipoMedioTransporte getTipoMedioTransporte() {
        return tipoMedioTransporte;
    }

    private void setTipoMedioTransporte(TipoMedioTransporte tipoMedioTransporte) {
        this.tipoMedioTransporte = tipoMedioTransporte;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    private void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public boolean esIgual(MedioTransporte medioTransporte) {
        return this.getNombre().equals(medioTransporte.getNombre());
    }
}
