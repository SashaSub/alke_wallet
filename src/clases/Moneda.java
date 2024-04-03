package clases;

import java.util.ArrayList;

public interface Moneda {

	/**
	 * Interfaz que devuelve el simbolo de la conversion
	 * @retun el simbolo
	 */
	
	public String getSimbolo();
	
	/**
	 * Interfaz para obtener el factor de conversion
	 * @return el factor en float
	 */
	
	public double getFactorConversion();
	
	/**
	 * Para convertir 
	 */
	public void convertir(ArrayList<Cuenta> listaCuentas);
}
