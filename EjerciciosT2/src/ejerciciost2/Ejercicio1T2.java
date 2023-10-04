package ejerciciost2;

import java.util.Scanner;

public class Ejercicio1T2 {

	public static void main(String[] args) {

		// Variable donde guardamos el número que nos diga el usuario
		int num;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos que nos diga un número para decirle si es o no par
		System.out.println("Escriba un número y te diremos si es par o no: ");
		
		// Leemos el número
		num = sc.nextInt();
		
		// Se comprueba si el número es par
		if (num % 2 == 0) {
			System.out.println("Tu número es par");
		} else {
			System.out.println("Tu número no es par");
		}
		
		// Cerramos el Scanner
		sc.close();
		
	} // fin main

} // fin clase
