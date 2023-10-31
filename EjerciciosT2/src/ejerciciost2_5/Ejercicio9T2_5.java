package ejerciciost2_5;

import java.util.Scanner;

public class Ejercicio9T2_5 {

	public static void main(String[] args) {

		int numero;

		boolean esPrimo = true;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número entero positivo");
		
		numero = sc.nextInt();
		
		if (numero > 0) {
			if (numero == 1) {
				esPrimo = false;
			}
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					esPrimo = false;
					break;

				}

			}
			System.out.println(esPrimo ? "El número es primo" : "El número no es primo");
		} else {
			System.out.println("El valor introducido no es correcto");

		}
		sc.close();
	}
}
