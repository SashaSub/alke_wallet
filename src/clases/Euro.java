package clases;

import java.util.ArrayList;

/**
 * La clase Euro para convertir saldo de una cuenta a euros 
 * Esta clase implements de interface Moneda
 */

public class Euro implements Moneda {

	// metodo para obtener simbolo de euro
	@Override
	public String getSimbolo() {
		// TODO Auto-generated method stub
		return "€";
	}

	// metodo para devolver el indice de conversion a euros
	@Override
	public double getFactorConversion() {
		// TODO Auto-generated method stub
		return 0.00094;
	}

	// metodo para convertir
	@Override
	public void convertir(ArrayList<Cuenta> listaCuentas) {
		// Crear nuevo objeto de la clase ValidacionCuenta
		ValidacionCuenta validacion = new ValidacionCuenta();
		// Recibir el saldo de la cuenta (para convertir) desde el objeto creado
		// 'validacion'
		System.out.println(
				"Saldo en euros: " + getSimbolo() + validacion.validarCuenta(listaCuentas) * getFactorConversion());
	}
}
