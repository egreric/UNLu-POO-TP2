package ar.edu.unlu.poo.tp2;

import ar.edu.unlu.poo.tp2.ejercicioDistribuidora.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Distribuidora {
    public static void main(String[] args) {
        // Cargo el stock disponile de mis articulos
        Stock stock = new Stock();
        stock.agregarArticulo("Bateria",10,5050.50);
        stock.agregarArticulo("Llanta",15,8920.50);
        stock.agregarArticulo("Manguera",15,2500);
        stock.agregarArticulo("Aros",15,3400.65);
        stock.agregarArticulo("Tanque",15,3299.99);
        stock.agregarArticulo("Bujia",15,1260.70);

        System.out.println("LISTADO STOCK ANTES DE PROCESAR LOS PEDIDOS \n" +stock.toString());
        System.out.println("--------------------------------------");

        // Armo pedidos
        Pedido pedido1 = new Pedido("Carlos","Perez","24.543.442",
                                      "Pedro","Mendez","40.233.268",
                                 LocalDate.of(2023,9,15));
        pedido1.agregarArticulo("Bateria",10);
        pedido1.agregarArticulo("Llanta",4);
        pedido1.agregarArticulo("Manguera",1);

        Pedido pedido2 = new Pedido("Matias","Sanchez","32.447.636",
                                      "Gabriel","Miranda","41.937.920",
                                LocalDate.of(2023,8,20));
        pedido2.agregarArticulo("Aros",3,2300.00);
        pedido2.agregarArticulo("Manguera",2000);

        Pedido pedido3 = new Pedido("Fernando","Rodriguez","17.527.347",
                "Roberto","Gomez","11.745.543",
                LocalDate.of(2023,9,13));
        pedido3.agregarArticulo("Tanque",10);
        pedido3.agregarArticulo("Bujia",10, 1000);

        Pedido pedido4 = new Pedido("Carlos","Perez","24.543.442",
                "Juan","Martinez","11.745.543",
                LocalDate.now());
        pedido4.agregarArticulo("Bateria",5);
        pedido4.agregarArticulo("Bujia",7);

        Pedido pedido5 = new Pedido("Carlos","Perez","24.543.442",
                "Juan","Martinez","11.745.543",
                LocalDate.of(2023,8,1));
        pedido5.agregarArticulo("Manguera",3);
        pedido5.agregarArticulo("Aros",3);

        // Agrego pedidos a lista para cargarlos en manejador
        ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();
        listaPedidos.add(pedido1);
        listaPedidos.add(pedido2);
        listaPedidos.add(pedido3);
        listaPedidos.add(pedido4);
        listaPedidos.add(pedido5);

        // Cargo en manejador la lista de pedidos y mi stock actual para poder procesarlos
        ManejadorPedido mp = new ManejadorPedido(listaPedidos, stock);
        mp.procesarPedidos();

        System.out.println("LISTADO STOCK DESPUES DE PROCESAR LOS PEDIDOS \n" +stock.toString());

        System.out.println(mp.informeMensual());

    }
}