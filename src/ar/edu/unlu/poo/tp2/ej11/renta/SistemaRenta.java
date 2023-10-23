package ar.edu.unlu.poo.tp2.ej11.renta;

import java.util.ArrayList;

public class SistemaRenta {
    private ArrayList<Cliente> listadoClientes;
    private ArrayList<Presupuesto> listadoPresupuestos;
    private ArrayList<Vehiculo> listadoVehiculos;

    public SistemaRenta(){
        listadoClientes = new ArrayList<>();
        listadoPresupuestos = new ArrayList<>();
        listadoVehiculos = new ArrayList<>();
    }

    public boolean agregarCliente(String nombre, String apellido, String dni){
        Cliente c = buscarCliente(dni);
        if (c == null) {
            listadoClientes.add(new Cliente(nombre, apellido, dni));
            return true;
        }
        return false;
    }

    public boolean agregarPresupuesto(int indiceVehiculo, int cantidadDias){
        if ( (indiceVehiculo > 0) && (indiceVehiculo <= listadoVehiculos.size()) ) {
            listadoPresupuestos.add(new Presupuesto(listadoVehiculos.get(indiceVehiculo-1), cantidadDias));
            return true;
        }
        return false;
    }

    public boolean agregarAuto(String patente, int cantAsientos){
        Vehiculo v = buscarVehiculo(patente);
        if (v == null) {
            listadoVehiculos.add(new Auto(patente, cantAsientos));
            return true;
        }
        return false;
    }

    public boolean agregarAutoVip(String patente, int cantAsientos){
        Vehiculo v = buscarVehiculo(patente);
        if (v == null) {
            listadoVehiculos.add(new AutoVip(patente, cantAsientos));
            return true;
        }
        return false;
    }

    public boolean agregarCamion(String patente){
        Vehiculo v = buscarVehiculo(patente);
        if (v == null) {
            listadoVehiculos.add(new Camion(patente));
            return true;
        }
        return false;
    }

    public boolean agregarCamioneta(String patente, double pat){
        Vehiculo v = buscarVehiculo(patente);
        if (v == null) {
            listadoVehiculos.add(new Camioneta(patente, pat));
            return true;
        }
        return false;
    }

    public boolean agregarCombi(String patente){
        Vehiculo v = buscarVehiculo(patente);
        if (v == null) {
            listadoVehiculos.add(new Combi(patente));
            return true;
        }
        return false;
    }

    private Vehiculo buscarVehiculo(String patente) {
        if (!listadoVehiculos.isEmpty()) {
            for (Vehiculo v : listadoVehiculos) {
                if (v.comparaPatente(patente)) {
                    return v;
                }
            }
        }
        return null;
    }

    public boolean alquilar(String dniCliente, int indicePresupuesto){
        Cliente c = buscarCliente(dniCliente);
       if ( (indicePresupuesto > 0) && (indicePresupuesto <= listadoPresupuestos.size()) && (c != null) ) {
           c.agregarAlquiler(listadoPresupuestos.get(indicePresupuesto-1));
           return true;
        }
        return false;
    }

    private Cliente buscarCliente(String dniCliente) {
        if (!listadoClientes.isEmpty()) {
            for (Cliente c : listadoClientes) {
                if (c.comparaDni(dniCliente)) {
                    return c;
                }
            }
        }
        return null;
    }

    public String getDescripcionAlquileresPorCliente(String dniCliente){
        String s = "";
        Cliente c = buscarCliente(dniCliente);
            if (c != null){
                s += c.mostrarDescripcionAlquileres();
            }
        return s;
    }

    public String getDescripcionAlquileresTotales(){
        String s = "";
        if (!listadoClientes.isEmpty()){
            for (Cliente c :listadoClientes) {
                s += c.mostrarDescripcionAlquileres() + "\n\n";
            }
        }
        return s;
    }

}

