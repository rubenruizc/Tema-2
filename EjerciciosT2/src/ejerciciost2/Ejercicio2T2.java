package ejerciciost2;

import java.util.Scanner;

public class Ejercicio2T2 {

	public static void main(String[] args) {

		// Variable donde guardamos el primer número del usuario
		int num1;

		// Variable donde guardamos el segundo número del usuario
		int num2;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que nos diga un número
		System.out.print("Escriba un número entero: ");

		// Leemos el número
		num1 = sc.nextInt();

		// Le pedimos al usuario que nos diga otro número
		System.out.print("Escriba otro número entero: ");

		// Leemos el número
		num2 = sc.nextInt();

		// Comprobamos si los números son iguales
		if (num1 == num2) {
			System.out.println("Sus números son iguales");
		} else {
			System.out.println("Sus números no son iguales");
		}

		// Cerramos el Scanner
		sc.close();

	} // Fin main

} // Fin clase
