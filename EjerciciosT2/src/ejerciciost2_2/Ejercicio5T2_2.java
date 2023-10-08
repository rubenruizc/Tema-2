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
		case "E" -> System.out.println("Este carnet pertenece a los remolques");
		case "D" -> System.out.println("Este carnet pertenece a los autobuses");
		case "C1" -> System.out.println("Este carnet pertenece a los camiones");
		case "C5" -> System.out.println("Este carnet pertenece a los camiones");
		case "A" -> System.out.println("Este carnet pertenece a las motos");
		case "B1" -> System.out.println("Este carnet pertenece a los automóviles");
		case "B2" -> System.out.println("Este carnet pertenece a los automóviles");
		default -> System.out.println("ERROR");
		}

		// Cerramos el Scanner
		sc.close();

	}// Cierre main

}// Cierre clase
