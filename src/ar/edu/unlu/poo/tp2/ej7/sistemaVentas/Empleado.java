package ar.edu.unlu.poo.tp2.ej7.sistemaVentas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private String dni;
    private ArrayList<Venta> ventas;
    private boolean usoDescuento;

    public Empleado(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
        this.ventas = new ArrayList<>();
        this.usoDescuento = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getTotalMensualVendido(){
        double monto = 0;
        for (Venta v: ventas){
            if (v.getEmpleado().mismoDni(this.dni) && (v.getFecha().getMonthValue() == (LocalDate.now().getMonthValue() - 1))){
                monto += v.getImporte();
            }
        }
        return monto;
    }

    public boolean mismoDni(String dni){
        return this.dni.equals(dni);
    }

    public void agregarVenta(Venta venta){
        this.ventas.add(venta);
    }

    public boolean getUsoDescuento(){ return this.usoDescuento;}

    public void setUsoDescuento(boolean seteo){
     this.usoDescuento = seteo;
    }

}
