package ar.edu.unlu.poo.tp2.ej3;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class GestionAcademia {
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    private ArrayList<Profesor> profesores = new ArrayList<Profesor>();
    private ArrayList<Inscripcion> inscripciones = new ArrayList<Inscripcion>();
    private ArrayList<Clase> clases = new ArrayList<Clase>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    private ArrayList<Salon> salones = new ArrayList<Salon>();

    // Segun el ejercicio al dar de alta un alumno se lo inscribe tambien en una clase
    public void altaAlumno(String nombre, String apellido, String dni, int numeroDeClaseAInscribir){
            Alumno a = new Alumno (nombre,apellido,dni);
            if (!existeAlumno(dni) && numeroDeClaseAInscribir <= this.clases.size()) { // si mi alumno no existe y el numero de clase a inscribirme esta dentro de mi rango de clases cargadas
                this.alumnos.add(a);
                inscribirAlumno(a.getDni(),numeroDeClaseAInscribir);
            }
    }

    public void altaProfesor(String nombre, String apellido, String dni){
        Profesor p = new Profesor(nombre,apellido,dni);
        if (!profesores.contains(p)) {
            this.profesores.add(p);
        }
    }

    public void altaDisciplina(String nombreDisciplina){
        Disciplina d = new Disciplina(nombreDisciplina);
        if (!disciplinas.contains(d)){
            this.disciplinas.add(d);
        }
    }

    public void altaSalon(String nombreSalon, int capacidad){
        Salon s = new Salon(nombreSalon,capacidad);
        if (!salones.contains(s)){
            salones.add(s);
        }
    }

    private boolean existeProfesor(String dniProfesor){
        for (Profesor p: this.profesores){
            if (p.getDni().equals(dniProfesor)){
                return true;
            }
        }
        return false;
    }

    private boolean existeSalon(String nombreSalon){
        for (Salon s: this.salones){
            if (s.getNombre().equals(nombreSalon)){
                return true;
            }
        }
        return false;
    }

    private Profesor buscarProfesor(String dni){
        for (Profesor p: this.profesores){
            if (p.getDni().equals(dni)){
                return p;
            }
        }
        return null;
    }

    private Salon buscarSalon(String nombreSalon){
        for (Salon s: this.salones){
            if (s.getNombre().equals(nombreSalon)){
                return s;
            }
        }
        return null;
    }

    // Para poder dar de alta una clase debe existir anteriormente, una disciplina, un profesor y un salon. (ademas de que esa clase no exista)
    public void altaClase(String disciplina, NivelClase nivel, String dniProfesor, ArrayList<Horario> horarios, String nombreSalon, double costo){
        if (existeProfesor(dniProfesor) && existeSalon(nombreSalon)) {
            Clase c = new Clase(new Disciplina(disciplina),nivel,buscarProfesor(dniProfesor),horarios, buscarSalon(nombreSalon),costo);
            if (!clases.contains(c)){
                this.clases.add(c);
            }
        }
    }

    private boolean existeAlumno(String dni){
        for (Alumno a: this.alumnos){
            if(a.getDni().equals(dni)){
                return true;
            }
        }
        return false;
    }

    private Alumno buscarAlumno(String dni){
        for (Alumno a: this.alumnos){
            if(a.getDni().equals(dni)){
                return a;
            }
        }
        return null;
    }

    public void inscribirAlumno(String dniAlumno, int numeroDeClaseAInscribir){
        if (existeAlumno(dniAlumno)){
            if (numeroDeClaseAInscribir <= this.clases.size()){
                Inscripcion i = new Inscripcion(this.clases.get(numeroDeClaseAInscribir-1),buscarAlumno(dniAlumno));
                if (!this.inscripciones.contains(i)) {
                    this.inscripciones.add(i);
                }
            }
        }
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

    public String getListadoAlumnos(){
        String s = "Listado de Alumnos\n";
        for (int i = 0; i < this.alumnos.size(); i++){
            s +=  "Alumno " + (i+1) + " -> " + this.alumnos.get(i).toString() + "\n";
        }
        return s;
    }

    public String getListadoProfesores(){
        String s = "Listado de Profesores\n";
        for (int i = 0; i < this.profesores.size(); i++){
            s +=  "Profesor " + (i+1) + " -> " + this.profesores.get(i).toString() + "\n";
        }
        return s;
    }

    public String getListadoDisciplinas(){
        String s = "Listado de Disciplinas\n";
        for (int i = 0; i < this.disciplinas.size(); i++){
            s +=  "Disciplina " + (i+1) + " -> " + this.disciplinas.get(i).toString() + "\n";
        }
        return s;
    }

    public String getListadoSalones(){
        String s = "Listado de Salones\n";
        for (int i = 0; i < this.salones.size(); i++){
            s +=  "Salon " + (i+1) + " -> " + this.salones.get(i).toString() + "\n";
        }
        return s;
    }

    public String getListadoClases(){
        String s = "Listado de Clases\n";
        for (int i = 0; i < this.clases.size(); i++){
            s +=  "Clase " + (i+1) + " -> " + this.clases.get(i).toString() + "\n";
        }
        return s;
    }

    public String getListadoInscripciones(){
        String s = "Listado de Inscripciones\n";
        for (int i = 0; i < this.inscripciones.size(); i++){
            s +=  "Inscripcion " + (i+1) + " -> " + this.inscripciones.get(i).toString() + "\n";
        }
        return s;
    }

}
