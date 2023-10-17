package ar.edu.unlu.poo.tp2.ej9.figurasTresDimensiones;

public class Cubo extends FiguraTresDimensiones{

    private double arista;

    public Cubo(double arista){
        this.arista = arista;
    }

    public double getArista() {
        return arista;
    }

    @Override
    public double getArea() {
        return 6 * (Math.pow(arista,2));
    }

    @Override
    public double getVolumen() {
        return Math.pow(arista,3);
    }

    @Override
    public String toString(){
        return "Cubo --> Arista: " + getArista() +
                " - Area: " + getArea() +
                " - Volumen: " + getVolumen();
    }
}
