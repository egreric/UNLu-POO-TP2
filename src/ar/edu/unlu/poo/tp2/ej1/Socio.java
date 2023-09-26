package ar.edu.unlu.poo.tp2.ej1;

public class Socio {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String email;

    public Socio(String nombre, String apellido, String dni, String direccion, String email){
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
        setDireccion(direccion);
        setEmail(email);
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
