package ar.edu.unlu.poo.tp2.ej11.renta;

public class Camioneta extends Vehiculo{

    private double pat;

    public Camioneta(String patente, double pat){
        super(patente);
        setPat(pat);
        setPrecioBase(600*pat);
    }

    public void setPat(double pat) {
        this.pat = pat;
    }

    public double getPat() {
        return pat;
    }



}
