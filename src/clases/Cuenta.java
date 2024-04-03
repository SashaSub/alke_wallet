package clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Se define la clase Cuenta con sus respectivos paramentros
 */
public class Cuenta implements Operacion {
	private int numeroCuenta;
	private String titular;
	private double saldoCuenta;

	ArrayList<Cuenta> listaCuentas = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public ArrayList<Cuenta> getListaCuentas() {
		return listaCuentas;
	}

	public void setListaCuentas(ArrayList<Cuenta> listaCuentas) {
		this.listaCuentas = listaCuentas;
	}

	// Crear constructor vacio
	public Cuenta() {
	}

	/**
	 * Crear constructor con parametros
	 * 
	 * @param numeroCuenta
	 * @param titular
	 * @param saldoCuenta
	 */
	public Cuenta(int numeroCuenta, String titular, double saldoCuenta) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldoCuenta = saldoCuenta;
	}

	/**
	 * agregar getters y setters
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldoCuenta() {
		return saldoCuenta;
	}

	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}

	// Devolver objeto cuenta como String
	@Override
	public String toString() {
		return "Cuenta {" + "numero =" + numeroCuenta + ", titular =" + titular + ", saldo actual =" + saldoCuenta
				+ '}';
	}

	// Crear metodo para crear cuentas nuevas y guardarlas en un ArrayList
	public void crearCuenta() {

		Cuenta newAccount = new Cuenta();
		System.out.println("Ingresa el numero de la cuenta: ");
		newAccount.setNumeroCuenta(sc.nextInt());
		sc.nextLine();
		System.out.println("Ingresa el nombre del titular: ");
		newAccount.setTitular(sc.next());
		sc.nextLine();
		System.out.println("Ingresa el saldo inicial: ");
		newAccount.setSaldoCuenta(sc.nextDouble());
		sc.nextLine();

		// Agrear nuevo objeto "newAccount" a ArrayList "listaCuentas"
		listaCuentas.add(newAccount);

		// Imprimir ArrayList para mostrar todas las cuentas
		System.out.println("Lista de las cuentas:");
		for (Cuenta cuenta : listaCuentas) {
			System.out.println(cuenta);
		}
	}

	/**
	 * Crear metodo publico 'ingresarDinero' para ingresar saldo a la cuenta
	 * 
	 * @param montoIngresado
	 */

	@Override
	public void ingresarDinero(double montoIngresado) {

		int i = 0;
		System.out.println("Ingrese el numero de la cuenta:");
		Cuenta numeroParaDepositar = new Cuenta();
		numeroParaDepositar.setNumeroCuenta(sc.nextInt());
		sc.nextLine();
		// Validar si el numero de la cuenta ingresado existe
		for (Cuenta cuenta : listaCuentas) {
			if (numeroParaDepositar.getNumeroCuenta() == cuenta.numeroCuenta) {
				System.out.println(cuenta);
				cuenta.saldoCuenta = cuenta.saldoCuenta + montoIngresado; // Agregar dinero al saldo actual
				System.out.println("Nuevo Saldo: " + cuenta.getSaldoCuenta()); // Mostrar saldo nuevo
				i = 1;
			}
		}
		// Mostrar aviso cuando no existe la cuenta con el numero ingresado por el
		// usuario
		if (i != 1) {
			System.out.println("\n!!! Cuenta con este numero no existe !!!");
		}
	}

	/**
	 * Crear metodo publico 'retirarDinero' para retirar dinero de la cuenta
	 * 
	 * @param montoRetirado
	 */
	@Override
	public void retirarDinero(double montoRetirado) {

		int i = 0;
		System.out.println("Ingrese el numero de la cuenta:");
		Cuenta numeroParaRetirar = new Cuenta();
		numeroParaRetirar.setNumeroCuenta(sc.nextInt());
		sc.nextLine();
		// Validar si el numero de la cuenta ingresado existe
		for (Cuenta cuenta : listaCuentas) {
			if (numeroParaRetirar.getNumeroCuenta() == cuenta.numeroCuenta) {
				System.out.println(cuenta);
				// Validar si saldo de cuenta es igual o mayor al monto para retirar
				if (cuenta.saldoCuenta >= montoRetirado) {
					cuenta.saldoCuenta = cuenta.saldoCuenta - montoRetirado;
					System.out.println("Nuevo Saldo: " + cuenta.getSaldoCuenta());
				} else {
					System.out.println("Saldo insuficiente para retiro, el saldo actual es: " + cuenta.saldoCuenta);
				}
			}
		}
		// Mostrar aviso cuando no existe la cuenta con el numero ingresado por el
		// usuario
		if (i != 1) {
			System.out.println("Cuenta con este numero no existe");
		}
	}

}
