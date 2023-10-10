package ejerciciost2_2;

import java.util.Scanner;

public class Ejercicio4T2_2 {

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
		
		// Le preguntamos por la primera tirada al usuario (Con letras)
		System.out.println("¿Cuánto ha sacado en la primera tirada?");
		
		// Leemos la línea
		tirada1 = sc.nextLine();
		
		// Le preguntamos por la segunda tirada al usuario (Con letras)
		System.out.println("¿Cuánto ha sacado en la seguunda tirada?");
		
		// Leemos la línea
		tirada2 = sc.nextLine();
		
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
		case "UNO" ->valorTirada2 = 1;
		case "DOS" -> valorTirada2 = 2;
		case "TRES" -> valorTirada2 = 3;
		case "CUATRO" -> valorTirada2 = 4;
		case "CINCO" -> valorTirada2 = 5;
		case "SEIS" -> valorTirada2 = 6;
		}
		
		// Operación para calcular el total de las tiradas
		valorTotal = valorTirada1 + valorTirada2;

		// Comprobamos si están bien elegidos los números
		if (valorTirada2 == 0 || valorTirada1 == 0) {
			System.out.println("TIRADA NO VÁLIDA");
		} else
			System.out.println("Su tirada final es: " + valorTotal);

		// Cerramos el Scanner
		sc.close();
		
	}// Cierre main

}// Cierre clase
