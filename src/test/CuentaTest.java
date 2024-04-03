package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import clases.Cuenta;

class CuentaTest {

	@Test
	void testToString() {
		Cuenta cuenta = new Cuenta(123456, "Alex", 1000.0);
		String expectedString = "Cuenta {numero =123456, titular =Alex, saldo actual =1000.0}";
		assertEquals(expectedString, cuenta.toString());
	}

	@Test
	void testCrearCuenta() {
	}

	@Test
	public void testMostrarCuentas() {
		ArrayList<Cuenta> listaCuentas = new ArrayList<>();
		listaCuentas.add(new Cuenta(111, "Titular1", 100.0));
		listaCuentas.add(new Cuenta(222, "Titular2", 200.0));

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		// Llamar al metodo para imprimir cuentas
		for (Cuenta cuenta : listaCuentas) {
			System.out.println(cuenta);
		}

		// Validar resultado
		String expectedOutput = "Cuenta {numero =111, titular =Titular1, saldo actual =100.0}\r\n"
				+ "Cuenta {numero =222, titular =Titular2, saldo actual =200.0}\r\n";
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testIngresarDinero() {

		Cuenta cuenta = new Cuenta(123456, "Alex", 1000.0);
		cuenta.getListaCuentas().add(cuenta);
		cuenta.ingresarDinero(50.0);
		assertEquals(1050.0, cuenta.getSaldoCuenta());
	}

	@Test
	void testRetirarDinero() {
		Cuenta cuenta = new Cuenta(123456, "Alex", 1000.0);
		cuenta.getListaCuentas().add(cuenta);
		cuenta.retirarDinero(50.0);
		assertEquals(950.0, cuenta.getSaldoCuenta());
	}

	@Test
	public void testSetListaCuentas() {
		Cuenta cuenta = new Cuenta();
		// Crear una lista de cuentas
		ArrayList<Cuenta> listaCuentas = new ArrayList<>();
		Cuenta cuenta1 = new Cuenta();
		Cuenta cuenta2 = new Cuenta();
		listaCuentas.add(cuenta1);
		listaCuentas.add(cuenta2);

		// Setear 'listaCuentas'
		cuenta.setListaCuentas(listaCuentas);

		assertEquals(listaCuentas, cuenta.getListaCuentas());
	}

	@Test
	public void testGetTitular() {
		// Instancear Cuenta
		Cuenta cuenta = new Cuenta();

		// Setear 'titular'
		String titular = "Alex";
		cuenta.setTitular(titular);

		// Verificar que el metodo getTitular() devuelve el valor correcto
		assertEquals(titular, cuenta.getTitular());
	}

	@Test
	public void testSetTitular() {

		Cuenta cuenta = new Cuenta();
		String titular = "Alex";
		cuenta.setTitular(titular);
		assertEquals(titular, cuenta.getTitular());
	}
	
	@Test
	public void testSetSaldoCuenta() {		
        Cuenta cuenta = new Cuenta();
        double saldo = 1000.0;
        cuenta.setSaldoCuenta(saldo);
        assertEquals(saldo, cuenta.getSaldoCuenta(), 0.001); // Ajustar el delta según los requisitos de precisión
    }
}
