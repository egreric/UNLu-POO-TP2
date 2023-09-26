package ar.edu.unlu.poo.tp2.ej2;

public class Proveedor {
    private String razonSocial;
    private String cuit;

    public Proveedor (String razonSocial, String cuit){
        setRazonSocial(razonSocial);
        setCuit(cuit);
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
}
