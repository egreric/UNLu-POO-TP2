package ar.edu.unlu.poo.tp2.ej8;

import java.util.ArrayList;

public class MainTp8 {
    public static void main(String[] args) {

        Biblioteca b = new Biblioteca();
        b.agregarSocio("Carlos Rodriguez","34.322.321");
        b.agregarSocio("Ernesto Mendez","34.322.321");
        b.agregarSocio("Javier Garcia","14.269.832");

        Revista revista1 = new Revista("Ciencia Biologica",
                "Solarium",
                1999,
                3,
                "2567GNL-2",
                "2543345863",
                40,
                3);

        Libro l1 = new Libro("Subiendo la cima",
                "Carlos Sanchez",
                2010,
                "Planeta Editorial",
                "2323567432",
                540,
                10);

        Libro l2 = new Libro("Bajando la nube",
                "Pedro Rodriguez",
                1992,
                "Torre Editorial",
                "24ABN2",
                "2323567432",
                780,
                1);

        Tesis tesis1 = new Tesis("Energia molecular", "Revelaciones", "Pedro Sanchez", 2, 2005,"2323876567");
        Tesis tesis2 = new Tesis("Mecanica Automotriz", "Motorizados", "Luis Paredes", 7, 2012,"67522421658");
        Diario diario1 = new Diario("Fisica Avanzada II", "Newton", "3455347983");

        b.agregarPublicacion(l1);
        b.agregarPublicacion(l2);
        b.agregarPublicacion(revista1);
        b.agregarPublicacion(tesis1);
        b.agregarPublicacion(tesis2);
        b.agregarPublicacion(diario1);

        System.out.println(b.mostrarEjemplaresDisponiblesPorCadaLibro());

        b.prestarLibro("Subiendo la cima", "34.322.321");

        System.out.println(b.mostrarPrestados());
        System.out.println(b.mostrarEjemplaresDisponiblesPorCadaLibro());

        b.devolverLibro("Subiendo la cima", "34.322.321");

        System.out.println(b.mostrarEjemplaresDisponiblesPorCadaLibro());

        b.prestarRevista("Ciencia Biologica","34.322.321");
        b.prestarLibro("Subiendo la cima", "34.322.321");
        b.prestarLibro("Bajando la nube", "14.269.832");

        System.out.println(b.mostrarEjemplaresDisponiblesPorCadaLibro());


    }
}
