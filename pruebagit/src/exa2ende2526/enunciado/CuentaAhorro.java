package exa2ende2526.enunciado;

public class CuentaAhorro extends CuentaBancaria{
	
	private double tasaInteres;
	
	public double getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	public CuentaAhorro(String titular, double saldoInicial, double tasaInteres) {
		super(titular, saldoInicial);
		this.tasaInteres = tasaInteres;
	}

	@Override
	public double calcularInteres() {
		double interes;
		interes = saldo * tasaInteres;
		return interes;
	}

}
