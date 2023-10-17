package ar.edu.unlu.poo.tp2.ej9.figurasTresDimensiones;

import ar.edu.unlu.poo.tp2.ej9.figurasDosDimensiones.FiguraDosDimensiones;

public class Esfera extends FiguraTresDimensiones {

    private double radio;

    public Esfera(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }


    @Override
    public double getArea() {
        return (4 * Math.PI * (Math.pow(radio,2)));
    }

    @Override
    public double getVolumen() {
        return (((double) 4 /3) * Math.PI * Math.pow(radio,3)) ;
    }

    @Override
    public String toString(){
        return "Esfera --> radio: " + getRadio() +
                " - Area: " + getArea() +
                " - Volumen: " + getVolumen();
    }
}
