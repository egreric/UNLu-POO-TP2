package ar.edu.unlu.poo.tp2.ej3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Inscripcion {
    private Clase clase;
    private Alumno alumno;
    private ArrayList<LocalDate> asistencias = new ArrayList<LocalDate>();
    private double importe;

    public Inscripcion(Clase clase, Alumno alumno){
        setClase(clase);
        setAlumno(alumno);
        setImporte(this.clase.getCosto());
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void agregarAsistencia(LocalDate fecha){
        this.asistencias.add(fecha);
    }

    public ArrayList<LocalDate> getAsistencias() {
        return asistencias;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Alumno: " + getAlumno().getNombre() + " " + getAlumno().getApellido() + " | Clase: " + getClase().getDisciplina().getNombre() + " " + getClase().getNivel();
        s += "(Prof. " + getClase().getProfesor().getNombre() + " " + getClase().getProfesor().getApellido() + ") " + getClase().getHorarios().toString();
        return s;
    }
}
