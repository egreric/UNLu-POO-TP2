package ar.edu.unlu.poo.tp2.ej8;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Publicacion> publicaciones = new ArrayList<>();
    private ArrayList<Socio> socios = new ArrayList<>();
    private ArrayList<Prestamo> prestamos = new ArrayList<>();

    public void agregarPublicacion(Publicacion publicacion){
        this.publicaciones.add(publicacion);
    }

    public void agregarSocio(String nombre, String dni){
        this.socios.add(new Socio(nombre,dni));
    }

    private Publicacion buscarPublicacionPorNombre(String nombreLibro){
        for(Publicacion publicacion: publicaciones){
            if (publicacion.getNombre().equals(nombreLibro)){
                return publicacion;            }
        }
        return null;
    }

    private Socio buscarSocioPorDNI(String dni){
        for (Socio socio: socios){
            if (socio.getDni().equals(dni)){
                return socio;
            }
        }
        return null;
    }

    private boolean existePrestamo(PublicacionPrestable publicacionAPrestar, Socio socio) {
        for (Prestamo p: prestamos){
            if ( (p.getDniSocio().equals(socio.getDni())) && (p.getNombrePublicacionPrestada().equals(publicacionAPrestar.getNombre())) ){
                return true;
            }
        }
        return false;
    }

    private int posicionPrestamoAEliminar(PublicacionPrestable publicacionAPrestar, Socio socio){
        for (int i = 0; i < prestamos.size(); i++){
            if ( (prestamos.get(i).getDniSocio().equals(socio.getDni())) && (prestamos.get(i).getNombrePublicacionPrestada().equals(publicacionAPrestar.getNombre()))){
                return i;
            }
        }
        return -1;
    }

    // Prestar un libro o revista (las cuales son un tipo de PublicacionPrestable)
    public void prestarLibro(String nombrePublicacion, String dniSocio){
        Publicacion publicacionAPrestar = buscarPublicacionPorNombre(nombrePublicacion);
        Socio socioAPrestar = buscarSocioPorDNI(dniSocio);
        if ((publicacionAPrestar != null) && (socioAPrestar != null)) {
            if (publicacionAPrestar instanceof PublicacionPrestable){
                if (!existePrestamo((PublicacionPrestable) publicacionAPrestar, socioAPrestar)){
                    if (((PublicacionPrestable) publicacionAPrestar).prestar()) {
                        prestamos.add(new Prestamo((PublicacionPrestable) publicacionAPrestar, socioAPrestar));
                    }
                }
            }
        }
    }

    public void prestarRevista(String nombrePublicacion, String dniSocio){
        prestarLibro(nombrePublicacion, dniSocio);
    }

    public void devolverLibro(String nombrePublicacion, String dniSocio){
        Publicacion publicacionAPrestar = buscarPublicacionPorNombre(nombrePublicacion);
        Socio socioAPrestar = buscarSocioPorDNI(dniSocio);
        if ((publicacionAPrestar != null) && (socioAPrestar != null)) {
            if ((publicacionAPrestar instanceof PublicacionPrestable) && existePrestamo((PublicacionPrestable) publicacionAPrestar, socioAPrestar)){
                ((PublicacionPrestable) publicacionAPrestar).devolver();
                prestamos.remove(posicionPrestamoAEliminar((PublicacionPrestable) publicacionAPrestar, socioAPrestar));
            }
        }
    }

    public void devolverRevista(String nombrePublicacion, String dniSocio){
        devolverLibro(nombrePublicacion, dniSocio);
    }

    public String mostrarPrestados(){
        return prestamos.toString();
    }

    public String mostrarEjemplaresDisponiblesPorCadaLibro(){
        String s = "";
        for (Publicacion p: publicaciones){
            if (p instanceof Libro){

                s +=((Libro) p).getDescripcion() + "\n";
            }
        }
        return s;
    }
}
