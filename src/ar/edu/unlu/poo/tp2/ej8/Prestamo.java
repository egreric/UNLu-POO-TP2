package ar.edu.unlu.poo.tp2.ej8;

public class Prestamo {
    private PublicacionPrestable publicacionPrestable;
    private Socio socio;

    public Prestamo(PublicacionPrestable publicacionPrestable, Socio socio){
        this.publicacionPrestable = publicacionPrestable;
        this.socio = socio;
    }

    public String getNombrePublicacionPrestada(){
        return publicacionPrestable.getNombre();
    }

    public String getNombreSocio(){
        return "Socio: " + socio.getNombre();
    }

    public String getDniSocio(){
        return socio.getDni();
    }

    public String toString(){
        return "Libro Prestado: " + publicacionPrestable.getNombre() + " - Socio(DNI): " + getDniSocio();
    }

}
