package ar.edu.unlu.poo.tp2.ej6;

import ar.edu.unlu.poo.tp2.ej6.sistemaVentas.Expendedor;
import ar.edu.unlu.poo.tp2.ej6.sistemaVentas.ModuloInformes;

import java.sql.Array;
import java.util.ArrayList;

public class MainTp6 {
    public static void main(String args[]){
        /*
        El diseño propuesto como solucion no pareceria cumplir con todos con los requisitos del sistema
         */

        ModuloInformes estacionServicio = new ModuloInformes();

        estacionServicio.agregarEmpleado("Carlos Rodriguez","17.467.282");
        estacionServicio.agregarEmpleado("Juan Perez","24.942.331");
        estacionServicio.agregarEmpleado("Joaquin Leal","31.226.897");

        estacionServicio.agregarExpendedor("Nafta",1670);
        estacionServicio.agregarExpendedor("Gasoil",1230);
        estacionServicio.agregarExpendedor("Kerosene",950);
        estacionServicio.agregarExpendedor("Gasoil",1230);
        estacionServicio.agregarExpendedor("Nafta",1670);

        estacionServicio.realizarVenta("Ernesto Paez","ABC 123",1,4500,"17.467.282");
        estacionServicio.realizarVenta("Pedro Garcia","JSK 245",2,10200,"24.942.331");
        estacionServicio.realizarVenta("Marcela Silvero","PEA 456",3,3680,"17.467.282");
        estacionServicio.realizarVenta("Florencia Pacheco","ROC 183",3,7500,"24.942.331");
        estacionServicio.realizarVenta("Esteban Solari","STK 832",3,4567,"31.226.897");
        estacionServicio.realizarVenta("Marcos Aguilera","ATC 670",5,7832,"17.467.282");
        estacionServicio.realizarVenta("Esteban Solari","STK 832",4,4567,"31.226.897");
        estacionServicio.realizarVenta("Romina Pinto","PRR 631",5,7890,"31.226.897");
        estacionServicio.realizarVenta("Marcelo Cabral","LKM 441",3,8090,"17.467.282");
        estacionServicio.realizarVenta("Braian Sarmiento","JTE 232",4,9090,"31.226.897");
        estacionServicio.realizarVenta("Gaston Monaco","IXE 225",1,4400,"24.942.331");
        estacionServicio.realizarVenta("Kevin Valencia","AEQ 790",3,6540,"17.467.282");
        estacionServicio.realizarVenta("Kevin Valencia","AEQ 790",3,6540,"17.467.282");

        System.out.println(estacionServicio.informeVentasPorCombustible());
        System.out.println(estacionServicio.informeVentasPorExpendedor());
        System.out.println(estacionServicio.informeLitrosPorExpendedor());
        System.out.println(estacionServicio.informeVentasPorEmpleado());
        System.out.println(estacionServicio.informeCompraPorCliente());

    }
}
