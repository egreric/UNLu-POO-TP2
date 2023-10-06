package ar.edu.unlu.poo.tp2.ej7.sistemaVentas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Expendedor {
    private int codigo;
    private static int totalExpendedores = 0; // uso un atributo de clase para asignar un valor distinto y consecutivo de expendedores
    private Combustible combustible;
    private ArrayList<Venta> ventas;

    public Expendedor(Combustible combustible) {
        totalExpendedores++;
        this.codigo = totalExpendedores;
        this.combustible = combustible;
        this.ventas = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCombustible() {
        return combustible.getTipo();
    }

    public double getPrecioVentaCombustible() {
        return combustible.getPrecioVenta();
    }

    public double getTotalMensualVendido(){
        double monto = 0;
        for (Venta v: ventas){
            if (v.getExpendedor().mismoExpendedor(this.codigo) && (v.getFecha().getMonthValue() == (LocalDate.now().getMonthValue() - 1))){
                monto += v.getImporte();
            }
        }
        return monto;
    }

    public double getTotalMensualLitrosExpendidos(){
        double monto = 0;
        for (Venta v: ventas){
            if (v.getExpendedor().mismoExpendedor(this.codigo) && (v.getFecha().getMonthValue() == (LocalDate.now().getMonthValue() - 1))){
                monto += v.getLitrosCombustible();
            }
        }
        return monto;
    }

    public int getCantidadMensualVentas(){
        int cantidad = 0;
        for (Venta v: ventas){
            if (v.getExpendedor().getCombustible().equals(this.getCombustible()) && (v.getFecha().getMonthValue() == (LocalDate.now().getMonthValue() - 1))){
                cantidad++;
            }
        }
        return cantidad;
    }

    public boolean mismoExpendedor(int codigoExpendedor){
        return this.codigo == codigoExpendedor;
    }

    public void agregarVenta(Venta venta){
        this.ventas.add(venta);
    }
}
