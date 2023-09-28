package ar.edu.unlu.poo.tp2.ej3;

import java.util.ArrayList;

public class MainGestionAcademia {

    public static void main(String[] args){
        GestionAcademia ga = new GestionAcademia();

        Alumno alumno1 = new Alumno("Raul", "Rizzo","13.422.423");
        Alumno alumno2 = new Alumno("Pedro", "Rodriguez","15.444.332");
        Alumno alumno3 = new Alumno("Juan", "Paz","16.232.545");
        Alumno alumno4 = new Alumno("Ezequiel", "Guerra","24.123.786");
        Alumno alumno5 = new Alumno("Pablo", "Castillo","28.244.268");

        Profesor profesor1 = new Profesor("Ernesto","Feliz","23.412.125");
        Profesor profesor2 = new Profesor("Carlos","Maidana","11.467.421");
        Profesor profesor3 = new Profesor("Roberto","Perez","28.231.869");
        Profesor profesor4 = new Profesor("Damian","Romero","31.789.549");
        Profesor profesor5 = new Profesor("Joaquin","Paredes","35.275.341");

        Disciplina disciplina1 = new Disciplina("Tango");
        Disciplina disciplina2 = new Disciplina("Salsa");
        Disciplina disciplina3 = new Disciplina("Bachata");
        Disciplina disciplina4 = new Disciplina("Clasico");
        Disciplina disciplina5 = new Disciplina("Arabe");


        Salon salon1 = new Salon("S10",10);
        Salon salon2 = new Salon("S25",25);
        Salon salon3 = new Salon("S50",50);
        Salon salon4 = new Salon("S30",30);
        Salon salon5 = new Salon("S15",15);


        Clase clase1 = new Clase(disciplina1,NivelClase.INICIAL,profesor1,salon1,3500);
        clase1.agregarHorario(Dia.LUNES,"15.30hs");
        clase1.agregarHorario(Dia.MIERCOLES,"17.00hs");

        Clase clase2 = new Clase(disciplina3,NivelClase.INICIAL,profesor2,salon3,5000);
        clase2.agregarHorario(Dia.MARTES,"14.00hs");
        clase2.agregarHorario(Dia.MIERCOLES,"16.00hs");

        Clase clase3 = new Clase(disciplina1,NivelClase.INICIAL,profesor1,salon2,2800);
        clase3.agregarHorario(Dia.LUNES,"18.30hs");
        clase3.agregarHorario(Dia.JUEVES,"15.00hs");

        Clase clase4 = new Clase(disciplina2,NivelClase.INTERMEDIO,profesor1,salon4,3400);
        clase4.agregarHorario(Dia.LUNES,"19.00hs");
        clase4.agregarHorario(Dia.VIERNES,"21.00hs");

        Clase clase5 = new Clase(disciplina3,NivelClase.AVANZADO,profesor3,salon2,6300);
        clase5.agregarHorario(Dia.MIERCOLES,"13.40hs");
        clase5.agregarHorario(Dia.SABADO,"17.30hs");

        Clase clase6 = new Clase(disciplina4,NivelClase.AVANZADO,profesor4,salon4,4400);
        clase6.agregarHorario(Dia.MARTES,"20.30hs");
        clase6.agregarHorario(Dia.JUEVES,"21.00hs");

        Clase clase7 = new Clase(disciplina5,NivelClase.INTERMEDIO,profesor5,salon5,6400);
        clase7.agregarHorario(Dia.VIERNES,"21.30hs");
        clase7.agregarHorario(Dia.SABADO,"08.30hs");

        Clase clase8 = new Clase(disciplina5,NivelClase.INTERMEDIO,profesor5,salon2,3200);
        clase8.agregarHorario(Dia.MIERCOLES,"09.00hs");
        clase8.agregarHorario(Dia.VIERNES,"11.00hs");

        Clase clase9 = new Clase(disciplina1,NivelClase.INICIAL,profesor3,salon5,2800);
        clase9.agregarHorario(Dia.MARTES,"10.30hs");
        clase9.agregarHorario(Dia.SABADO,"16.00hs");

        Clase clase10 = new Clase(disciplina1,NivelClase.AVANZADO,profesor4,salon5,3900);
        clase10.agregarHorario(Dia.LUNES,"11.00hs");
        clase10.agregarHorario(Dia.MARTES,"9.00hs");

        


    }


}
