package ar.edu.unlu.poo.tp2.ej1;

import java.time.LocalDate;

public class Inscripcion {
    private Socio socio;
    private LocalDate fecha;
    private Suscripcion suscripcion;

    public Inscripcion(Socio socio, LocalDate fecha, Suscripcion suscripcion){
        setSocio(socio);
        setFecha(fecha);
        setSuscripcion(suscripcion);
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

    public String mostrarDatosInscripcion(){
        return "Nombre: " + this.getSocio().getNombre() + " " + this.getSocio().getApellido() + "\nFecha inscripcion: " + this.getFecha() + "\nTipo Suscripcion: " + this.getSuscripcion().getTipo();
    }
}
