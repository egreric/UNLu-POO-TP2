package ar.edu.unlu.poo.tp2.ejercicioDistribuidora;

public class Vendedor {
    private String nombre;
    private String apellido;
    private String dni;

    public Vendedor(String nombre, String apellido, String dni){
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    private void setDni(String dni) {
        this.dni = dni;
    }

    public String toString(){
        return (this.getNombre() + " - " + this.getApellido() + " - " + this.getDni());
    }
}
