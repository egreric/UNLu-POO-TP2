package ar.edu.unlu.poo.tp2.ej11.renta;

public class Vehiculo {
    private String patente;
    private double precioBase;

    public Vehiculo(String patente){
        setPatente(patente);
        setPrecioBase(3000);
    }

    public String getPatente() {
        return patente;
    }

    private void setPatente(String patente){
        this.patente = patente;
    }

    protected void setPrecioBase(double precio){
        this.precioBase = precio;
    }

    public double getPrecioBase(){
        return precioBase;
    }

    public double getPrecioAlquiler(int cantidadDias){
        return getPrecioBase() * cantidadDias;
    }

    public boolean comparaPatente(String patente){
        return getPatente().equals(patente);
    }

    @Override
    public String toString(){
        return "Tipo de vehiculo: " + this.getClass().getSimpleName() + " - Patente: " + getPatente();
    }

}
