package ar.edu.unlu.poo.tp2.ej5;


import ar.edu.unlu.poo.tp2.ej5.billeteraVirtual.Usuario;
import ar.edu.unlu.poo.tp2.ej5.cuentas.Cuenta;
import ar.edu.unlu.poo.tp2.ej5.cuentas.CuentaCredito;
import ar.edu.unlu.poo.tp2.ej5.dateUtils.DateUtils;

import java.time.LocalDate;

public class MainTp5 {

    /*
    El diseño actual me permite introducir de manera simple los cambios en la clase Cuenta, simplemente
    modificamos la clase agregando ahora los plazos minimos y maximos de dias necesarios para que una inversion me devuelta cierta cantidad
    de interes sobre el monto invertido, luego modificamos los metodos que hacen uso de estos atributos para ajustarlos a las necesidades de
    la nueva feature.
    Tambien se agrego la opcion para poder activar y desactivar la precancelacion automatica de una inversion en la clase Cuenta. y nuevamente
    pasa lo mismo, no hay muchas complicaciones para manejar este cambio, mas alla de su agregacion en las distintas implementaciones de los metodos
    respectivos.

    La sencillez para la implementacion de los cambios viene ligada al diseño altamente cohesivo y su bajo acoplamiento, lo cual me permite
    realizar este tipo de cambios sin la necesidad de mirar como afectan estos a las demas clases de mi proyecto.
    */
    public static void main(String[] args){
        Cuenta c = new Cuenta(10000,5000);
        CuentaCredito cc = new CuentaCredito(20000);
        Usuario u = new Usuario(c,cc);

        System.out.println("\nESTADIO INICIAL DE LAS CUENTAS ANTES DE REALIZAR ALGUNA OPERACION");
        u.mostrarEstado();
        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("HAGO UN GASTO SIN GIRO POR $9350");
        u.realizarGasto(9350);
        u.mostrarEstado();
        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("HAGO UN GASTO SIN GIRO POR $2500");
        u.realizarGasto(2500);
        u.mostrarEstado();
        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("VUELVO A INTENTAR EL GASTO PERO AHORA CON GIRO POR $2500");
        u.realizarGastoYGirar(2500);
        u.mostrarEstado();
        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");


        System.out.println("HAGO UNA INVERSION POR $1000");
        u.realizarInversion(1000);
        u.mostrarEstado();
        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("NO PUDE HACER INVERSION (NO TENGO SALDO)");
        System.out.println("HAGO UN DEPOSITO POR $10000");
        u.depositar(10000);
        u.mostrarEstado();
        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("HAGO UNA INVERSION POR $5000");
        u.realizarInversion(5000);
        u.mostrarEstado();
        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("INTENTO RECUPERAR LA INVERSION INMEDIATAMENTE");
        u.recuperarInversion();
        u.mostrarEstado();
        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("RECUPERE LA INVERSION PERO SIN INTERES GANADOS YA QUE NO PASARON POR LO MENOS 30 DIAS");
        System.out.println("HAGO UNA INVERSION POR $5000");
        u.realizarInversion(5000);
        u.mostrarEstado();
        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("INTENTO COMPRAR POR $10000");
        u.realizarGastoYGirar(10000);
        u.mostrarEstado();
        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("COMO NO TENGO PRECANCELACION AUTOMATICA NO PUEDO SACAR DE MIS INVERSIONES EL DINERO QUE ME FALTA PARA COMPLETAR LOS $10000");
        System.out.println("ACTIVAMOS EL PRECANCELAR AUTOMATICO Y PROBAMOS DE NUEVO");
        System.out.println("INTENTO COMPRAR POR $10000");
        u.activarPrecanceladoAutomatico();
        u.realizarGastoYGirar(10000);
        u.mostrarEstado();
        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("VEMOS QUE AHORA SI ME DEJO");
    }
}
