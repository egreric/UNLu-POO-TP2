package ar.edu.unlu.poo.tp2.ej4.cuentas;

import java.util.ArrayList;
import java.util.List;

public class CuentaCredito {
	private double limite;
	private List<Double> compras;
	private List<Double> pagado;
	
	
	public CuentaCredito(double limite) {
		this.limite = limite;
		this.compras = new ArrayList<Double>();
		this.pagado = new ArrayList<Double>();
	}
	
	/**
	 * Registra una nueva compra en caso que todavía quede saldo disponible para compras. 
	 * 
	 * @param monto
	 * @return boolean: true si la compra fue existosa, false en caso contrario.
	 */
	public boolean comprar(double monto) {
		// TODO Implementar ..
		return true;
	}
	
	/**
	 * Realiza un pago sobre una compra. Si el monto es menor o igual al saldo que queda por pagar de la compra, el pago se registra 
	 * y la operacion es exitosa devolviendo true. 
	 * Si el monto es mayor al saldo, entonces la operación no se realiza devolviendo false.
	 * 
	 * @param monto: cantidad a pagar.
	 * @param indiceCompra: el numero de indice de la compra sobre la cual se requiere realizar un pago.
	 * @return
	 */
	public boolean pagar(double monto, int indiceCompra) {
		// TODO implementar ...
		return true;
	}
	
	/**
	 * Retorna el saldo que queda por pagar de una compra, incluyendo el interes.
	 * 
	 * @param indiceCompra
	 * @return
	 */
	public double getSaldoDeudorCompra(int indiceCompra) {
		// TODO falta implementar ..
		return 0.0d;
	}
	
	/**
	 * Devuelve el saldo deudor total teniendo en cuenta todas las compras impagas.
	 * @return double
	 */
	public double getSaldoDeudor() {
		// TODO falta implementar...
		return 0.0d;
	}
	
	/**
	 * Devuelve el monto disponible para compras de la cuenta teniendo en cuenta todas las compras
	 * realizadas que quedan por pagar, sin tener en cuenta las que deben solo el interes.
	 * @return double: el saldo disponible para realizar compras.
	 */
	public double getMontoDisponibleParaCompras() {
		// TODO falta implementar ...
		return 0.0d;
	}
	
}
