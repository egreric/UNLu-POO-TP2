package ar.edu.unlu.poo.tp2.ej3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Clase {
    private Disciplina disciplina;
    private NivelClase nivel;
    private Profesor profesor;
    private ArrayList<Horario> horarios = new ArrayList<Horario>();
    private Salon salon;
    private double costo;

    public Clase(Disciplina disciplina, NivelClase nivelClase, Profesor profesor, ArrayList<Horario> horarios,  Salon salon, double precio){
        setDisciplina(disciplina);
        setNivel(nivelClase);
        setProfesor(profesor);
        setSalon(salon);
        setCosto(precio);
        setHorarios(horarios);
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    private void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public NivelClase getNivel() {
        return nivel;
    }

    private void setNivel(NivelClase nivel) {
        this.nivel = nivel;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    private void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Horario> getHorarios() { return horarios;
    }

    private void setHorarios(ArrayList<Horario> horarios){
        this.horarios = horarios;
    }

    public Salon getSalon() {
        return salon;
    }

    private void setSalon(Salon salon) {
        this.salon = salon;
    }

    public double getCosto() {
        return this.costo;
    }

    private void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clase clase = (Clase) o;
        return Double.compare(costo, clase.costo) == 0 && Objects.equals(disciplina, clase.disciplina) && nivel == clase.nivel && Objects.equals(profesor, clase.profesor) && Objects.equals(horarios, clase.horarios) && Objects.equals(salon, clase.salon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disciplina, nivel, profesor, horarios, salon, costo);
    }

    @Override
    public String toString(){
        String s = "";
        s += "Disciplina: " + getDisciplina().getNombre() + " (" + getNivel() + ") | Profesor: " + getProfesor().getNombre() + " " + getProfesor().getApellido() + " | ";
        s += "Horarios: " + getHorarios().toString() + " | Salon: " + getSalon().getNombre() + " | Costo $" + getCosto();
        return s;
    }
}
