package clases;

import java.util.ArrayList;

/**
 * La clase Dolar para convertir saldo de una cuenta a dolares
 * Esta clase implements de interface Moneda
 */
public class Dolar implements Moneda{
		
	//metodo para obtener simbolo de dolar USD
	@Override
	public String getSimbolo() {		
		return "$";
	}

	//metodo para devolver el indice de conversion a dolares
	@Override
	public double getFactorConversion() {		
		return 0.001;
	}

	//metodo para convertir
	@Override
	public void convertir(ArrayList<Cuenta> listaCuentas) {		
		//Crear nuevo objeto de la clase ValidacionCuenta
		ValidacionCuenta validacion = new ValidacionCuenta();		
		// Recibir el saldo de la cuenta (para convertir) desde el objeto creado
		// 'validacion'
		System.out.println("Saldo en dolares: " + getSimbolo()
		+ validacion.validarCuenta(listaCuentas) * getFactorConversion());		
	}
}
