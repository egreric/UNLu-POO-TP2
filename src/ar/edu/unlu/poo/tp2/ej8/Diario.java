package ar.edu.unlu.poo.tp2.ej8;

import java.time.LocalDate;

public class Diario extends Publicacion{
    private LocalDate fechaPublicacion;

    public Diario(String nombre, String editor, String telefonoProveedor) {
        super(nombre, editor, telefonoProveedor);
    }

}
