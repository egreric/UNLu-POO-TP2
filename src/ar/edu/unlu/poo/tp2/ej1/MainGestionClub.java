package ar.edu.unlu.poo.tp2.ej1;

import java.time.LocalDate;

public class MainGestionClub {
    public static void main(String[] args){
        // Cargo las actividades Basicas
        Actividad actividadBasica1 = new Actividad("Gimnasio");
        Actividad actividadBasica2 = new Actividad("Parque");

        // Cargo las actividades Intermedias
        Actividad actividadIntermedia1 = new Actividad("Pileta");
        Actividad actividadIntermedia2 = new Actividad("Uso Canchas Futbol");

        // Cargo las actividades Destacadas
        Actividad actividadDestacada1 = new Actividad("Sauna");
        Actividad actividadDestacada2 = new Actividad("Uso Quincho");

        // Creo el tipo de suscripcion Basico
        Suscripcion sBasica = new Suscripcion(TipoSuscripcion.BASICA, 999.99);
        sBasica.agregarActividad(actividadBasica1);
        sBasica.agregarActividad(actividadBasica2);

        // Creo el tipo de suscripcion Intermedio
        Suscripcion sIntermedia = new Suscripcion(TipoSuscripcion.INTERMEDIA, 1999.99);
        sIntermedia.agregarActividad(actividadIntermedia1);
        sIntermedia.agregarActividad(actividadIntermedia2);

        // Creo el tipo de suscripcion Destacado
        Suscripcion sDestacada = new Suscripcion(TipoSuscripcion.DESTACADA, 2999.99);
        sDestacada.agregarActividad(actividadDestacada1);
        sDestacada.agregarActividad(actividadDestacada2);

        GestionClub gc = new GestionClub(sBasica,sIntermedia,sDestacada);

        Socio socio1 = new Socio("Carlos","Rodriguez","15.423.333","La plata 321","CRodriguez72@gmail.com");
        LocalDate fecha1 = LocalDate.of(2023,8,23);

        Socio socio2 = new Socio("Raul","Garcia","15.423.333","La plata 321","CRodriguez72@gmail.com");
        LocalDate fecha2 = LocalDate.of(2023,9,17);

        Socio socio3 = new Socio("Pedro","Gomez","15.423.333","La plata 321","CRodriguez72@gmail.com");
        LocalDate fecha3 = LocalDate.of(2023,8,30);

        Socio socio4 = new Socio("Juan","Paredes","15.423.333","La plata 321","CRodriguez72@gmail.com");
        LocalDate fecha4 = LocalDate.of(2023,8,16);

        Socio socio5 = new Socio("Roberto","Romero","15.423.333","La plata 321","CRodriguez72@gmail.com");
        LocalDate fecha5 = LocalDate.of(2023,9,8);

        Socio socio6 = new Socio("Carlos","Rodriguez","15.423.333","La plata 321","CRodriguez72@gmail.com");
        LocalDate fecha6 = LocalDate.of(2023,8,15);

        gc.agregarInscriptoBasico(socio1,fecha1);
        gc.agregarInscriptoBasico(socio2,fecha2);

        gc.agregarInscriptoIntermedio(socio3,fecha3);
        gc.agregarInscriptoIntermedio(socio4,fecha4);

        gc.agregarInscriptoDestacada(socio5,fecha5);
        gc.agregarInscriptoDestacada(socio6,fecha6);



        // Comienzo del ejercicio

        // Punto 1 - Reporte mensual de nuevos socios inscriptos
        System.out.println(gc.reporteMensualInscriptos());

        // Punto 2 - Mostrar Listado de actividades segun tipo de suscripcion
        System.out.println("Actividades Basicas: \n" + gc.mostrarActividadesBasicas());
        System.out.println("Actividades Intermedias: \n" + gc.mostrarActividadesIntermedias());
        System.out.println("Actividades Destacadas: \n" + gc.mostrarActividadesDestacadas());

        // Punto 3
        System.out.println(gc.listadoSociosSegunSuscripcion(TipoSuscripcion.BASICA));
        System.out.println(gc.listadoSociosSegunSuscripcion(TipoSuscripcion.INTERMEDIA));
        System.out.println(gc.listadoSociosSegunSuscripcion(TipoSuscripcion.DESTACADA));
    }
}
