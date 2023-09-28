package ar.edu.unlu.poo.tp2.ej3;

import java.util.ArrayList;

public class Clase {
    private Disciplina disciplina;
    private NivelClase nivel;
    private Profesor profesor;
    private ArrayList<Horario> horarios = new ArrayList<Horario>();
    private Salon salon;
    private double costo;

    public Clase(Disciplina disciplina, NivelClase nivelClase, Profesor profesor, Salon salon, double precio){
        setDisciplina(disciplina);
        setNivel(nivelClase);
        setProfesor(profesor);
        setSalon(salon);
        setCosto(precio);
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public NivelClase getNivel() {
        return nivel;
    }

    public void setNivel(NivelClase nivel) {
        this.nivel = nivel;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Horario> getHorarios() { return horarios;
    }

    public void agregarHorario(Dia dia, String hora){
        this.horarios.add(new Horario(dia,hora));
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public double getCosto() {
        return this.costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
