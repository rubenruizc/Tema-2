package ejerciciost2_4;

import java.util.Scanner;

public class Ejercicio8T2_4 {

	public static void main(String[] args) {
		// Variable donde guardaremos la primera tirada del usuario
		String tirada1;

		// Variable donde guardaremos la segunda tirada del usuario
		String tirada2;

		// Variable donde guardaremos el valor de la 1º tirada en números
		int valorTirada1 = 0;

		// Variable donde guardaremos el valor de la 2º tirada en números
		int valorTirada2 = 0;

		// Variable donde guardaremos el valor total de las dos tiradas
		int valorTotal;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Pedimos la primera tirada y comprobamos que sea correcta
		do {
			System.out.println("¿Cuánto ha sacado en la PRIMERA tirada?");
			tirada1 = sc.nextLine();
		} while (!tirada1.equals("UNO") && !tirada1.equals("DOS")
				&& !tirada1.equals("TRES") && !tirada1.equals("CUATRO")
				&& !tirada1.equals("CINCO") && !tirada1.equals("SEIS"));

		// Pedimos la segunda tirada y comprobamos que sea correcta
		do {
			System.out.println("¿Cuánto ha sacado en la SEGUNDA tirada?");
			tirada2 = sc.nextLine();
		} while (!tirada2.equals("UNO") && !tirada2.equals("DOS")
				&& !tirada2.equals("TRES") && !tirada2.equals("CUATRO")
				&& !tirada2.equals("CINCO") && !tirada2.equals("SEIS"));

		// Le damos valores a los números introducidos con letras (1ºtirada)
		switch (tirada1) {
		case "UNO" -> valorTirada1 = 1;
		case "DOS" -> valorTirada1 = 2;
		case "TRES" -> valorTirada1 = 3;
		case "CUATRO" -> valorTirada1 = 4;
		case "CINCO" -> valorTirada1 = 5;
		case "SEIS" -> valorTirada1 = 6;
		}

		// Le damos valores a los números introducidos con letras (2ºtirada)
		switch (tirada2) {
		case "UNO" -> valorTirada2 = 1;
		case "DOS" -> valorTirada2 = 2;
		case "TRES" -> valorTirada2 = 3;
		case "CUATRO" -> valorTirada2 = 4;
		case "CINCO" -> valorTirada2 = 5;
		case "SEIS" -> valorTirada2 = 6;
		}

		// Operación para calcular el total de las tiradas
		valorTotal = valorTirada1 + valorTirada2;

		// Comprobamos si están bien elegidos los números
		System.out.println("Su tirada final es: " + valorTotal);

		// Cerramos el Scanner
		sc.close();
	}

}
