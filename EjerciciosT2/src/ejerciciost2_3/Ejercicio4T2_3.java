package ejerciciost2_3;

import java.util.Scanner;

public class Ejercicio4T2_3 {

	public static void main(String[] args) {

		// Variable para guardar el número del usuario
		int num;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos un número al usuario y le explicamos el ejercicio
		System.out.println("Introduzca un número.Si introduce el 0 se termina. ");

		// Leemos el número
		num = sc.nextInt();

		// Mientras que el número sea distinto de 0 seguimos
		while (num != 0) {

			// Comprobamos si es par
			if (num % 2 == 0) {

				// Le explicamos que el número es par
				System.out.println("Su número es par");

				// Le pedimos un número al usuario y le explicamos el ejercicio
				System.out.println("Introduzca un número.Si introduce el 0 se termina. ");

				// Leemos el número
				num = sc.nextInt();

				// Comprobamos si es impar
			} else {

				// Le explicamos que el número es impar
				System.out.println("Su número es impar");

				// Le pedimos un número al usuario y le explicamos el ejercicio
				System.out.println("Introduzca un número.Si introduce el 0 se termina. ");

				// Leemos el número
				num = sc.nextInt();
			}
		}

		// Le explicamos que hay un error si introduce el 0
		System.out.println("ERROR");

		// Cerramos el Scanner
		sc.close();

	} // Cierre main

} // Cierre clase
