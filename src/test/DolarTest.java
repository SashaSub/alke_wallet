package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Cuenta;

class DolarTest {

	@Test
	void testGetSimbolo() {
		String expected = "$";		
		assertEquals("$", expected);
	}

	@Test
	void testGetFactorConversion() {
		double expected = 0.001;		
		assertEquals(0.001, expected);
	}

	@Test
	void testConvertir() {		
		Cuenta cuenta = new Cuenta(123456, "Alex", 1000.0);
		double expected = 1.0;
		assertEquals(expected, cuenta.getSaldoCuenta()*0.001);
	}

}
