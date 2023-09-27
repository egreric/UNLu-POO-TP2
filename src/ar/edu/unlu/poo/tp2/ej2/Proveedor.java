package ar.edu.unlu.poo.tp2.ej2;

public class Proveedor {
    private String razonSocial;
    private String cuit;
    private TipoProveedor tipoProveedor;

    public Proveedor (String razonSocial, String cuit, TipoProveedor tipoProveedor){
        setRazonSocial(razonSocial);
        setCuit(cuit);
        setTipoProveedor(tipoProveedor);
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    private TipoProveedor getTipoProveedor(){
        return this.tipoProveedor;
    }

    public void setTipoProveedor(TipoProveedor tipoProveedor){
        this.tipoProveedor = tipoProveedor;
    }
}
