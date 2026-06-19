package exa2ende2526.enunciado;

public class CuentaCorriente extends CuentaBancaria{
	/**
	 * Atributo que indica la comisión de la cuenta
	 */
	private double comision;
	/**
	 * Método que obtiene la comisión
	 * @return, devuelve la comisión de dicha cuenta
	 */
	public double getComision() {
		return comision;
	}
	/**
	 * método que nos permite cambiar la comisión
	 * @param comision, es la comisión de la cuenta
	 */
	public void setComision(double comision) {
		this.comision = comision;
	}
	/**
	 * Constructor de la clase con los atributos de la clase padre: titular y saldoInicial, y los atributos propios de la clase: comision
	 * @param titular, es el titular de la cuenta bancaria
	 * @param saldoInicial, saldo inicial a disposicion del usuario de dicha cuenta bancaria
	 * @param comision, es la comision de la cuenta bancaria
	 */
	public CuentaCorriente(String titular, double saldoInicial, double comision) {
		super(titular, saldoInicial);
		this.comision = comision;
	}
	
	@Override
	/**
	 * Método que nos permite calcular los intereses que posee la cuenta corriente
	 * @return, devuelve el interés calculado
	 */
	public double calcularInteres() {
		double interes;
		interes = comision;
		return interes;
	}

}
