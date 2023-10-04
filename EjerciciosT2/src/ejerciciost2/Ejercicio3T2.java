package ejerciciost2;

import java.util.Scanner;

public class Ejercicio3T2 {

	public static void main(String[] args) {

		// Variable donde guardamos el número del usuario
		double num;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que nos diga un número con decimales
		System.out.println("Escriba un número decimal: ");

		// Leemos el número
		num = sc.nextDouble();

		// Comprobamos si el número insertado es casi cero
		if (num > -1 && num < 1 && num != 0) {
			System.out.println("Su número es casi-cero");
		} else {
			System.out.println("Su número no es casi-cero");
		}

		// Cerramos el Scanner
		sc.close();

	} // Cierre main

} // Cierre clase
