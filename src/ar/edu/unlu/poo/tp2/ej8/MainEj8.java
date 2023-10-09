package ar.edu.unlu.poo.tp2.ej8;

import java.util.ArrayList;

public class MainEj8 {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Subiendo la cima",
                "Carlos Sanchez",
                2010,
                "Planeta Editorial",
                "2323567432",
                540,
                10);

        Libro libro2 = new Libro("Bajando la nube",
                "Pedro Rodriguez",
                1992,
                "Torre Editorial",
                "24ABN2",
                "2323567432",
                780,
                1);

        // informo cual libro tiene mas paginas
        if (libro1.getCantidadPaginas() > libro2.getCantidadPaginas()) {
            System.out.println("El libro: " + libro1.getNombre() + " tiene mas paginas(" + libro1.getCantidadPaginas() + ") que el libro: " + libro2.getNombre() + "(" + libro2.getCantidadPaginas() + ").");
        } else {
            System.out.println("El libro: '" + libro2.getNombre() + "' tiene mas paginas(" + libro2.getCantidadPaginas() + ") que el libro: '" + libro1.getNombre() + "(" + libro1.getCantidadPaginas() + ").");
        }

        // agrego libros a una lista
        ArrayList<Libro> libros = new ArrayList<Libro>();
        libros.add(libro1);
        libros.add(libro2);

        // prestamo de libros
        for (Libro l : libros) {
            if (l.prestar()) {
                System.out.println("Libro prestado!");
            } else {
                System.out.println("No se pudo prestar el libro");
            }
        }

        for (int i = 0; i < libros.size(); i++) {
            System.out.println(libros.get(i).getDescripcion());
        }

        int suma = 0;
        for (Libro l : libros) {
            suma += l.getCantidadEjemplaresPrestados();
        }
        System.out.println("La cantidad total hecha de prestamos es de: " + suma + " Libros");


        /* Cargo una revista como publicacion
         * Vamos a ver como solamente tengo los atributos y metodos definidos en la clase Publicacion, ya que si
         * bien instancio a mi variable revista como Revista, esta es de tipo Publicacion y por lo tanto me va a dejar
         * trabajar solo con el comportamiento definida en ella(a menos que lo castee como Revista)
         */
        Publicacion revista = new Revista("Ciencia Biologica",
                "Solarium",
                1999,
                3,
                "2567GNL-2",
                "2543345863",
                40,
                3);

        System.out.println("\nMuestro los datos de la revista");

        System.out.println("Nombre: " + revista.getNombre());
        System.out.println("Editor: " + revista.getEditor());
        System.out.println("Telefono proveedor: " + revista.getTelefonoProveedor());
        System.out.println("Clase: " + revista.getClass());

        // Casteo mi revista de tipo Publicacion como Revista y ahora puedo utilizar los metodos de esa clase
        System.out.println("ISSN: " + ((Revista) revista).getISSN());
        System.out.println("Numero: " + ((Revista) revista).getNumero());


    }
}
