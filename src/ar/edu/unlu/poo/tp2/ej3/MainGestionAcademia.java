package ar.edu.unlu.poo.tp2.ej3;

import ar.edu.unlu.poo.tp2.ej3.*;

import java.time.LocalDate;
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

        // INSCRIBO A ALUMNOS YA DADOS DE ALTA A N° DE CLASE
        ga.inscribirAlumno("13.422.423", 8);
        ga.inscribirAlumno("26.783.288", 9);
        ga.inscribirAlumno("15.444.332", 10);
        ga.inscribirAlumno("16.232.545",3);
        ga.inscribirAlumno("16.232.545",8);

        // REGISTRO LAS ASISTENCIAS DE LOS ALUMNOS EN CADA CLASE
        ga.agregarAsistencia("13.422.423",1,LocalDate.of(2023,8,2));
        ga.agregarAsistencia("13.422.423",1,LocalDate.of(2023,8,4));
        ga.agregarAsistencia("13.422.423",1,LocalDate.of(2023,9,12));

        ga.agregarAsistencia("26.783.288",2,LocalDate.of(2023,8,10));
        ga.agregarAsistencia("26.783.288",2,LocalDate.of(2023,9,27));

        ga.agregarAsistencia("15.444.332",3,LocalDate.of(2023,8,30));

        ga.agregarAsistencia("16.232.545",4,LocalDate.of(2023,8,12));
        ga.agregarAsistencia("16.232.545",4,LocalDate.of(2023,9,15));
        ga.agregarAsistencia("16.232.545",4,LocalDate.of(2023,9,28));

        ga.agregarAsistencia("24.123.786",10,LocalDate.of(2023,8,10));
        ga.agregarAsistencia("24.123.786",10,LocalDate.of(2023,8,13));
        ga.agregarAsistencia("24.123.786",10,LocalDate.of(2023,8,18));

        ga.agregarAsistencia("28.244.268",6,LocalDate.of(2023,9,2));

        ga.agregarAsistencia("32.311.113",7,LocalDate.of(2023,8,8));

        ga.agregarAsistencia("13.422.423",8,LocalDate.of(2023,8,21));

        ga.agregarAsistencia("26.783.288",9,LocalDate.of(2023,8,17));
        ga.agregarAsistencia("26.783.288",9,LocalDate.of(2023,9,11));

        ga.agregarAsistencia("15.444.332",10,LocalDate.of(2023,9,8));
        ga.agregarAsistencia("15.444.332",10,LocalDate.of(2023,9,22));

        ga.agregarAsistencia("16.232.545",3,LocalDate.of(2023,8,12));
        ga.agregarAsistencia("16.232.545",3,LocalDate.of(2023,8,17));
        ga.agregarAsistencia("16.232.545",3,LocalDate.of(2023,9,15));

        ga.agregarAsistencia("16.232.545",8,LocalDate.of(2023,8,24));

        String separacion = ("-------------------------------\n");

        System.out.println(separacion + ga.getListadoAlumnos() + separacion);
        System.out.println(ga.getListadoProfesores() + separacion);
        System.out.println(ga.getListadoDisciplinas() + separacion);
        System.out.println(ga.getListadoSalones() + separacion);
        System.out.println(ga.getListadoClases() + separacion);
        System.out.println(ga.getListadoInscripciones() + separacion);

        System.out.println(ga.informeMensual() + separacion);

        System.out.println(ga.informeDisciplinaMayorIngreso() + separacion);


    }


}
