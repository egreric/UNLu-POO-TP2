package ar.edu.unlu.poo.tp2.ej9.figurasDosDimensiones;

public class Circulo extends FiguraDosDimensiones {

    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    @Override
    public double getArea(){
        return (Math.PI * Math.pow(radio,2));
    }

    @Override
    public String toString(){
        return "Circulo --> Radio: " + getRadio() + " - Area: " + getArea();
    }

}
