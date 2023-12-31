package ar.edu.unlu.poo.tp2.ej4;


import ar.edu.unlu.poo.tp2.ej4.billeteraVirtual.Usuario;
import ar.edu.unlu.poo.tp2.ej4.cuentas.Cuenta;
import ar.edu.unlu.poo.tp2.ej4.cuentas.CuentaCredito;

public class MainTp4 {

    /*
    Podemos observar que las clases planteadas como solucion cumple con los 3 conceptos dados.
    COHESION: Vemos que tanto la clase Usuario como la clase Cuenta y CuentaCredito tienen las responsabilidades logicas esperadas para objetos de ese tipo,
    por lo que se mantiene una alta cohesion de las mismas.

    ENCAPSULAMIENTO/CONTRATO: Tenemos acceso publico a toda aquella informacion necesaria producto de la abstraccion realizada

    OCULTAMIENTO DE LA INFORMACION: Ademas del acceso publico a la informacion, esta se accede y manipula de manera que se esconde como es la implementacion dentro de
    nuestras clases y muestra al usuario solo lo necesario para que este pueda operar (esto se logra seteando los valores de los atributos en cada clase como private y
    accediendo y manipulando las clases mediante los metodos, apartir del envio de mensajes hacia y entre instancias de clases)

    OBSERVACIONES: En la clase CuentaCredito agregamos como atributo el valor que representa el porcentaje de recargo por cada compra (Y la dejamos como atributo estatico y final, ademas
     de publico para consultarlo, ya que su valor no puede ser modificado por el usuario)
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

        System.out.println("NO SE PUEDE RECUPERAR LA INVERSION (NO PASARON LOS DIAS SUFICIENTES)");
        System.out.println("REALIZO UNA COMPRA CON CREDITO POR $10000");
        u.comprarConCredito(10000);
        u.mostrarEstado();
        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("REALIZO UNA COMPRA CON CREDITO POR $15000");
        u.comprarConCredito(15000);
        u.mostrarEstado();
        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("NO PUEDO HACER LA COMPRA (NO TENIA CREDITO DISPONIBLE)");
        System.out.println("REALIZO UNA COMPRA CON CREDITO POR $3000");
        u.comprarConCredito(3000);
        u.mostrarEstado();
        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("REALIZO PAGO DE MI SEGUNDA COMPRA ($2000)");
        u.pagarDeudaCredito(2000,2);
        u.mostrarEstado();
        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("REALIZO PAGO DE MI SEGUNDA COMPRA (LO QUE RESTA, $1150)");
        u.pagarDeudaCredito(1150,2);
        u.mostrarEstado();
        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("REALIZO PAGO DE MI PRIMERA COMPRA SIN LOS INTERESES ($10000)");
        u.pagarDeudaCredito(10000,1);
        u.mostrarEstado();
        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        System.out.println("REALIZO PAGO DE INTERESES DE MI PRIMERA COMPRA ($500)");
        u.pagarDeudaCredito(500,1);
        u.mostrarEstado();
        System.out.println("\n--------------------------------");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

    }
}
