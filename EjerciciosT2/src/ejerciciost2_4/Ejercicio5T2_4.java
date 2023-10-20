package ejerciciost2_4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5T2_4 {

	public static void main(String[] args) {
		
		// Variable donde guardaremos el número mínimo del número random
		int min = 1;

		// Variable donde guardaremos el número máximo del número random
		int max = 101;

		// Variable donde guardaremos la respuesta del usuario
		String eleccion = "";

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Generamos un número random entre el número min y el max
		Random r = new Random();

		// Le explicamos al usuario el ejercicio
		System.out.println("Piense en un número y yo lo intentare adivinar");

		// Generamos un número random hasta que sea el número que piensa el usuario
		do {
			int numr = r.nextInt(min, max);
			System.out.println(numr);

			// Seguimos pidiendole números al usuario hasta que escriba bien las palabras
			do {
				eleccion = sc.nextLine();

			} while (!eleccion.equalsIgnoreCase("MENOR") && !eleccion.equalsIgnoreCase("MAYOR")
					&& !eleccion.equalsIgnoreCase("ADIVINASTE"));

			// Hacemos que el ordenador escoja un número menor si decimos que nuestro número
			// es menor
			if (eleccion.equalsIgnoreCase("MENOR")) {
				max = numr;

			// Hacemos que el ordenador escoja un número mayor si decimos que nuestro número
			// es mayor
			} else if (eleccion.equalsIgnoreCase("MAYOR")) {
				min = numr;

			}

		} while (!eleccion.equalsIgnoreCase("ADIVINASTE"));

		// La máquina esta alegre por adivinar nuestro número
		System.out.println("He adivinado tu número");

		// Cerramos el Scanner
		sc.close();

	} // Cierre de main

}// Cierre de clase
