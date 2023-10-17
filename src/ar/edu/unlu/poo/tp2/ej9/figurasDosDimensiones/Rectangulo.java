package ar.edu.unlu.poo.tp2.ej9.figurasDosDimensiones;

public class Rectangulo extends FiguraDosDimensiones {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    @Override
    public double getArea(){
        return (base * altura);
    }

    @Override
    public String toString(){
        return "Rectangulo --> Base: " + getBase() + " - Altura: " + getAltura() + " - Area: " + getArea();
    }

}
