package ar.edu.unlu.poo.tp2.ej1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Suscripcion {
    TipoSuscripcion tipo;
    double precioMensual;
    ArrayList<Actividad> actividades = new ArrayList<Actividad>();

    public Suscripcion(TipoSuscripcion tipo, double precioMensual){
        setTipo(tipo);
        setPrecioMensual(precioMensual);
    }

    public void setTipo(TipoSuscripcion tipo){
        this.tipo = tipo;
    }

    public TipoSuscripcion getTipo(){
        return this.tipo;
    }

    public void setPrecioMensual(double precioMensual){
        this.precioMensual = precioMensual;
    }

    public double getPrecioMensual(){
        return this.precioMensual;
    }

    public ArrayList<Actividad> getActividades(){
        return this.actividades;
    }

    public void agregarActividad(Actividad actividad){
        this.actividades.add(actividad);
    }

    public String mostrarActividades(){
        String s = "";
        for (Actividad a: actividades){
            s += a.getDescripcionActividad() + "\n";
        }
        return s;
    }
}
