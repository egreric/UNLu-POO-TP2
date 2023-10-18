package ar.edu.unlu.poo.tp2.ej11;

import ar.edu.unlu.poo.tp2.ej11.renta.Auto;
import ar.edu.unlu.poo.tp2.ej11.renta.AutoVip;
import ar.edu.unlu.poo.tp2.ej11.renta.Combi;
import ar.edu.unlu.poo.tp2.ej11.renta.Vehiculo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainEj11 {
    public static void main(String[] args){
        ArrayList<Vehiculo> listadoVehiculos = new ArrayList<Vehiculo>();

        listadoVehiculos.add(new Auto("AGG 223",2));
        listadoVehiculos.add(new AutoVip("SDD 643",5));
        listadoVehiculos.add(new Combi("JIX 123"));

        for(Vehiculo v: listadoVehiculos){
            System.out.println("Patente: " + v.getPatente() + " - Precio de alquiler por 1 dia: " + v.getPrecioAlquiler(1) + " - Precio de alquiler por 3 dias: " + v.getPrecioAlquiler(3) );
        }

    }
}
