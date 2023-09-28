package ar.edu.unlu.poo.tp2.ej3;

public class Alumno {
    private String nombre;
    private String apellido;
    private String dni;

    public Alumno(String nombre, String apellido, String dni){
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
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
}
