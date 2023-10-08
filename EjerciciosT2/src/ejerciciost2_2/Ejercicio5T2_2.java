package ejerciciost2_2;

import java.util.Scanner;

public class Ejercicio5T2_2 {

	public static void main(String[] args) {

		// Variable donde guardaremos el carnet del usuario
		String carnet;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario su carnet
		System.out.print("Introduzca su carnet de conducir: ");
		
		// Leemos el tipo
		carnet = sc.nextLine();
		
		// Comprobamos a que que esta asociado dicho carnet
		switch (carnet) {
		case "E" -> System.out.println("Remolques");
		case "D" -> System.out.println("Autobuses");
		case "C1" -> System.out.println("Camiones");
		case "C5" -> System.out.println("Camiones");
		case "A" -> System.out.println("Motos");
		case "B1" -> System.out.println("Automóviles");
		case "B2" -> System.out.println("Automóviles");
		default -> System.out.println("ERROR");
		}

		// Cerramos el Scanner
		sc.close();

	}// Cierre main

}// Cierre clase
