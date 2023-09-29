package ar.edu.unlu.poo.tp2.ej3;

import ar.edu.unlu.poo.tp2.ej3.*;

import java.util.ArrayList;

public class MainGestionAcademia {

    public static void main(String[] args){
        GestionAcademia ga = new GestionAcademia();

        // DOY ALTA DISCIPLINAS
        ga.altaDisciplina("Tango");
        ga.altaDisciplina("Salsa");
        ga.altaDisciplina("Bachata");
        ga.altaDisciplina("Clasico");
        ga.altaDisciplina("Arabe");

        // DOY ALTA PROFESORES
        ga.altaProfesor("Ernesto","Feliz","23.412.125");
        ga.altaProfesor("Carlos","Maidana","11.467.421");
        ga.altaProfesor("Roberto","Perez","28.231.869");
        ga.altaProfesor("Damian","Romero","31.789.549");
        ga.altaProfesor("Joaquin","Paredes","35.275.341");

        // DOY ALTA SALONES
        ga.altaSalon("S10",10);
        ga.altaSalon("S25",25);
        ga.altaSalon("S50",50);
        ga.altaSalon("S30",30);
        ga.altaSalon("S15",15);

        // DOY DE ALTA ALGUNAS CLASES
        // CLASE N°1
        ArrayList<Horario> horarios = new ArrayList<Horario>();
        horarios.add(new Horario(Dia.LUNES,"15.30hs"));
        horarios.add(new Horario(Dia.MIERCOLES,"17.00hs"));
        ga.altaClase("Tango",NivelClase.INICIAL,"23.412.125",horarios,"S10",3000);

        // CLASE N°2
        horarios = new ArrayList<Horario>();
        horarios.add(new Horario(Dia.MARTES,"14.00hs"));
        horarios.add(new Horario(Dia.MIERCOLES,"16.00hs"));
        ga.altaClase("Bachata",NivelClase.INICIAL,"11.467.421",horarios,"S50",5000);

        // CLASE N°3
        horarios = new ArrayList<Horario>();
        horarios.add(new Horario(Dia.LUNES,"18.30hs"));
        horarios.add(new Horario(Dia.JUEVES,"15.00hs"));
        ga.altaClase("Tango",NivelClase.INICIAL,"23.412.125",horarios,"S25",2800);

        // CLASE N°4
        horarios = new ArrayList<Horario>();
        horarios.add(new Horario(Dia.LUNES,"19.00hs"));
        horarios.add(new Horario(Dia.VIERNES,"21.00hs"));
        ga.altaClase("Salsa",NivelClase.INTERMEDIO,"23.412.125",horarios,"S30",3400);

        // CLASE N°5
        horarios = new ArrayList<Horario>();
        horarios.add(new Horario(Dia.MIERCOLES,"13.40hs"));
        horarios.add(new Horario(Dia.SABADO,"17.30hs"));
        ga.altaClase("Bachata",NivelClase.AVANZADO,"28.231.869",horarios,"S25",6300);

        // CLASE N°6
        horarios = new ArrayList<Horario>();
        horarios.add(new Horario(Dia.MARTES,"20.30hs"));
        horarios.add(new Horario(Dia.JUEVES,"21.00hs"));
        ga.altaClase("Clasico",NivelClase.AVANZADO,"31.789.549",horarios,"S30",4400);

        // CLASE N°7
        horarios = new ArrayList<Horario>();
        horarios.add(new Horario(Dia.VIERNES,"21.30hs"));
        horarios.add(new Horario(Dia.SABADO,"08.30hs"));
        ga.altaClase("Arabe",NivelClase.INTERMEDIO,"35.275.341",horarios,"S15",6400);

        // CLASE N°8
        horarios = new ArrayList<Horario>();
        horarios.add(new Horario(Dia.MIERCOLES,"09.00hs"));
        horarios.add(new Horario(Dia.VIERNES,"11.00hs"));
        ga.altaClase("Arabe",NivelClase.INTERMEDIO,"35.275.341",horarios,"S25",3200);

        // CLASE N°9
        horarios = new ArrayList<Horario>();
        horarios.add(new Horario(Dia.MARTES,"10.30hs"));
        horarios.add(new Horario(Dia.SABADO,"16.00hs"));
        ga.altaClase("Tango",NivelClase.INICIAL,"28.231.869",horarios,"S15",2800);

        // CLASE N°10
        horarios = new ArrayList<Horario>();
        horarios.add(new Horario(Dia.LUNES,"11.00hs"));
        horarios.add(new Horario(Dia.MARTES,"09.00hs"));
        ga.altaClase("Tango",NivelClase.AVANZADO,"31.789.549",horarios,"S15",3900);

        // DOY ALTA ALUMNOS NUEVOS (Y POR SER NUEVOS LOS DEBO INSCRIBIR A UN N° DE CLASE)
        ga.altaAlumno("Raul", "Rizzo","13.422.423",1);
        ga.altaAlumno("Joaquin", "Pereira","26.783.288",2);
        ga.altaAlumno("Pedro", "Rodriguez","15.444.332",3);
        ga.altaAlumno("Juan", "Paz","16.232.545",4);
        ga.altaAlumno("Ezequiel", "Guerra","24.123.786",10);
        ga.altaAlumno("Pablo", "Castillo","28.244.268",6);
        ga.altaAlumno("Marcos", "Real","32.311.113",7);

        ga.inscribirAlumno("13.422.423", 8);
        ga.inscribirAlumno("26.783.288", 9);
        ga.inscribirAlumno("15.444.332", 10);
        ga.inscribirAlumno("16.232.545",3);
        ga.inscribirAlumno("16.232.545",8);

        System.out.println(ga.getListadoAlumnos());
        System.out.println(ga.getListadoProfesores());
        System.out.println(ga.getListadoDisciplinas());
        System.out.println(ga.getListadoSalones());
        System.out.println(ga.getListadoClases());
        System.out.println(ga.getListadoInscripciones());


        // me falta agregar a la clase gestionAcademia las asistencias a las clases por parte de los alumnos
        System.out.println(ga.informeMensual());




    }


}
