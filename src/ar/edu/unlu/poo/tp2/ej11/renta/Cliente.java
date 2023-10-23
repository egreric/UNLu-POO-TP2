package ar.edu.unlu.poo.tp2.ej11.renta;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;
    private ArrayList<Alquiler> listadoAlquileres;

    public Cliente(String nombre, String apellido, String dni){
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
        listadoAlquileres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void agregarAlquiler(Presupuesto presupuesto){
        listadoAlquileres.add(new Alquiler(presupuesto, this, LocalDate.now()));
    }

    public String mostrarDescripcionAlquileres(){
        String s = toString() + "\n";
        double monto = 0;
        for (Alquiler a: listadoAlquileres){
            s += a.toString() + "\n";
            monto += a.montoAPagar();
        }
        return s + "Monto Total a pagar: $" + monto;
    }

    @Override
    public String toString(){
        return "Cliente: " + getNombre() + " " + getApellido() + " (DNI: " + getDni() + ")";
    }

    public boolean comparaDni(String dniCliente) {
        if (getDni().equals(dniCliente)) {
            return true;
        }
        return false;
    }
}
