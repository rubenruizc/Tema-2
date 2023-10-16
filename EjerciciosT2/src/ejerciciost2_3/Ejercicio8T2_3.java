package ejerciciost2_3;

import java.util.Scanner;

public class Ejercicio8T2_3 {

	public static void main(String[] args) {

		// Variable donde guardamos la altura del árbol del usuario
		int alturaArbol = 0;

		// Variable donde guardamos la altura más alta
		int alturaMasAlta = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le explicamos al usuario el ejercicio
		System.out.println("Introduce la altura de cada árbol en centímetros.");

		// Comprobamos que el número del usuario es distinto a -1
		while (alturaArbol != -1) {

			// Le pedimos al usuario una altura
			System.out.print("Altura del árbol (-1 para finalizar): ");

			// Leemos el número
			alturaArbol = sc.nextInt();

			// Comprobamos cual es la mayor altura
			if (alturaArbol > alturaMasAlta) {
				alturaMasAlta = alturaArbol;

			}

		}

		// Comprobamos si la altura añadida es igual a -1 y decimos cual ha sido la altura más alta
		if (alturaArbol == -1) {
			System.out.println("La altura del árbol más alto es: " + alturaMasAlta + " centímetros.");

		}

		// Cerramos el Scanner
		sc.close();

	} // Cierre del main

} // Cierre de la clase
