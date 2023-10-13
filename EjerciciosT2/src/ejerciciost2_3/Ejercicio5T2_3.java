package ejerciciost2_3;

import java.util.Scanner;

public class Ejercicio5T2_3 {

	public static void main(String[] args) {

		// Variable donde guardaremos los números del usuario
		int num;

		// Variable donde guardaremos la cantidad de números que puede escribir el usuario
		int contador = 1;

		// Variable donde guardaremos la operación para sumar los positivos
		int operacionPositivos = 0;

		// Variable donde guardaremos el contador de ceros introducidos
		int contadorCeros = 0;

		// Variable donde guardaremos el contador de negativos introducidos
		double contadorNegativos = 0;

		// Variable donde guardaremos la operación para sumar los negativos
		int operacionNegativos = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Mientras que haya insertado menos de 10 números seguimos
		while (contador <= 10) {

			// Le pedimos al usuario números
			System.out.println("Introduzca un número");

			// Leemos los números
			num = sc.nextInt();

			// Comprobamos si el número introducido es positivo
			if (num > 0) {

				// Operación para ir sumando los positivos
				operacionPositivos += num;

				// Comprobamos si el número introducido es negativo
			} else if (num < 0) {

				// Operación para ir sumando los negativos
				operacionNegativos += num;

				// Vamos sumando 1 cuando vaya añadiendo números negativos
				contadorNegativos++;

				// Comprobamos si el número no es ni positivo ni negativo
			} else {

				// Vamos sumadno 1 cuando vaya añadiendo ceros
				contadorCeros++;

			}

			// Vamos sumando 1 cuando vaya añadiendo números
			contador++;
		}
		// Comprobamos si podemos realizar la media
		if (contadorNegativos != 0) {

			// Operación para calcular la media
			operacionNegativos /= contadorNegativos;

		}

		// Le decimos al usuario cual es la suma de sus números positivos
		System.out.println("Sus números positivos sumados son = " + operacionPositivos);

		// Le decimos al usuario cual es la media de sus números negativos
		System.out.println("La media de sus números negativos es = " + operacionNegativos);

		// Le decimos al usuario la cantidad de ceros que ha añadido
		System.out.println("Ha insertado una cantidad de " + contadorCeros + " ceros");

		// Cerramos el Scanner
		sc.close();

	}// Cierre del main

}// Cierre de la clase
