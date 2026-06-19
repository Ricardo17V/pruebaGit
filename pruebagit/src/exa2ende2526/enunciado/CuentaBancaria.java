package exa2ende2526.enunciado;

public abstract class CuentaBancaria {

    protected String titular;
    protected double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    
    public abstract double calcularInteres();
    
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
    	if(cantidad<0) {
    		throw new IllegalArgumentException("No se pueden ingresar cantidades negativas");
    	}
        saldo += cantidad;
    }

    public void reintegrar(double cantidad) {
    	if(cantidad<0) {
    		throw new IllegalArgumentException("No se sacar cantidades negativas");
    	}
    	if(saldo<cantidad) {
    		throw new IllegalArgumentException("No se puede sacar más dinero que tu saldo actual");
    	}
        saldo -= cantidad;
    }

}
