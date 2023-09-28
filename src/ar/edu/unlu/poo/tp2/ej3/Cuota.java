package ar.edu.unlu.poo.tp2.ej3;

import java.time.LocalDate;

public class Cuota {
    private LocalDate fecha;
    private double importe;
    private boolean estaPago = false;

    public Cuota(LocalDate fecha, double importe){
        setFecha(fecha);
        setImporte(importe);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean estaPago() {
        return estaPago;
    }

    public void pagar(){
        this.estaPago = true;
    }
}
