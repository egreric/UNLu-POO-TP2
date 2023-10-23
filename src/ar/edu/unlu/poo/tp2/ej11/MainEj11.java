package ar.edu.unlu.poo.tp2.ej11;

import ar.edu.unlu.poo.tp2.ej11.renta.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainEj11 {
    public static void main(String[] args){
        SistemaRenta sr = new SistemaRenta();

        sr.agregarAuto("JED 234", 4); // Vehiculo 1
        sr.agregarAutoVip("CD 444 ZT", 2); // Vehiculo 2
        sr.agregarCamion("DE 452 RD"); // Vehiculo 3
        sr.agregarCamioneta("SDF 234", 800); // Vehiculo 4
        sr.agregarCombi("AR 240 JC"); // Vehiculo 5

        sr.agregarCliente("Carlos", "Gimenez", "14.233.299");
        sr.agregarCliente("Raul", "Monaco", "23.452.222");
        sr.agregarCliente("Javier", "Paz", "41.423.897");

        sr.agregarPresupuesto(1,7); // Presupuesto 1
        sr.agregarPresupuesto(2,4); // Presupuesto 2
        sr.agregarPresupuesto(3,17); // Presupuesto 3
        sr.agregarPresupuesto(4,4); // Presupuesto 4
        sr.agregarPresupuesto(5,8); // Presupuesto 5
        sr.agregarPresupuesto(3,40); // Presupuesto 6

        sr.alquilar("14.233.299",2);
        sr.alquilar("14.233.299",1);
        sr.alquilar("23.452.222",3);
        sr.alquilar("41.423.897",5);
        sr.alquilar("23.452.222",4);
        sr.alquilar("41.423.897",6);
        sr.alquilar("23.452.222",6);
        sr.alquilar("14.233.299",4);

        System.out.println("DESCRIPCION DE ALQUILERES POR CLIENTE\n" + sr.getDescripcionAlquileresPorCliente("41.423.897") + "\n");
        System.out.println("DESCRIPCION DE ALQUILERES TOTALES\n" + sr.getDescripcionAlquileresTotales());


    }
}
