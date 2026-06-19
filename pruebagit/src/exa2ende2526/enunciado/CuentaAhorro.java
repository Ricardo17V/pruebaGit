package exa2ende2526.enunciado;

public class CuentaAhorro extends CuentaBancaria{
	/**
	 * Atributo que indica el porcentaje de la tasa de interes de la cuenta de ahorro
	 */
	private double tasaInteres;
	/**
	 * Método para obtener la tasa de interés
	 * @return, devuelve la tasa de interés
	 */
	public double getTasaInteres() {
		return tasaInteres;
	}
	/**
	 * método que nos permite cambiar la tasa de interés
	 * @param tasaInteres, es la tasa de interés de la cuenta de ahorro
	 */
	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}
	/**
	 * Constructor con los atributos de la clase padre: titular y saldo inicial, y además los atributos propios de la clase tasa de interes
	 * @param titular, es el nombre del titular de la cuenta bancaria
	 * @param saldoInicial, es el saldo inicial a disposición del usuario de la cuenta bancaria
	 * @param tasaInteres, es el porcentaje de la tasa de interes que tiene la cuenta de ahorro
	 */
	public CuentaAhorro(String titular, double saldoInicial, double tasaInteres) {
		super(titular, saldoInicial);
		this.tasaInteres = tasaInteres;
	}

	@Override
	/**
	 * Método que nos permite calcular el interés para dicha cuenta de ahorro
	 * @return, devuelve dicho interés calculado
	 */
	public double calcularInteres() {
		double interes;
		interes = saldo * tasaInteres;
		return interes;
	}

}
