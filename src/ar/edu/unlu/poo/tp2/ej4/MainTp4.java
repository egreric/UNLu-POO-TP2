package ar.edu.unlu.poo.tp2.ej4;


import ar.edu.unlu.poo.tp2.ej4.billeteraVirtual.Usuario;
import ar.edu.unlu.poo.tp2.ej4.cuentas.Cuenta;
import ar.edu.unlu.poo.tp2.ej4.cuentas.CuentaCredito;

public class MainTp4 {
    public static void main(String[] args){
        System.out.println("asd");
        Cuenta c = new Cuenta(10000,5000);
        CuentaCredito cc = new CuentaCredito(20000);
        Usuario u = new Usuario(c,cc);

        System.out.println(u.toString());
    }
}
