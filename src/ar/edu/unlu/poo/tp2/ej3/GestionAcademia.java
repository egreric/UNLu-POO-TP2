package ar.edu.unlu.poo.tp2.ej3;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionAcademia {
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    private ArrayList<Profesor> profesores = new ArrayList<Profesor>();
    private ArrayList<Inscripcion> inscripciones = new ArrayList<Inscripcion>();
    private ArrayList<Clase> clases = new ArrayList<Clase>();

    // Segun el ejercicio al dar de alta un alumno se lo inscribe tambien en una clase
    public void altaAlumno(Alumno alumno, Clase clase){
            this.alumnos.add(alumno);
            this.inscripciones.add(new Inscripcion(clase, alumno));
    }

    public void altaProfesor(Profesor profesor){
        this.profesores.add(profesor);
    }

    public void agregarClase(Clase clase){
        this.clases.add(clase);
    }

    public void inscribir(Alumno alumno, Clase clase){
        this.inscripciones.add(new Inscripcion(clase, alumno));

    }

    public String informeMensual(){
        String s = "";
        int cantidadAsistencias = 0;
        double gananciaPorAsistenca = 10;
        for (Profesor p: profesores){
            s += "Profesor: " + p.getNombre() + " " + p.getApellido() + " (dni: " + p.getDni() + ")\n";
            cantidadAsistencias = this.asistenciasMesPasadoSegunProfesor(p);
            s += "Cantidad de asistencias: " + cantidadAsistencias + "\n";
            s += "Importe a pagar: $" + (cantidadAsistencias*gananciaPorAsistenca) + "\n";
        }
        return s;
    }

    private int asistenciasMesPasadoSegunProfesor(Profesor p) {
        int sumatoria = 0;
        int mesAnterior = LocalDate.now().minusMonths(1).getMonthValue();
        for (Inscripcion i: inscripciones){ // busco en cada inscripcion las asistencias
            if (i.getClase().getProfesor().getDni().equals(p.getDni())){ // pregunto si es el profesor que busco
                for (LocalDate fecha: i.getAsistencias()){
                    if (fecha.getMonthValue() == mesAnterior) { // cuento las asistencias del mes anterior al actual (el informe es a mes vencido)
                        sumatoria++;
                    }
                }

            }
        }
        return sumatoria;
    }

}
