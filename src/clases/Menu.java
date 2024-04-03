package clases;

import java.util.Scanner;

public class Menu {

	public void mostrarMenu() {
		
		//Metodo para mostrar menu

		/**
		 *  Instanciar un objeto de clase Cuenta - cuenta
		 *  Iniciar Scanner
		 */
		
		Cuenta cuenta = new Cuenta();
		Scanner sc = new Scanner(System.in);
		int opcion;

		do {
			// Mostrar menu
			System.out.println("1 - para crear cuenta");
			System.out.println("2 - para ingresar dinero");
			System.out.println("3 - para retirar dinero");
			System.out.println("4 - para mostrar saldo en dolares");
			System.out.println("5 - para mostrar saldo en euros");
			System.out.println("6 - para salir");
			System.out.println("\nElija la opción:\n ");

			opcion = sc.nextInt();
			// Procesar la entrada del usuario usando Switch
			switch (opcion) {
			case 1:
				cuenta.crearCuenta();
				System.out.println();
				break;
			case 2:				
				System.out.println("Ingresa el monto para depositar: ");
				cuenta.ingresarDinero(sc.nextDouble());	
				System.out.println();
				break;
			case 3:
				System.out.println("Ingresa el monto para retirar: ");
				cuenta.retirarDinero(sc.nextDouble());	
				System.out.println();
				break;
			case 4:
				Dolar saldoDolar = new Dolar();
				saldoDolar.convertir(cuenta.listaCuentas);
				System.out.println();
				break;
			case 5:
				Euro saldoEuro = new Euro();
				saldoEuro.convertir(cuenta.listaCuentas);
				System.out.println();
				break;			
			default:
				if (opcion != 6) {
					System.out.println("Opción no valida \n");
				}
			}

		} while (opcion != 6);
		
		System.out.println("Gracias y Chao!");
		
		// Close the scanner
		sc.close();
	}
}
