package clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Se define la clase ValidacionCuenta
 */
public class ValidacionCuenta {

	Scanner sc = new Scanner(System.in);
	int i = 0;

	/**
	 * Metodo 'validarCuenta' para validar existencia de la cuenta con el numero
	 * ingresado por el usuario. Este metodo devuelve el saldo actual de la cuenta
	 * encontrada o cero.
	 * 
	 * @param listaCuentas
	 * @return
	 */
	public double validarCuenta(ArrayList<Cuenta> listaCuentas) {

		System.out.println("Ingrese el numero de la cuenta: ");
		Cuenta numeroCuenta = new Cuenta();
		numeroCuenta.setNumeroCuenta(sc.nextInt());
		double saldo = 0;
		sc.nextLine();
		// Validar si el numero de la cuenta ingresado existe
		for (Cuenta cuenta : listaCuentas) {
			if (numeroCuenta.getNumeroCuenta() == cuenta.getNumeroCuenta()) {
				System.out.println(cuenta);
				i = 1;
				saldo = cuenta.getSaldoCuenta(); // asignar el saldo actual de la cuenta encontrada a la variable 'saldo'
			}
		}
		// Mostrar aviso cuando no existe la cuenta con el numero ingresado por el
		// usuario
		if (i != 1) {
			System.out.println("Cuenta con este numero no existe");
		}

		return saldo;
	}

}
