package ar.edu.unlu.poo.tp2.ej11.renta;

public class AutoVip extends Auto{

    public AutoVip(String patente, int cantidadAsientos){
        super(patente, cantidadAsientos);
        setPrecioPorAsiento(500);
    }
}
