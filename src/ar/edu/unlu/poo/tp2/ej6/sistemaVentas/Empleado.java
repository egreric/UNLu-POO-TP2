package ar.edu.unlu.poo.tp2.ej6.sistemaVentas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empleado {
    private String nombre;
    private String dni;
    private ArrayList<Venta> ventas;

    public Empleado(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
        this.ventas = new ArrayList<>();
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
}
