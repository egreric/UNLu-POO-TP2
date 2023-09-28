package ar.edu.unlu.poo.tp2.ej3;

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

}
