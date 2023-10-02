package ar.edu.unlu.poo.tp2.ej5.cuentas;

import java.util.ArrayList;
import java.util.List;

public class CuentaCredito {
	private double limite;
	private List<Double> compras;
	private List<Double> pagado;
	public static final double RECARGO_POR_COMPRA = 0.05;


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
		boolean res = false;
		if (this.getMontoDisponibleParaCompras() >= monto) {
			this.compras.add(monto);
			this.pagado.add(0.0);
			res = true;
		}
		return res;
	}

	/**
	 * Realiza un pago sobre una compra. Si el monto es menor o igual al saldo que queda por pagar de la compra, el pago se registra
	 * y la operacion es exitosa devolviendo true.
	 * Si el monto es mayor al saldo, entonces la operación no se realiza devolviendo false.
	 *
	 * @param monto:        cantidad a pagar.
	 * @param indiceCompra: el numero de indice de la compra sobre la cual se requiere realizar un pago.
	 * @return
	 */
	public boolean pagar(double monto, int indiceCompra) {
		boolean res = false;
		if (monto <= getSaldoDeudorCompra(indiceCompra)) {
			this.pagado.set(indiceCompra - 1, (this.pagado.get(indiceCompra - 1) + monto));
			res = true;
		}
		return res;
	}

	/**
	 * Retorna el saldo que queda por pagar de una compra, incluyendo el interes.
	 *
	 * @param indiceCompra
	 * @return
	 */
	public double getSaldoDeudorCompra(int indiceCompra) {
		return (this.compras.get(indiceCompra - 1) * (1 + RECARGO_POR_COMPRA)) - this.pagado.get(indiceCompra - 1);
	}

	/**
	 * Devuelve el saldo deudor total teniendo en cuenta todas las compras impagas.
	 *
	 * @return double
	 */
	public double getSaldoDeudor() {
		double saldoDeudor = 0;
		for (int i = 0; i < this.compras.size(); i++)
			saldoDeudor += getSaldoDeudorCompra(i + 1);
		return saldoDeudor;
	}

	/**
	 * Devuelve el monto disponible para compras de la cuenta teniendo en cuenta todas las compras
	 * realizadas que quedan por pagar, sin tener en cuenta las que deben solo el interes.
	 *
	 * @return double: el saldo disponible para realizar compras.
	 */
	public double getMontoDisponibleParaCompras() {
		double deudaSinInteres = 0;
		for (int i = 0; i < this.compras.size(); i++) {
			if (this.pagado.get(i) < this.compras.get(i)) {
				deudaSinInteres += (this.compras.get(i) - this.pagado.get(i));
			}

		}
		return (this.limite - deudaSinInteres);
	}

	public int getCantidadCompras(){
		return this.compras.size();
	}
}
