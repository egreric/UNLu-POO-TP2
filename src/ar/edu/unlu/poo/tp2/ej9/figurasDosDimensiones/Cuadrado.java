package ar.edu.unlu.poo.tp2.ej9.figurasDosDimensiones;

public class Cuadrado extends FiguraDosDimensiones {

    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return this.lado;
    }

    @Override
    public double getArea() {
        return (lado * lado);
    }

    @Override
    public String toString(){
        return "Cuadrado --> Lado: " + getLado() + " - Area: " + getArea();
    }
}
