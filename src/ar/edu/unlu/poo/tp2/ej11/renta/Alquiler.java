package ar.edu.unlu.poo.tp2.ej11.renta;

import java.time.LocalDate;

public class Alquiler {
    private Presupuesto presupuesto;
    private Cliente cliente;
    private LocalDate fecha;

    public Alquiler(Presupuesto presupuesto, Cliente cliente, LocalDate fecha){
        setPresupuesto(presupuesto);
        setCliente(cliente);
        setFecha(fecha);
    }

    private void setPresupuesto(Presupuesto presupuesto) {
        this.presupuesto = presupuesto;
    }

    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double montoAPagar(){
        return presupuesto.montoFinal();
    }

    public LocalDate getFechaInicio(){
        return this.fecha;
    }

    @Override
    public String toString(){
        return presupuesto.toString();
    }
}
