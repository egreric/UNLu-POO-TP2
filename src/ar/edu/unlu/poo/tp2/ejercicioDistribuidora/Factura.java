package ar.edu.unlu.poo.tp2.ejercicioDistribuidora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Factura {
    private static int numeroTotalFacturas = 0; /* Llevo registro de cuantas facturas realice asi a medida que voy
                                               creando nuevas, les asigno un valor correlativo y univoco */
    private LocalDate fecha;
    private int numeroFactura;
    //private float monto; aca calcular monto de factura
    private Pedido pedido;

    public Factura(Pedido pedido){
        setFecha(LocalDate.now());
        setNumeroFactura(++numeroTotalFacturas);
    }

    public String getFecha() { return fecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")); }

    private void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    private void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
}
