package exa2ende2526.enunciado;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;
import java.util.*;

public class CuentaCorrienteTest {
	private static List<CuentaBancaria> listaCuentas; 

	private double saldoInicial;
	private double comision;
	private double interesEsperado;
	private CuentaCorriente cuenta;

	public CuentaCorrienteTest(double saldoInicial, double tasaInteres, double interesEsperado, CuentaCorriente cuenta) {
		this.saldoInicial = saldoInicial;
		this.comision = tasaInteres;
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
		CuentaCorriente cuenta = new CuentaCorriente("Test", saldoInicial, comision);
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
		assertEquals(interesEsperado, cuenta.calcularInteres(), 0.01);
	}

	@Ignore("Test ignorado")
	public void testFiscal() {

	}
}
