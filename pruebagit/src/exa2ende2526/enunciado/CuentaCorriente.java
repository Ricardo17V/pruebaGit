package exa2ende2526.enunciado;

public class CuentaCorriente extends CuentaBancaria{
	
	private double comision;
	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public CuentaCorriente(String titular, double saldoInicial, double comision) {
		super(titular, saldoInicial);
		this.comision = comision;
	}

	@Override
	public double calcularInteres() {
		double interes;
		interes = comision;
		return interes;
	}

}
