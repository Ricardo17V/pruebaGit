package exa2ende2526.enunciado;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;
import java.util.*;

public class CuentaAhorroTest {
	private static List<CuentaBancaria> listaCuentas; // lista compartida entre tests

	private double saldoInicial;
	private double tasaInteres;
	private double interesEsperado;
	private CuentaAhorro cuenta;

	public CuentaAhorroTest(double saldoInicial, double tasaInteres, double interesEsperado, CuentaAhorro cuenta) {
		this.saldoInicial = saldoInicial;
		this.tasaInteres = tasaInteres;
		this.interesEsperado = interesEsperado;
		this.cuenta = cuenta;
	}

	@Parameters
	public static Collection<Object[]> datos() {
		return Arrays.asList(new Object[][] { { 1000, 10, -10 }, { 500, 5, -5 }, { 2000, 20, -20 }, { 1500, 0, 0 },
				{ 0, 15, -15 } });
	}

	@BeforeClass
	public static void iniciarlistaCuentas() {
		listaCuentas = new ArrayList<CuentaBancaria>();
		System.out.println("=== Creando lista de cuentas para todos los tests ===");
	}

	@Before
	public void crearTipoCuenta() {
		CuentaAhorro cuenta = new CuentaAhorro("Test", saldoInicial, tasaInteres);
	}

	@AfterClass
	public void limpiarLista() {
		listaCuentas = null;
		System.out.println("=== Lista de cuentas liberada despu�s de todos los tests ===");
	}

	@After
	public void limpiarTipoCuenta() {
		cuenta = null;
	}

	@Test
	public void testCalcularInteres() {
		//test para testear los errores que se producen en el método ingresar y en el método reintegrar
		assertEquals(interesEsperado, cuenta.calcularInteres(), 0.01);
	}

	@Ignore("Test ignorado")
	public void testFiscal() {

	}
}
