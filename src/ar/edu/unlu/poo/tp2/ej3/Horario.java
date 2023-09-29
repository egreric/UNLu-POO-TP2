package ar.edu.unlu.poo.tp2.ej3;

import java.util.Objects;

public class Horario {
    private Dia dia;
    private String hora;

    public Horario(Dia dia, String hora){
        setDia(dia);
        setHora(hora);

    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horario horario = (Horario) o;
        return dia == horario.dia && Objects.equals(hora, horario.hora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, hora);
    }

    @Override
    public String toString(){
        return getDia() + ": " + getHora();
    }

}
