package ar.edu.unlu.poo.tp2.ej10;

import ar.edu.unlu.poo.tp2.ej10.organizacion.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainEj10 {
    public static void main(String[] args){
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(new EmpleadoAsalariado("Carlos", "Sotelo", "2323456231", "20-32244212-7",250000, LocalDate.of(2000,10,8)));
        listaEmpleados.add(new EmpleadoConComision("Javier", "Perez", "2234567599", "20-16455690-3",80000,30, LocalDate.of(2004,10,5)));
        listaEmpleados.add(new EmpleadoConComisionBase("Marcelo", "Garcia", "2444564122", "20-22456908-5",65000,20,15000, LocalDate.of(2005,10,13)));
        listaEmpleados.add(new EmpleadoPorHora("Ernesto", "Dominguez", "2323545670", "20-40234933-5",1500,180, LocalDate.of(1997,10,12)));
        listaEmpleados.add(new Pasante("Gaston", "Peralta", "2323679809", "20-20341670-7", LocalDate.of(1999,11,20)));

        for(Empleado e: listaEmpleados){
            System.out.println(e.toString());
        }
    }
}
