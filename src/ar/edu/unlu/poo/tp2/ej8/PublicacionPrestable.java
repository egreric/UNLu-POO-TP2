package ar.edu.unlu.poo.tp2.ej8;

import java.time.Year;

public class PublicacionPrestable extends Publicacion {
    private int cantidadPaginas;
    private int cantidadEjemplares;
    private int cantidadEjemplaresPrestados;

    public PublicacionPrestable(String nombre, String editor, String telefonoProveedor, int cantidadPaginas, int cantidadEjemplares) {
        super(nombre, editor, telefonoProveedor);
        this.cantidadPaginas = cantidadPaginas;
        this.cantidadEjemplares = cantidadEjemplares;
        this.cantidadEjemplaresPrestados = 0;
    }


    public boolean prestar(){
        if (cantidadEjemplares - cantidadEjemplaresPrestados > 1){
            cantidadEjemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolver(){
        if (cantidadEjemplaresPrestados > 0){
            cantidadEjemplaresPrestados--;
            return true;
        } else {
            return false;
        }
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        if (cantidadEjemplares > this.cantidadEjemplaresPrestados) {
            this.cantidadEjemplares = cantidadEjemplares;
        }
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public int getCantidadEjemplaresPrestados() {
        return cantidadEjemplaresPrestados;
    }

    public int getCantidadEjemplaresDisponibles(){ return getCantidadEjemplares() - getCantidadEjemplaresPrestados(); }


}
