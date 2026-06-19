package exa2ende2526.enunciado;

public abstract class CuentaBancaria {
	/**
	 * Atributo que indica el nombre del titular de la cuenta bancaria
	 */
    protected String titular;
    /**
     * Atributo que indica el saldo inicial que tiene el usuario de la cuenta bancaria
     */
    protected double saldo;
    /**
     * Constructor de la clase con los atributos titular y saldoInicial
     * @param titular, es el nombre de la persona titular de la cuenta bancaria
     * @param saldoInicial, es el saldo inicial que tiene el usuario de la cuenta bancaria
     */
    public CuentaBancaria(String titular, double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    /**
     * Método abstracto que heredarán y será desarrollado por sus clases hijas que permite calcular el interes de dicha cuenta bancaria
     * @return, devuelve dicho interes calculado
     */
    public abstract double calcularInteres();
    
    /**
     * Método que nos permite obtener el titular
     * @return, devuelve el titular de la cuenta bancaria
     */
    public String getTitular() {
        return titular;
    }
    /**
     * Método que nos permite obtener el saldo 
     * @return, devuelve el saldo inicial de la cuenta bancaria
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Método que nos permite ingresar cantidades positivas a la cuenta de banco
     * @param cantidad es la cantidad a ingresar en la cuenta bancaria
     */
    public void ingresar(double cantidad) {
    	if(cantidad<0) {
    		throw new IllegalArgumentException("No se pueden ingresar cantidades negativas");
    	}
        saldo += cantidad;
    }
    /**
     * Método que nos permite retirar cierta cantidad de la cuenta de banco, siempre y cuando la cantidad no sea superior a su saldo o  negativa
     * @param cantidad es la cantidad a retirar de la cuenta bancaria
     */
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
