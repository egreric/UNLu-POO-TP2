package ar.edu.unlu.poo.tp2.ej11.renta;

public class Auto extends Vehiculo {
    private int cantidadAsientos;
    private double precioPorAsiento;

    public Auto(String patente, int cantidadAsientos){
        super(patente);
        setCantidadAsientos(cantidadAsientos);
        setPrecioPorAsiento(300);
    }

    protected void setPrecioPorAsiento(double precio) {
        this.precioPorAsiento = precio;
    }

    private void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public double precioPorAsiento(){
        return precioPorAsiento;
    }

    @Override
    public double getPrecioBase() { return super.getPrecioBase() + (precioPorAsiento * getCantidadAsientos());
    }

}
