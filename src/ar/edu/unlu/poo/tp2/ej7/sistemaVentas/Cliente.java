package ar.edu.unlu.poo.tp2.ej6.sistemaVentas;

public class Cliente {
    private String nombre;
    private String patente;

    public Cliente(String nombre, String patente){
        this.nombre = nombre;
        this.patente = patente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPatente() {
        return patente;
    }
}
