package ar.edu.unlu.poo.tp2.ej7;

import ar.edu.unlu.poo.tp2.ej7.sistemaVentas.ModuloInformes;

import java.time.LocalDate;

public class MainTp7 {
    public static void main(String args[]){

        ModuloInformes estacionServicio = new ModuloInformes();

        estacionServicio.agregarEmpleado("Carlos Rodriguez","17.467.282");
        estacionServicio.agregarEmpleado("Juan Perez","24.942.331");
        estacionServicio.agregarEmpleado("Joaquin Leal","31.226.897");

        estacionServicio.agregarExpendedor("Nafta",1670);
        estacionServicio.agregarExpendedor("Gasoil",1230);
        estacionServicio.agregarExpendedor("Kerosene",950);
        estacionServicio.agregarExpendedor("Gasoil",1230);
        estacionServicio.agregarExpendedor("Nafta",1670);

        /* Cargo ventas del mes anterior (Aclaracion: se va a implementar un metodo que en realidad no deberia formar parte de la clase, pero se va a utiliza para
            "simular" que hubo ventas el mes anterior y asi poder realizar los informes pedidos */
        int esteAnio = LocalDate.now().getYear();
        int mesAnterior = LocalDate.now().getMonthValue() - 1;
        estacionServicio.realizarVenta("Marcelo Cabral","LKM 441",1,8090,"17.467.282", LocalDate.of(esteAnio,mesAnterior,1));
        estacionServicio.realizarVenta("Braian Sarmiento","JTE 232",2,9090,"31.226.897", LocalDate.of(esteAnio,mesAnterior,1));
        estacionServicio.realizarVenta("Florencia Pacheco","ROC 183",5,7500,"24.942.331", LocalDate.of(esteAnio,mesAnterior,1));
        estacionServicio.realizarVenta("Kevin Valencia","AEQ 790",4,6540,"17.467.282", LocalDate.of(esteAnio,mesAnterior,1));
        estacionServicio.realizarVenta("Gaston Monaco","IXE 225",2,4400,"24.942.331", LocalDate.of(esteAnio,mesAnterior,1));
        estacionServicio.realizarVenta("Kevin Valencia","AEQ 790",1,6540,"17.467.282", LocalDate.of(esteAnio,mesAnterior,1));
        estacionServicio.realizarVenta("Pedro Garcia","JSK 245",1,10200,"24.942.331", LocalDate.of(esteAnio,mesAnterior,1));
        estacionServicio.realizarVenta("Marcela Silvero","PEA 456",4,3680,"17.467.282", LocalDate.of(esteAnio,mesAnterior,1));
        estacionServicio.realizarVenta("Ernesto Paez","ABC 123",3,4500,"17.467.282", LocalDate.of(esteAnio,mesAnterior,1));
        estacionServicio.realizarVenta("Esteban Solari","STK 832",2,4567,"31.226.897", LocalDate.of(esteAnio,mesAnterior,1));
        estacionServicio.realizarVenta("Marcos Aguilera","ATC 670",5,7832,"17.467.282", LocalDate.of(esteAnio,mesAnterior,1));
        estacionServicio.realizarVenta("Esteban Solari","STK 832",5,4567,"31.226.897", LocalDate.of(esteAnio,mesAnterior,1));
        estacionServicio.realizarVenta("Romina Pinto","PRR 631",3,7890,"31.226.897", LocalDate.of(esteAnio,mesAnterior,1));

        // Cargo ventas del dia
        estacionServicio.realizarVenta("Ernesto Paez","ABC 123",1,4500,"17.467.282", true);
        estacionServicio.realizarVenta("Pedro Garcia","JSK 245",2,10200,"24.942.331", true);
        estacionServicio.realizarVenta("Marcela Silvero","PEA 456",3,3680,"17.467.282", true);
        estacionServicio.realizarVenta("Florencia Pacheco","ROC 183",3,7500,"24.942.331", true);
        estacionServicio.realizarVenta("Esteban Solari","STK 832",3,4567,"31.226.897", true);
        estacionServicio.realizarVenta("Marcos Aguilera","ATC 670",5,7832,"17.467.282", true);
        estacionServicio.realizarVenta("Esteban Solari","STK 832",4,4567,"31.226.897", true);
        estacionServicio.realizarVenta("Romina Pinto","PRR 631",5,7890,"31.226.897", true);
        estacionServicio.realizarVenta("Marcelo Cabral","LKM 441",3,8090,"17.467.282", true);
        estacionServicio.realizarVenta("Braian Sarmiento","JTE 232",4,9090,"31.226.897", true);
        estacionServicio.realizarVenta("Gaston Monaco","IXE 225",1,4400,"24.942.331", true);
        estacionServicio.realizarVenta("Kevin Valencia","AEQ 790",3,6540,"17.467.282", true);
        estacionServicio.realizarVenta("Kevin Valencia","AEQ 790",3,6540,"17.467.282", true);

        System.out.println(estacionServicio.proporcionCantidadVentasMensualPorCombustible());
        System.out.println(estacionServicio.informeVentasPorExpendedor());
        System.out.println(estacionServicio.informeLitrosPorExpendedor());
        System.out.println(estacionServicio.informeVentasPorEmpleado());
        System.out.println(estacionServicio.top10ClientesCompras());

        System.out.println("Conclusiones del Ejercicio 7:\n");
        System.out.println("*Si el precio de los combustibles cambia con el tiempo y en mi clase venta no la tengo como atributo, para calcular la cantidad de litros de\n" +
                "combustible vendido voy a tener que preguntarle al objeto Combustible cual es su precio y dividirlo por el importe de la venta. lo que puede\n" +
                "resultar (si el precio subio por ejemplo), que vendi menos litros de los que en realidad fueron. para evitar esto es mejor tener ese atributo\n" +
                "dentro de mi clase venta y evitar asi futuras inconsistencias entre los datos.\n\n" +
                "*Si el dueño decide vender otros productos voy a tener que crear tanta cantidad de clases como productos distintos venda, ademas tambien el comportamiento\n" +
                "de estas nuevas clases seria el mismo para cada producto, Spor lo que voy a tener que duplicar codigo para cada una de las nuevas clases desarrolladas.\n");

    }
}

