package ar.edu.unlu.poo.tp2.ej11.renta;

public class Camion extends Vehiculo{

    public Camion(String patente){
        super(patente);
        setPrecioBase(100000);
    }
    @Override
    public double getPrecioAlquiler(int cantidadDias) {
        double precioAlquiler = this.getPrecioBase();
        if (cantidadDias > 30){
            precioAlquiler = 75000;
        }
        return precioAlquiler * cantidadDias;
    }


}
