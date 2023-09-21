package ar.edu.unlu.poo.tp2;

import ar.edu.unlu.poo.tp2.ejercicioDistribuidora.Articulo;
import ar.edu.unlu.poo.tp2.ejercicioDistribuidora.Cliente;
import ar.edu.unlu.poo.tp2.ejercicioDistribuidora.Pedido;
import ar.edu.unlu.poo.tp2.ejercicioDistribuidora.Vendedor;

import java.time.LocalDate;
import java.util.ArrayList;

public class Distribuidora {
    public static void main(String[] args) {
        // Cargo la Base de datos de mis articulos
        Articulo articulo1 = new Articulo("Bateria",10,20320.10);
        Articulo articulo2 = new Articulo("Llanta",4,8920.50);
        Articulo articulo3 = new Articulo("Manguera",1,2500.00);
        Articulo articulo4 = new Articulo("Aros",2,3400.65);
        Articulo articulo5 = new Articulo("Tanque",2,3400.65);
        Articulo articulo6 = new Articulo("Bujia",2,3400.65);

        Vendedor vendedor1 = new Vendedor("Carlos","Perez","24.543.442");
        Vendedor vendedor2 = new Vendedor("Matias","Sanchez","32.447.636");
        Vendedor vendedor3 = new Vendedor("Fernando","Rodriguez","17.527.347");

        Cliente cliente1 = new Cliente("Pedro","Mendez","40.233.268");
        Cliente cliente2 = new Cliente("Gabriel","Miranda","41.937.920");
        Cliente cliente3 = new Cliente("Roberto","Gomez","11.745.543");
        Cliente cliente4 = new Cliente("Juan","Martinez","11.745.543");

        LocalDate fecha1 = LocalDate.of(2023,9,15);
        LocalDate fecha2 = LocalDate.of(2023,8,20);
        LocalDate fecha3 = LocalDate.of(2023,8,20);
        LocalDate fecha4 = LocalDate.of(2023,9,13);
        LocalDate fecha5 = LocalDate.now();
        LocalDate fecha6 = LocalDate.of(2023,8,1);

        Pedido pedido1 = new Pedido("Carlos","Perez","24.543.442",
                                "Pedro","Mendez","40.233.268",
                                LocalDate.of(2023,9,15));
        pedido1.agregarArticulo("Bateria",10);
        pedido1.agregarArticulo("Llanta",4);
        pedido1.agregarArticulo("Manguera",1);
        System.out.println(pedido1.getListaDetalle());

        pedido1.


        System.out.println(fecha1.minusMonths(1).lengthOfMonth()); // resto un mes a mi fecha y averiguo cuantos dias tiene el mes anterior




    }
}