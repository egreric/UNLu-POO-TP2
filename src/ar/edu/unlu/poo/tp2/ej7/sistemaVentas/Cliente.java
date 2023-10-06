package ar.edu.unlu.poo.tp2.ej7.sistemaVentas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String patente;
    private ArrayList<Venta> ventas;

    public Cliente(String nombre, String patente){
        this.nombre = nombre;
        this.patente = patente;
        this.ventas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getPatente() {
        return patente;
    }

    public double getTotalMensualGastado(){
        double total = 0;
        for (Venta v: ventas){
            if (v.getCliente().mismaPatente(this.patente) && (v.getFecha().getMonthValue() == (LocalDate.now().getMonthValue() - 1))){
                total += v.getImporte();
            }
        }
        return total;
    }

    public boolean mismaPatente(String patente){
        return this.patente.equals(patente);
    }

    public void agregarVenta(Venta venta){
        this.ventas.add(venta);
    }
}


