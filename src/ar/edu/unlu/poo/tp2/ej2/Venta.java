package ar.edu.unlu.poo.tp2.ej2;

import java.time.LocalDate;

public class Venta {

    private PaqueteTurismo paqueteTurismo;
    private Cliente cliente;
    private double importe;
    private LocalDate fecha;


    public Venta(PaqueteTurismo paqueteTurismo, Cliente cliente, double importe, LocalDate fecha){
        setPaqueteTurismo(paqueteTurismo);
        setCliente(cliente);
        setImporte(importe);
        setFecha(fecha);
    }

    public PaqueteTurismo getPaqueteTurismo() {
        return paqueteTurismo;
    }

    private void setPaqueteTurismo(PaqueteTurismo paqueteTurismo) {
        this.paqueteTurismo = paqueteTurismo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getImporte() {
        return importe;
    }

    private void setImporte(double importe) {
        this.importe = importe;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    private void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
