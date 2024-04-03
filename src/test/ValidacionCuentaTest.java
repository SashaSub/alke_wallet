package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import clases.Cuenta;

class ValidacionCuentaTest {	
	
	@Test
	void testValidarCuenta() {
		
		Cuenta cuenta = new Cuenta(11, "Adrian", 150.000);
		cuenta.getListaCuentas().add(cuenta);		
	//	double expected = 150000;
	//	double actual = this.ValidacionCuenta.validarCuenta();
		
		assertEquals(11, cuenta.getNumeroCuenta());
	}

}
