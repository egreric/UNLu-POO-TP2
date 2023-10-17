package ar.edu.unlu.poo.tp2.ej9;

import ar.edu.unlu.poo.tp2.ej9.figurasDosDimensiones.Circulo;
import ar.edu.unlu.poo.tp2.ej9.figurasDosDimensiones.Cuadrado;
import ar.edu.unlu.poo.tp2.ej9.figurasDosDimensiones.Rectangulo;
import ar.edu.unlu.poo.tp2.ej9.figurasDosDimensiones.Triangulo;
import ar.edu.unlu.poo.tp2.ej9.figurasTresDimensiones.*;

import java.util.ArrayList;

public class MainEj9 {
    public static void main(String[] args){
        ArrayList<Figura> listadoFiguras = new ArrayList<Figura>();

        // Agrego figuras de dos dimensiones
        listadoFiguras.add(new Circulo(3));
        listadoFiguras.add(new Cuadrado(4));
        listadoFiguras.add(new Rectangulo(3,4));
        listadoFiguras.add(new Triangulo(4,5));

        // Agrego figuras de tres dimensiones
        listadoFiguras.add(new Cubo(4));
        listadoFiguras.add(new Esfera(3));
        listadoFiguras.add(new Paralelepipedo(3,2,4));
        listadoFiguras.add(new Tetraedro(4));

        for (Figura f: listadoFiguras){
            System.out.println(f.toString());
        }

    }
}
