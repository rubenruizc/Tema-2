package ejerciciost2_2;

import java.util.Scanner;

public class Ejercicio1T2_2 {

	public static void main(String[] args) {

		// Variable donde guardaremos la nota del usuario
		int nota;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario una nota entera
		System.out.print("Escriba una nota entera: ");
		
		// Leemos el número
		nota = sc.nextInt();
		
		// Comprobamos que nota ha sacado el usuario
		switch (nota) {
		case 1, 2, 3, 4 -> System.out.println("INSUFICIENTE");
		case 5 -> System.out.println("SUFICIENTE");
		case 6 -> System.out.println("BIEN");
		case 7, 8 -> System.out.println("NOTABLE");
		case 9, 10 -> System.out.println("SOBRESALIENTE");
		default -> System.out.println("Nota introducida incorrectamente");

		}
		
		// Cerramos el Scanner
		sc.close();
		
	}// Cierre de main

}// Cierre de clase
