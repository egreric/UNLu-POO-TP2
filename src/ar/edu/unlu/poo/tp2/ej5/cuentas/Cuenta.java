package ar.edu.unlu.poo.tp2.ej5.cuentas;

import ar.edu.unlu.poo.tp2.ej4.dateUtils.DateUtils;

import java.time.LocalDate;

public class Cuenta {
	private double saldo;
	private double limiteGiroDescubierto;
	private double giroDescubierto;
	private double saldoInvertido;
	public static final double INTERES_POR_INVERSION_MINIMA = 0.05;
	public static final double INTERES_POR_INVERSION_MAXIMA = 0.4;
	public static final double PLAZO_DIAS_INVERSION_MINIMA = 30;
	public static final double PLAZO_DIAS_INVERSION_MAXIMA = 120;
	private boolean precancelarAutomatico;
	private LocalDate fechaInversion;

	public Cuenta(double saldo, double limiteGiroDescubierto) {
		this.saldo = saldo;
		this.limiteGiroDescubierto = limiteGiroDescubierto;
		this.giroDescubierto = 0;
		this.saldoInvertido = 0;
		this.fechaInversion = null;
		this.precancelarAutomatico = false;
	}
	
	/**
	 * Dado un monto genera un gasto en la cuenta: quita del saldo el monto a gastar, si el monto es mayor
	 * al saldo entonces gira en descubierto (siempre y cuando todavía quede límite). 
	 * Si (saldo + limite descubierto disponible) < monto, entonces la operacion no se realiza y devuelve false.
	 * @param monto: el monto a gastar
	 * @return boolean: indica si la operación fué exitosa.
	 */
	
	public boolean gastar(double monto) {
		boolean res = false;
		if (precancelarAutomatico){
			if (this.saldo + this.saldoInvertido + getInteresGanadoAlMomento() + (this.limiteGiroDescubierto - this.giroDescubierto) >= monto ){
				// Operaciones con precancelar automatico activado
				if (this.saldo + this.saldoInvertido + getInteresGanadoAlMomento() < monto){
					this.recuperarInversion();
					this.giroDescubierto += monto - this.saldo;
					this.saldo = 0;
				} else {
					if (this.saldo < monto){
						this.recuperarInversion();
					}
					this.saldo -= monto;
				}
				res = true;
			}
		} else {
			// Operaciones con precancelar automatico desactivado
			if (this.saldo + (this.limiteGiroDescubierto - this.giroDescubierto) >= monto ){
				if (this.saldo < monto) {
					// Giro en descubierto
					this.giroDescubierto += monto - this.saldo;
					this.saldo = 0;
				}else {
					// El saldo me alcanza para el gasto
					this.saldo -= monto;
				}
				res = true;
			}
		}
		return res;
	}
	
	/**
	 * Deposita el monto en la cuenta. Si existe giro en descubierto, primero intenta cubrirlo y si queda 
	 * dinero disponible aumenta el saldo.
	 * @param monto
	 */
	public void depositar(double monto) {
		// Si hay giro descubierto a cubrir
		if (this.giroDescubierto > 0){
			if (monto > this.giroDescubierto){
				monto -= this.giroDescubierto;
				this.giroDescubierto = 0;
			} else {
				this.giroDescubierto -= monto;
				monto = 0;
			}
		}
		// Deposito dinero en cuenta (si es que me quedo monto disponible despues de cubrir el giro descubierto)
		if (monto > 0){
			this.saldo += monto;
		}
	}
	
	/**
	 * Realiza la inversion del monto indicado. Condiciones para que la operación sea exitosa:
	 * 	a. Que el saldo sea >= monto
	 *  b. Que no exista una inversión activa.
	 *  
	 * Tambien establece la fecha de inversión.
	 * 
	 * @param monto
	 * @return
	 */
	public boolean invertir(double monto) {
		boolean res = false;
		if ((this.saldo >= monto) && (this.saldoInvertido == 0)){
			this.saldoInvertido = monto;
			this.fechaInversion = LocalDate.now();
			this.saldo -= monto;
			res = true;
		}
		return res;
	}
	
	/**
	 * Devuelve el monto invertido al saldo con el interes establecido. Se puede realizar siempre y cuando 
	 * hayan pasado los N días que dura la inversión.
	 * @return
	 */
	public boolean recuperarInversion() {
		boolean res = false;
		if (saldoInvertido > 0) {
			if (DateUtils.esMayorIgual(LocalDate.now().minusDays((int) PLAZO_DIAS_INVERSION_MAXIMA), fechaInversion)) {
				this.saldo += saldoInvertido * (1 + INTERES_POR_INVERSION_MAXIMA);
			} else {
				if (DateUtils.esMayorIgual(LocalDate.now().minusDays((int) PLAZO_DIAS_INVERSION_MINIMA), fechaInversion)) {
					this.saldo += saldoInvertido * (1 + INTERES_POR_INVERSION_MINIMA);
				} else {
					this.saldo += saldoInvertido;
				}
			}
			this.saldoInvertido = 0;
			this.fechaInversion = null;
			res = true;
		}
		return res;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public double getGiroDescubierto() {
		return this.giroDescubierto;
	}
	
	public double getLimiteGiroDescubierto() {
		return this.limiteGiroDescubierto;
	}
	
	public double getMontoInvertido() {
		return this.saldoInvertido;
	}
	
	public double getInteresGanadoAlMomento() {
		if (this.fechaInversion != null){
			if (DateUtils.esMayorIgual(LocalDate.now().minusDays((int) PLAZO_DIAS_INVERSION_MAXIMA), fechaInversion)) {
				return saldoInvertido * INTERES_POR_INVERSION_MAXIMA;
			} else {
				if (DateUtils.esMayorIgual(LocalDate.now().minusDays((int) PLAZO_DIAS_INVERSION_MINIMA), fechaInversion)) {
					return saldoInvertido * INTERES_POR_INVERSION_MINIMA;
				}
			}
		}
		return 0.0d;
	}

	public double getInteresAGanar() {
		if (this.fechaInversion != null)
			return this.saldoInvertido * INTERES_POR_INVERSION_MAXIMA;
		return 0.0d;
	}

	public void setPrecancelarAutomatico(boolean opcion){
		this.precancelarAutomatico = opcion;
	}

}
