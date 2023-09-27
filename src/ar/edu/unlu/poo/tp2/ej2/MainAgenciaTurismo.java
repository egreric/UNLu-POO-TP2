package ar.edu.unlu.poo.tp2.ej2;

import java.time.LocalDate;

public class MainAgenciaTurismo {
    public static void main(String[] args){
        AgenciaTurismo agenciaTurismo = new AgenciaTurismo();

        // Armo los paquetes de turismo
        MedioTransporte mt1 = new MedioTransporte("Vuela Vuela",5000,TipoMedioTransporte.AEREA,"Volar Alto S.A.","30-24433243-1");//2
        MedioTransporte mt2 = new MedioTransporte("Ruta Rapida",1500,TipoMedioTransporte.TERRESTE,"Truck Master S.A.","30-29333222-7");//4
        MedioTransporte mt3 = new MedioTransporte("Aguas Veloces",3000,TipoMedioTransporte.MARITIMA,"Mar Azul S.R.L.","30-32777888-3");//7

        Hospedaje h1 = new Hospedaje("SS Hosterias",2300,TipoHospedaje.HOSTERIA,"Descansar S.R.L.","30-32256754-3");//1
        Hospedaje h2 = new Hospedaje("Six Bungalos",3600,TipoHospedaje.BUNGALO,"Duerme Ya S.A.","30-322543233-3");//
        Hospedaje h3 = new Hospedaje("Hotel Royal",4800,TipoHospedaje.HOTEL,"Tranquilidad S.A.","30-23498574-3");//8

        Excursion e1 = new Excursion("Recorrido Museo",1000, "Travesia S.A.","30-28428999-3");//3
        Excursion e2 = new Excursion("Turismo Aventura",1300, "Locura S.R.L.","30-17747533-3");//5
        Excursion e3 = new Excursion("Visita Parque Nacional",2200, "Mirasol S.R.L.","30-24342931-3");//6

        PaqueteTurismo pTurismo1 = new PaqueteTurismo("Grecia",mt1,h1);
        pTurismo1.agregarExcursion(e1);

        PaqueteTurismo pTurismo2 = new PaqueteTurismo("Grecia",mt2,h2);
        pTurismo2.agregarExcursion(e1);
        pTurismo2.agregarExcursion(e2);

        PaqueteTurismo pTurismo3 = new PaqueteTurismo("Francia",mt3,h2);
        pTurismo3.agregarExcursion(e1);
        pTurismo3.agregarExcursion(e3);

        PaqueteTurismo pTurismo4 = new PaqueteTurismo("Argentina",mt2,h3);
        pTurismo4.agregarExcursion(e1);
        pTurismo4.agregarExcursion(e2);
        pTurismo4.agregarExcursion(e3);

        PaqueteTurismo pTurismo5 = new PaqueteTurismo("Brasil",mt1,h2);
        pTurismo5.agregarExcursion(e3);

        agenciaTurismo.agregarPaqueteTurismo(pTurismo1);
        agenciaTurismo.agregarPaqueteTurismo(pTurismo2);
        agenciaTurismo.agregarPaqueteTurismo(pTurismo3);
        agenciaTurismo.agregarPaqueteTurismo(pTurismo4);
        agenciaTurismo.agregarPaqueteTurismo(pTurismo5);


        // agrego clientes
        Cliente cliente1 = new Cliente("Carlos","Rodriguez","12.133.421");
        Cliente cliente2 = new Cliente("Pedro", "Sanchez","17.346.224");
        Cliente cliente3 = new Cliente("Juan", "Perez","32.336.163");
        Cliente cliente4 = new Cliente("Ernesto", "Garcia","24.226.288");

        agenciaTurismo.agregarCliente(cliente1);
        agenciaTurismo.agregarCliente(cliente2);
        agenciaTurismo.agregarCliente(cliente3);
        agenciaTurismo.agregarCliente(cliente4);

        // realizo ventas de paquetes
        agenciaTurismo.realizarVenta(cliente1, pTurismo1, LocalDate.of(2023,9,25));
        agenciaTurismo.realizarVenta(cliente1, pTurismo2, LocalDate.of(2023,8,20));
        agenciaTurismo.realizarVenta(cliente2, pTurismo3, LocalDate.of(2023,6,13));
        agenciaTurismo.realizarVenta(cliente3, pTurismo4, LocalDate.of(2023,7,17));
        agenciaTurismo.realizarVenta(cliente4, pTurismo5, LocalDate.of(2023,9,3));
        agenciaTurismo.realizarVenta(cliente4, pTurismo3, LocalDate.of(2023,9,8));

        // Muestro todos los proveedores y su tipo(sin ordenar)
        System.out.println("LISTADO DE PROVEEDORES");
        System.out.println(agenciaTurismo.listadoProveedores());
        System.out.println("-----------------------------------------");

        // Muestro el listado de los paquetes de turismo disponibles
        System.out.println("LISTADO DE PAQUETES DE TURISMO");
        System.out.println(agenciaTurismo.listadoPaquetesTurismo());
        System.out.println("-----------------------------------------");

        // Muestro listado de clientes
        System.out.println("LISTADO DE CLIENTES");
        System.out.println(agenciaTurismo.listadoClientes());
        System.out.println("-----------------------------------------");

        // Muestro listado de ventas completo
        System.out.println("LISTADO DE VENTAS COMPLETO");
        System.out.println(agenciaTurismo.listadoVentasCompleto());
        System.out.println("-----------------------------------------");

        // Muestro listado de ventas por destino
        System.out.println("LISTADO DE VENTAS (POR DESTINO)");
        System.out.println(agenciaTurismo.listadoVentasPorDestino("Francia"));
        System.out.println("-----------------------------------------");

        // Muestro destino favorito y la cantidad de ventas que tuvo
        System.out.println("Destino favorito de los clientes (con mas ventas)");
        System.out.println(agenciaTurismo.destinoFavorito());
        System.out.println("-----------------------------------------");

    }
}
