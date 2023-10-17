package ar.edu.unlu.poo.tp2.ej9.figurasTresDimensiones;

public class Tetraedro extends FiguraTresDimensiones{

    private double arista;

    public Tetraedro(double arista){
        this.arista = arista;
    }

    public double getArista() {
        return arista;
    }

    @Override
    public double getArea() {
        return Math.pow(arista,2) * Math.cbrt(3);
    }

    @Override
    public double getVolumen() {
        return Math.pow(arista,3) * (Math.sqrt(2) / 12);
    }

    @Override
    public String toString(){
        return "Tetraedro --> Arista: " + getArista() +
                " - Area: " + getArea() +
                " - Volumen: " + getVolumen();
    }
}
